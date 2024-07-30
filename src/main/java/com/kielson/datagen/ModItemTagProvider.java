package com.kielson.datagen;

import com.kielson.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.kielson.KielsonsEnhancedCombat.MOD_ID;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    public static final TagKey<Item> DAGGERS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "daggers"));
    public static final TagKey<Item> CUSTOM_BOWS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "custom_bows"));
    public static final TagKey<Item> SWEEPING_DISABLED = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "sweeping_disabled"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(DAGGERS)
                .add(ModItems.WOODEN_DAGGER)
                .add(ModItems.STONE_DAGGER)
                .add(ModItems.IRON_DAGGER)
                .add(ModItems.GOLDEN_DAGGER)
                .add(ModItems.DIAMOND_DAGGER)
                .add(ModItems.NETHERITE_DAGGER);

        getOrCreateTagBuilder(CUSTOM_BOWS)
                .add(ModItems.LONGBOW);
    }
}
