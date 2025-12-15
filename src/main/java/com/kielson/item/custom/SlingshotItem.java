package com.kielson.item.custom;

import com.kielson.ExpandedWeaponryTags;
import com.kielson.item.CustomBow;
import java.util.function.Predicate;
import net.minecraft.world.item.ItemStack;

public class SlingshotItem extends CustomBow {
    public SlingshotItem(Properties settings) {
        super(4, 0.6, 2, settings.durability(236));
    }

    @Override
    public Predicate<ItemStack> getAllSupportedProjectiles() {
        return stack -> stack.is(ExpandedWeaponryTags.SLINGSHOT_PROJECTILES);
    }

    @Override
    public int getDefaultProjectileRange() {
        return 5;
    }
}
