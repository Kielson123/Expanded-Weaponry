package com.kielson.item;

import com.kielson.item.custom.DaggerItem;
import com.kielson.item.custom.HammerItem;
import com.kielson.item.custom.SlingshotItem;
import com.kielson.item.custom.SpearItem;
import com.kielson.util.ItemHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class ModItems {

    //Items
    public static final Item WOODEN_DAGGER = ItemHelper.registerItem("wooden_dagger", settings -> new DaggerItem(ToolMaterial.WOOD, settings), new Item.Settings());
    public static final Item STONE_DAGGER = ItemHelper.registerItem("stone_dagger", settings -> new DaggerItem(ToolMaterial.STONE, settings), new Item.Settings());
    public static final Item IRON_DAGGER = ItemHelper.registerItem("iron_dagger", settings -> new DaggerItem(ToolMaterial.IRON, settings), new Item.Settings());
    public static final Item GOLDEN_DAGGER = ItemHelper.registerItem("golden_dagger", settings -> new DaggerItem(ToolMaterial.GOLD, settings), new Item.Settings());
    public static final Item DIAMOND_DAGGER = ItemHelper.registerItem("diamond_dagger", settings -> new DaggerItem(ToolMaterial.DIAMOND, settings), new Item.Settings());
    public static final Item NETHERITE_DAGGER = ItemHelper.registerItem("netherite_dagger", settings -> new DaggerItem(ToolMaterial.NETHERITE, settings.fireproof()), new Item.Settings());

    public static final Item WOODEN_HAMMER = ItemHelper.registerItem("wooden_hammer", settings -> new HammerItem(ToolMaterial.WOOD, settings), new Item.Settings());
    public static final Item STONE_HAMMER = ItemHelper.registerItem("stone_hammer", settings -> new HammerItem(ToolMaterial.STONE, settings), new Item.Settings());
    public static final Item IRON_HAMMER = ItemHelper.registerItem("iron_hammer", settings -> new HammerItem(ToolMaterial.IRON, settings), new Item.Settings());
    public static final Item GOLDEN_HAMMER = ItemHelper.registerItem("golden_hammer", settings -> new HammerItem(ToolMaterial.GOLD, settings), new Item.Settings());
    public static final Item DIAMOND_HAMMER = ItemHelper.registerItem("diamond_hammer", settings -> new HammerItem(ToolMaterial.DIAMOND, settings), new Item.Settings());
    public static final Item NETHERITE_HAMMER = ItemHelper.registerItem("netherite_hammer", settings -> new HammerItem(ToolMaterial.NETHERITE, settings.fireproof()), new Item.Settings());

    public static final Item WOODEN_SPEAR = ItemHelper.registerItem("wooden_spear", settings -> new SpearItem(ToolMaterial.WOOD, settings), new Item.Settings());
    public static final Item STONE_SPEAR = ItemHelper.registerItem("stone_spear", settings -> new SpearItem(ToolMaterial.STONE, settings), new Item.Settings());
    public static final Item IRON_SPEAR = ItemHelper.registerItem("iron_spear", settings -> new SpearItem(ToolMaterial.IRON, settings), new Item.Settings());
    public static final Item GOLDEN_SPEAR = ItemHelper.registerItem("golden_spear", settings -> new SpearItem(ToolMaterial.GOLD, settings), new Item.Settings());
    public static final Item DIAMOND_SPEAR = ItemHelper.registerItem("diamond_spear", settings -> new SpearItem(ToolMaterial.DIAMOND, settings), new Item.Settings());
    public static final Item NETHERITE_SPEAR = ItemHelper.registerItem("netherite_spear", settings -> new SpearItem(ToolMaterial.NETHERITE, settings.fireproof()), new Item.Settings());

    public static final Item LONGBOW = ItemHelper.registerItem("longbow", settings -> new CustomBow(8.5, 1.8, 3.75, settings), new Item.Settings());
    public static final Item SLINGSHOT = ItemHelper.registerItem("slingshot", SlingshotItem::new, new Item.Settings());


    //Model generation
    public static final Item[] ITEMS_HANDHELD = new Item[]{
            WOODEN_DAGGER, STONE_DAGGER, IRON_DAGGER, GOLDEN_DAGGER, DIAMOND_DAGGER, NETHERITE_DAGGER,
            WOODEN_HAMMER, STONE_HAMMER, IRON_HAMMER, GOLDEN_HAMMER, DIAMOND_HAMMER, NETHERITE_HAMMER
    };
    public static final Item[] ITEMS_DEFAULT = new Item[]{

    };

    public static void initialize() {}
}
