package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialStatsDataProvider;
import slimeknights.tconstruct.tools.stats.ExtraMaterialStats;
import slimeknights.tconstruct.tools.stats.HandleMaterialStats;
import slimeknights.tconstruct.tools.stats.HeadMaterialStats;

import static net.minecraft.world.item.Tiers.*;

import javax.annotation.Nonnull;

public class MWMaterialStats extends AbstractMaterialStatsDataProvider {

    public MWMaterialStats(DataGenerator gen, AbstractMaterialDataProvider materials) {
        super(gen, materials);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Milkyway Core Material Stats";
    }

    @Override
    protected void addMaterialStats() {

        addMaterialStats(MWMaterialIds.transium,
                new HeadMaterialStats(950, 7f, DIAMOND, 7f),
                HandleMaterialStats.DEFAULT.withMiningSpeed(7f).withAttackDamage(1.15f),
                ExtraMaterialStats.DEFAULT);
}}
