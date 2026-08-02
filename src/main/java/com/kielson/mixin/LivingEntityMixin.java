package com.kielson.mixin;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {


    @Inject(method = "getEquipmentSlotForItem", at = @At("TAIL"), cancellable = true)
    private void injectedGetEquipmentSlotForItem(ItemStack itemStack, CallbackInfoReturnable<EquipmentSlot> cir) {
        if (itemStack.getItem() instanceof ShieldItem) {
            cir.setReturnValue(EquipmentSlot.OFFHAND);
        }
    }
}
