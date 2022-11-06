package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen;

import com.pouffy.mw_core.AllBlocks;
import com.pouffy.mw_core.MWCore;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import slimeknights.tconstruct.common.TinkerTags;

import javax.annotation.Nullable;

import static com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon.MWTags.Blocks.*;

public class MWBlockTags extends BlockTagsProvider {

    private static TagKey<Block> create(String name) {
        return BlockTags.create(new ResourceLocation(name));
    }

    public MWBlockTags(DataGenerator gen, @Nullable ExistingFileHelper existingFileHelper) {
        super(gen, MWCore.MODID, existingFileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void addTags() {

        tag(ROCK_TYPE_BLOCKS).addTags(Tags.Blocks.STONE, Tags.Blocks.END_STONES, Tags.Blocks.NETHERRACK);

        tag(RAW_ALUMINIUM).add(AllBlocks.RAW_ALUMINIUM_BLOCK.get());

        tag(Tags.Blocks.ORES).add(
                AllBlocks.ALUMINIUM_ORE.get(),
                AllBlocks.DEEPSLATE_ALUMINIUM_ORE.get()
        );

        tag(ALUMINIUM).add(AllBlocks.ALUMINIUM_BLOCK.get());
        tag(TRANSIUM).add(AllBlocks.TRANSIUM_BLOCK.get());

        //USE LATER IF NEEDED
       //tag(BlockTags.NEEDS_DIAMOND_TOOL)
       //        .add(
       //
       //        );
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(
                        AllBlocks.ALUMINIUM_ORE.get(),
                        AllBlocks.RAW_ALUMINIUM_BLOCK.get(),
                        AllBlocks.DEEPSLATE_ALUMINIUM_ORE.get(),
                        AllBlocks.ALUMINIUM_BLOCK.get(),
                        AllBlocks.TRANSIUM_BLOCK.get()
                );

        tag(ALUMINIUM_ORE).add(AllBlocks.ALUMINIUM_ORE.get(), AllBlocks.DEEPSLATE_ALUMINIUM_ORE.get());

        tag(Tags.Blocks.ORES)
                .add(
                        AllBlocks.ALUMINIUM_ORE.get(),
                        AllBlocks.DEEPSLATE_ALUMINIUM_ORE.get()
                );

        tag(Tags.Blocks.STORAGE_BLOCKS)
                .add(
                        AllBlocks.RAW_ALUMINIUM_BLOCK.get(),
                        AllBlocks.TRANSIUM_BLOCK.get(),
                        AllBlocks.ALUMINIUM_BLOCK.get()
                );

        tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(
                        AllBlocks.ALUMINIUM_BLOCK.get(),
                        AllBlocks.TRANSIUM_BLOCK.get()
                );

        tag(TinkerTags.Blocks.ANVIL_METAL)
                .add(
                        AllBlocks.TRANSIUM_BLOCK.get(),
                        AllBlocks.ALUMINIUM_BLOCK.get()
                );

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        AllBlocks.ALUMINIUM_ORE.get(),
                        AllBlocks.DEEPSLATE_ALUMINIUM_ORE.get(),
                        AllBlocks.RAW_ALUMINIUM_BLOCK.get(),
                        AllBlocks.TRANSIUM_BLOCK.get(),
                        AllBlocks.ALUMINIUM_BLOCK.get()
                );
    }
}
