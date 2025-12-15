package com.kielson.mixin;

import com.kielson.ExpandedWeaponryTags;
import com.kielson.item.ExpandedWeaponryItems;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.entity.projectile.arrow.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

@Mixin(Arrow.class)
public abstract class ArrowEntityMixin extends AbstractArrow {
    @Unique private final Arrow arrowEntity = (Arrow) (Object) this;
    @Unique private ItemStack stack;
    @Unique private ItemStack shotFrom;
    @Unique private Level world;
    @Unique private Entity owner = arrowEntity.getOwner();

    protected ArrowEntityMixin(EntityType<? extends AbstractArrow> type, LivingEntity owner, Level world, ItemStack stack, @Nullable ItemStack shotFrom) {
        super(type, owner, world, stack, shotFrom);
    }
    @Inject(method = "<init>(Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)V", at = @At("RETURN"))
    protected void ExpandedWeaponry$init(Level world, double x, double y, double z, ItemStack stack, ItemStack shotFrom, CallbackInfo ci){
        this.stack = stack;
        this.shotFrom = shotFrom;
        this.world = world;
    }

    @Inject(method = "<init>(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)V", at = @At("RETURN"))
    protected void ExpandedWeaponry$init(Level world, LivingEntity owner, ItemStack stack, ItemStack shotFrom, CallbackInfo ci){
        this.stack = stack;
        this.shotFrom = shotFrom;
        this.world = world;
    }

    @Inject(method = "<init>(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V", at = @At("RETURN"))
    protected void ExpandedWeaponry$init(EntityType entityType, Level world, CallbackInfo ci){
        this.world = world;
    }

    @Inject(method = "doPostHurtEffects", at = @At("HEAD"))
    protected void ExpandedWeaponry$onHit(LivingEntity target, CallbackInfo ci){
        if(stack == null || shotFrom == null){
            return;
        }
        if(stack.is(ExpandedWeaponryTags.SLINGSHOT_PROJECTILES) && shotFrom.is(ExpandedWeaponryItems.SLINGSHOT) && arrowEntity.isInGround() && arrowEntity.inGroundTime != 0){
            if(owner instanceof Player player && !player.hasInfiniteMaterials()){
                int chance = new Random().nextInt(0, 2);
                if(chance == 1){
                    arrowEntity.spawnAtLocation((ServerLevel) world, stack.getItem());
                }
            }
            arrowEntity.discard();
        }
    }

    @Inject(method = "tick", at = @At("HEAD"))
    protected void ExpandedWeaponry$onGroundHit(CallbackInfo ci){
        if(stack == null || shotFrom == null){
            return;
        }
        if(stack.is(ExpandedWeaponryTags.SLINGSHOT_PROJECTILES) && shotFrom.is(ExpandedWeaponryItems.SLINGSHOT) && arrowEntity.isInGround() && arrowEntity.inGroundTime != 0){
            if(owner instanceof Player player && !player.hasInfiniteMaterials()){
                arrowEntity.spawnAtLocation((ServerLevel) world, stack.getItem());
            }
            arrowEntity.discard();
        }
    }
}
