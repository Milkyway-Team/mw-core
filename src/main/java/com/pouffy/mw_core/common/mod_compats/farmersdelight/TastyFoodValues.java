package com.pouffy.mw_core.common.mod_compats.farmersdelight;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class TastyFoodValues extends FoodValues {
    public static final FoodProperties SODA = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 0);
    }, 1.0F).build();
    public static final FoodProperties MOTIVATIONAL_STEW = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 2);
    }, 1.0F).effect(() -> {
        return new MobEffectInstance(MobEffects.REGENERATION, 1200, 0);
    }, 1.0F).effect(() -> {
        return new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1);
    }, 1.0F).build();

    public static final FoodProperties MILKYWAY_BAR = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(ModEffects.COMFORT.get(), 1200, 0);
    }, 1.0F).build();
    public static final FoodProperties SALT = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.CONFUSION, 300, 0);
    }, 1.0F).build();
    public static final FoodProperties SALTED_BEEF = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(ModEffects.COMFORT.get(), 300, 0);
    }, 0.5F).effect(() -> {
        return new MobEffectInstance(MobEffects.CONFUSION, 300, 0);
    }, 0.5F).build();
}
