package com.kielson.item.custom;

import com.kielson.client.TooltipHelper;
import com.kielson.util.ItemHelper;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipData;
import net.minecraft.util.Identifier;

import java.util.Optional;

import static com.kielson.KielsonsEnhancedCombat.MOD_ID;

public class DaggerItem extends Item {
    private static final float ATTACK_DAMAGE = 1.0f;
    private static final float ATTACK_SPEED = -1.9f;

    public DaggerItem(ToolMaterial toolMaterial, Item.Settings settings) {
        super(settings
                .sword(toolMaterial, ATTACK_DAMAGE, ATTACK_SPEED)
                .maxDamage((int) (toolMaterial.durability() * 0.85))
                .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, createAttributeModifiers(toolMaterial)));
    }

    public static AttributeModifiersComponent createAttributeModifiers(ToolMaterial material) {
        return AttributeModifiersComponent.builder()
                .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(BASE_ATTACK_DAMAGE_MODIFIER_ID, ATTACK_DAMAGE + material.attackDamageBonus(), EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(BASE_ATTACK_SPEED_MODIFIER_ID, ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                .add(EntityAttributes.ENTITY_INTERACTION_RANGE, new EntityAttributeModifier(Identifier.of(MOD_ID, "dagger"),
                        -1.75, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build();
    }

    @Override
    public Optional<TooltipData> getTooltipData(ItemStack stack) {
        TooltipHelper.updateTooltipText();
    }
}
