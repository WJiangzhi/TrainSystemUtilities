package com.trainsystemutilities.client.renderer;

import com.trainsystemutilities.blockentity.PosterManagementBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

/** ポスター管理ブロック (= モニター連携カードのみ。 メモリーカードスロットは持たない)。 */
public class PosterManagementBlockRenderer extends ConsoleBlockRenderer<PosterManagementBlockEntity> {

    public PosterManagementBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new ConsoleGeoModel<>("poster_management_block",
                null,
                PosterManagementBlockEntity::hasMonitorCard));
    }
}
