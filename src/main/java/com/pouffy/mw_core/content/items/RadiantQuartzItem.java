package com.pouffy.mw_core.content.items;

import com.simibubi.create.content.curiosities.NoGravMagicalDohickyItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class RadiantQuartzItem extends NoGravMagicalDohickyItem {
    public RadiantQuartzItem(Item.Properties properties) {
        super(properties);
    }

    public boolean isFoil(ItemStack stack) {
        return true;
    }

    protected void onCreated(ItemEntity entity, CompoundTag persistentData) {
        super.onCreated(entity, persistentData);
        entity.setDeltaMovement(entity.getDeltaMovement().add(0.0, 0.25, 0.0));
    }
}
