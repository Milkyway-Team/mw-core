package com.pouffy.mw_core;

import com.pouffy.mw_core.content.items.SequencedAssemblyItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
@SuppressWarnings("unused")

public class AllIncompleteItems {
    public static final DeferredRegister<Item> INCOMPLETE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MWCore.MODID);

    public static final RegistryObject<Item> INCOMPLETE_BASIC = INCOMPLETE_ITEMS.register("incomplete_basic_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_COPPER = INCOMPLETE_ITEMS.register("incomplete_copper_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_SEARED = INCOMPLETE_ITEMS.register("incomplete_seared_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_SCORCHED = INCOMPLETE_ITEMS.register("incomplete_scorched_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_COBALT = INCOMPLETE_ITEMS.register("incomplete_cobalt_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_MANYULLYN = INCOMPLETE_ITEMS.register("incomplete_manyullyn_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_LOGIC = INCOMPLETE_ITEMS.register("incomplete_logic_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_ACTION = INCOMPLETE_ITEMS.register("incomplete_action_mechanism",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final RegistryObject<Item> INCOMPLETE_SECURITY_CARD = INCOMPLETE_ITEMS.register("incomplete_security_card",
            () -> new SequencedAssemblyItem(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_UPGRADE = INCOMPLETE_ITEMS.register("incomplete_upgrade",
            () -> new SequencedAssemblyItem(new Item.Properties()));

}
