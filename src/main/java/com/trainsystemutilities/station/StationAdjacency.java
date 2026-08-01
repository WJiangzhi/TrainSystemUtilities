package com.trainsystemutilities.station;

import com.simibubi.create.content.trains.graph.EdgePointType;
import com.simibubi.create.content.trains.graph.TrackGraph;
import com.simibubi.create.content.trains.graph.TrackNode;
import com.simibubi.create.content.trains.station.GlobalStation;
import com.trainsystemutilities.TrainSystemUtilities;
import com.trainsystemutilities.network.TrackNetworkScanner;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * 線路グラフ (= 路線マップが描いているもの) をたどって「隣の駅グループ」を求める server 側ヘルパー。
 *
 * <p>手順: 駅グループの Create 駅ブロックを起点に、 Create の {@link TrackGraph} を
 * 各方向へ幅優先で歩き、 <b>最初に出会った別の駅グループ</b>をその方向の隣とする。
 *
 * <p>左右の割り当ては看板の FACING から自動で決まる (設定不要): 看板を見る人の左方向は
 * {@code facing.getClockWise()} なので、 起点駅 → 隣駅 のベクトルをその軸へ射影して符号で分ける。
 *
 * <p>分岐駅で候補が 3 つ以上になった場合は、 <b>方位が最も反対向きになる 2 つ</b>
 * (= その駅を貫く直線に最も近い組) を採る。 実物の駅名標が「その駅を通る線の両端」を出すのに合わせている。
 *
 * <p>グラフ走査は安くないので、 駅グループ単位で {@link #CACHE_TICKS} tick キャッシュする。
 */
public final class StationAdjacency {

    private StationAdjacency() {}

    /** 隣駅候補。 dx/dz は起点駅からの水平ベクトル (左右判定用)。 */
    public record Neighbor(String groupName, double dx, double dz) {}

    /** 左右に割り当て済みの結果。 未解決は空文字。 */
    public record Result(String left, String right) {
        public static final Result EMPTY = new Result("", "");
    }

    /** キャッシュ寿命。 線路や駅の増減はまれなので長めでよい。 */
    private static final int CACHE_TICKS = 600;
    /** 空振りの寿命は短く。 サーバー起動直後は Create の線路グラフがまだ構築途中で空を返すため、
     *  それを 600 tick 抱えると「しばらく隣駅が出ない」状態になる。 */
    private static final int EMPTY_CACHE_TICKS = 60;
    /** 1 方向あたりの探索ノード数上限 (= 巨大ネットワークでの暴走止め)。 */
    private static final int WALK_LIMIT = 4000;

    private record Cached(long gameTime, List<Neighbor> neighbors) {}

    private static final Map<UUID, Cached> CACHE = new HashMap<>();

    /** 駅グループの隣駅候補 (キャッシュ付き)。 */
    public static List<Neighbor> candidates(ServerLevel level, StationGroup group) {
        long now = level.getGameTime();
        Cached c = CACHE.get(group.id());
        if (c != null) {
            int ttl = c.neighbors().isEmpty() ? EMPTY_CACHE_TICKS : CACHE_TICKS;
            if (now - c.gameTime() < ttl) return c.neighbors();
        }
        List<Neighbor> found;
        try {
            found = scan(level, group);
        } catch (Exception e) {
            TrainSystemUtilities.LOGGER.debug("[StationAdjacency] scan failed for {}: {}",
                    group.name(), e.getMessage());
            found = List.of();
        }
        CACHE.put(group.id(), new Cached(now, found));
        return found;
    }

    /** 候補を看板の向きで左右へ割り当てる。 候補が 3 つ以上なら最も反対向きの 2 つを採る。 */
    public static Result assign(List<Neighbor> neighbors, Direction facing) {
        if (neighbors.isEmpty()) return Result.EMPTY;
        List<Neighbor> picked = neighbors.size() <= 2 ? neighbors : mostOpposite(neighbors);

        // 看板を見る人の左方向 (FACING=south なら west)。
        Direction leftDir = facing.getClockWise();
        double lx = leftDir.getStepX(), lz = leftDir.getStepZ();

        String left = "", right = "";
        for (Neighbor n : picked) {
            boolean isLeft = n.dx() * lx + n.dz() * lz >= 0;
            if (isLeft && left.isEmpty()) left = n.groupName();
            else if (!isLeft && right.isEmpty()) right = n.groupName();
            else if (left.isEmpty()) left = n.groupName();
            else if (right.isEmpty()) right = n.groupName();
        }
        return new Result(left, right);
    }

    /** 方位ベクトルの内積が最小 (= 最も反対向き) になる 2 つを選ぶ。 */
    private static List<Neighbor> mostOpposite(List<Neighbor> ns) {
        double best = Double.MAX_VALUE;
        Neighbor a = ns.get(0), b = ns.get(1);
        for (int i = 0; i < ns.size(); i++) {
            for (int j = i + 1; j < ns.size(); j++) {
                double dot = unitDot(ns.get(i), ns.get(j));
                if (dot < best) { best = dot; a = ns.get(i); b = ns.get(j); }
            }
        }
        return List.of(a, b);
    }

    private static double unitDot(Neighbor p, Neighbor q) {
        double pl = Math.hypot(p.dx(), p.dz()), ql = Math.hypot(q.dx(), q.dz());
        if (pl < 1e-6 || ql < 1e-6) return 1.0;
        return (p.dx() * q.dx() + p.dz() * q.dz()) / (pl * ql);
    }

    // --- グラフ走査 ---

    private static List<Neighbor> scan(ServerLevel level, StationGroup group) {
        List<BlockPos> ownStations = group.stationBlockPositions();
        if (ownStations == null || ownStations.isEmpty()) return List.of();
        BlockPos seed = ownStations.get(0);

        TrackGraph graph = TrackNetworkScanner.findGraphForPosition(level, seed);
        if (graph == null) return List.of();

        // node 一覧と隣接。 TrackNodeLocation → TrackNode は locateNode 経由 (TrackNetworkScanner と同じ)。
        List<TrackNode> nodes = new ArrayList<>();
        for (var loc : graph.getNodes()) {
            TrackNode n = graph.locateNode(loc);
            if (n != null) nodes.add(n);
        }
        if (nodes.isEmpty()) return List.of();

        Map<TrackNode, List<TrackNode>> adj = new HashMap<>();
        for (TrackNode n : nodes) {
            var conns = graph.getConnectionsFrom(n);
            if (conns == null) continue;
            adj.put(n, new ArrayList<>(conns.keySet()));
        }

        // 駅 → 最寄り node。 GlobalStation は edge 上の点なので node へ寄せる。
        String dim = level.dimension().location().toString();
        StationGroupSavedData sgData = StationGroupSavedData.get(level.getServer());
        Map<TrackNode, List<BlockPos>> stationsAtNode = new HashMap<>();
        for (GlobalStation gs : graph.getPoints(EdgePointType.STATION)) {
            BlockPos sp = gs.getBlockEntityPos();
            if (sp == null) continue;
            TrackNode near = nearest(nodes, sp);
            if (near != null) stationsAtNode.computeIfAbsent(near, k -> new ArrayList<>()).add(sp);
        }

        TrackNode origin = nearest(nodes, seed);
        if (origin == null) return List.of();

        List<Neighbor> out = new ArrayList<>();
        Set<UUID> seenGroups = new HashSet<>();
        seenGroups.add(group.id());

        for (TrackNode first : adj.getOrDefault(origin, List.of())) {
            BlockPos hit = walkUntilStation(adj, stationsAtNode, origin, first, dim, sgData, group);
            if (hit == null) continue;
            StationGroup g = sgData.findContaining(dim, hit);
            if (g == null || !seenGroups.add(g.id())) continue;
            out.add(new Neighbor(g.name() == null ? "" : g.name(),
                    hit.getX() - seed.getX(), hit.getZ() - seed.getZ()));
        }
        return out;
    }

    /** origin から first 方向へ歩き、 最初に見つかった「別グループの駅」の位置を返す。 */
    private static BlockPos walkUntilStation(Map<TrackNode, List<TrackNode>> adj,
                                             Map<TrackNode, List<BlockPos>> stationsAtNode,
                                             TrackNode origin, TrackNode first, String dim,
                                             StationGroupSavedData sgData, StationGroup ownGroup) {
        Set<TrackNode> visited = new HashSet<>();
        visited.add(origin);
        ArrayDeque<TrackNode> queue = new ArrayDeque<>();
        queue.add(first);
        visited.add(first);
        int budget = WALK_LIMIT;

        while (!queue.isEmpty() && budget-- > 0) {
            TrackNode cur = queue.poll();
            for (BlockPos sp : stationsAtNode.getOrDefault(cur, List.of())) {
                StationGroup g = sgData.findContaining(dim, sp);
                if (g != null && !g.id().equals(ownGroup.id())) return sp;
                // 同一グループの駅 (= 別番線) は通過して先へ進む
            }
            for (TrackNode nx : adj.getOrDefault(cur, List.of())) {
                if (visited.add(nx)) queue.add(nx);
            }
        }
        return null;
    }

    private static TrackNode nearest(List<TrackNode> nodes, BlockPos pos) {
        TrackNode best = null;
        double bestD = Double.MAX_VALUE;
        double px = pos.getX() + 0.5, pz = pos.getZ() + 0.5;
        for (TrackNode n : nodes) {
            var v = n.getLocation().getLocation();
            double d = (v.x - px) * (v.x - px) + (v.z - pz) * (v.z - pz);
            if (d < bestD) { bestD = d; best = n; }
        }
        return best;
    }
}
