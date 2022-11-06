package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class MWTags {
    public static void init() {
        Blocks.init();
        Items.init();
        Fluids.init();
    }

    public static class Blocks {

        public static void init() {}

        private static TagKey<Block> create(String name) {
            return BlockTags.create(new ResourceLocation(name));
        }

        public static final TagKey<Block> ROCK_TYPE_BLOCKS = create("mw_core:rock_type_blocks");


        // terra modifier tag
        // ores
        public static final TagKey<Block> ALUMINIUM_ORE = create("forge:ores/aluminum");

        // storage blocks
        public static final TagKey<Block> TRANSIUM = create("forge:storage_blocks/transium");
        public static final TagKey<Block> ALUMINIUM = create("forge:storage_blocks/aluminum");


        // raw blocks
        public static final TagKey<Block> RAW_ALUMINIUM = create("forge:storage_blocks/raw_aluminum");
    }

    public static class Items {

        public static void init() {}

        private static TagKey<Item> create(String name) {
            return ItemTags.create(new ResourceLocation(name));
        }

        // ores
        public static final TagKey<Item> ALUMINIUM_ORE = create("forge:ores/aluminum");


        // storage blocks
        public static final TagKey<Item> TRANSIUM_BLOCK = create("forge:storage_blocks/transium");
        public static final TagKey<Item> ALUMINIUM_BLOCK = create("forge:storage_blocks/aluminum");

        // raw blocks
        public static final TagKey<Item> RAW_ALUMINUM_BLOCK = create("forge:storage_blocks/raw_aluminum");

        public static final TagKey<Item> RAW_ALUMINUM = create("forge:raw_materials/aluminum");


        public static final TagKey<Item> TRANSIUM_INGOT = create("forge:ingots/transium");
        public static final TagKey<Item> TRANSIUM_DUST = create("forge:dusts/duralumin");
        public static final TagKey<Item> TRANSIUM_NUGGET = create("forge:nuggets/transium");

        public static final TagKey<Item> ALUMINUM_INGOT = create("forge:ingots/aluminum");
        public static final TagKey<Item> ALUMINUM_DUST = create("forge:dusts/aluminum");
        public static final TagKey<Item> ALUMINUM_NUGGET = create("forge:nuggets/aluminum");



        public static final TagKey<Item> ALUMINUM_CASTS = create("tinkers_reforged:casts/aluminum");
    }

    public static class Fluids {

        public static void init() {}

        private static TagKey<Fluid> create(String name) {
            return FluidTags.create(new ResourceLocation(name));
        }

        // forge tags
        public static final TagKey<Fluid> TRANSIUM = create("forge:molten_transium");

        // tinkers reforged tags
        public static final TagKey<Fluid> TRANSIUM_ = create("mw_core:molten_transium");
    }
}
