package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.pouffy.mw_core.MWCore;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MWLootTables extends LootTableProvider {

    private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> lootTables = ImmutableList.of(Pair.of(MWBlocksLoot::new, LootContextParamSet.builder().build()));

    public MWLootTables(DataGenerator gen) {
        super(gen);
    }

    @Nonnull
    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return lootTables;
    }


    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, @Nonnull ValidationContext validationtracker) {
        map.keySet().removeIf((loc) -> !loc.getNamespace().equals(MWCore.MODID));
    }

    /**
     * Gets a name for this provider, to use in logging.
     */
    @Nonnull
    @Override
    public String getName() {
        return MWCore.MODID + " LootTables";
    }
}