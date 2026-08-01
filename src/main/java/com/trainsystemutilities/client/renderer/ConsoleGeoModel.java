package com.trainsystemutilities.client.renderer;

import com.trainsystemutilities.TrainSystemUtilities;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.model.GeoModel;

import java.util.function.Predicate;

/**
 * 管理系コンソール 3 種 (管理用コンピューター / 鉄道管理ブロック / ポスター管理ブロック) 共通の
 * Geckolib モデル定義。 3 つは同一形状の派生で、 差分は「メモリーカードスロットを持つか」だけ。
 *
 * <p>カード状態の反映は 2 系統:
 * <ul>
 *   <li><b>bone</b> — 挿さっていないカードの bone ({@code memory} / {@code monitor}) を隠す
 *       (= スロットが空いて見える)</li>
 *   <li><b>texture</b> — 天板の status LED は body の面に描かれていて bone 単位で着色できないため、
 *       LED を赤に塗り替えた変種テクスチャへ差し替える。 変種は
 *       {@code scripts/import_console_models.py} が author 済みテクスチャから生成する</li>
 * </ul>
 *
 * <p>カード有無は BE の NBT (getUpdateTag) 経由で client にも届いている (§5.1)。
 */
public class ConsoleGeoModel<T extends BlockEntity & GeoAnimatable> extends GeoModel<T> {

    /** BlockBench 側の bone 名 (= 挿さっているカードそのもの)。 */
    private static final String BONE_MEMORY = "memory";
    private static final String BONE_MONITOR = "monitor";

    private final ResourceLocation model;
    private final ResourceLocation animation;
    /** LED 全点灯 (= author されたテクスチャそのもの)。 */
    private final ResourceLocation texAllGreen;
    /** LED 全消灯 (= 全て赤)。 */
    private final ResourceLocation texNone;
    /** memory だけ緑 / monitor だけ緑。 memory スロットを持つブロックでのみ存在する。 */
    private final ResourceLocation texMemoryOnly;
    private final ResourceLocation texMonitorOnly;

    /** null = メモリーカードスロットを持たない (= ポスター管理ブロック、 LED は 1 個)。 */
    @Nullable
    private final Predicate<T> hasMemoryCard;
    private final Predicate<T> hasMonitorCard;

    public ConsoleGeoModel(String id, @Nullable Predicate<T> hasMemoryCard, Predicate<T> hasMonitorCard) {
        this.model = res("geo/" + id + ".geo.json");
        this.animation = res("animations/" + id + ".animation.json");
        this.texAllGreen = res("textures/block/" + id + ".png");
        this.texNone = res("textures/block/" + id + "_none.png");
        this.texMemoryOnly = res("textures/block/" + id + "_memory.png");
        this.texMonitorOnly = res("textures/block/" + id + "_monitor.png");
        this.hasMemoryCard = hasMemoryCard;
        this.hasMonitorCard = hasMonitorCard;
    }

    private static ResourceLocation res(String path) {
        return ResourceLocation.fromNamespaceAndPath(TrainSystemUtilities.MOD_ID, path);
    }

    @Override
    public boolean crashIfBoneMissing() { return false; }

    @Override public ResourceLocation getModelResource(T be) { return model; }
    @Override public ResourceLocation getAnimationResource(T be) { return animation; }

    @Override
    public ResourceLocation getTextureResource(T be) {
        boolean monitor = hasMonitorCard.test(be);
        if (hasMemoryCard == null) return monitor ? texAllGreen : texNone;
        boolean memory = hasMemoryCard.test(be);
        if (memory && monitor) return texAllGreen;
        if (memory) return texMemoryOnly;
        if (monitor) return texMonitorOnly;
        return texNone;
    }

    @Override
    public void setCustomAnimations(T be, long instanceId, AnimationState<T> state) {
        super.setCustomAnimations(be, instanceId, state);
        // bone は baked model 共有なので、 描画のたびに この BE の状態で必ず上書きする。
        GeoBone memory = getAnimationProcessor().getBone(BONE_MEMORY);
        if (memory != null) memory.setHidden(hasMemoryCard == null || !hasMemoryCard.test(be));
        GeoBone monitor = getAnimationProcessor().getBone(BONE_MONITOR);
        if (monitor != null) monitor.setHidden(!hasMonitorCard.test(be));
    }
}
