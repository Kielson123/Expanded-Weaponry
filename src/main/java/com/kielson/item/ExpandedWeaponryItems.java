package com.kielson.item;

import com.kielson.item.custom.*;
import com.kielson.util.ItemHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.equipment.EquipmentType;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ExpandedWeaponryItems {

    //Daggers
    public static final Item WOODEN_DAGGER = ItemHelper.registerItem(MOD_ID, "wooden_dagger",
            settings -> new DaggerItem(ToolMaterial.WOOD, settings), new Item.Settings());
    public static final Item STONE_DAGGER = ItemHelper.registerItem(MOD_ID, "stone_dagger",
            settings -> new DaggerItem(ToolMaterial.STONE, settings), new Item.Settings());
    public static final Item IRON_DAGGER = ItemHelper.registerItem(MOD_ID, "iron_dagger",
            settings -> new DaggerItem(ToolMaterial.IRON, settings), new Item.Settings());
    public static final Item GOLDEN_DAGGER = ItemHelper.registerItem(MOD_ID, "golden_dagger",
            settings -> new DaggerItem(ToolMaterial.GOLD, settings), new Item.Settings());
    public static final Item DIAMOND_DAGGER = ItemHelper.registerItem(MOD_ID, "diamond_dagger",
            settings -> new DaggerItem(ToolMaterial.DIAMOND, settings), new Item.Settings());
    public static final Item NETHERITE_DAGGER = ItemHelper.registerItem(MOD_ID, "netherite_dagger",
            settings -> new DaggerItem(ToolMaterial.NETHERITE, settings.fireproof()), new Item.Settings());


    //Hammers
    public static final Item WOODEN_HAMMER = ItemHelper.registerItem(MOD_ID, "wooden_hammer",
            settings -> new HammerItem(ToolMaterial.WOOD, settings), new Item.Settings());
    public static final Item STONE_HAMMER = ItemHelper.registerItem(MOD_ID, "stone_hammer",
            settings -> new HammerItem(ToolMaterial.STONE, settings), new Item.Settings());
    public static final Item IRON_HAMMER = ItemHelper.registerItem(MOD_ID, "iron_hammer",
            settings -> new HammerItem(ToolMaterial.IRON, settings), new Item.Settings());
    public static final Item GOLDEN_HAMMER = ItemHelper.registerItem(MOD_ID, "golden_hammer",
            settings -> new HammerItem(ToolMaterial.GOLD, settings), new Item.Settings());
    public static final Item DIAMOND_HAMMER = ItemHelper.registerItem(MOD_ID, "diamond_hammer",
            settings -> new HammerItem(ToolMaterial.DIAMOND, settings), new Item.Settings());
    public static final Item NETHERITE_HAMMER = ItemHelper.registerItem(MOD_ID, "netherite_hammer",
            settings -> new HammerItem(ToolMaterial.NETHERITE, settings.fireproof()), new Item.Settings());


    //Spears
    public static final Item WOODEN_SPEAR = ItemHelper.registerItem(MOD_ID, "wooden_spear",
            settings -> new SpearItem(ToolMaterial.WOOD, settings), new Item.Settings());
    public static final Item STONE_SPEAR = ItemHelper.registerItem(MOD_ID, "stone_spear",
            settings -> new SpearItem(ToolMaterial.STONE, settings), new Item.Settings());
    public static final Item IRON_SPEAR = ItemHelper.registerItem(MOD_ID, "iron_spear",
            settings -> new SpearItem(ToolMaterial.IRON, settings), new Item.Settings());
    public static final Item GOLDEN_SPEAR = ItemHelper.registerItem(MOD_ID, "golden_spear",
            settings -> new SpearItem(ToolMaterial.GOLD, settings), new Item.Settings());
    public static final Item DIAMOND_SPEAR = ItemHelper.registerItem(MOD_ID, "diamond_spear",
            settings -> new SpearItem(ToolMaterial.DIAMOND, settings), new Item.Settings());
    public static final Item NETHERITE_SPEAR = ItemHelper.registerItem(MOD_ID, "netherite_spear",
            settings -> new SpearItem(ToolMaterial.NETHERITE, settings.fireproof()), new Item.Settings());


    //Ranged
    public static final Item LONGBOW = ItemHelper.registerItem(MOD_ID, "longbow",
            settings -> new CustomBow(8.5, 1.8, 3.75, settings.maxDamage(428)), new Item.Settings());
    public static final Item SLINGSHOT = ItemHelper.registerItem(MOD_ID, "slingshot", SlingshotItem::new, new Item.Settings());


    //Armor
    public static final Item HEAVY_IRON_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_iron_helmet", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_IRON, EquipmentType.HELMET, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_IRON, EquipmentType.HELMET));
    public static final Item HEAVY_IRON_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_iron_chestplate", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_IRON, EquipmentType.CHESTPLATE, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_IRON, EquipmentType.CHESTPLATE));
    public static final Item HEAVY_IRON_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_iron_leggings", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_IRON, EquipmentType.LEGGINGS, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_IRON, EquipmentType.LEGGINGS));
    public static final Item HEAVY_IRON_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_iron_boots", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_IRON, EquipmentType.BOOTS, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_IRON, EquipmentType.BOOTS));

    public static final Item HEAVY_GOLDEN_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_golden_helmet", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, EquipmentType.HELMET, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, EquipmentType.HELMET));
    public static final Item HEAVY_GOLDEN_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_golden_chestplate", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, EquipmentType.CHESTPLATE, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, EquipmentType.CHESTPLATE));
    public static final Item HEAVY_GOLDEN_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_golden_leggings", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, EquipmentType.LEGGINGS, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, EquipmentType.LEGGINGS));
    public static final Item HEAVY_GOLDEN_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_golden_boots", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, EquipmentType.BOOTS, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_GOLD, EquipmentType.BOOTS));

    public static final Item HEAVY_DIAMOND_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_diamond_helmet", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, EquipmentType.HELMET, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, EquipmentType.HELMET));
    public static final Item HEAVY_DIAMOND_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_diamond_chestplate", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, EquipmentType.CHESTPLATE, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, EquipmentType.CHESTPLATE));
    public static final Item HEAVY_DIAMOND_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_diamond_leggings", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, EquipmentType.LEGGINGS, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, EquipmentType.LEGGINGS));
    public static final Item HEAVY_DIAMOND_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_diamond_boots", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, EquipmentType.BOOTS, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_DIAMOND, EquipmentType.BOOTS));

    public static final Item HEAVY_NETHERITE_HELMET = ItemHelper.registerItem(MOD_ID, "heavy_netherite_helmet", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, EquipmentType.HELMET, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, EquipmentType.HELMET).fireproof());
    public static final Item HEAVY_NETHERITE_CHESTPLATE = ItemHelper.registerItem(MOD_ID, "heavy_netherite_chestplate", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, EquipmentType.CHESTPLATE, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, EquipmentType.CHESTPLATE).fireproof());
    public static final Item HEAVY_NETHERITE_LEGGINGS = ItemHelper.registerItem(MOD_ID, "heavy_netherite_leggings", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, EquipmentType.LEGGINGS, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, EquipmentType.LEGGINGS).fireproof());
    public static final Item HEAVY_NETHERITE_BOOTS = ItemHelper.registerItem(MOD_ID, "heavy_netherite_boots", settings ->
            new HeavyArmorItem(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, EquipmentType.BOOTS, settings), new Item.Settings().armor(ExpandedWeaponryArmorMaterials.HEAVY_NETHERITE, EquipmentType.BOOTS).fireproof());



    //Model generation
    public static final Item[] ITEMS_HANDHELD = new Item[]{
            WOODEN_DAGGER, STONE_DAGGER, IRON_DAGGER, GOLDEN_DAGGER, DIAMOND_DAGGER, NETHERITE_DAGGER,
    };
    public static final Item[] ITEMS_DEFAULT = new Item[]{
            HEAVY_IRON_HELMET, HEAVY_IRON_CHESTPLATE, HEAVY_IRON_LEGGINGS, HEAVY_IRON_BOOTS,
            HEAVY_GOLDEN_HELMET, HEAVY_GOLDEN_CHESTPLATE, HEAVY_GOLDEN_LEGGINGS, HEAVY_GOLDEN_BOOTS,
            HEAVY_DIAMOND_HELMET, HEAVY_DIAMOND_CHESTPLATE, HEAVY_DIAMOND_LEGGINGS, HEAVY_DIAMOND_BOOTS,
            HEAVY_NETHERITE_HELMET, HEAVY_NETHERITE_CHESTPLATE, HEAVY_NETHERITE_LEGGINGS, HEAVY_NETHERITE_BOOTS,
    };
    public static final Item[] ITEMS_CUSTOM = new Item[]{
            WOODEN_SPEAR, STONE_SPEAR, IRON_SPEAR, GOLDEN_SPEAR, DIAMOND_SPEAR, NETHERITE_SPEAR,
    };

    public static void initialize() {}
}
