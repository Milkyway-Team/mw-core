package com.pouffy.mw_core.content.items;

import com.pouffy.mw_core.util.Color;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SequencedAssemblyItem extends Item {
    public SequencedAssemblyItem(Item.Properties p_i48487_1_) {
        super(p_i48487_1_.stacksTo(1));
    }

    public float getProgress(ItemStack stack) {
        if (!stack.hasTag()) {
            return 0.0F;
        } else {
            CompoundTag tag = stack.getTag();
            return !tag.contains("SequencedAssembly") ? 0.0F : tag.getCompound("SequencedAssembly").getFloat("Progress");
        }
    }

    public void fillItemCategory(CreativeModeTab p_150895_1_, NonNullList<ItemStack> p_150895_2_) {
    }

    public boolean isBarVisible(ItemStack stack) {
        return true;
    }

    public int getBarWidth(ItemStack stack) {
        return Math.round(this.getProgress(stack) * 13.0F);
    }

    public int getBarColor(ItemStack stack) {
        return Color.mixColors(-16268, -12124192, this.getProgress(stack));
    }
}
