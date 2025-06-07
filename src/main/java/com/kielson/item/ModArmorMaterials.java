package com.kielson.item;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.ArmorMaterials;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import static com.kielson.ExpandedWeaponry.MOD_ID;
import static net.minecraft.item.equipment.EquipmentAssetKeys.REGISTRY_KEY;

public interface  ModArmorMaterials extends ArmorMaterials {
    /*  i - durability
        j - enchantability
        f - toughness
        g - knockback resistance    */


    //Heavy
    ArmorMaterial HEAVY_IRON = new ArmorMaterial((int) (15*1.25), ArmorMaterials.createDefenseMap(3, 6, 7, 3, 6),
            9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2F, 0.1F, ItemTags.REPAIRS_IRON_ARMOR, ModEquipmentAssetKeys.HEAVY_IRON);
    ArmorMaterial HEAVY_GOLD = new ArmorMaterial((int) (7*1.25), ArmorMaterials.createDefenseMap(2, 4, 6, 3, 8),
            25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.0F, 0.1F, ItemTags.REPAIRS_GOLD_ARMOR, ModEquipmentAssetKeys.HEAVY_GOLD);
    ArmorMaterial HEAVY_DIAMOND = new ArmorMaterial((int) (33*1.25), ArmorMaterials.createDefenseMap(4, 7, 9, 4, 12),
            10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F, 0.1F, ItemTags.REPAIRS_DIAMOND_ARMOR, ModEquipmentAssetKeys.HEAVY_DIAMOND);
    ArmorMaterial HEAVY_NETHERITE = new ArmorMaterial((int) (37*1.25), ArmorMaterials.createDefenseMap(4, 7, 9, 4, 12),
            15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0F, 0.2F, ItemTags.REPAIRS_NETHERITE_ARMOR, ModEquipmentAssetKeys.HEAVY_NETHERITE);



    class ModEquipmentAssetKeys {
        static RegistryKey<EquipmentAsset> HEAVY_IRON = register("heavy_iron");
        static RegistryKey<EquipmentAsset> HEAVY_GOLD = register("heavy_gold");
        static RegistryKey<EquipmentAsset> HEAVY_DIAMOND = register("heavy_diamond");
        static RegistryKey<EquipmentAsset> HEAVY_NETHERITE = register("heavy_netherite");;

        static RegistryKey<EquipmentAsset> register(String name) {
            return RegistryKey.of(REGISTRY_KEY, Identifier.of(MOD_ID, name));
        }
    }
}
