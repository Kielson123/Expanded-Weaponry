package com.kielson.datagen;

import com.kielson.ExpandedWeaponryTags;
import com.kielson.item.ExpandedWeaponryItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagEntry;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ExpandedWeaponryTagProvider extends FabricTagProvider.ItemTagProvider {
    public ExpandedWeaponryTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        valueLookupBuilder(ExpandedWeaponryTags.DAGGERS)
                .add(ExpandedWeaponryItems.WOODEN_DAGGER)
                .add(ExpandedWeaponryItems.STONE_DAGGER)
                .add(ExpandedWeaponryItems.IRON_DAGGER)
                .add(ExpandedWeaponryItems.GOLDEN_DAGGER)
                .add(ExpandedWeaponryItems.DIAMOND_DAGGER)
                .add(ExpandedWeaponryItems.NETHERITE_DAGGER);

        valueLookupBuilder(ExpandedWeaponryTags.HAMMERS)
                .add(ExpandedWeaponryItems.WOODEN_HAMMER)
                .add(ExpandedWeaponryItems.STONE_HAMMER)
                .add(ExpandedWeaponryItems.IRON_HAMMER)
                .add(ExpandedWeaponryItems.GOLDEN_HAMMER)
                .add(ExpandedWeaponryItems.DIAMOND_HAMMER)
                .add(ExpandedWeaponryItems.NETHERITE_HAMMER);

        valueLookupBuilder(ExpandedWeaponryTags.SPEARS)
                .add(ExpandedWeaponryItems.WOODEN_SPEAR)
                .add(ExpandedWeaponryItems.STONE_SPEAR)
                .add(ExpandedWeaponryItems.IRON_SPEAR)
                .add(ExpandedWeaponryItems.GOLDEN_SPEAR)
                .add(ExpandedWeaponryItems.DIAMOND_SPEAR)
                .add(ExpandedWeaponryItems.NETHERITE_SPEAR);

        valueLookupBuilder(ExpandedWeaponryTags.BOWS)
                .add(ExpandedWeaponryItems.LONGBOW);

        valueLookupBuilder(ExpandedWeaponryTags.SLINGSHOT_PROJECTILES)
                .add(Items.IRON_NUGGET)
                .add(Items.GOLD_NUGGET)
                .add(Items.FLINT);

        valueLookupBuilder(ExpandedWeaponryTags.HEAVY_ARMORS)
                .add(ExpandedWeaponryItems.HEAVY_IRON_HELMET)
                .add(ExpandedWeaponryItems.HEAVY_IRON_CHESTPLATE)
                .add(ExpandedWeaponryItems.HEAVY_IRON_LEGGINGS)
                .add(ExpandedWeaponryItems.HEAVY_IRON_BOOTS)
                .add(ExpandedWeaponryItems.HEAVY_GOLDEN_HELMET)
                .add(ExpandedWeaponryItems.HEAVY_GOLDEN_CHESTPLATE)
                .add(ExpandedWeaponryItems.HEAVY_GOLDEN_LEGGINGS)
                .add(ExpandedWeaponryItems.HEAVY_GOLDEN_BOOTS)
                .add(ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET)
                .add(ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE)
                .add(ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS)
                .add(ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS)
                .add(ExpandedWeaponryItems.HEAVY_NETHERITE_HELMET)
                .add(ExpandedWeaponryItems.HEAVY_NETHERITE_CHESTPLATE)
                .add(ExpandedWeaponryItems.HEAVY_NETHERITE_LEGGINGS)
                .add(ExpandedWeaponryItems.HEAVY_NETHERITE_BOOTS);
    }
}
