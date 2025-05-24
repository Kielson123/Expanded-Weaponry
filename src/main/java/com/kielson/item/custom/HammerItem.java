package com.kielson.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.kielson.KielsonsAPIComponents.TWO_HANDED;

public class HammerItem extends Item {
    public HammerItem(ToolMaterial toolMaterial, Item.Settings settings) {
        super(settings
                .sword(toolMaterial, 7.0f, -3.4f)
                .maxDamage((int) (toolMaterial.durability() * 1.1))
                .component(TWO_HANDED, Boolean.TRUE));
    }

    @Override
    public boolean canMine(ItemStack stack, BlockState state, World world, BlockPos pos, LivingEntity user) {
        return !user.isInCreativeMode();
    }
}
