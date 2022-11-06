package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen;

import com.pouffy.mw_core.AllBlocks;
import com.pouffy.mw_core.AllItems;
import com.pouffy.mw_core.MWCore;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.stream.Collectors;

public class MWBlocksLoot extends BlockLoot {

    @Nonnull
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream()
                .filter((block) -> MWCore.MODID.equals(Objects.requireNonNull(block.getRegistryName()).getNamespace()))
                .collect(Collectors.toList());
    }

    @Override
    protected void addTables() {
        this.add(AllBlocks.ALUMINIUM_ORE.get(), (block) -> createOreDrop(block, AllItems.RAW_ALUMINIUM.get()));
        this.add(AllBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), (block) -> createOreDrop(block, AllItems.RAW_ALUMINIUM.get()));
        this.dropSelf(AllBlocks.ALUMINIUM_BLOCK.get());
        this.dropSelf(AllBlocks.TRANSIUM_BLOCK.get());

    }
}
