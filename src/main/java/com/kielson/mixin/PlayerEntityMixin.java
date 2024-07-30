package com.kielson.mixin;

import com.kielson.KielsonsEnhancedCombat;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.kielson.util.ModComponents.TWO_HANDED;

@Mixin(PlayerEntity.class)
abstract class PlayerEntityMixin extends LivingEntity {
    @Unique private final PlayerEntity player = (PlayerEntity) (Object)this;

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    //Two-Handed component
    @Inject(method = "getEquippedStack", at = @At("HEAD"), cancellable = true)
    private void Kielson$getEquippedStack(EquipmentSlot slot, CallbackInfoReturnable<ItemStack> cir) {
        //KielsonsEnhancedCombat.LOGGER.warn("Works!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        if (slot.equals(EquipmentSlot.MAINHAND)) {
            ItemStack offHandStack = player.getInventory().offHand.getFirst();
            Boolean offHandStackComponent = offHandStack.get(TWO_HANDED);

            if (Boolean.TRUE.equals(offHandStackComponent)) {
                cir.setReturnValue(ItemStack.EMPTY);
            }
        }
        else if (slot.equals(EquipmentSlot.OFFHAND)) {
            ItemStack mainHandStack = player.getInventory().getMainHandStack();
            Boolean mainHandStackComponent = mainHandStack.get(TWO_HANDED);

            if (Boolean.TRUE.equals(mainHandStackComponent)) {
                cir.setReturnValue(ItemStack.EMPTY);
            }
        }
    }
}
