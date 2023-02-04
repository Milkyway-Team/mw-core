package com.pouffy.mw_core.content.block;

import blusunrize.immersiveengineering.common.blocks.*;
import blusunrize.immersiveengineering.common.blocks.metal.CrusherBlockEntity;
import blusunrize.immersiveengineering.common.blocks.metal.MetalMultiblockBlock;
import blusunrize.immersiveengineering.common.blocks.wooden.BarrelBlock;
import blusunrize.immersiveengineering.common.register.IEBlockEntities;
import blusunrize.immersiveengineering.common.register.IEBlocks;
import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class IEIntegrationBlocks {
    public static final DeferredRegister<Block> REGISTER;
    private static final Supplier<BlockBehaviour.Properties> METAL_PROPERTIES_NO_OCCLUSION = null;

    private IEIntegrationBlocks() {
    }


    public static void init() {
        REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
        IEIntegrationBlocks.Multiblocks.init();
        Iterator var0 = IEIntegrationBlocks.BlockEntry.ALL_ENTRIES.iterator();

    }

    static {
        REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, "mw_core");
    }

    public static final class BlockEntry<T extends Block> implements Supplier<T>, ItemLike {
        public static final Collection<IEIntegrationBlocks.BlockEntry<?>> ALL_ENTRIES = new ArrayList();
        private final RegistryObject<Block> regObject;
        private final Supplier<BlockBehaviour.Properties> properties;

        public static IEIntegrationBlocks.BlockEntry<IEBaseBlock> simple(String name, Supplier<BlockBehaviour.Properties> properties, Consumer<IEBaseBlock> extra) {
            return new IEIntegrationBlocks.BlockEntry(name, properties, (p) -> {
                return (IEBaseBlock) Util.make(new IEBaseBlock((BlockBehaviour.Properties) p), extra);
            });
        }

        public static IEIntegrationBlocks.BlockEntry<IEBaseBlock> simple(String name, Supplier<BlockBehaviour.Properties> properties) {
            return simple(name, properties, ($) -> {
            });
        }

        public static IEIntegrationBlocks.BlockEntry<IEEntityBlock<?>> barrel(String name, boolean metal) {
            return new IEIntegrationBlocks.BlockEntry(name, () -> {
                return BarrelBlock.getProperties(metal);
            }, (p) -> {
                return BarrelBlock.make((BlockBehaviour.Properties) p, metal);
            });
        }

        public BlockEntry(String name, Supplier<BlockBehaviour.Properties> properties, Function<BlockBehaviour.Properties, T> make) {
            this.properties = properties;
            this.regObject = IEIntegrationBlocks.REGISTER.register(name, () -> {
                return (Block) make.apply((BlockBehaviour.Properties) properties.get());
            });
            ALL_ENTRIES.add(this);
        }

        public BlockEntry(T existing) {
            this.properties = () -> {
                return BlockBehaviour.Properties.copy(existing);
            };
            this.regObject = RegistryObject.create(existing.getRegistryName(), ForgeRegistries.BLOCKS);
        }

        public BlockEntry(IEIntegrationBlocks.BlockEntry<? extends T> toCopy) {
            this.properties = toCopy.properties;
            this.regObject = toCopy.regObject;
        }

        public T get() {
            return (T) this.regObject.get();
        }

        public BlockState defaultBlockState() {
            return this.get().defaultBlockState();
        }

        public ResourceLocation getId() {
            return this.regObject.getId();
        }

        public BlockBehaviour.Properties getProperties() {
            return (BlockBehaviour.Properties) this.properties.get();
        }

        @Nonnull
        public Item asItem() {
            return this.get().asItem();
        }
    }

    public static final class Multiblocks {
        public static final IEBlocks.BlockEntry<MetalMultiblockBlock<CrusherBlockEntity>> CRYSTAL_MULTIPLIER;

        public Multiblocks() {
        }

        private static void init() {
        }

        static {

            CRYSTAL_MULTIPLIER = new IEBlocks.BlockEntry("crusher", IEIntegrationBlocks.METAL_PROPERTIES_NO_OCCLUSION, (p) -> {
                return new MetalMultiblockBlock((MultiblockBEType) IEBlockEntities.CRUSHER, (BlockBehaviour.Properties) p);
            });
        }
    }
}
