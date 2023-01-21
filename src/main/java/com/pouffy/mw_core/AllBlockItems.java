package com.pouffy.mw_core;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
@SuppressWarnings("unused")
public class AllBlockItems {
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MWCore.MODID);

    public static final RegistryObject<BlockItem> ROCK_LUMP = BLOCK_ITEMS.register("rock_lump",
            () -> new BlockItem(AllBlocks.ROCK_LAYER.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> RAW_ALUMINIUM_BLOCK = BLOCK_ITEMS.register("raw_aluminium_block",
            () -> new BlockItem(AllBlocks.RAW_ALUMINIUM_BLOCK.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_BLOCK = BLOCK_ITEMS.register("aluminium_block",
            () -> new BlockItem(AllBlocks.ALUMINIUM_BLOCK.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_ORE = BLOCK_ITEMS.register("aluminium_ore",
            () -> new BlockItem(AllBlocks.ALUMINIUM_ORE.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> DEEPSLATE_ALUMINIUM_ORE = BLOCK_ITEMS.register("deepslate_aluminium_ore",
            () -> new BlockItem(AllBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CREATITE_ORE = BLOCK_ITEMS.register("creatite_ore",
            () -> new BlockItem(AllBlocks.CREATITE_ORE.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> TRANSIUM_BLOCK = BLOCK_ITEMS.register("transium_block",
            () -> new BlockItem(AllBlocks.TRANSIUM_BLOCK.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> DRAINED_SAND = BLOCK_ITEMS.register("drained_sand",
            () -> new BlockItem(AllBlocks.DRAINED_SAND.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> DRAINED_RED_SAND = BLOCK_ITEMS.register("drained_red_sand",
            () -> new BlockItem(AllBlocks.DRAINED_RED_SAND.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> HALITE_ORE = BLOCK_ITEMS.register("halite_ore",
            () -> new BlockItem(AllBlocks.HALITE_ORE.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> DEEPSLATE_HALITE_ORE = BLOCK_ITEMS.register("deepslate_halite_ore",
            () -> new BlockItem(AllBlocks.DEEPSLATE_HALITE_ORE.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CREATITE_BLOCK = BLOCK_ITEMS.register("creatite_block",
            () -> new BlockItem(AllBlocks.CREATITE_BLOCK.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> RADIANT_CASING = BLOCK_ITEMS.register("radiant_casing",
            () -> new BlockItem(AllBlocks.RADIANT_CASING.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> RADIANT_LAMP = BLOCK_ITEMS.register("radiant_lamp",
            () -> new BlockItem(AllBlocks.RADIANT_LAMP.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> RADIANT_QUARTZ_BLOCK = BLOCK_ITEMS.register("radiant_quartz_block",
            () -> new BlockItem(AllBlocks.RADIANT_QUARTZ_BLOCK.get(), new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> MAGISTEEL_BLOCK = BLOCK_ITEMS.register("magisteel_block",
            () -> new BlockItem(AllBlocks.MAGISTEEL_BLOCK.get(), new Item.Properties().tab(MWCore.MISC)));
}
