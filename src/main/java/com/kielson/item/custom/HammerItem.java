package com.kielson.item.custom;

import static com.kielson.KielsonsAPIComponents.TWO_HANDED;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.AttackRange;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class HammerItem extends Item {
    private static final float ATTACK_DAMAGE = 7.0f;
    private static final float ATTACK_SPEED = -3.25f;
    private static final float ATTACK_RANGE_MIN = 1.5f;
    private static final float ATTACK_RANGE_MAX = 3.0f;

    public HammerItem(ToolMaterial toolMaterial, Item.Properties settings) {
        super(settings
                .axe(toolMaterial, ATTACK_DAMAGE, ATTACK_SPEED)
                .durability((int) (toolMaterial.durability() * 1.1))
                .component(TWO_HANDED, Boolean.TRUE)
                .component(DataComponents.ATTACK_RANGE, new AttackRange(ATTACK_RANGE_MIN, ATTACK_RANGE_MAX, ATTACK_RANGE_MIN, Math.max(ATTACK_RANGE_MAX, 5), 0.3f, 1f)));
    }

    @Override
    public boolean canDestroyBlock(ItemStack stack, BlockState state, Level world, BlockPos pos, LivingEntity user) {
        return !user.hasInfiniteMaterials();
    }
}
