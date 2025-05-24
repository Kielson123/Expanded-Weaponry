package com.kielson.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.kielson.KielsonsAPIComponents.TWO_HANDED;
import static com.kielson.KielsonsEnhancedCombat.MOD_ID;

public class SpearItem extends Item {

    public SpearItem(ToolMaterial toolMaterial, Item.Settings settings) {
        super(settings
                .sword(toolMaterial, 2, -3.2f)
                .maxDamage(toolMaterial.durability())
                .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, createAttributeModifiers(toolMaterial))
                .component(TWO_HANDED, Boolean.TRUE));
    }

    public static AttributeModifiersComponent createAttributeModifiers(ToolMaterial material) {
        return AttributeModifiersComponent.builder()
                .add(EntityAttributes.ENTITY_INTERACTION_RANGE, new EntityAttributeModifier(Identifier.of(MOD_ID, "spear"),
                        1.5, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build();
    }

    @Override
    public boolean canMine(ItemStack stack, BlockState state, World world, BlockPos pos, LivingEntity user) {
        return !user.isInCreativeMode();
    }
}
