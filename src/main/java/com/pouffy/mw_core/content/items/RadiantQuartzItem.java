package com.pouffy.mw_core.content.items;

import com.pouffy.mw_core.MWCore;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class RadiantQuartzItem extends NoGravInventoryDohicky {
    public RadiantQuartzItem(Item.Properties properties) {
        super(properties);
        properties.tab(MWCore.MISC);
    }

    public boolean isFoil(ItemStack stack) {
        return true;
    }

    protected void onCreated(ItemEntity entity, CompoundTag persistentData) {
        super.onCreated(entity, persistentData);
        entity.setDeltaMovement(entity.getDeltaMovement().add(0.0, 50.0, 0.0));
    }
}
