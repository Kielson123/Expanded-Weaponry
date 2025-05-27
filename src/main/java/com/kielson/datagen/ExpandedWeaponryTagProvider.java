package com.kielson.datagen;

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

    public static final TagKey<Item> SLINGSHOT_PROJECTILES = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "slingshot_projectiles"));
    public static final TagKey<Item> DAGGERS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "daggers"));
    public static final TagKey<Item> HAMMERS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "hammers"));
    public static final TagKey<Item> SPEARS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "spears"));
    public static final TagKey<Item> CUSTOM_BOWS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "custom_bows"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(DAGGERS)
                .add(ModItems.WOODEN_DAGGER)
                .add(ModItems.STONE_DAGGER)
                .add(ModItems.IRON_DAGGER)
                .add(ModItems.GOLDEN_DAGGER)
                .add(ModItems.DIAMOND_DAGGER)
                .add(ModItems.NETHERITE_DAGGER);

        getOrCreateTagBuilder(HAMMERS)
                .add(ModItems.WOODEN_HAMMER)
                .add(ModItems.STONE_HAMMER)
                .add(ModItems.IRON_HAMMER)
                .add(ModItems.GOLDEN_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);

        getOrCreateTagBuilder(SPEARS)
                .add(ModItems.WOODEN_SPEAR)
                .add(ModItems.STONE_SPEAR)
                .add(ModItems.IRON_SPEAR)
                .add(ModItems.GOLDEN_SPEAR)
                .add(ModItems.DIAMOND_SPEAR)
                .add(ModItems.NETHERITE_SPEAR);

        getOrCreateTagBuilder(CUSTOM_BOWS)
                .add(ModItems.LONGBOW);

        getOrCreateTagBuilder(SLINGSHOT_PROJECTILES)
                .add(Items.IRON_NUGGET)
                .add(Items.GOLD_NUGGET)
                .add(Items.FLINT);
    }
}
