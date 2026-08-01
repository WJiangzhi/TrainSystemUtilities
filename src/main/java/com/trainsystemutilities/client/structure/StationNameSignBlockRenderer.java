package com.trainsystemutilities.client.structure;

import com.mojang.blaze3d.vertex.PoseStack;
import com.trainsystemutilities.structure.block.StationNameSignBlock;
import com.trainsystemutilities.structure.blockentity.StationNameSignBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

/**
 * 駅名サインの筐体 (Geckolib) の BER。
 *
 * <p><b>表示内容 (Manta) はここでは描かない。</b> 共有 {@code MultiBufferSource} へ BE 描画フェーズで
 * 書き込むと、 {@code MonitorWorldRenderer} が AFTER_TRANSLUCENT_BLOCKS で行う
 * {@code bufferSource.endBatch()} と flush 順序が競合して既存モニターの路線記号が点滅する。
 * TSU のワールド空間 Manta 描画は全て {@code RenderLevelStageEvent} 側に置く規約で、
 * 駅名サインの面は {@link com.trainsystemutilities.client.renderer.StationSignWorldRenderer} が描く。
 *
 * <p>モデルは 4 セルの中央を原点に author されているため、 master セル中心から幅方向へ +0.5 セルずらす。
 * 表示は master セルのみ (dummy セルは何も描かない)。
 */
public class StationNameSignBlockRenderer extends GeoBlockRenderer<StationNameSignBlockEntity> {

    public StationNameSignBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new StationNameSignGeoModel());
    }

    @Override
    public int getViewDistance() { return 256; }

    /** モデルは前面を +X に author してあるため、 FACING の向きへ 90° 補正する
     *  (= 管理系コンソール 3 種と同じ規約)。 */
    @Override
    protected void rotateBlock(Direction facing, PoseStack poseStack) {
        super.rotateBlock(facing.getClockWise(), poseStack);
    }

    @Override
    public void render(StationNameSignBlockEntity be, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        if (!be.isMaster()) return;

        Direction axis = StationNameSignBlock.widthAxis(be.getBlockState().getValue(StationNameSignBlock.FACING));
        poseStack.pushPose();
        poseStack.translate(axis.getStepX() * 0.5, 0, axis.getStepZ() * 0.5);
        super.render(be, partialTick, poseStack, bufferSource, packedLight, packedOverlay);
        poseStack.popPose();
    }
}
