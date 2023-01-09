package com.pouffy.mw_core.world.feature;

import com.pouffy.mw_core.util.config.MWCommonConfig;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class PlacedFeatures {
    public static final Holder<PlacedFeature> ALUMINIUM_ORE_PLACED = PlacementUtils.register("aluminium_ore_placed",
            ConfiguredFeatures.ALUMINIUM_ORE, OrePlacement.commonOrePlacement(MWCommonConfig.BAUXITE_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> CINNABAR_ORE_PLACED = PlacementUtils.register("cinnabar_ore_placed",
            ConfiguredFeatures.CINNABAR_ORE, OrePlacement.commonOrePlacement(MWCommonConfig.CINNABAR_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> CREATITE_ORE_PLACED = PlacementUtils.register("creatite_ore_placed",
            ConfiguredFeatures.CREATITE_ORE, OrePlacement.commonOrePlacement(MWCommonConfig.CREATITE_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(120))));

    public static final Holder<PlacedFeature> HALITE_ORE_PLACED = PlacementUtils.register("halite_ore_placed",
            ConfiguredFeatures.HALITE_ORE, OrePlacement.commonOrePlacement(MWCommonConfig.HALITE_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(150))));
}
