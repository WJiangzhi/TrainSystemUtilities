package com.trainsystemutilities.client.structure;

import com.trainsystemutilities.TrainSystemUtilities;
import com.trainsystemutilities.structure.blockentity.StationNameSignBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

/** 駅名サインの Geckolib モデル定義 (静的)。 表示内容はモデルではなく Manta が面に描く。 */
public class StationNameSignGeoModel extends GeoModel<StationNameSignBlockEntity> {

    private static final ResourceLocation MODEL = res("geo/station_name_sign.geo.json");
    private static final ResourceLocation MODEL_POLE = res("geo/station_name_sign_pole.geo.json");
    private static final ResourceLocation TEXTURE = res("textures/block/station_name_sign.png");
    private static final ResourceLocation TEXTURE_POLE = res("textures/block/station_name_sign_pole.png");
    private static final ResourceLocation ANIMATION = res("animations/station_name_sign.animation.json");

    private static ResourceLocation res(String path) {
        return ResourceLocation.fromNamespaceAndPath(TrainSystemUtilities.MOD_ID, path);
    }

    /** ポール付き版か (= ブロックが持つフラグ。 白い面の位置は両版で同じ)。 */
    private static boolean isPole(StationNameSignBlockEntity be) {
        return be.getBlockState().getBlock()
                instanceof com.trainsystemutilities.structure.block.StationNameSignBlock b && b.hasPole();
    }

    @Override
    public boolean crashIfBoneMissing() { return false; }

    @Override
    public ResourceLocation getModelResource(StationNameSignBlockEntity be) {
        return isPole(be) ? MODEL_POLE : MODEL;
    }

    @Override
    public ResourceLocation getTextureResource(StationNameSignBlockEntity be) {
        return isPole(be) ? TEXTURE_POLE : TEXTURE;
    }

    @Override public ResourceLocation getAnimationResource(StationNameSignBlockEntity be) { return ANIMATION; }
}
