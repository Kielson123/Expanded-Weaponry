package com.kielson.item.custom;

import com.kielson.ExpandedWeaponryTags;
import com.kielson.item.CustomBow;
import java.util.function.Predicate;

import com.kielson.util.RangedWeaponStats;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.NonNull;

public class SlingshotItem extends CustomBow {
    public SlingshotItem(Properties settings) {
        super(new RangedWeaponStats(4, 0.6, 2), settings.durability(236));
    }

    @Override
    public @NonNull Predicate<ItemStack> getAllSupportedProjectiles() {
        return stack -> stack.is(ExpandedWeaponryTags.SLINGSHOT_PROJECTILES);
    }

    @Override
    public int getDefaultProjectileRange() {
        return 5;
    }
}
