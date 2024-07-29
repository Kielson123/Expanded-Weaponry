package com.kielson.mixin;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.kielson.item.ModItems.TWO_HANDED;
import static net.minecraft.entity.EquipmentSlot.MAINHAND;
import static net.minecraft.entity.EquipmentSlot.OFFHAND;

@Mixin(PlayerEntity.class)
abstract class PlayerEntityMixin {
    @Unique private final PlayerEntity player = ((PlayerEntity) ((Object)this));

    /*@ModifyVariable(method = "attack", at = @At("STORE"), ordinal = 3)
    private boolean Kielson$disableSweeping(boolean value) {
        Hand currentHand = player.getActiveHand();
        if (currentHand != null) {
            ItemStack stack = player.getStackInHand(currentHand);
            if (stack.isIn(ModItemTagProvider.SWEEPING_DISABLED)) return false;
        }
        return value;
    }*/

    @Inject(method = "getEquippedStack", at = @At("HEAD"), cancellable = true)
    public void Kielson$getEquippedStack(EquipmentSlot slot, CallbackInfoReturnable<ItemStack> cir) {
        System.out.println("Executed");
        Boolean mainHandStackComponent = player.getInventory().getMainHandStack().get(TWO_HANDED);
        if (Boolean.TRUE.equals(mainHandStackComponent) && slot == OFFHAND) {
            cir.setReturnValue(ItemStack.EMPTY);
        }

        Boolean offHandStackComponent = player.getInventory().offHand.get(0).get(TWO_HANDED);
        if (Boolean.TRUE.equals(offHandStackComponent) && slot == MAINHAND) {
            cir.setReturnValue(ItemStack.EMPTY);
        }
    }
}
