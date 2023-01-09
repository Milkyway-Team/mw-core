package com.pouffy.mw_core.util.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MWCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> BAUXITE_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> CREATITE_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> HALITE_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> CINNABAR_ORE_VEINS_PER_CHUNK;

    public static final ForgeConfigSpec.ConfigValue<Integer> BAUXITE_ORE_VEIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> CREATITE_ORE_VEIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> HALITE_ORE_VEIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> CINNABAR_ORE_VEIN_SIZE;


    static {
        BUILDER.push("Configs for Milkyway Core");

        BAUXITE_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Bauxite Ore Veins spawn per chunk!")
                .define("Bauxite Veins Per Chunk", 9);
        CREATITE_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Creatite Ore Veins spawn per chunk!")
                .define("Creatite Veins Per Chunk", 13);
        HALITE_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Halite Ore Veins spawn per chunk!")
                .define("Halite Veins Per Chunk", 13);
        CINNABAR_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many bonus Cinnabar Ore Veins spawn per chunk!")
                .define("Bonus Cinnabar Veins Per Chunk", 9);
        BAUXITE_ORE_VEIN_SIZE = BUILDER.comment("How many Bauxite Ore Blocks spawn in one Vein!")
                .defineInRange("Bauxite Vein Size", 9, 4, 20);
        CREATITE_ORE_VEIN_SIZE = BUILDER.comment("How many Creatite Ore Blocks spawn in one Vein!")
                .defineInRange("Creatite Vein Size", 3, 1, 6);
        HALITE_ORE_VEIN_SIZE = BUILDER.comment("How many Creatite Ore Blocks spawn in one Vein!")
                .defineInRange("Halite Vein Size", 13, 5, 16);
        CINNABAR_ORE_VEIN_SIZE = BUILDER.comment("How many bonus Cinnabar Ore Blocks spawn in one Vein!")
                .defineInRange("Bonus Cinnabar Vein Size", 5, 2, 12);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
