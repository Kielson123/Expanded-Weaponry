package com.kielson.datagen;

import com.kielson.ModTags;
import com.kielson.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ExpandedWeaponryTagProvider extends FabricTagProvider.ItemTagProvider {
    public ExpandedWeaponryTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.DAGGERS)
                .add(ModItems.WOODEN_DAGGER)
                .add(ModItems.STONE_DAGGER)
                .add(ModItems.IRON_DAGGER)
                .add(ModItems.GOLDEN_DAGGER)
                .add(ModItems.DIAMOND_DAGGER)
                .add(ModItems.NETHERITE_DAGGER);

        getOrCreateTagBuilder(ModTags.HAMMERS)
                .add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLDEN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);

        getOrCreateTagBuilder(ModTags.SPEARS)
                .add(ModItems.WOODEN_SPEAR)
                .add(ModItems.STONE_SPEAR)
                .add(ModItems.IRON_SPEAR)
                .add(ModItems.GOLDEN_SPEAR)
                .add(ModItems.DIAMOND_SPEAR)
                .add(ModItems.NETHERITE_SPEAR);

        getOrCreateTagBuilder(ModTags.BOWS)
                .add(ModItems.LONGBOW);

        getOrCreateTagBuilder(ModTags.SLINGSHOT_PROJECTILES)
                .add(Items.IRON_NUGGET)
                .add(Items.GOLD_NUGGET)
                .add(Items.FLINT);

        getOrCreateTagBuilder(ModTags.HEAVY_ARMORS)
                .add(ModItems.HEAVY_IRON_HELMET)
                .add(ModItems.HEAVY_IRON_CHESTPLATE)
                .add(ModItems.HEAVY_IRON_LEGGINGS)
                .add(ModItems.HEAVY_IRON_BOOTS)
                .add(ModItems.HEAVY_GOLDEN_HELMET)
                .add(ModItems.HEAVY_GOLDEN_CHESTPLATE)
                .add(ModItems.HEAVY_GOLDEN_LEGGINGS)
                .add(ModItems.HEAVY_GOLDEN_BOOTS)
                .add(ModItems.HEAVY_DIAMOND_HELMET)
                .add(ModItems.HEAVY_DIAMOND_CHESTPLATE)
                .add(ModItems.HEAVY_DIAMOND_LEGGINGS)
                .add(ModItems.HEAVY_DIAMOND_BOOTS)
                .add(ModItems.HEAVY_NETHERITE_HELMET)
                .add(ModItems.HEAVY_NETHERITE_CHESTPLATE)
                .add(ModItems.HEAVY_NETHERITE_LEGGINGS)
                .add(ModItems.HEAVY_NETHERITE_BOOTS);
    }
}
