package com.trainsystemutilities.client.renderer;

import com.trainsystemutilities.blockentity.ManagementComputerBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

/** 管理用コンピューター (= メモリーカード + モニター連携カードの 2 スロット)。 */
public class ManagementComputerBlockRenderer extends ConsoleBlockRenderer<ManagementComputerBlockEntity> {

    public ManagementComputerBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new ConsoleGeoModel<>("management_computer",
                ManagementComputerBlockEntity::hasMemoryCard,
                ManagementComputerBlockEntity::hasMonitorCard));
    }
}
