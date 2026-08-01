package com.trainsystemutilities.structure.block;

import com.mojang.serialization.MapCodec;
import com.trainsystemutilities.registry.ModBlockEntities;
import com.trainsystemutilities.structure.blockentity.StationNameSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

/**
 * 駅名サイン: 横 4 ブロック × 高さ 1 ブロックの multi-block。
 *
 * <p>master 1 セル + dummy 3 セル。 セルは {@link #widthAxis(Direction)} 方向に
 * -1 / 0 (master) / +1 / +2 と並ぶ。 モデルは 4 セルの中央を原点に author されているので、
 * 描画側 (BlockRenderer) が master セル中心から +0.5 セルずらす。
 *
 * <p>FACING = 表示面が向く方向 (= 既存 3 コンソールと同じ規約)。 モデルは前面を +X に
 * author してあり、 renderer 側で 90° 補正する。
 *
 * <p>UI は持たない。 表示内容は BE が server で解決する。
 */
public class StationNameSignBlock extends BaseEntityBlock {
    public static final MapCodec<StationNameSignBlock> CODEC = simpleCodec(StationNameSignBlock::new);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    /** master から widthAxis 方向へ +1, +2、 反対方向へ -1 の計 3 dummy。 */
    private static final int DUMMIES_BACKWARD = 1;
    private static final int DUMMIES_FORWARD = 2;

    /** 板厚 6 voxel (モデル X -3..3) を FACING 軸に立てた collision。 高さは 1 ブロック。 */
    private static final VoxelShape SHAPE_NS = Block.box(0, 0, 5, 16, 16, 11);
    private static final VoxelShape SHAPE_EW = Block.box(5, 0, 0, 11, 16, 16);
    /** ポール版の両端セル: 柱 (モデル Y 16..32) を含む 2 ブロック高。 */
    private static final VoxelShape SHAPE_NS_POLE = Block.box(0, 0, 5, 16, 32, 11);
    private static final VoxelShape SHAPE_EW_POLE = Block.box(5, 0, 0, 11, 32, 16);

    /** ポール付き版か (= 両端に柱があり、 その 2 セルだけ高さ 2 ブロック)。 */
    private final boolean pole;

    public StationNameSignBlock(Properties properties) {
        this(properties, false);
    }

    public StationNameSignBlock(Properties properties, boolean pole) {
        super(properties);
        this.pole = pole;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public boolean hasPole() { return pole; }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() { return CODEC; }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    /** 看板が伸びる方向 (= 表示面から見た左右軸)。 */
    public static Direction widthAxis(Direction facing) {
        return facing.getClockWise();
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction facing = context.getHorizontalDirection().getOpposite();
        // dummy 3 セル (+ ポール版は端 2 セルの上) が置けないなら設置させない (= null。 アイテムを消費しない)
        if (!canPlaceAll(context.getLevel(), context.getClickedPos(), widthAxis(facing))) {
            return null;
        }
        return this.defaultBlockState().setValue(FACING, facing);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        Direction facing = state.getValue(FACING);
        boolean tall = pole && isEndCell(state, level, pos);
        return switch (facing) {
            case EAST, WEST -> tall ? SHAPE_EW_POLE : SHAPE_EW;
            default -> tall ? SHAPE_NS_POLE : SHAPE_NS;
        };
    }

    /** 4 セルのうち両端 (= master から幅方向 -1 と +2) か。 柱があるのはこの 2 セルだけ。 */
    private static boolean isEndCell(BlockState state, BlockGetter level, BlockPos pos) {
        if (!(level.getBlockEntity(pos) instanceof StationNameSignBlockEntity sign)) return false;
        BlockPos master = sign.isMaster() ? pos : sign.getMasterPos();
        if (master == null) return false;
        Direction axis = widthAxis(state.getValue(FACING));
        BlockPos diff = pos.subtract(master);
        int along = axis.getStepX() * diff.getX() + axis.getStepZ() * diff.getZ();
        return along == -DUMMIES_BACKWARD || along == DUMMIES_FORWARD;
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    @Nullable
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new StationNameSignBlockEntity(pos, state);
    }

    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state,
                                                                  BlockEntityType<T> type) {
        if (level.isClientSide()) return null;
        return createTickerHelper(type, ModBlockEntities.STATION_NAME_SIGN.get(),
                StationNameSignBlockEntity::tick);
    }

    /** UI なし。 表示内容は駅グループと路線記号から自動解決される。 */
    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                               Player player, BlockHitResult hit) {
        return InteractionResult.PASS;
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state,
                            @Nullable LivingEntity placer, ItemStack stack) {
        super.setPlacedBy(level, pos, state, placer, stack);
        if (level.isClientSide()) return;
        Direction axis = widthAxis(state.getValue(FACING));

        if (!canPlaceAll(level, pos, axis)) {
            level.setBlock(pos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
            if (placer instanceof Player player && !player.isCreative()) {
                player.getInventory().add(new ItemStack(this.asItem()));
            }
            return;
        }
        for (int i = 1; i <= DUMMIES_BACKWARD; i++) {
            placeDummy(level, pos.relative(axis.getOpposite(), i), state, pos);
        }
        for (int i = 1; i <= DUMMIES_FORWARD; i++) {
            placeDummy(level, pos.relative(axis, i), state, pos);
        }
    }

    /** dummy 3 セル + (ポール版のみ) ポールが伸びる端 2 セルの上の空間をまとめて検査する。
     *  ポールのセルにはブロックを置かない (= 券売機の上段と同じ collision overhang) が、
     *  既存ブロックへめり込む設置は防ぐ。 */
    private boolean canPlaceAll(Level level, BlockPos pos, Direction axis) {
        if (!canPlaceDummies(level, pos, axis)) return false;
        if (pole) {
            if (!canReplace(level, pos.relative(axis.getOpposite(), DUMMIES_BACKWARD).above())) return false;
            if (!canReplace(level, pos.relative(axis, DUMMIES_FORWARD).above())) return false;
        }
        return true;
    }

    private static boolean canPlaceDummies(Level level, BlockPos pos, Direction axis) {
        for (int i = 1; i <= DUMMIES_BACKWARD; i++) {
            if (!canReplace(level, pos.relative(axis.getOpposite(), i))) return false;
        }
        for (int i = 1; i <= DUMMIES_FORWARD; i++) {
            if (!canReplace(level, pos.relative(axis, i))) return false;
        }
        return true;
    }

    private static boolean canReplace(Level level, BlockPos pos) {
        BlockState s = level.getBlockState(pos);
        return s.isAir() || s.canBeReplaced();
    }

    private static void placeDummy(Level level, BlockPos pos, BlockState state, BlockPos masterPos) {
        level.setBlock(pos, state, Block.UPDATE_ALL);
        if (level.getBlockEntity(pos) instanceof StationNameSignBlockEntity sign) {
            sign.setDummy(masterPos);
        }
    }

    @Override
    protected void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!state.is(newState.getBlock()) && !level.isClientSide()) {
            if (level.getBlockEntity(pos) instanceof StationNameSignBlockEntity sign) {
                if (sign.isMaster()) {
                    Direction axis = widthAxis(state.getValue(FACING));
                    for (int i = 1; i <= DUMMIES_BACKWARD; i++) {
                        clearDummy(level, pos.relative(axis.getOpposite(), i));
                    }
                    for (int i = 1; i <= DUMMIES_FORWARD; i++) {
                        clearDummy(level, pos.relative(axis, i));
                    }
                } else {
                    BlockPos m = sign.getMasterPos();
                    if (m != null && level.getBlockState(m).getBlock() == this) {
                        level.setBlock(m, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
                    }
                }
            }
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }

    private void clearDummy(Level level, BlockPos pos) {
        if (level.getBlockState(pos).getBlock() != this) return;
        if (level.getBlockEntity(pos) instanceof StationNameSignBlockEntity sign && !sign.isMaster()) {
            level.setBlock(pos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
        }
    }
}
