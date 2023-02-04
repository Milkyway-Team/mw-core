package com.pouffy.mw_core.content.items.charms;

import net.minecraft.world.item.ItemStack;

import java.util.Random;

public class DamageCharm {
    public static void execute(ItemStack itemstack) {
        if (!itemstack.getOrCreateTag().getBoolean("Deactivated")) {
            {
                if (itemstack.hurt(1, new Random(), null)) {
                    itemstack.shrink(1);
                    itemstack.setDamageValue(0);
                }
            }
        }
    }

}
