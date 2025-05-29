package com.kielson.item.custom;

import com.kielson.ModTags;
import com.kielson.item.CustomBow;
import net.minecraft.item.ItemStack;
import java.util.function.Predicate;

public class SlingshotItem extends CustomBow {
    public SlingshotItem(Settings settings) {
        super(4, 0.6, 2, settings.maxDamage(236));
    }

    @Override
    public Predicate<ItemStack> getProjectiles() {
        return stack -> stack.isIn(ModTags.SLINGSHOT_PROJECTILES);
    }

    @Override
    public int getRange() {
        return 5;
    }
}
