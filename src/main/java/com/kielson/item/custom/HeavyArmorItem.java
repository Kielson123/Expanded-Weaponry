package com.kielson.item.custom;

import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.util.Identifier;

import static com.kielson.ExpandedWeaponry.MOD_ID;

public class HeavyArmorItem extends Item {
    public HeavyArmorItem(ArmorMaterial material, EquipmentType equipmentType, Settings settings) {
        super(settings.armor(material, equipmentType).attributeModifiers(createAttributeModifiers(material, equipmentType)));
    }

    private static AttributeModifiersComponent createAttributeModifiers(ArmorMaterial material, EquipmentType equipmentType){
        AttributeModifierSlot slot;
        switch (equipmentType){
            case HELMET -> slot = AttributeModifierSlot.HEAD;
            case CHESTPLATE -> slot = AttributeModifierSlot.CHEST;
            case LEGGINGS -> slot = AttributeModifierSlot.LEGS;
            case BOOTS -> slot = AttributeModifierSlot.FEET;
            default -> slot = AttributeModifierSlot.BODY;
        }
        return AttributeModifiersComponent.builder()
                .add(EntityAttributes.ARMOR, new EntityAttributeModifier(Identifier.of(MOD_ID, "armor_defense." + slot.asString()),
                        material.defense().get(equipmentType), EntityAttributeModifier.Operation.ADD_VALUE), slot)
                .add(EntityAttributes.ARMOR_TOUGHNESS, new EntityAttributeModifier(Identifier.of(MOD_ID, "armor_toughness." + slot.asString()),
                        material.toughness(), EntityAttributeModifier.Operation.ADD_VALUE), slot)
                .add(EntityAttributes.KNOCKBACK_RESISTANCE, new EntityAttributeModifier(Identifier.of(MOD_ID, "armor_knockback_resistance." + slot.asString()),
                        material.knockbackResistance(), EntityAttributeModifier.Operation.ADD_VALUE), slot)
                .add(EntityAttributes.MOVEMENT_SPEED, new EntityAttributeModifier(Identifier.of(MOD_ID, "armor_slowness." + slot.asString()),
                        -0.04, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), slot)
                .build();
    }
}
