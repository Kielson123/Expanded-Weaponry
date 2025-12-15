package com.kielson.item;

import com.kielson.item.custom.*;
import com.kielson.util.ItemHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ExpandedWeaponryItems {

    //Daggers
    public static final Item WOODEN_DAGGER = ItemHelper.registerItem(MOD_ID, "wooden_dagger",
            settings -> new DaggerItem(ToolMaterial.WOOD, settings), new Item.Properties());
    public static final Item STONE_DAGGER = ItemHelper.registerItem(MOD_ID, "stone_dagger",
            settings -> new DaggerItem(ToolMaterial.STONE, settings), new Item.Properties());
    public static final Item COPPER_DAGGER = ItemHelper.registerItem(MOD_ID, "copper_dagger",
            settings -> new DaggerItem(ToolMaterial.COPPER, settings), new Item.Properties());
    public static final Item IRON_DAGGER = ItemHelper.registerItem(MOD_ID, "iron_dagger",
            settings -> new DaggerItem(ToolMaterial.IRON, settings), new Item.Properties());
    public static final Item GOLDEN_DAGGER = ItemHelper.registerItem(MOD_ID, "golden_dagger",
            settings -> new DaggerItem(ToolMaterial.GOLD, settings), new Item.Properties());
    public static final Item DIAMOND_DAGGER = ItemHelper.registerItem(MOD_ID, "diamond_dagger",
            settings -> new DaggerItem(ToolMaterial.DIAMOND, settings), new Item.Properties());
    public static final Item NETHERITE_DAGGER = ItemHelper.registerItem(MOD_ID, "netherite_dagger",
            settings -> new DaggerItem(ToolMaterial.NETHERITE, settings.fireResistant()), new Item.Properties());

    //Hammers
    public static final Item WOODEN_HAMMER = ItemHelper.registerItem(MOD_ID, "wooden_hammer",
            settings -> new HammerItem(ToolMaterial.WOOD, settings), new Item.Properties());
    public static final Item STONE_HAMMER = ItemHelper.registerItem(MOD_ID, "stone_hammer",
            settings -> new HammerItem(ToolMaterial.STONE, settings), new Item.Properties());
    public static final Item COPPER_HAMMER = ItemHelper.registerItem(MOD_ID, "copper_hammer",
            settings -> new HammerItem(ToolMaterial.COPPER, settings), new Item.Properties());
    public static final Item IRON_HAMMER = ItemHelper.registerItem(MOD_ID, "iron_hammer",
            settings -> new HammerItem(ToolMaterial.IRON, settings), new Item.Properties());
    public static final Item GOLDEN_HAMMER = ItemHelper.registerItem(MOD_ID, "golden_hammer",
            settings -> new HammerItem(ToolMaterial.GOLD, settings), new Item.Properties());
    public static final Item DIAMOND_HAMMER = ItemHelper.registerItem(MOD_ID, "diamond_hammer",
            settings -> new HammerItem(ToolMaterial.DIAMOND, settings), new Item.Properties());
    public static final Item NETHERITE_HAMMER = ItemHelper.registerItem(MOD_ID, "netherite_hammer",
            settings -> new HammerItem(ToolMaterial.NETHERITE, settings.fireResistant()), new Item.Properties());

    //Ranged
    public static final Item LONGBOW = ItemHelper.registerItem(MOD_ID, "longbow",
            settings -> new CustomBow(8.5, 1.8, 3.75, settings.durability(428)), new Item.Properties());
    public static final Item SLINGSHOT = ItemHelper.registerItem(MOD_ID, "slingshot", SlingshotItem::new, new Item.Properties());

    //Armor
    public static final Item HEAVY_COPPER_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_copper_helmet", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.HELMET, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.HELMET));
    public static final Item HEAVY_COPPER_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_copper_chestplate", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.CHESTPLATE, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.CHESTPLATE));
    public static final Item HEAVY_COPPER_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_copper_leggings", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.LEGGINGS, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.LEGGINGS));
    public static final Item HEAVY_COPPER_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_copper_boots", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.BOOTS, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.BOOTS));

    public static final Item HEAVY_IRON_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_iron_helmet", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.HELMET, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.HELMET));
    public static final Item HEAVY_IRON_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_iron_chestplate", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.CHESTPLATE, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.CHESTPLATE));
    public static final Item HEAVY_IRON_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_iron_leggings", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.LEGGINGS, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.LEGGINGS));
    public static final Item HEAVY_IRON_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_iron_boots", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.BOOTS, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.BOOTS));

    public static final Item HEAVY_GOLDEN_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_golden_helmet", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.HELMET, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.HELMET));
    public static final Item HEAVY_GOLDEN_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_golden_chestplate", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.CHESTPLATE, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.CHESTPLATE));
    public static final Item HEAVY_GOLDEN_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_golden_leggings", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.LEGGINGS, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.LEGGINGS));
    public static final Item HEAVY_GOLDEN_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_golden_boots", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.BOOTS, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.BOOTS));

    public static final Item HEAVY_DIAMOND_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_diamond_helmet", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.HELMET, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.HELMET));
    public static final Item HEAVY_DIAMOND_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_diamond_chestplate", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.CHESTPLATE, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.CHESTPLATE));
    public static final Item HEAVY_DIAMOND_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_diamond_leggings", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.LEGGINGS, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.LEGGINGS));
    public static final Item HEAVY_DIAMOND_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_diamond_boots", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.BOOTS, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.BOOTS));

    public static final Item HEAVY_NETHERITE_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_netherite_helmet", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.HELMET, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.HELMET).fireResistant());
    public static final Item HEAVY_NETHERITE_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_netherite_chestplate", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.CHESTPLATE, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.CHESTPLATE).fireResistant());
    public static final Item HEAVY_NETHERITE_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_netherite_leggings", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.LEGGINGS, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.LEGGINGS).fireResistant());
    public static final Item HEAVY_NETHERITE_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_netherite_boots", settings -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.BOOTS, settings), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.BOOTS).fireResistant());



    //Model generation
    public static final Item[] ITEMS_HANDHELD = new Item[]{
            WOODEN_DAGGER, STONE_DAGGER, COPPER_DAGGER, IRON_DAGGER, GOLDEN_DAGGER, DIAMOND_DAGGER, NETHERITE_DAGGER,
    };
    public static final Item[] ITEMS_DEFAULT = new Item[]{
            HEAVY_COPPER_HELMET, HEAVY_COPPER_CHESTPLATE, HEAVY_COPPER_LEGGINGS, HEAVY_COPPER_BOOTS,
            HEAVY_IRON_HELMET, HEAVY_IRON_CHESTPLATE, HEAVY_IRON_LEGGINGS, HEAVY_IRON_BOOTS,
            HEAVY_GOLDEN_HELMET, HEAVY_GOLDEN_CHESTPLATE, HEAVY_GOLDEN_LEGGINGS, HEAVY_GOLDEN_BOOTS,
            HEAVY_DIAMOND_HELMET, HEAVY_DIAMOND_CHESTPLATE, HEAVY_DIAMOND_LEGGINGS, HEAVY_DIAMOND_BOOTS,
            HEAVY_NETHERITE_HELMET, HEAVY_NETHERITE_CHESTPLATE, HEAVY_NETHERITE_LEGGINGS, HEAVY_NETHERITE_BOOTS,
    };
    public static final Item[] ITEMS_CUSTOM = new Item[]{

    };

    public static void initialize() {}
}
