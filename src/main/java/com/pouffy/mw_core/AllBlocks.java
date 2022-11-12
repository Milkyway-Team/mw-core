package com.pouffy.mw_core;

import com.simibubi.create.content.contraptions.base.CasingBlock;
import com.simibubi.create.foundation.data.BuilderTransformers;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import slimeknights.tconstruct.shared.TinkerMaterials;

@SuppressWarnings("unused")
public class AllBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MWCore.MODID);

    public static final RegistryObject<Block> TRANSIUM_BLOCK = BLOCKS.register("transium_block",
            () -> new Block(Block.Properties.copy(Blocks.NETHERITE_BLOCK).strength(2.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ALUMINIUM_BLOCK = BLOCKS.register("aluminium_block",
            () -> new Block(Block.Properties.copy(Blocks.COPPER_BLOCK).strength(2.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ALUMINIUM_ORE = BLOCKS.register("aluminium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F)));
    public static final RegistryObject<Block> CREATITE_ORE = BLOCKS.register("creatite_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops().strength(4.0F)));
    public static final RegistryObject<Block> DEEPSLATE_ALUMINIUM_ORE = BLOCKS.register("deepslate_aluminium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.DEEPSLATE).strength(3.0F).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> RAW_ALUMINIUM_BLOCK = BLOCKS.register("raw_aluminium_block",
            () -> new Block(Block.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(2.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DRAINED_RED_SAND = BLOCKS.register("drained_red_sand",
            () -> new SandBlock(11098145, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE).strength(0.5F).sound(SoundType.SAND)));
    public static final RegistryObject<Block> DRAINED_SAND = BLOCKS.register("drained_sand",
            () -> new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5F).sound(SoundType.SAND)));
    public static final RegistryObject<Block> HALITE_ORE = BLOCKS.register("halite_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0F)));
    public static final RegistryObject<Block> DEEPSLATE_HALITE_ORE = BLOCKS.register("deepslate_halite_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).color(MaterialColor.DEEPSLATE).strength(3.0F).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> CREATITE_BLOCK = BLOCKS.register("creatite_block",
            () -> new Block(Block.Properties.copy(Blocks.NETHERITE_BLOCK).strength(2.0F).requiresCorrectToolForDrops()));
}
