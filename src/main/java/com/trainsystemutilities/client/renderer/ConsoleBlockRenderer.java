package com.trainsystemutilities.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntity;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

/**
 * 管理系コンソール 3 種共通の BER。
 *
 * <p>3 つのモデルは前面 (= カードスロットと画面のある側) を BlockBench の +X に向けて author
 * されている。 素の {@link GeoBlockRenderer} は FACING=NORTH を無回転として扱うので、
 * そのままだと前面が FACING と 90° ずれる。 ここで 1 回だけ補正する
 * (= 既存ブロックの FACING の意味を変えずに済むので、 設置済みブロックの向きも変わらない)。
 */
public abstract class ConsoleBlockRenderer<T extends BlockEntity & GeoAnimatable>
        extends GeoBlockRenderer<T> {

    protected ConsoleBlockRenderer(GeoModel<T> model) {
        super(model);
    }

    @Override
    protected void rotateBlock(Direction facing, PoseStack poseStack) {
        super.rotateBlock(facing.getClockWise(), poseStack);
    }

    @Override
    public int getViewDistance() { return 256; }
}
