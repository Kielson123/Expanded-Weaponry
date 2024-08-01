package com.kielson.item.custom;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;

import static com.kielson.KielsonsAPIComponents.TWO_HANDED;
import static com.kielson.KielsonsEnhancedCombat.MOD_ID;

public class HammerItem extends SwordItem {

    public HammerItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings.maxDamage((int) (toolMaterial.getDurability() * 1.1))
                .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, HammerItem.createAttributeModifiers(toolMaterial))
                .component(TWO_HANDED, Boolean.TRUE));
    }

    private static AttributeModifiersComponent createAttributeModifiers(ToolMaterial material) {
        return AttributeModifiersComponent.builder()
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(BASE_ATTACK_DAMAGE_MODIFIER_ID, material.getAttackDamage() + 7.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(BASE_ATTACK_SPEED_MODIFIER_ID, -3.4, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                .add(EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE, new EntityAttributeModifier(Identifier.of(MOD_ID, "hammer"), -0.5, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                .build();
    }
}
