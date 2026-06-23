package com.kielson.datagen;

import com.kielson.ExpandedWeaponryTags;
import com.kielson.item.ExpandedWeaponryItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ExpandedWeaponryTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public ExpandedWeaponryTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider arg) {
        this.builder(ExpandedWeaponryTags.DAGGERS)
                .add(ExpandedWeaponryItems.WOODEN_DAGGER.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.STONE_DAGGER.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.COPPER_DAGGER.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.IRON_DAGGER.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.GOLDEN_DAGGER.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.DIAMOND_DAGGER.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.NETHERITE_DAGGER.builtInRegistryHolder().key());

        this.builder(ExpandedWeaponryTags.HAMMERS)
                .add(ExpandedWeaponryItems.WOODEN_HAMMER.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.STONE_HAMMER.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.COPPER_HAMMER.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.IRON_HAMMER.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.GOLDEN_HAMMER.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.DIAMOND_HAMMER.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.NETHERITE_HAMMER.builtInRegistryHolder().key());

        this.builder(ExpandedWeaponryTags.TWIN_BLADE_SWORDS)
                .add(ExpandedWeaponryItems.WOODEN_TWIN_BLADE_SWORD.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.STONE_TWIN_BLADE_SWORD.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.COPPER_TWIN_BLADE_SWORD.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.IRON_TWIN_BLADE_SWORD.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.GOLDEN_TWIN_BLADE_SWORD.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.DIAMOND_TWIN_BLADE_SWORD.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.NETHERITE_TWIN_BLADE_SWORD.builtInRegistryHolder().key());

        this.builder(ExpandedWeaponryTags.GREATSWORDS)
                .add(ExpandedWeaponryItems.WOODEN_GREATSWORD.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.STONE_GREATSWORD.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.COPPER_GREATSWORD.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.IRON_GREATSWORD.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.GOLDEN_GREATSWORD.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.DIAMOND_GREATSWORD.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.NETHERITE_GREATSWORD.builtInRegistryHolder().key());

        this.builder(ExpandedWeaponryTags.BOWS)
                .add(ExpandedWeaponryItems.LONGBOW.builtInRegistryHolder().key());

        this.builder(ExpandedWeaponryTags.SLINGSHOT_PROJECTILES)
                .add(Items.IRON_NUGGET.builtInRegistryHolder().key())
                .add(Items.GOLD_NUGGET.builtInRegistryHolder().key())
                .add(Items.FLINT.builtInRegistryHolder().key());

        this.builder(ExpandedWeaponryTags.HEAVY_ARMORS)
                .add(ExpandedWeaponryItems.HEAVY_COPPER_HELMET.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_COPPER_CHESTPLATE.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_COPPER_LEGGINGS.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_COPPER_BOOTS.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_IRON_HELMET.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_IRON_CHESTPLATE.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_IRON_LEGGINGS.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_IRON_BOOTS.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_GOLDEN_HELMET.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_GOLDEN_CHESTPLATE.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_GOLDEN_LEGGINGS.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_GOLDEN_BOOTS.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_NETHERITE_HELMET.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_NETHERITE_CHESTPLATE.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_NETHERITE_LEGGINGS.builtInRegistryHolder().key())
                .add(ExpandedWeaponryItems.HEAVY_NETHERITE_BOOTS.builtInRegistryHolder().key());
    }
}
