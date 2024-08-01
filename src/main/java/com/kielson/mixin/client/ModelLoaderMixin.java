package com.kielson.mixin.client;

import com.kielson.util.InHandItemModels;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(ModelLoader.class)
public abstract class ModelLoaderMixin {
    @Shadow protected abstract void loadItemModel(ModelIdentifier id);

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/model/ModelLoader;loadItemModel(Lnet/minecraft/client/util/ModelIdentifier;)V", ordinal = 1, shift = At.Shift.AFTER))
    private void addRubyStaff(BlockColors blockColors, Profiler profiler, Map jsonUnbakedModels, Map blockStates, CallbackInfo ci) {
        this.loadItemModel(InHandItemModels.WOODEN_HAMMER_IN_HAND);
        this.loadItemModel(InHandItemModels.STONE_HAMMER_IN_HAND);
        this.loadItemModel(InHandItemModels.IRON_HAMMER_IN_HAND);
        this.loadItemModel(InHandItemModels.GOLDEN_HAMMER_IN_HAND);
        this.loadItemModel(InHandItemModels.DIAMOND_HAMMER_IN_HAND);
        this.loadItemModel(InHandItemModels.NETHERITE_HAMMER_IN_HAND);
    }
}
