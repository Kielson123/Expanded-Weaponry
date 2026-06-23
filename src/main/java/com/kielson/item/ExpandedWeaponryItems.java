package com.kielson.item;

import com.kielson.item.custom.*;
import com.kielson.util.ItemHelper;
import com.kielson.util.RangedWeaponStats;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ExpandedWeaponryItems {

    //Daggers
    public static final Item WOODEN_DAGGER = ItemHelper.registerItem(MOD_ID, "wooden_dagger",
            properties -> new DaggerItem(ToolMaterial.WOOD, properties), new Item.Properties());
    public static final Item STONE_DAGGER = ItemHelper.registerItem(MOD_ID, "stone_dagger",
            properties -> new DaggerItem(ToolMaterial.STONE, properties), new Item.Properties());
    public static final Item COPPER_DAGGER = ItemHelper.registerItem(MOD_ID, "copper_dagger",
            properties -> new DaggerItem(ToolMaterial.COPPER, properties), new Item.Properties());
    public static final Item IRON_DAGGER = ItemHelper.registerItem(MOD_ID, "iron_dagger",
            properties -> new DaggerItem(ToolMaterial.IRON, properties), new Item.Properties());
    public static final Item GOLDEN_DAGGER = ItemHelper.registerItem(MOD_ID, "golden_dagger",
            properties -> new DaggerItem(ToolMaterial.GOLD, properties), new Item.Properties());
    public static final Item DIAMOND_DAGGER = ItemHelper.registerItem(MOD_ID, "diamond_dagger",
            properties -> new DaggerItem(ToolMaterial.DIAMOND, properties), new Item.Properties());
    public static final Item NETHERITE_DAGGER = ItemHelper.registerItem(MOD_ID, "netherite_dagger",
            properties -> new DaggerItem(ToolMaterial.NETHERITE, properties.fireResistant()), new Item.Properties());

    //Hammers
    public static final Item WOODEN_HAMMER = ItemHelper.registerItem(MOD_ID, "wooden_hammer",
            properties -> new HammerItem(ToolMaterial.WOOD, properties), new Item.Properties());
    public static final Item STONE_HAMMER = ItemHelper.registerItem(MOD_ID, "stone_hammer",
            properties -> new HammerItem(ToolMaterial.STONE, properties), new Item.Properties());
    public static final Item COPPER_HAMMER = ItemHelper.registerItem(MOD_ID, "copper_hammer",
            properties -> new HammerItem(ToolMaterial.COPPER, properties), new Item.Properties());
    public static final Item IRON_HAMMER = ItemHelper.registerItem(MOD_ID, "iron_hammer",
            properties -> new HammerItem(ToolMaterial.IRON, properties), new Item.Properties());
    public static final Item GOLDEN_HAMMER = ItemHelper.registerItem(MOD_ID, "golden_hammer",
            properties -> new HammerItem(ToolMaterial.GOLD, properties), new Item.Properties());
    public static final Item DIAMOND_HAMMER = ItemHelper.registerItem(MOD_ID, "diamond_hammer",
            properties -> new HammerItem(ToolMaterial.DIAMOND, properties), new Item.Properties());
    public static final Item NETHERITE_HAMMER = ItemHelper.registerItem(MOD_ID, "netherite_hammer",
            properties -> new HammerItem(ToolMaterial.NETHERITE, properties.fireResistant()), new Item.Properties());

    //Twin Blade Swords
    public static final Item WOODEN_TWIN_BLADE_SWORD = ItemHelper.registerItem(MOD_ID, "wooden_twin_blade_sword",
            properties -> new TwinBladeSwordItem(ToolMaterial.WOOD, properties), new Item.Properties());
    public static final Item STONE_TWIN_BLADE_SWORD = ItemHelper.registerItem(MOD_ID, "stone_twin_blade_sword",
            properties -> new TwinBladeSwordItem(ToolMaterial.STONE, properties), new Item.Properties());
    public static final Item COPPER_TWIN_BLADE_SWORD = ItemHelper.registerItem(MOD_ID, "copper_twin_blade_sword",
            properties -> new TwinBladeSwordItem(ToolMaterial.COPPER, properties), new Item.Properties());
    public static final Item IRON_TWIN_BLADE_SWORD = ItemHelper.registerItem(MOD_ID, "iron_twin_blade_sword",
            properties -> new TwinBladeSwordItem(ToolMaterial.IRON, properties), new Item.Properties());
    public static final Item GOLDEN_TWIN_BLADE_SWORD = ItemHelper.registerItem(MOD_ID, "golden_twin_blade_sword",
            properties -> new TwinBladeSwordItem(ToolMaterial.GOLD, properties), new Item.Properties());
    public static final Item DIAMOND_TWIN_BLADE_SWORD = ItemHelper.registerItem(MOD_ID, "diamond_twin_blade_sword",
            properties -> new TwinBladeSwordItem(ToolMaterial.DIAMOND, properties), new Item.Properties());
    public static final Item NETHERITE_TWIN_BLADE_SWORD = ItemHelper.registerItem(MOD_ID, "netherite_twin_blade_sword",
            properties -> new TwinBladeSwordItem(ToolMaterial.NETHERITE, properties), new Item.Properties());

    //Greatswords
    public static final Item WOODEN_GREATSWORD = ItemHelper.registerItem(MOD_ID, "wooden_greatsword",
            properties -> new GreatswordItem(ToolMaterial.WOOD, properties), new Item.Properties());
    public static final Item STONE_GREATSWORD = ItemHelper.registerItem(MOD_ID, "stone_greatsword",
            properties -> new GreatswordItem(ToolMaterial.STONE, properties), new Item.Properties());
    public static final Item COPPER_GREATSWORD = ItemHelper.registerItem(MOD_ID, "copper_greatsword",
            properties -> new GreatswordItem(ToolMaterial.COPPER, properties), new Item.Properties());
    public static final Item IRON_GREATSWORD = ItemHelper.registerItem(MOD_ID, "iron_greatsword",
            properties -> new GreatswordItem(ToolMaterial.IRON, properties), new Item.Properties());
    public static final Item GOLDEN_GREATSWORD = ItemHelper.registerItem(MOD_ID, "golden_greatsword",
            properties -> new GreatswordItem(ToolMaterial.GOLD, properties), new Item.Properties());
    public static final Item DIAMOND_GREATSWORD = ItemHelper.registerItem(MOD_ID, "diamond_greatsword",
            properties -> new GreatswordItem(ToolMaterial.DIAMOND, properties), new Item.Properties());
    public static final Item NETHERITE_GREATSWORD = ItemHelper.registerItem(MOD_ID, "netherite_greatsword",
            properties -> new GreatswordItem(ToolMaterial.NETHERITE, properties), new Item.Properties());

    //Ranged
    public static final Item LONGBOW = ItemHelper.registerItem(MOD_ID, "longbow",
            properties -> new CustomBow(new RangedWeaponStats(8.5, 1.8, 3.75), properties.durability(428)), new Item.Properties());
    public static final Item SLINGSHOT = ItemHelper.registerItem(MOD_ID, "slingshot", SlingshotItem::new, new Item.Properties());

    //Armor
    public static final Item HEAVY_COPPER_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_copper_helmet", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.HELMET, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.HELMET));
    public static final Item HEAVY_COPPER_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_copper_chestplate", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.CHESTPLATE, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.CHESTPLATE));
    public static final Item HEAVY_COPPER_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_copper_leggings", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.LEGGINGS, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.LEGGINGS));
    public static final Item HEAVY_COPPER_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_copper_boots", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.BOOTS, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_COPPER, ArmorType.BOOTS));

    public static final Item HEAVY_IRON_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_iron_helmet", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.HELMET, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.HELMET));
    public static final Item HEAVY_IRON_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_iron_chestplate", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.CHESTPLATE, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.CHESTPLATE));
    public static final Item HEAVY_IRON_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_iron_leggings", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.LEGGINGS, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.LEGGINGS));
    public static final Item HEAVY_IRON_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_iron_boots", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.BOOTS, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_IRON, ArmorType.BOOTS));

    public static final Item HEAVY_GOLDEN_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_golden_helmet", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.HELMET, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.HELMET));
    public static final Item HEAVY_GOLDEN_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_golden_chestplate", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.CHESTPLATE, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.CHESTPLATE));
    public static final Item HEAVY_GOLDEN_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_golden_leggings", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.LEGGINGS, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.LEGGINGS));
    public static final Item HEAVY_GOLDEN_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_golden_boots", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.BOOTS, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, ArmorType.BOOTS));

    public static final Item HEAVY_DIAMOND_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_diamond_helmet", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.HELMET, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.HELMET));
    public static final Item HEAVY_DIAMOND_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_diamond_chestplate", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.CHESTPLATE, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.CHESTPLATE));
    public static final Item HEAVY_DIAMOND_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_diamond_leggings", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.LEGGINGS, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.LEGGINGS));
    public static final Item HEAVY_DIAMOND_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_diamond_boots", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.BOOTS, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, ArmorType.BOOTS));

    public static final Item HEAVY_NETHERITE_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_netherite_helmet", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.HELMET, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.HELMET).fireResistant());
    public static final Item HEAVY_NETHERITE_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_netherite_chestplate", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.CHESTPLATE, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.CHESTPLATE).fireResistant());
    public static final Item HEAVY_NETHERITE_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_netherite_leggings", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.LEGGINGS, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.LEGGINGS).fireResistant());
    public static final Item HEAVY_NETHERITE_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_netherite_boots", properties -> new HeavyArmorItem(
            ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.BOOTS, properties), new Item.Properties().humanoidArmor(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, ArmorType.BOOTS).fireResistant());



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
