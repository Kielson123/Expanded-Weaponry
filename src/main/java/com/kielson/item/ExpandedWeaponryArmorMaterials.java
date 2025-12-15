package com.kielson.item;

import static com.kielson.ExpandedWeaponry.MOD_ID;
import static net.minecraft.world.item.equipment.EquipmentAssets.ROOT_ID;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;

public interface ExpandedWeaponryArmorMaterials extends ArmorMaterials {
    /*  i - durability
        j - enchantability
        f - toughness
        g - knockback resistance    */


    //Heavy
    ArmorMaterial HEAVY_COPPER = new ArmorMaterial((int) (11*1.25), ArmorMaterials.makeDefense(2, 4, 5, 3, 5),
            8, SoundEvents.ARMOR_EQUIP_COPPER, 2F, 0.1F, ItemTags.REPAIRS_COPPER_ARMOR, ModEquipmentAssetKeys.HEAVY_COPPER);
    ArmorMaterial HEAVY_IRON = new ArmorMaterial((int) (15*1.25), ArmorMaterials.makeDefense(3, 6, 7, 3, 6),
            9, SoundEvents.ARMOR_EQUIP_IRON, 2F, 0.1F, ItemTags.REPAIRS_IRON_ARMOR, ModEquipmentAssetKeys.HEAVY_IRON);
    ArmorMaterial HEAVY_GOLD = new ArmorMaterial((int) (7*1.25), ArmorMaterials.makeDefense(2, 4, 6, 3, 8),
            25, SoundEvents.ARMOR_EQUIP_GOLD, 1.0F, 0.1F, ItemTags.REPAIRS_GOLD_ARMOR, ModEquipmentAssetKeys.HEAVY_GOLD);
    ArmorMaterial HEAVY_DIAMOND = new ArmorMaterial((int) (33*1.25), ArmorMaterials.makeDefense(4, 7, 9, 4, 12),
            10, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.1F, ItemTags.REPAIRS_DIAMOND_ARMOR, ModEquipmentAssetKeys.HEAVY_DIAMOND);
    ArmorMaterial HEAVY_NETHERITE = new ArmorMaterial((int) (37*1.25), ArmorMaterials.makeDefense(4, 7, 9, 4, 12),
            15, SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.2F, ItemTags.REPAIRS_NETHERITE_ARMOR, ModEquipmentAssetKeys.HEAVY_NETHERITE);



    class ModEquipmentAssetKeys {
        static ResourceKey<EquipmentAsset> HEAVY_COPPER = register("heavy_copper");
        static ResourceKey<EquipmentAsset> HEAVY_IRON = register("heavy_iron");
        static ResourceKey<EquipmentAsset> HEAVY_GOLD = register("heavy_gold");
        static ResourceKey<EquipmentAsset> HEAVY_DIAMOND = register("heavy_diamond");
        static ResourceKey<EquipmentAsset> HEAVY_NETHERITE = register("heavy_netherite");;

        static ResourceKey<EquipmentAsset> register(String name) {
            return ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(MOD_ID, name));
        }
    }
}
