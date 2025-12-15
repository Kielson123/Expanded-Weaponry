package com.kielson.item.custom;

import static com.kielson.ExpandedWeaponry.MOD_ID;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class DaggerItem extends Item {
    private static final float ATTACK_DAMAGE = 1.0f;
    private static final float ATTACK_SPEED = -1.9f;

    public DaggerItem(ToolMaterial toolMaterial, Item.Properties settings) {
        super(settings
                .sword(toolMaterial, ATTACK_DAMAGE, ATTACK_SPEED)
                .durability((int) (toolMaterial.durability() * 0.85))
                .component(DataComponents.ATTRIBUTE_MODIFIERS, createAttributeModifiers(toolMaterial)));
    }

    public static ItemAttributeModifiers createAttributeModifiers(ToolMaterial material) {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, ATTACK_DAMAGE + material.attackDamageBonus(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, ATTACK_SPEED, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ENTITY_INTERACTION_RANGE, new AttributeModifier(Identifier.fromNamespaceAndPath(MOD_ID, "dagger"),
                        -1.75, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build();
    }

    @Override
    public boolean canDestroyBlock(ItemStack stack, BlockState state, Level world, BlockPos pos, LivingEntity user) {
        return !user.hasInfiniteMaterials();
    }
}
