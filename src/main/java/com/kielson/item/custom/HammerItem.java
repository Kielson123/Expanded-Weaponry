package com.kielson.item.custom;

import static com.kielson.KielsonsAPIComponents.TWO_HANDED;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class HammerItem extends Item {
    public HammerItem(ToolMaterial toolMaterial, Item.Properties settings) {
        super(settings
                .axe(toolMaterial, 7.0f, -3.5f)
                .durability((int) (toolMaterial.durability() * 1.1))
                .component(TWO_HANDED, Boolean.TRUE));
    }

    @Override
    public boolean canDestroyBlock(ItemStack stack, BlockState state, Level world, BlockPos pos, LivingEntity user) {
        return !user.hasInfiniteMaterials();
    }
}
