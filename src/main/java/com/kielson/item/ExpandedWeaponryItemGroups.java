package com.kielson.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ExpandedWeaponryItemGroups {

    public static final ItemGroup ExpandedWeaponry = Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, MOD_ID),
        FabricItemGroup.builder().displayName(Text.translatable("itemGroup." + MOD_ID)).icon(() -> new ItemStack(ExpandedWeaponryItems.GOLDEN_HAMMER)).entries((displayContext, entries) -> {
            entries.add(ExpandedWeaponryItems.WOODEN_DAGGER);
            entries.add(ExpandedWeaponryItems.STONE_DAGGER);
            entries.add(ExpandedWeaponryItems.IRON_DAGGER);
            entries.add(ExpandedWeaponryItems.GOLDEN_DAGGER);
            entries.add(ExpandedWeaponryItems.DIAMOND_DAGGER);
            entries.add(ExpandedWeaponryItems.NETHERITE_DAGGER);

            entries.add(ExpandedWeaponryItems.WOODEN_HAMMER);
            entries.add(ExpandedWeaponryItems.STONE_HAMMER);
            entries.add(ExpandedWeaponryItems.IRON_HAMMER);
            entries.add(ExpandedWeaponryItems.GOLDEN_HAMMER);
            entries.add(ExpandedWeaponryItems.DIAMOND_HAMMER);
            entries.add(ExpandedWeaponryItems.NETHERITE_HAMMER);

            entries.add(ExpandedWeaponryItems.WOODEN_SPEAR);
            entries.add(ExpandedWeaponryItems.STONE_SPEAR);
            entries.add(ExpandedWeaponryItems.IRON_SPEAR);
            entries.add(ExpandedWeaponryItems.GOLDEN_SPEAR);
            entries.add(ExpandedWeaponryItems.DIAMOND_SPEAR);
            entries.add(ExpandedWeaponryItems.NETHERITE_SPEAR);

            entries.add(ExpandedWeaponryItems.LONGBOW);
            entries.add(ExpandedWeaponryItems.SLINGSHOT);

            entries.add(ExpandedWeaponryItems.HEAVY_IRON_HELMET);
            entries.add(ExpandedWeaponryItems.HEAVY_IRON_CHESTPLATE);
            entries.add(ExpandedWeaponryItems.HEAVY_IRON_LEGGINGS);
            entries.add(ExpandedWeaponryItems.HEAVY_IRON_BOOTS);

            entries.add(ExpandedWeaponryItems.HEAVY_GOLDEN_HELMET);
            entries.add(ExpandedWeaponryItems.HEAVY_GOLDEN_CHESTPLATE);
            entries.add(ExpandedWeaponryItems.HEAVY_GOLDEN_LEGGINGS);
            entries.add(ExpandedWeaponryItems.HEAVY_GOLDEN_BOOTS);

            entries.add(ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET);
            entries.add(ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE);
            entries.add(ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS);
            entries.add(ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS);

            entries.add(ExpandedWeaponryItems.HEAVY_NETHERITE_HELMET);
            entries.add(ExpandedWeaponryItems.HEAVY_NETHERITE_CHESTPLATE);
            entries.add(ExpandedWeaponryItems.HEAVY_NETHERITE_LEGGINGS);
            entries.add(ExpandedWeaponryItems.HEAVY_NETHERITE_BOOTS);

        }).build());

    public static void initialize() {
        addItemsToCombat();
    }

    private static void addItemsToCombat(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.NETHERITE_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.DIAMOND_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.GOLDEN_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.IRON_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.STONE_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.WOODEN_DAGGER);

            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.NETHERITE_HAMMER);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.DIAMOND_HAMMER);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.GOLDEN_HAMMER);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.IRON_HAMMER);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.STONE_HAMMER);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.WOODEN_HAMMER);

            content.addAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.NETHERITE_SPEAR);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.DIAMOND_SPEAR);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.GOLDEN_SPEAR);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.IRON_SPEAR);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.STONE_SPEAR);
            content.addAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.WOODEN_SPEAR);

            content.addAfter(Items.BOW, ExpandedWeaponryItems.LONGBOW);
            content.addAfter(Items.CROSSBOW, ExpandedWeaponryItems.SLINGSHOT);

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

