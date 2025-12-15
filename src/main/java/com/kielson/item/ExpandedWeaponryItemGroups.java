package com.kielson.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ExpandedWeaponryItemGroups {

    public static final CreativeModeTab ExpandedWeaponry = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, MOD_ID),
        FabricItemGroup.builder().title(Component.translatable("itemGroup." + MOD_ID)).icon(() -> new ItemStack(ExpandedWeaponryItems.GOLDEN_HAMMER)).displayItems((displayContext, entries) -> {
            entries.accept(ExpandedWeaponryItems.WOODEN_DAGGER);
            entries.accept(ExpandedWeaponryItems.STONE_DAGGER);
            entries.accept(ExpandedWeaponryItems.COPPER_DAGGER);
            entries.accept(ExpandedWeaponryItems.IRON_DAGGER);
            entries.accept(ExpandedWeaponryItems.GOLDEN_DAGGER);
            entries.accept(ExpandedWeaponryItems.DIAMOND_DAGGER);
            entries.accept(ExpandedWeaponryItems.NETHERITE_DAGGER);

            entries.accept(ExpandedWeaponryItems.WOODEN_HAMMER);
            entries.accept(ExpandedWeaponryItems.STONE_HAMMER);
            entries.accept(ExpandedWeaponryItems.COPPER_HAMMER);
            entries.accept(ExpandedWeaponryItems.IRON_HAMMER);
            entries.accept(ExpandedWeaponryItems.GOLDEN_HAMMER);
            entries.accept(ExpandedWeaponryItems.DIAMOND_HAMMER);
            entries.accept(ExpandedWeaponryItems.NETHERITE_HAMMER);

            entries.accept(ExpandedWeaponryItems.LONGBOW);
            entries.accept(ExpandedWeaponryItems.SLINGSHOT);


            entries.accept(ExpandedWeaponryItems.HEAVY_COPPER_HELMET);
            entries.accept(ExpandedWeaponryItems.HEAVY_COPPER_CHESTPLATE);
            entries.accept(ExpandedWeaponryItems.HEAVY_COPPER_LEGGINGS);
            entries.accept(ExpandedWeaponryItems.HEAVY_COPPER_BOOTS);

            entries.accept(ExpandedWeaponryItems.HEAVY_IRON_HELMET);
            entries.accept(ExpandedWeaponryItems.HEAVY_IRON_CHESTPLATE);
            entries.accept(ExpandedWeaponryItems.HEAVY_IRON_LEGGINGS);
            entries.accept(ExpandedWeaponryItems.HEAVY_IRON_BOOTS);

            entries.accept(ExpandedWeaponryItems.HEAVY_GOLDEN_HELMET);
            entries.accept(ExpandedWeaponryItems.HEAVY_GOLDEN_CHESTPLATE);
            entries.accept(ExpandedWeaponryItems.HEAVY_GOLDEN_LEGGINGS);
            entries.accept(ExpandedWeaponryItems.HEAVY_GOLDEN_BOOTS);

            entries.accept(ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET);
            entries.accept(ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE);
            entries.accept(ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS);
            entries.accept(ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS);

            entries.accept(ExpandedWeaponryItems.HEAVY_NETHERITE_HELMET);
            entries.accept(ExpandedWeaponryItems.HEAVY_NETHERITE_CHESTPLATE);
            entries.accept(ExpandedWeaponryItems.HEAVY_NETHERITE_LEGGINGS);
            entries.accept(ExpandedWeaponryItems.HEAVY_NETHERITE_BOOTS);

        }).build());

    public static void initialize() {
        addItemsToCombat();
    }

    private static void addItemsToCombat(){
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> {
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.NETHERITE_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.DIAMOND_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.GOLDEN_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.IRON_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.COPPER_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.STONE_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.WOODEN_DAGGER);

            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.NETHERITE_HAMMER);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.DIAMOND_HAMMER);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.GOLDEN_HAMMER);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.IRON_HAMMER);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.COPPER_HAMMER);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.STONE_HAMMER);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.WOODEN_HAMMER);

            content.addAfter(Items.BOW, ExpandedWeaponryItems.LONGBOW);
            content.addAfter(Items.CROSSBOW, ExpandedWeaponryItems.SLINGSHOT);

            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_COPPER_HELMET);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_COPPER_CHESTPLATE);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_COPPER_LEGGINGS);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_COPPER_BOOTS);

            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_IRON_HELMET);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_IRON_CHESTPLATE);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_IRON_LEGGINGS);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_IRON_BOOTS);

            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_GOLDEN_HELMET);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_GOLDEN_CHESTPLATE);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_GOLDEN_LEGGINGS);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_GOLDEN_BOOTS);

            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS);

            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_NETHERITE_HELMET);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_NETHERITE_CHESTPLATE);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_NETHERITE_LEGGINGS);
            content.addBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_NETHERITE_BOOTS);
        });
    }
}

