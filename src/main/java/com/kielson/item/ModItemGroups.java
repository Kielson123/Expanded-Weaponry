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

public class ModItemGroups {

    public static final ItemGroup ExpandedWeaponry = Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, MOD_ID),
        FabricItemGroup.builder().displayName(Text.translatable("itemGroup." + MOD_ID)).icon(() -> new ItemStack(ModItems.GOLDEN_HAMMER)).entries((displayContext, entries) -> {
            entries.add(ModItems.WOODEN_DAGGER);
            entries.add(ModItems.STONE_DAGGER);
            entries.add(ModItems.IRON_DAGGER);
            entries.add(ModItems.GOLDEN_DAGGER);
            entries.add(ModItems.DIAMOND_DAGGER);
            entries.add(ModItems.NETHERITE_DAGGER);

            entries.add(ModItems.WOODEN_HAMMER);
            entries.add(ModItems.STONE_HAMMER);
            entries.add(ModItems.IRON_HAMMER);
            entries.add(ModItems.GOLDEN_HAMMER);
            entries.add(ModItems.DIAMOND_HAMMER);
            entries.add(ModItems.NETHERITE_HAMMER);

            entries.add(ModItems.WOODEN_SPEAR);
            entries.add(ModItems.STONE_SPEAR);
            entries.add(ModItems.IRON_SPEAR);
            entries.add(ModItems.GOLDEN_SPEAR);
            entries.add(ModItems.DIAMOND_SPEAR);
            entries.add(ModItems.NETHERITE_SPEAR);

            entries.add(ModItems.LONGBOW);
            entries.add(ModItems.SLINGSHOT);

            entries.add(ModItems.HEAVY_IRON_HELMET);
            entries.add(ModItems.HEAVY_IRON_CHESTPLATE);
            entries.add(ModItems.HEAVY_IRON_LEGGINGS);
            entries.add(ModItems.HEAVY_IRON_BOOTS);

            entries.add(ModItems.HEAVY_GOLDEN_HELMET);
            entries.add(ModItems.HEAVY_GOLDEN_CHESTPLATE);
            entries.add(ModItems.HEAVY_GOLDEN_LEGGINGS);
            entries.add(ModItems.HEAVY_GOLDEN_BOOTS);

            entries.add(ModItems.HEAVY_DIAMOND_HELMET);
            entries.add(ModItems.HEAVY_DIAMOND_CHESTPLATE);
            entries.add(ModItems.HEAVY_DIAMOND_LEGGINGS);
            entries.add(ModItems.HEAVY_DIAMOND_BOOTS);

            entries.add(ModItems.HEAVY_NETHERITE_HELMET);
            entries.add(ModItems.HEAVY_NETHERITE_CHESTPLATE);
            entries.add(ModItems.HEAVY_NETHERITE_LEGGINGS);
            entries.add(ModItems.HEAVY_NETHERITE_BOOTS);

        }).build());

    public static void initialize() {
        addItemsToCombat();
    }

    private static void addItemsToCombat(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.addAfter(Items.NETHERITE_AXE, ModItems.NETHERITE_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ModItems.DIAMOND_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ModItems.GOLDEN_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ModItems.IRON_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ModItems.STONE_DAGGER);
            content.addAfter(Items.NETHERITE_AXE, ModItems.WOODEN_DAGGER);

            content.addAfter(ModItems.NETHERITE_DAGGER, ModItems.NETHERITE_HAMMER);
            content.addAfter(ModItems.NETHERITE_DAGGER, ModItems.DIAMOND_HAMMER);
            content.addAfter(ModItems.NETHERITE_DAGGER, ModItems.GOLDEN_HAMMER);
            content.addAfter(ModItems.NETHERITE_DAGGER, ModItems.IRON_HAMMER);
            content.addAfter(ModItems.NETHERITE_DAGGER, ModItems.STONE_HAMMER);
            content.addAfter(ModItems.NETHERITE_DAGGER, ModItems.WOODEN_HAMMER);

            content.addAfter(ModItems.NETHERITE_HAMMER, ModItems.NETHERITE_SPEAR);
            content.addAfter(ModItems.NETHERITE_HAMMER, ModItems.DIAMOND_SPEAR);
            content.addAfter(ModItems.NETHERITE_HAMMER, ModItems.GOLDEN_SPEAR);
            content.addAfter(ModItems.NETHERITE_HAMMER, ModItems.IRON_SPEAR);
            content.addAfter(ModItems.NETHERITE_HAMMER, ModItems.STONE_SPEAR);
            content.addAfter(ModItems.NETHERITE_HAMMER, ModItems.WOODEN_SPEAR);

            content.addAfter(Items.BOW, ModItems.LONGBOW);
            content.addAfter(Items.CROSSBOW, ModItems.SLINGSHOT);

            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_IRON_HELMET);
            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_IRON_CHESTPLATE);
            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_IRON_LEGGINGS);
            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_IRON_BOOTS);

            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_GOLDEN_HELMET);
            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_GOLDEN_CHESTPLATE);
            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_GOLDEN_LEGGINGS);
            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_GOLDEN_BOOTS);

            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_DIAMOND_HELMET);
            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_DIAMOND_CHESTPLATE);
            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_DIAMOND_LEGGINGS);
            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_DIAMOND_BOOTS);

            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_NETHERITE_HELMET);
            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_NETHERITE_CHESTPLATE);
            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_NETHERITE_LEGGINGS);
            content.addBefore(Items.TURTLE_HELMET, ModItems.HEAVY_NETHERITE_BOOTS);
        });
    }
}

