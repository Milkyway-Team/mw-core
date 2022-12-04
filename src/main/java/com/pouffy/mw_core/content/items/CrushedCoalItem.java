package com.pouffy.mw_core.content.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class CrushedCoalItem extends Item {
    public final int burnTime;

    public CrushedCoalItem(Item.Properties properties) {
        super(properties);
        this.burnTime = 800;
    }

    public CrushedCoalItem(Item.Properties properties, int burnTime) {
        super(properties);
        this.burnTime = burnTime;
    }

    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }
}
