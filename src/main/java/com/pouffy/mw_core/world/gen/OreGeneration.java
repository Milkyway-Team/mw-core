package com.pouffy.mw_core.world.gen;

import com.pouffy.mw_core.world.feature.PlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class OreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(PlacedFeatures.ALUMINIUM_ORE_PLACED);
        base.add(PlacedFeatures.CREATITE_ORE_PLACED);
        base.add(PlacedFeatures.HALITE_ORE_PLACED);
    }
}
