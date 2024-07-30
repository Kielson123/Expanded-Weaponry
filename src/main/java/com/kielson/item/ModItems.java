package com.kielson.item;

import com.kielson.item.custom.DaggerItem;
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

    public static final Item LONGBOW = register("longbow", new CustomBow(10, 2, 3.75, new Settings().maxDamage(328)));


    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, id), item);
    }

    public static void registerModItems() {int x = 1;}
}
