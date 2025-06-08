package com.kielson;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class ExpandedWeaponryTags {
    public static final TagKey<Item> SLINGSHOT_PROJECTILES = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "slingshot_projectiles"));
    public static final TagKey<Item> DAGGERS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "daggers"));
    public static final TagKey<Item> HAMMERS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "hammers"));
    public static final TagKey<Item> SPEARS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "spears"));
    public static final TagKey<Item> BOWS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "bows"));
    public static final TagKey<Item> HEAVY_ARMORS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "heavy_armors"));

    public static void initialize() {}
}
