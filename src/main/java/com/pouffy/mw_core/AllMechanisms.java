package com.pouffy.mw_core;

import com.refinedmods.refinedstorage.RS;
import com.simibubi.create.content.contraptions.itemAssembly.SequencedAssemblyItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
@SuppressWarnings("unused")
public class AllMechanisms {
    public static Item.Properties mechanismItem(Item.Properties properties) {
        return new Item.Properties().tab(MWCore.MISC);
    }
    public static final DeferredRegister<Item> MECHANISMS = DeferredRegister.create(ForgeRegistries.ITEMS, MWCore.MODID);

    public static final RegistryObject<Item> BASIC = MECHANISMS.register("basic_mechanism",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> COPPER = MECHANISMS.register("copper_mechanism",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> SEARED = MECHANISMS.register("seared_mechanism",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> SCORCHED = MECHANISMS.register("scorched_mechanism",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> COBALT = MECHANISMS.register("cobalt_mechanism",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> MANYULLYN = MECHANISMS.register("manyullyn_mechanism",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> LOGIC = MECHANISMS.register("logic_mechanism",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> TECH = MECHANISMS.register("tech_tube",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> DATA = MECHANISMS.register("data_tube",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REFINED_PARTS = MECHANISMS.register("refined_parts",
            () -> new Item(new Item.Properties().tab(RS.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> ACTION = MECHANISMS.register("action_mechanism",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> CORE_CASING = MECHANISMS.register("core_casing",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CIRTUS_CORE = MECHANISMS.register("certus_core",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> FLUIX_CORE = MECHANISMS.register("fluix_core",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));


}
