package com.kielson.mixin.client;

import com.kielson.item.custom.HammerItem;
import net.minecraft.client.render.item.ItemModels;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import static com.kielson.KielsonsEnhancedCombat.MOD_ID;

@Mixin(ItemRenderer.class)
abstract class ItemRendererMixin {

    @Shadow @Final private ItemModels models;

    @ModifyVariable(method = "renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILnet/minecraft/client/render/model/BakedModel;)V", at = @At("HEAD"), argsOnly = true)
    private BakedModel useHammerModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode){
        if (stack.getItem() instanceof HammerItem && renderMode != ModelTransformationMode.GUI){
            return this.models.getModelManager().getModel(new ModelIdentifier(Identifier.of(MOD_ID, stack.getItem().getTranslationKey().replace("item.kielsons_enhanced_combat.", "")), "in_hand"));
        }
        return value;
    }
}
