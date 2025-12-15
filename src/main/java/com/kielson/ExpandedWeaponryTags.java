package com.kielson;

import static com.kielson.ExpandedWeaponry.MOD_ID;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ExpandedWeaponryTags {
    public static final TagKey<Item> SLINGSHOT_PROJECTILES = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "slingshot_projectiles"));
    public static final TagKey<Item> DAGGERS = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "daggers"));
    public static final TagKey<Item> HAMMERS = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "hammers"));
    public static final TagKey<Item> BOWS = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "bows"));
    public static final TagKey<Item> HEAVY_ARMORS = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "heavy_armors"));

    public static void initialize() {}
}
