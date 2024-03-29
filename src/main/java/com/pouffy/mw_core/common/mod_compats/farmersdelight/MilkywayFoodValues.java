package com.pouffy.mw_core.common.mod_compats.farmersdelight;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class MilkywayFoodValues {
    public static final FoodProperties SODA = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 0);
    }, 1.0F).build();
    public static final FoodProperties SWEET_BERRY_JUICE = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1);
    }, 1.0F).build();

    public static final FoodProperties MILKYWAY_BAR = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 0);
    }, 1.0F).effect(() -> {
        return new MobEffectInstance(MobEffects.REGENERATION, 1200, 0); }, 1.0F).effect(() -> {
            return new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0); },
            1.0F).nutrition(6).saturationMod(0.2F).build();
    public static final FoodProperties SALT = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.CONFUSION, 300, 0);
    }, 1.0F).build();
    public static final FoodProperties SALTED_BEEF = (new FoodProperties.Builder()).effect(() -> {
        return new MobEffectInstance(MobEffects.REGENERATION, 300, 0);
    }, 0.5F).effect(() -> {
        return new MobEffectInstance(MobEffects.CONFUSION, 300, 0);
    }, 0.5F).nutrition(2).saturationMod(0.6F).meat().build();

    public static final FoodProperties SYRUP_GLAZED_APPLE = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();
    public static final FoodProperties SYRUP_GLAZED_BERRIES = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.8F).build();
}
