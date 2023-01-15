package com.pouffy.mw_core.world.feature;

import com.pouffy.mw_core.AllBlocks;
import com.pouffy.mw_core.util.config.MWCommonConfig;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> ALUMINIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, AllBlocks.ALUMINIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, AllBlocks.DEEPSLATE_ALUMINIUM_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> CREATITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, AllBlocks.CREATITE_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> HALITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, AllBlocks.HALITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, AllBlocks.DEEPSLATE_HALITE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ALUMINIUM_ORE = FeatureUtils.register("aluminium_ore",
            Feature.ORE, new OreConfiguration(ALUMINIUM_ORES, MWCommonConfig.BAUXITE_ORE_VEIN_SIZE.get()));


    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CREATITE_ORE = FeatureUtils.register("creatite_ore",
            Feature.ORE, new OreConfiguration(CREATITE_ORES, MWCommonConfig.CREATITE_ORE_VEIN_SIZE.get()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> HALITE_ORE = FeatureUtils.register("halite_ore",
            Feature.ORE, new OreConfiguration(HALITE_ORES, MWCommonConfig.HALITE_ORE_VEIN_SIZE.get()));
}
