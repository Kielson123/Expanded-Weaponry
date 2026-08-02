package com.kielson.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CreativeModeTab.Output.class)
public interface CreativeModeTabMixin {

    @WrapOperation(method = "accept(Lnet/minecraft/world/level/ItemLike;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/CreativeModeTab$Output;accept(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/CreativeModeTab$TabVisibility;)V"))
    private static void ExpandedWeaponry$removeShield(CreativeModeTab.Output instance, ItemStack itemStack, CreativeModeTab.TabVisibility tabVisibility, Operation<Void> original){
        if(!itemStack.is(Items.SHIELD)) original.call(instance, itemStack, tabVisibility);
    }
}
