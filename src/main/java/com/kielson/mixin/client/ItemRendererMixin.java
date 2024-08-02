package com.kielson.mixin.client;

import com.kielson.item.ModItems;
import com.kielson.util.InHandItemModels;
import net.minecraft.client.render.item.ItemModels;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
abstract class ItemRendererMixin {

    @Shadow @Final private ItemModels models;

    @ModifyVariable(method = "renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILnet/minecraft/client/render/model/BakedModel;)V", at = @At("HEAD"), argsOnly = true)
    private BakedModel useHammerModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode){
        if (renderMode == ModelTransformationMode.FIRST_PERSON_LEFT_HAND || renderMode == ModelTransformationMode.FIRST_PERSON_RIGHT_HAND
                || renderMode == ModelTransformationMode.THIRD_PERSON_LEFT_HAND || renderMode == ModelTransformationMode.THIRD_PERSON_RIGHT_HAND){

            if (stack.isOf(ModItems.WOODEN_HAMMER)) return this.models.getModelManager().getModel(InHandItemModels.WOODEN_HAMMER_IN_HAND);
            if (stack.isOf(ModItems.STONE_HAMMER)) return this.models.getModelManager().getModel(InHandItemModels.STONE_HAMMER_IN_HAND);
            if (stack.isOf(ModItems.IRON_HAMMER)) return this.models.getModelManager().getModel(InHandItemModels.IRON_HAMMER_IN_HAND);
            if (stack.isOf(ModItems.GOLDEN_HAMMER)) return this.models.getModelManager().getModel(InHandItemModels.GOLDEN_HAMMER_IN_HAND);
            if (stack.isOf(ModItems.DIAMOND_HAMMER)) return this.models.getModelManager().getModel(InHandItemModels.DIAMOND_HAMMER_IN_HAND);
            if (stack.isOf(ModItems.NETHERITE_HAMMER)) return this.models.getModelManager().getModel(InHandItemModels.NETHERITE_HAMMER_IN_HAND);
        }
        return value;
    }
}
