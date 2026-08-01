package com.trainsystemutilities.client.renderer;

import com.trainsystemutilities.blockentity.RailwayManagementBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

/** 鉄道管理ブロック (= メモリーカード [ホームドア group] + モニター連携カードの 2 スロット)。 */
public class RailwayManagementBlockRenderer extends ConsoleBlockRenderer<RailwayManagementBlockEntity> {

    public RailwayManagementBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new ConsoleGeoModel<>("railway_management_block",
                RailwayManagementBlockEntity::hasMemoryCard,
                RailwayManagementBlockEntity::hasMonitorCard));
    }
}
