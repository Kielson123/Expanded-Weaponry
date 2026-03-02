package com.kielson.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.AttackRange;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import static com.kielson.KielsonsAPIComponents.TWO_HANDED;

public class GreatswordItem extends Item {
    private static final float ATTACK_DAMAGE = 5.0f;
    private static final float ATTACK_SPEED = -3.15f;
    private static final float ATTACK_RANGE_MIN = 1.5f;
    private static final float ATTACK_RANGE_MAX = 4.5f;

    public GreatswordItem(ToolMaterial toolMaterial, Properties properties) {
        super(properties
                .sword(toolMaterial, ATTACK_DAMAGE, ATTACK_SPEED)
                .durability(toolMaterial.durability())
                .component(TWO_HANDED, Boolean.TRUE)
                .component(DataComponents.ATTRIBUTE_MODIFIERS, createAttributeModifiers(toolMaterial))
                .component(DataComponents.ATTACK_RANGE, new AttackRange(ATTACK_RANGE_MIN, ATTACK_RANGE_MAX, ATTACK_RANGE_MIN, Math.max(ATTACK_RANGE_MAX, 5), 0.3f, 1f)));
    }

    public static ItemAttributeModifiers createAttributeModifiers(ToolMaterial material) {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, ATTACK_DAMAGE + material.attackDamageBonus(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, ATTACK_SPEED, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .build();
    }

    @Override
    public boolean canDestroyBlock(ItemStack stack, BlockState state, Level world, BlockPos pos, LivingEntity user) {
        return !user.hasInfiniteMaterials();
    }
}
