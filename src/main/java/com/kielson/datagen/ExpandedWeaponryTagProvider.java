package com.kielson.datagen;

import com.kielson.ExpandedWeaponryTags;
import com.kielson.item.ExpandedWeaponryItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import java.util.concurrent.CompletableFuture;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ExpandedWeaponryTagProvider extends FabricTagProvider.ItemTagProvider {
    public ExpandedWeaponryTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        valueLookupBuilder(ExpandedWeaponryTags.DAGGERS)
                .add(ExpandedWeaponryItems.WOODEN_DAGGER)
                .add(ExpandedWeaponryItems.STONE_DAGGER)
                .add(ExpandedWeaponryItems.COPPER_DAGGER)
                .add(ExpandedWeaponryItems.IRON_DAGGER)
                .add(ExpandedWeaponryItems.GOLDEN_DAGGER)
                .add(ExpandedWeaponryItems.DIAMOND_DAGGER)
                .add(ExpandedWeaponryItems.NETHERITE_DAGGER);

        valueLookupBuilder(ExpandedWeaponryTags.HAMMERS)
                .add(ExpandedWeaponryItems.WOODEN_HAMMER)
                .add(ExpandedWeaponryItems.STONE_HAMMER)
                .add(ExpandedWeaponryItems.COPPER_HAMMER)
                .add(ExpandedWeaponryItems.IRON_HAMMER)
                .add(ExpandedWeaponryItems.GOLDEN_HAMMER)
                .add(ExpandedWeaponryItems.DIAMOND_HAMMER)
                .add(ExpandedWeaponryItems.NETHERITE_HAMMER);

        valueLookupBuilder(ExpandedWeaponryTags.BOWS)
                .add(ExpandedWeaponryItems.LONGBOW);

        valueLookupBuilder(ExpandedWeaponryTags.SLINGSHOT_PROJECTILES)
                .add(Items.IRON_NUGGET)
                .add(Items.GOLD_NUGGET)
                .add(Items.FLINT);

        valueLookupBuilder(ExpandedWeaponryTags.HEAVY_ARMORS)
                .add(ExpandedWeaponryItems.HEAVY_COPPER_HELMET)
                .add(ExpandedWeaponryItems.HEAVY_COPPER_CHESTPLATE)
                .add(ExpandedWeaponryItems.HEAVY_COPPER_LEGGINGS)
                .add(ExpandedWeaponryItems.HEAVY_COPPER_BOOTS)
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
