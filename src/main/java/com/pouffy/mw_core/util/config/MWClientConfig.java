package com.pouffy.mw_core.util.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class MWClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> FOOD_EFFECT_TOOLTIP;

    static {
        BUILDER.push("Client Configs for Milkyway Core");

        FOOD_EFFECT_TOOLTIP = BUILDER.comment("Should meal and drink tooltips display which effects they provide?")
                .define("foodEffectTooltip", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
