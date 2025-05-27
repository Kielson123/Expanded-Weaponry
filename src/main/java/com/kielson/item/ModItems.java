package com.kielson.item;

import com.kielson.item.custom.DaggerItem;
import com.kielson.item.custom.HammerItem;
import com.kielson.item.custom.SlingshotItem;
import com.kielson.item.custom.SpearItem;
import com.kielson.util.ItemHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ModItems {

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


    //Model generation
    public static final Item[] ITEMS_HANDHELD = new Item[]{
            WOODEN_DAGGER, STONE_DAGGER, IRON_DAGGER, GOLDEN_DAGGER, DIAMOND_DAGGER, NETHERITE_DAGGER,
    };
    public static final Item[] ITEMS_DEFAULT = new Item[]{

    };
    public static final Item[] ITEMS_CUSTOM = new Item[]{
            WOODEN_SPEAR, STONE_SPEAR, IRON_SPEAR, GOLDEN_SPEAR, DIAMOND_SPEAR, NETHERITE_SPEAR
    };

    public static void initialize() {}
}
