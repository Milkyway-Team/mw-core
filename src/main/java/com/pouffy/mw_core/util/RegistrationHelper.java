package com.pouffy.mw_core.util;

import cofh.core.entity.AbstractGrenade;
import cofh.core.entity.AbstractTNTMinecart;
import cofh.core.item.*;
import cofh.lib.api.IDetonatable;
import cofh.lib.block.CropBlockCoFH;
import cofh.lib.block.CropBlockPerennial;
import cofh.lib.block.CropBlockTall;
import cofh.lib.block.TntBlockCoFH;
import cofh.lib.entity.PrimedTntCoFH;
import cofh.lib.util.Constants;
import cofh.thermal.core.ThermalCore;
import cofh.thermal.core.entity.explosive.DetonateUtils;
import cofh.thermal.core.entity.explosive.Grenade;
import cofh.thermal.core.entity.explosive.ThermalTNTEntity;
import cofh.thermal.core.entity.explosive.ThermalTNTMinecart;
import cofh.thermal.lib.common.ThermalFlags;
import cofh.thermal.lib.common.ThermalItemGroups;
import cofh.thermal.lib.item.BlockItemAugmentable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class RegistrationHelper {
    public RegistrationHelper() {
    }

    public static void registerBlock(String name, Supplier<Block> sup) {
        registerBlock(name, sup, "thermal");
    }

    public static void registerBlock(String name, Supplier<Block> sup, Supplier<Boolean> showInGroups) {
        registerBlock(name, sup, showInGroups, "thermal");
    }

    public static void registerBlock(String name, Supplier<Block> sup, CreativeModeTab group) {
        registerBlock(name, sup, group, Constants.TRUE, "thermal");
    }

    public static void registerBlock(String name, Supplier<Block> sup, CreativeModeTab group, Supplier<Boolean> showInGroups) {
        registerBlock(name, sup, group, showInGroups, "thermal");
    }

    public static void registerBlock(String name, Supplier<Block> sup, Rarity rarity) {
        registerBlock(name, sup, rarity, "thermal");
    }

    public static void registerBlock(String name, Supplier<Block> sup, Rarity rarity, Supplier<Boolean> showInGroups) {
        registerBlock(name, sup, rarity, showInGroups, "thermal");
    }

    public static void registerBlock(String name, Supplier<Block> sup, CreativeModeTab group, Rarity rarity, Supplier<Boolean> showInGroups) {
        registerBlock(name, sup, group, rarity, showInGroups, "thermal");
    }

    public static void registerBlock(String name, Supplier<Block> sup, String modId) {
        registerBlock(name, sup, ThermalItemGroups.THERMAL_BLOCKS, Rarity.COMMON, Constants.TRUE, modId);
    }

    public static void registerBlock(String name, Supplier<Block> sup, CreativeModeTab group, String modId) {
        registerBlock(name, sup, group, Rarity.COMMON, Constants.TRUE, modId);
    }

    public static void registerBlock(String name, Supplier<Block> sup, Supplier<Boolean> showInGroups, String modId) {
        registerBlock(name, sup, ThermalItemGroups.THERMAL_BLOCKS, Rarity.COMMON, showInGroups, modId);
    }

    public static void registerBlock(String name, Supplier<Block> sup, CreativeModeTab group, Supplier<Boolean> showInGroups, String modId) {
        registerBlock(name, sup, group, Rarity.COMMON, showInGroups, modId);
    }

    public static void registerBlock(String name, Supplier<Block> sup, Rarity rarity, String modId) {
        registerBlock(name, sup, ThermalItemGroups.THERMAL_BLOCKS, rarity, Constants.TRUE, modId);
    }

    public static void registerBlock(String name, Supplier<Block> sup, CreativeModeTab group, Rarity rarity, String modId) {
        registerBlock(name, sup, group, rarity, Constants.TRUE, modId);
    }

    public static void registerBlock(String name, Supplier<Block> sup, Rarity rarity, Supplier<Boolean> showInGroups, String modId) {
        registerBlock(name, sup, ThermalItemGroups.THERMAL_BLOCKS, rarity, showInGroups, modId);
    }

    public static void registerBlock(String name, Supplier<Block> sup, CreativeModeTab group, Rarity rarity, Supplier<Boolean> showInGroups, String modId) {
        registerBlockAndItem(name, sup, () -> {
            return (new BlockItemCoFH((Block) ThermalCore.BLOCKS.get(name), (new Item.Properties()).tab(group).rarity(rarity))).setShowInGroups(showInGroups).setModId(modId);
        });
    }

    public static void registerBlockOnly(String name, Supplier<Block> sup) {
        ThermalCore.BLOCKS.register(name, sup);
    }

    public static void registerBlockAndItem(String name, Supplier<Block> blockSup, Supplier<Item> itemSup) {
        ThermalCore.BLOCKS.register(name, blockSup);
        ThermalCore.ITEMS.register(name, itemSup);
    }

    public static void registerAugmentableBlock(String name, Supplier<Block> sup, IntSupplier numSlots, BiPredicate<ItemStack, List<ItemStack>> validAugment, Supplier<Boolean> showInGroups) {
        registerAugmentableBlock(name, sup, numSlots, validAugment, showInGroups, "thermal");
    }

    public static void registerAugmentableBlock(String name, Supplier<Block> sup, IntSupplier numSlots, BiPredicate<ItemStack, List<ItemStack>> validAugment, String modId) {
        registerAugmentableBlock(name, sup, numSlots, validAugment, ThermalItemGroups.THERMAL_DEVICES, Rarity.COMMON, Constants.TRUE, modId);
    }

    public static void registerAugmentableBlock(String name, Supplier<Block> sup, IntSupplier numSlots, BiPredicate<ItemStack, List<ItemStack>> validAugment, Supplier<Boolean> showInGroups, String modId) {
        registerAugmentableBlock(name, sup, numSlots, validAugment, ThermalItemGroups.THERMAL_DEVICES, Rarity.COMMON, showInGroups, modId);
    }

    public static void registerAugmentableBlock(String name, Supplier<Block> sup, IntSupplier numSlots, BiPredicate<ItemStack, List<ItemStack>> validAugment, CreativeModeTab group, Rarity rarity, Supplier<Boolean> showInGroups, String modId) {
        ThermalCore.BLOCKS.register(name, sup);
        ThermalCore.ITEMS.register(name, () -> {
            return (new BlockItemAugmentable((Block)ThermalCore.BLOCKS.get(name), (new Item.Properties()).tab(group).rarity(rarity))).setNumSlots(numSlots).setAugValidator(validAugment).setShowInGroups(showInGroups).setModId(modId);
        });
    }

    public static void registerWoodBlockSet(String woodName, Material material, MaterialColor color, float hardness, float resistance, SoundType soundType, String modId) {
        registerBlock(woodName + "_planks", () -> {
            return new Block(BlockBehaviour.Properties.of(material, color).strength(hardness, resistance).sound(soundType));
        }, modId);
        registerBlock(woodName + "_slab", () -> {
            return new SlabBlock(BlockBehaviour.Properties.of(material, color).strength(hardness, resistance).sound(soundType));
        }, modId);
        registerBlock(woodName + "_stairs", () -> {
            return new StairBlock(() -> {
                return ((Block)ThermalCore.BLOCKS.get(woodName + "_planks")).defaultBlockState();
            }, BlockBehaviour.Properties.of(material, color).strength(hardness, resistance).sound(soundType));
        }, modId);
        registerBlock(woodName + "_door", () -> {
            return new DoorBlock(BlockBehaviour.Properties.of(material, color).strength(resistance).sound(soundType).noOcclusion());
        }, modId);
        registerBlock(woodName + "_trapdoor", () -> {
            return new TrapDoorBlock(BlockBehaviour.Properties.of(material, color).strength(resistance).sound(soundType).noOcclusion().isValidSpawn((state, reader, pos, entityType) -> {
                return false;
            }));
        }, modId);
        registerBlock(woodName + "_button", () -> {
            return new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(soundType));
        }, modId);
        registerBlock(woodName + "_pressure_plate", () -> {
            return new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(material, color).noCollission().strength(0.5F).sound(soundType));
        }, modId);
        registerBlock(woodName + "_fence", () -> {
            return new FenceBlock(BlockBehaviour.Properties.of(material, color).strength(hardness, resistance).sound(soundType));
        }, modId);
        registerBlock(woodName + "_fence_gate", () -> {
            return new FenceGateBlock(BlockBehaviour.Properties.of(material, color).strength(hardness, resistance).sound(soundType));
        }, modId);
    }

    public static RegistryObject<Item> registerItem(String name, Supplier<Item> sup) {
        return ThermalCore.ITEMS.register(name, sup);
    }

    public static RegistryObject<Item> registerItem(String name, CreativeModeTab group) {
        return registerItem(name, group, Rarity.COMMON);
    }

    public static RegistryObject<Item> registerItem(String name, CreativeModeTab group, Rarity rarity) {
        return registerItem(name, () -> {
            return new ItemCoFH((new Item.Properties()).tab(group).rarity(rarity));
        });
    }

    public static void registerMetalSet(String prefix, CreativeModeTab group, Rarity rarity) {
        registerMetalSet(prefix, group, rarity, Constants.TRUE, false, false, "thermal");
    }

    public static void registerMetalSet(String prefix, CreativeModeTab group, Rarity rarity, Supplier<Boolean> showInGroups) {
        registerMetalSet(prefix, group, rarity, showInGroups, false, false, "thermal");
    }

    public static void registerMetalSet(String prefix, CreativeModeTab group, Supplier<Boolean> showInGroups) {
        registerMetalSet(prefix, group, Rarity.COMMON, showInGroups, false, false, "thermal");
    }

    public static void registerAlloySet(String prefix, CreativeModeTab group, Rarity rarity) {
        registerMetalSet(prefix, group, rarity, Constants.TRUE, false, true, "thermal");
    }

    public static void registerAlloySet(String prefix, CreativeModeTab group, Supplier<Boolean> showInGroups) {
        registerMetalSet(prefix, group, Rarity.COMMON, showInGroups, false, true, "thermal");
    }

    public static void registerVanillaMetalSet(String prefix, CreativeModeTab group) {
        registerMetalSet(prefix, group, Rarity.COMMON, Constants.TRUE, true, false, "thermal");
    }

    public static void registerMetalSet(String prefix, CreativeModeTab group, Rarity rarity, Supplier<Boolean> showInGroups, boolean vanilla, boolean alloy, String modId) {
        if (prefix.equals("copper") || prefix.equals("netherite")) {
            ThermalCore.ITEMS.register(prefix + "_nugget", () -> {
                return (new ItemCoFH((new Item.Properties()).tab(group).rarity(rarity))).setShowInGroups(showInGroups).setModId(modId);
            });
        }

        if (!vanilla) {
            if (!alloy) {
                ThermalCore.ITEMS.register("raw_" + prefix, () -> {
                    return (new ItemCoFH((new Item.Properties()).tab(group).rarity(rarity))).setShowInGroups(showInGroups).setModId(modId);
                });
            }

            ThermalCore.ITEMS.register(prefix + "_ingot", () -> {
                return (new ItemCoFH((new Item.Properties()).tab(group).rarity(rarity))).setShowInGroups(showInGroups).setModId(modId);
            });
            ThermalCore.ITEMS.register(prefix + "_nugget", () -> {
                return (new ItemCoFH((new Item.Properties()).tab(group).rarity(rarity))).setShowInGroups(showInGroups).setModId(modId);
            });
        }

        ThermalCore.ITEMS.register(prefix + "_dust", () -> {
            return (new ItemCoFH((new Item.Properties()).tab(group).rarity(rarity))).setShowInGroups(showInGroups).setModId(modId);
        });
        ThermalCore.ITEMS.register(prefix + "_gear", () -> {
            return (new ItemCoFH((new Item.Properties()).tab(group).rarity(rarity))).setShowInGroups(showInGroups).setModId(modId);
        });
        ThermalCore.ITEMS.register(prefix + "_plate", () -> {
            return (new CountedItem((new Item.Properties()).tab(group).rarity(rarity))).setShowInGroups(() -> {
                return (Boolean) ThermalFlags.getFlag(ThermalFlags.FLAG_PLATES).get() && (Boolean)showInGroups.get();
            }).setModId(modId);
        });
        ThermalCore.ITEMS.register(prefix + "_coin", () -> {
            return (new CoinItem((new Item.Properties()).tab(group).rarity(rarity))).setShowInGroups(() -> {
                return (Boolean)ThermalFlags.getFlag(ThermalFlags.FLAG_COINS).get() && (Boolean)showInGroups.get();
            }).setModId(modId);
        });
    }

    public static void registerGemSet(String prefix, CreativeModeTab group, Rarity rarity, Supplier<Boolean> showInGroups) {
        registerGemSet(prefix, group, rarity, showInGroups, false);
    }

    public static void registerGemSet(String prefix, CreativeModeTab group, Supplier<Boolean> showInGroups) {
        registerGemSet(prefix, group, Rarity.COMMON, showInGroups, false);
    }

    public static void registerVanillaGemSet(String prefix, CreativeModeTab group) {
        registerGemSet(prefix, group, Rarity.COMMON, Constants.TRUE, true);
    }

    public static void registerGemSet(String prefix, CreativeModeTab group, Rarity rarity, Supplier<Boolean> showInGroups, boolean vanilla) {
        if (!vanilla) {
            ThermalCore.ITEMS.register(prefix, () -> {
                return (new ItemCoFH((new Item.Properties()).tab(group).rarity(rarity))).setShowInGroups(showInGroups);
            });
        }

        ThermalCore.ITEMS.register(prefix + "_dust", () -> {
            return (new ItemCoFH((new Item.Properties()).tab(group).rarity(rarity))).setShowInGroups(showInGroups);
        });
        ThermalCore.ITEMS.register(prefix + "_gear", () -> {
            return (new ItemCoFH((new Item.Properties()).tab(group).rarity(rarity))).setShowInGroups(showInGroups);
        });
    }







    public static String deepslate(String id) {
        return "deepslate_" + id;
    }

    public static String netherrack(String id) {
        return "netherrack_" + id;
    }

    public static String raw(String id) {
        return "raw_" + id;
    }

    public static String block(String id) {
        return id + "_block";
    }

    public static String seeds(String id) {
        return id + "_seeds";
    }

    public static String spores(String id) {
        return id + "_spores";
    }

}
