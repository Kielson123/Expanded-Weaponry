package com.kielson.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ExpandedWeaponryItemGroups {

    public static final ResourceKey<CreativeModeTab> EXPANDED_WEAPONRY_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(MOD_ID, "expanded_weaponry")
    );

    public static final CreativeModeTab EXPANDED_WEAPONRY_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ExpandedWeaponryItems.GOLDEN_HAMMER)).title(Component.translatable("itemGroup." + MOD_ID))
            .displayItems((_, output) -> {
                output.accept(ExpandedWeaponryItems.WOODEN_DAGGER);
                output.accept(ExpandedWeaponryItems.STONE_DAGGER);
                output.accept(ExpandedWeaponryItems.COPPER_DAGGER);
                output.accept(ExpandedWeaponryItems.IRON_DAGGER);
                output.accept(ExpandedWeaponryItems.GOLDEN_DAGGER);
                output.accept(ExpandedWeaponryItems.DIAMOND_DAGGER);
                output.accept(ExpandedWeaponryItems.NETHERITE_DAGGER);

                output.accept(ExpandedWeaponryItems.WOODEN_HAMMER);
                output.accept(ExpandedWeaponryItems.STONE_HAMMER);
                output.accept(ExpandedWeaponryItems.COPPER_HAMMER);
                output.accept(ExpandedWeaponryItems.IRON_HAMMER);
                output.accept(ExpandedWeaponryItems.GOLDEN_HAMMER);
                output.accept(ExpandedWeaponryItems.DIAMOND_HAMMER);
                output.accept(ExpandedWeaponryItems.NETHERITE_HAMMER);

                output.accept(ExpandedWeaponryItems.WOODEN_TWIN_BLADE_SWORD);
                output.accept(ExpandedWeaponryItems.STONE_TWIN_BLADE_SWORD);
                output.accept(ExpandedWeaponryItems.COPPER_TWIN_BLADE_SWORD);
                output.accept(ExpandedWeaponryItems.IRON_TWIN_BLADE_SWORD);
                output.accept(ExpandedWeaponryItems.GOLDEN_TWIN_BLADE_SWORD);
                output.accept(ExpandedWeaponryItems.DIAMOND_TWIN_BLADE_SWORD);
                output.accept(ExpandedWeaponryItems.NETHERITE_TWIN_BLADE_SWORD);

                output.accept(ExpandedWeaponryItems.WOODEN_GREATSWORD);
                output.accept(ExpandedWeaponryItems.STONE_GREATSWORD);
                output.accept(ExpandedWeaponryItems.COPPER_GREATSWORD);
                output.accept(ExpandedWeaponryItems.IRON_GREATSWORD);
                output.accept(ExpandedWeaponryItems.GOLDEN_GREATSWORD);
                output.accept(ExpandedWeaponryItems.DIAMOND_GREATSWORD);
                output.accept(ExpandedWeaponryItems.NETHERITE_GREATSWORD);

                output.accept(ExpandedWeaponryItems.LONGBOW);
                output.accept(ExpandedWeaponryItems.SLINGSHOT);

                output.accept(ExpandedWeaponryItems.WOODEN_SHIELD);
                output.accept(ExpandedWeaponryItems.STONE_SHIELD);
                output.accept(ExpandedWeaponryItems.COPPER_SHIELD);
                output.accept(ExpandedWeaponryItems.IRON_SHIELD);
                output.accept(ExpandedWeaponryItems.GOLDEN_SHIELD);
                output.accept(ExpandedWeaponryItems.DIAMOND_SHIELD);
                output.accept(ExpandedWeaponryItems.NETHERITE_SHIELD);

                output.accept(ExpandedWeaponryItems.HEAVY_COPPER_HELMET);
                output.accept(ExpandedWeaponryItems.HEAVY_COPPER_CHESTPLATE);
                output.accept(ExpandedWeaponryItems.HEAVY_COPPER_LEGGINGS);
                output.accept(ExpandedWeaponryItems.HEAVY_COPPER_BOOTS);

                output.accept(ExpandedWeaponryItems.HEAVY_IRON_HELMET);
                output.accept(ExpandedWeaponryItems.HEAVY_IRON_CHESTPLATE);
                output.accept(ExpandedWeaponryItems.HEAVY_IRON_LEGGINGS);
                output.accept(ExpandedWeaponryItems.HEAVY_IRON_BOOTS);

                output.accept(ExpandedWeaponryItems.HEAVY_GOLDEN_HELMET);
                output.accept(ExpandedWeaponryItems.HEAVY_GOLDEN_CHESTPLATE);
                output.accept(ExpandedWeaponryItems.HEAVY_GOLDEN_LEGGINGS);
                output.accept(ExpandedWeaponryItems.HEAVY_GOLDEN_BOOTS);

                output.accept(ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET);
                output.accept(ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE);
                output.accept(ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS);
                output.accept(ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS);

                output.accept(ExpandedWeaponryItems.HEAVY_NETHERITE_HELMET);
                output.accept(ExpandedWeaponryItems.HEAVY_NETHERITE_CHESTPLATE);
                output.accept(ExpandedWeaponryItems.HEAVY_NETHERITE_LEGGINGS);
                output.accept(ExpandedWeaponryItems.HEAVY_NETHERITE_BOOTS);

            }).build();

    private static void addItemsToCombat(){
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(content -> {
            content.insertAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.NETHERITE_DAGGER);
            content.insertAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.DIAMOND_DAGGER);
            content.insertAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.GOLDEN_DAGGER);
            content.insertAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.IRON_DAGGER);
            content.insertAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.COPPER_DAGGER);
            content.insertAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.STONE_DAGGER);
            content.insertAfter(Items.NETHERITE_AXE, ExpandedWeaponryItems.WOODEN_DAGGER);

            content.insertAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.NETHERITE_HAMMER);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.DIAMOND_HAMMER);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.GOLDEN_HAMMER);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.IRON_HAMMER);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.COPPER_HAMMER);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.STONE_HAMMER);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_DAGGER, ExpandedWeaponryItems.WOODEN_HAMMER);

            content.insertAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.NETHERITE_TWIN_BLADE_SWORD);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.DIAMOND_TWIN_BLADE_SWORD);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.GOLDEN_TWIN_BLADE_SWORD);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.IRON_TWIN_BLADE_SWORD);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.COPPER_TWIN_BLADE_SWORD);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.STONE_TWIN_BLADE_SWORD);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_HAMMER, ExpandedWeaponryItems.WOODEN_TWIN_BLADE_SWORD);

            content.insertAfter(ExpandedWeaponryItems.NETHERITE_TWIN_BLADE_SWORD, ExpandedWeaponryItems.NETHERITE_GREATSWORD);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_TWIN_BLADE_SWORD, ExpandedWeaponryItems.DIAMOND_GREATSWORD);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_TWIN_BLADE_SWORD, ExpandedWeaponryItems.GOLDEN_GREATSWORD);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_TWIN_BLADE_SWORD, ExpandedWeaponryItems.IRON_GREATSWORD);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_TWIN_BLADE_SWORD, ExpandedWeaponryItems.COPPER_GREATSWORD);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_TWIN_BLADE_SWORD, ExpandedWeaponryItems.STONE_GREATSWORD);
            content.insertAfter(ExpandedWeaponryItems.NETHERITE_TWIN_BLADE_SWORD, ExpandedWeaponryItems.WOODEN_GREATSWORD);

            content.insertAfter(Items.MACE, ExpandedWeaponryItems.NETHERITE_SHIELD);
            content.insertAfter(Items.MACE, ExpandedWeaponryItems.DIAMOND_SHIELD);
            content.insertAfter(Items.MACE, ExpandedWeaponryItems.GOLDEN_SHIELD);
            content.insertAfter(Items.MACE, ExpandedWeaponryItems.IRON_SHIELD);
            content.insertAfter(Items.MACE, ExpandedWeaponryItems.COPPER_SHIELD);
            content.insertAfter(Items.MACE, ExpandedWeaponryItems.STONE_SHIELD);
            content.insertAfter(Items.MACE, ExpandedWeaponryItems.WOODEN_SHIELD);

            content.insertAfter(Items.BOW, ExpandedWeaponryItems.LONGBOW);
            content.insertAfter(Items.CROSSBOW, ExpandedWeaponryItems.SLINGSHOT);

            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_COPPER_HELMET);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_COPPER_CHESTPLATE);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_COPPER_LEGGINGS);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_COPPER_BOOTS);

            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_IRON_HELMET);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_IRON_CHESTPLATE);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_IRON_LEGGINGS);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_IRON_BOOTS);

            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_GOLDEN_HELMET);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_GOLDEN_CHESTPLATE);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_GOLDEN_LEGGINGS);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_GOLDEN_BOOTS);

            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_DIAMOND_HELMET);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_DIAMOND_CHESTPLATE);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_DIAMOND_LEGGINGS);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_DIAMOND_BOOTS);

            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_NETHERITE_HELMET);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_NETHERITE_CHESTPLATE);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_NETHERITE_LEGGINGS);
            content.insertBefore(Items.TURTLE_HELMET, ExpandedWeaponryItems.HEAVY_NETHERITE_BOOTS);
        });
    }

    public static void initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, EXPANDED_WEAPONRY_KEY, EXPANDED_WEAPONRY_TAB);
        addItemsToCombat();
    }
}

