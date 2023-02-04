package com.pouffy.mw_core.content.items.charms.abilities;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import java.util.Random;

public class NegativeEffectRemover {
    public static void clearEffects(Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.DIG_SLOWDOWN);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.CONFUSION);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.HUNGER);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.POISON);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.WITHER);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.UNLUCK);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.WEAKNESS);


    }
    public static void damageStack(ItemStack itemstack) {
        if (itemstack.hurt(1, new Random(), null)) {
                itemstack.shrink(1);
                itemstack.setDamageValue(0);
            }
    }

    }
