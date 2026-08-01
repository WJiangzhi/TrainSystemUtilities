package com.trainsystemutilities.item;

import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

/**
 * 駅名サイン (ポール付き) のアイテム。
 *
 * <p>ポールはモデル上、 看板の上 (Y 16..32) に伸びる吊り下げ形状。 素の設置だと天井下面を
 * クリックしたとき看板本体が天井直下のセルへ入り、 <b>ポールが天井へめり込む</b>。
 * そこで天井下面クリック時は設置位置を 1 ブロック下げ、 ポール行がクリックした天井の直下に
 * 来る (= ポール上端が天井に接する) ようにする。 床や側面への設置は通常どおり。
 */
public class StationNameSignPoleItem extends GeoBlockItem {

    public StationNameSignPoleItem(Block block, Item.Properties properties) {
        super(block, properties);
    }

    @Override
    @Nullable
    public BlockPlaceContext updatePlacementContext(BlockPlaceContext context) {
        if (context.getClickedFace() == Direction.DOWN) {
            return BlockPlaceContext.at(context, context.getClickedPos().below(), Direction.DOWN);
        }
        return context;
    }
}
