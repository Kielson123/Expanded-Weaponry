package com.kielson.mixin;

import com.kielson.ExpandedWeaponryTags;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.ShieldDecorationRecipe;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(ShieldDecorationRecipe.class)
public abstract class ShieldDecorationRecipeMixin extends CustomRecipe {
    public ShieldDecorationRecipeMixin() {
        super();
    }

    @Inject(method = "matches(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/world/level/Level;)Z", at = @At("HEAD"), cancellable = true)
    private void ExpandedWeaponry$injectedMatches(CraftingInput input, Level level, CallbackInfoReturnable<Boolean> returnee) {
        ItemStack itemStack = ItemStack.EMPTY;
        ItemStack itemStack2 = ItemStack.EMPTY;
        for (int i = 0; i < input.size(); ++i) {
            ItemStack itemStack3 = input.getItem(i);
            if (itemStack3.isEmpty()) continue;
            if (itemStack3.getItem() instanceof BannerItem) {
                if (!itemStack2.isEmpty()) {
                    returnee.setReturnValue(false);
                }
                itemStack2 = itemStack3;
                continue;
            }
            if (itemStack3.is(ExpandedWeaponryTags.SHIELDS)) {
                if (!itemStack.isEmpty()) {
                    returnee.setReturnValue(false);
                }
                BannerPatternLayers bannerPatternsComponent = itemStack3.getOrDefault(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY);
                if (!bannerPatternsComponent.layers().isEmpty()) {
                    returnee.setReturnValue(false);
                }
                itemStack = itemStack3;
                continue;
            }
            returnee.setReturnValue(false);
        }
        returnee.setReturnValue(!itemStack.isEmpty() && !itemStack2.isEmpty());
    }

    @Inject(method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;)Lnet/minecraft/world/item/ItemStack;", at = @At("HEAD"), cancellable = true)
    private void ExpandedWeaponry$injectedAssemble(CraftingInput input, CallbackInfoReturnable<ItemStack> cir) {
        ItemStack itemStack = ItemStack.EMPTY;
        ItemStack itemStack2 = ItemStack.EMPTY;
        for (int i = 0; i < input.size(); ++i) {
            ItemStack itemStack3 = input.getItem(i);
            if (itemStack3.isEmpty()) continue;
            if (itemStack3.getItem() instanceof BannerItem) {
                itemStack = itemStack3;
                continue;
            }
            if (!(itemStack3.is(ExpandedWeaponryTags.SHIELDS))) continue;
            itemStack2 = itemStack3.copy();
        }
        if (itemStack2.isEmpty()) {
            cir.setReturnValue(itemStack2);
        }
        itemStack2.set(DataComponents.BANNER_PATTERNS, itemStack.get(DataComponents.BANNER_PATTERNS));
        itemStack2.set(DataComponents.BASE_COLOR, ((BannerItem)itemStack.getItem()).getColor());
        cir.setReturnValue(itemStack2);
    }
}
