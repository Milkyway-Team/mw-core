package com.pouffy.mw_core;

import com.pouffy.mw_core.mw_capsules.ToolTipItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import slimeknights.mantle.item.TooltipItem;

public class AllFluidCapsules {
    public static final DeferredRegister<Item> FLUID_CAPSULE = DeferredRegister.create(ForgeRegistries.ITEMS, "mw_capsules");

    public static final RegistryObject<Item> EMPTY = FLUID_CAPSULE.register("empty_fluid",
            () -> new ToolTipItem(new Item.Properties().tab(MWCore.CAPSULES), true, true));
    public static final RegistryObject<Item> ALUMINIUM = FLUID_CAPSULE.register("aluminium_fluid",
            () -> new ToolTipItem(new Item.Properties().tab(MWCore.CAPSULES), true, true));
    public static final RegistryObject<Item> AMETHYST = FLUID_CAPSULE.register("amethyst_fluid",
            () -> new ToolTipItem(new Item.Properties().tab(MWCore.CAPSULES), true, true));
    public static final RegistryObject<Item> AMETHYST_BRONZE = FLUID_CAPSULE.register("amethyst_bronze_fluid",
            () -> new ToolTipItem(new Item.Properties().tab(MWCore.CAPSULES), true, true));
    public static final RegistryObject<Item> BRASS = FLUID_CAPSULE.register("brass_fluid",
            () -> new ToolTipItem(new Item.Properties().tab(MWCore.CAPSULES), true, true));
    public static final RegistryObject<Item> BRONZE = FLUID_CAPSULE.register("bronze_fluid",
            () -> new ToolTipItem(new Item.Properties().tab(MWCore.CAPSULES), true, true));
}
