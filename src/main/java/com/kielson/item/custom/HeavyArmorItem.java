package com.kielson.item.custom;

import static com.kielson.ExpandedWeaponry.MOD_ID;

import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

public class HeavyArmorItem extends Item {
    public HeavyArmorItem(ArmorMaterial material, ArmorType equipmentType, Properties settings) {
        super(settings.humanoidArmor(material, equipmentType).attributes(createAttributeModifiers(material, equipmentType)));
    }

    private static ItemAttributeModifiers createAttributeModifiers(ArmorMaterial material, ArmorType equipmentType){
        EquipmentSlotGroup slot;
        switch (equipmentType){
            case HELMET -> slot = EquipmentSlotGroup.HEAD;
            case CHESTPLATE -> slot = EquipmentSlotGroup.CHEST;
            case LEGGINGS -> slot = EquipmentSlotGroup.LEGS;
            case BOOTS -> slot = EquipmentSlotGroup.FEET;
            default -> slot = EquipmentSlotGroup.BODY;
        }
        return ItemAttributeModifiers.builder()
                .add(Attributes.ARMOR, new AttributeModifier(Identifier.fromNamespaceAndPath(MOD_ID, "armor_defense." + slot.getSerializedName()),
                        material.defense().get(equipmentType), AttributeModifier.Operation.ADD_VALUE), slot)
                .add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(Identifier.fromNamespaceAndPath(MOD_ID, "armor_toughness." + slot.getSerializedName()),
                        material.toughness(), AttributeModifier.Operation.ADD_VALUE), slot)
                .add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(Identifier.fromNamespaceAndPath(MOD_ID, "armor_knockback_resistance." + slot.getSerializedName()),
                        material.knockbackResistance(), AttributeModifier.Operation.ADD_VALUE), slot)
                .add(Attributes.MOVEMENT_SPEED, new AttributeModifier(Identifier.fromNamespaceAndPath(MOD_ID, "armor_slowness." + slot.getSerializedName()),
                        -0.04, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), slot)
                .build();
    }
}
