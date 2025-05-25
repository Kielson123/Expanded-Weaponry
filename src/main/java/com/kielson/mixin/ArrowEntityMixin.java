package com.kielson.mixin;

import com.kielson.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(ArrowEntity.class)
public abstract class ArrowEntityMixin extends PersistentProjectileEntity {
    @Unique private final ArrowEntity arrowEntity = (ArrowEntity) (Object) this;
    @Unique private ItemStack stack;
    @Unique private ItemStack shotFrom;
    @Unique private World world;
    @Unique private Entity owner = arrowEntity.getOwner();

    protected ArrowEntityMixin(EntityType<? extends PersistentProjectileEntity> type, LivingEntity owner, World world, ItemStack stack, @Nullable ItemStack shotFrom) {
        super(type, owner, world, stack, shotFrom);
    }
    @Inject(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)V", at = @At("RETURN"))
    protected void Kielson$init(World world, double x, double y, double z, ItemStack stack, ItemStack shotFrom, CallbackInfo ci){
        this.stack = stack;
        this.shotFrom = shotFrom;
        this.world = world;
    }

    @Inject(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)V", at = @At("RETURN"))
    protected void Kielson$init(World world, LivingEntity owner, ItemStack stack, ItemStack shotFrom, CallbackInfo ci){
        this.stack = stack;
        this.shotFrom = shotFrom;
        this.world = world;
    }

    @Inject(method = "<init>(Lnet/minecraft/entity/EntityType;Lnet/minecraft/world/World;)V", at = @At("RETURN"))
    protected void Kielson$init(EntityType entityType, World world, CallbackInfo ci){
        this.world = world;
    }

    @Inject(method = "onHit", at = @At("HEAD"))
    protected void Kielson$onHit(LivingEntity target, CallbackInfo ci){
        if(stack == null || shotFrom == null){
            return;
        }
        if((stack.isOf(Items.IRON_NUGGET) || stack.isOf(Items.GOLD_NUGGET) || stack.isOf(Items.FLINT))
                && shotFrom.isOf(ModItems.SLINGSHOT) && arrowEntity.isInGround() && arrowEntity.inGroundTime != 0){
            if(owner instanceof PlayerEntity player && !player.isInCreativeMode()){
                int chance = new Random().nextInt(0, 2);
                if(chance == 1){
                    arrowEntity.dropItem((ServerWorld) world, stack.getItem());
                }
            }
            arrowEntity.discard();
        }
    }

    @Inject(method = "tick", at = @At("HEAD"))
    protected void Kielson$onGroundHit(CallbackInfo ci){
        if(stack == null || shotFrom == null){
            return;
        }
        if((stack.isOf(Items.IRON_NUGGET) || stack.isOf(Items.GOLD_NUGGET) || stack.isOf(Items.FLINT))
                && shotFrom.isOf(ModItems.SLINGSHOT) && arrowEntity.isInGround() && arrowEntity.inGroundTime != 0){
            if(owner instanceof PlayerEntity player && !player.isInCreativeMode()){
                arrowEntity.dropItem((ServerWorld) world, stack.getItem());
            }
            arrowEntity.discard();
        }
    }
}
