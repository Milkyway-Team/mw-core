package com.pouffy.mw_core;

import blusunrize.immersiveengineering.common.blocks.IEBaseBlock;
import blusunrize.immersiveengineering.common.blocks.IEEntityBlock;
import blusunrize.immersiveengineering.common.blocks.generic.PostBlock;
import blusunrize.immersiveengineering.common.blocks.generic.ScaffoldingBlock;
import blusunrize.immersiveengineering.common.blocks.generic.WallmountBlock;
import blusunrize.immersiveengineering.common.blocks.metal.CrusherBlockEntity;
import blusunrize.immersiveengineering.common.blocks.metal.MetalMultiblockBlock;
import blusunrize.immersiveengineering.common.blocks.wooden.BarrelBlock;
import blusunrize.immersiveengineering.common.register.IEBlockEntities;
import com.pouffy.mw_core.content.block.PlushBlock;
import com.pouffy.mw_core.content.block.RockLayerBlock;
import com.pouffy.mw_core.content.block.SkystoneMagmaBlock;
import com.pouffy.mw_core.util.BlockHelper;
import com.simibubi.create.content.contraptions.base.CasingBlock;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

@SuppressWarnings("unused")
public class AllBlocks {
    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (state) -> (Boolean)state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }
    private static Boolean always(BlockState p_50810_, BlockGetter p_50811_, BlockPos p_50812_, EntityType<?> p_50813_) {
        return true;
    }
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

    public static final RegistryObject<Block> RADIANT_CASING = BLOCKS.register("radiant_casing",
            () -> new CasingBlock(Block.Properties.copy(Blocks.OAK_WOOD).lightLevel(BlockHelper.lightValue(15)).strength(1.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RADIANT_LAMP = BLOCKS.register("radiant_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(20)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(AllBlocks::always)));
    public static final RegistryObject<Block> RADIANT_QUARTZ_BLOCK = BLOCKS.register("radiant_quartz_block",
            () -> new Block(Block.Properties.copy(Blocks.GLASS).lightLevel(BlockHelper.lightValue(15)).strength(2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MAGISTEEL_BLOCK = BLOCKS.register("magisteel_block",
            () -> new Block(Block.Properties.copy(Blocks.NETHERITE_BLOCK).strength(2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<RockLayerBlock> ROCK_LAYER = BLOCKS.register("rock_lump",
            () -> new RockLayerBlock(Block.Properties.copy(Blocks.STONE).strength(1.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROCK_BLOCK = BLOCKS.register("rock_block",
            () -> new Block(Block.Properties.copy(Blocks.STONE).strength(1.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROCK = BLOCKS.register("rock",
            () -> new Block(Block.Properties.copy(Blocks.STONE).strength(3.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<SkystoneMagmaBlock> SKYSTONE_MAGMA = BLOCKS.register("skystone_magma",
            () -> new SkystoneMagmaBlock(Block.Properties.copy(Blocks.MAGMA_BLOCK).strength(25.0F, 75.0F).requiresCorrectToolForDrops().lightLevel((p_152684_) -> {
                return 3;
            }).randomTicks().isValidSpawn((p_187421_, p_187422_, p_187423_, p_187424_) -> {
                return p_187424_.fireImmune();
            }).hasPostProcess(AllBlocks::always).emissiveRendering(AllBlocks::always)));
    public static final RegistryObject<PlushBlock> MILKFUR_PLUSH = BLOCKS.register("milkfur_plush",
            () -> new PlushBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.0F)));
    public static final RegistryObject<PlushBlock> POUFFY_PLUSH = BLOCKS.register("pouffy_plush",
            () -> new PlushBlock(Block.Properties.copy(Blocks.WHITE_WOOL).strength(1.0F)));


    private static boolean always(BlockState p_50775_, BlockGetter p_50776_, BlockPos p_50777_) {
        return true;
    }
}
