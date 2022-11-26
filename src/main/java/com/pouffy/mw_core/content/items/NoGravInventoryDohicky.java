package com.pouffy.mw_core.content.items;

import com.simibubi.create.foundation.utility.VecHelper;
import net.minecraft.core.NonNullList;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class NoGravInventoryDohicky extends Item {
    public NoGravInventoryDohicky(Item.Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        Level world = entity.level;
        Vec3 pos = entity.position();
        CompoundTag persistentData = entity.getPersistentData();
        if (world.isClientSide) {
            Vec3 basemotion;
            if (world.random.nextFloat() < this.getIdleParticleChance(entity)) {
                basemotion = VecHelper.offsetRandomly(pos, world.random, 0.5F);
                world.addParticle(ParticleTypes.END_ROD, basemotion.x, pos.y, basemotion.z, 0.0, -0.10000000149011612, 0.0);
            }

            if (entity.isSilent() && !persistentData.getBoolean("PlayEffects")) {
                basemotion = new Vec3(0.0, 1.0, 0.0);
                world.addParticle(ParticleTypes.FLASH, pos.x, pos.y, pos.z, 0.0, 0.0, 0.0);

                for(int i = 0; i < 20; ++i) {
                    Vec3 motion = VecHelper.offsetRandomly(basemotion, world.random, 1.0F);
                    world.addParticle(ParticleTypes.WITCH, pos.x, pos.y, pos.z, motion.x, motion.y, motion.z);
                    world.addParticle(ParticleTypes.END_ROD, pos.x, pos.y, pos.z, motion.x, motion.y, motion.z);
                }

                persistentData.putBoolean("PlayEffects", true);
            }

            return false;
        } else {
            entity.setNoGravity(true);
            if (!persistentData.contains("JustCreated")) {
                return false;
            } else {
                this.onCreated(entity, persistentData);
                return false;
            }
        }
    }

    protected float getIdleParticleChance(ItemEntity entity) {
        return (float) Mth.clamp(entity.getItem().getCount() - 10, 5, 100) / 64.0F;
    }

    protected void onCreated(ItemEntity entity, CompoundTag persistentData) {
        entity.lifespan = 6000;
        persistentData.remove("JustCreated");
        entity.setSilent(true);
    }
}
