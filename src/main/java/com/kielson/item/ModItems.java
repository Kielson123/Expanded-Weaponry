package com.kielson.item;

import com.kielson.item.custom.DaggerItem;
import com.kielson.item.custom.HammerItem;
import com.kielson.item.custom.SpearItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.kielson.KielsonsEnhancedCombat.MOD_ID;

public class ModItems {

    //Items
    public static final Item WOODEN_DAGGER = register("wooden_dagger", new DaggerItem(ToolMaterials.WOOD, new Settings()));
    public static final Item STONE_DAGGER = register("stone_dagger", new DaggerItem(ToolMaterials.STONE, new Settings()));
    public static final Item IRON_DAGGER = register("iron_dagger", new DaggerItem(ToolMaterials.IRON, new Settings()));
    public static final Item GOLDEN_DAGGER = register("golden_dagger", new DaggerItem(ToolMaterials.GOLD, new Settings()));
    public static final Item DIAMOND_DAGGER = register("diamond_dagger", new DaggerItem(ToolMaterials.DIAMOND, new Settings()));
    public static final Item NETHERITE_DAGGER = register("netherite_dagger", new DaggerItem(ToolMaterials.NETHERITE, new Settings().fireproof()));

    public static final Item WOODEN_HAMMER = register("wooden_hammer", new HammerItem(ToolMaterials.WOOD, new Settings()));
    public static final Item STONE_HAMMER = register("stone_hammer", new HammerItem(ToolMaterials.STONE, new Settings()));
    public static final Item IRON_HAMMER = register("iron_hammer", new HammerItem(ToolMaterials.IRON, new Settings()));
    public static final Item GOLDEN_HAMMER = register("golden_hammer", new HammerItem(ToolMaterials.GOLD, new Settings()));
    public static final Item DIAMOND_HAMMER = register("diamond_hammer", new HammerItem(ToolMaterials.DIAMOND, new Settings()));
    public static final Item NETHERITE_HAMMER = register("netherite_hammer", new HammerItem(ToolMaterials.NETHERITE, new Settings().fireproof()));

    public static final Item WOODEN_SPEAR = register("wooden_spear", new SpearItem(ToolMaterials.WOOD, new Settings()));
    public static final Item STONE_SPEAR = register("stone_spear", new SpearItem(ToolMaterials.STONE, new Settings()));
    public static final Item IRON_SPEAR = register("iron_spear", new SpearItem(ToolMaterials.IRON, new Settings()));
    public static final Item GOLDEN_SPEAR = register("golden_spear", new SpearItem(ToolMaterials.GOLD, new Settings()));
    public static final Item DIAMOND_SPEAR = register("diamond_spear", new SpearItem(ToolMaterials.DIAMOND, new Settings()));
    public static final Item NETHERITE_SPEAR = register("netherite_spear", new SpearItem(ToolMaterials.NETHERITE, new Settings().fireproof()));

    public static final Item LONGBOW = register("longbow", new CustomBow(8.5, 1.8, 3.75, new Settings().maxDamage(328)));


    //Model generation
    public static final Item[] ITEMS_HANDHELD = new Item[]{
            WOODEN_DAGGER, STONE_DAGGER, IRON_DAGGER, GOLDEN_DAGGER, DIAMOND_DAGGER, NETHERITE_DAGGER,
            WOODEN_HAMMER, STONE_HAMMER, IRON_HAMMER, GOLDEN_HAMMER, DIAMOND_HAMMER, NETHERITE_HAMMER,
            WOODEN_SPEAR, STONE_SPEAR, IRON_SPEAR, GOLDEN_SPEAR, DIAMOND_SPEAR, NETHERITE_SPEAR
    };
    public static final Item[] ITEMS_DEFAULT = new Item[]{

    };

    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, id), item);
    }

    public static void registerModItems() {int x = 1;}
}
