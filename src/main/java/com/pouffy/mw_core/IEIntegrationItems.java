package com.pouffy.mw_core;

import com.pouffy.mw_core.content.items.SequencedAssemblyItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
@SuppressWarnings({"unused", "typos"})
public class IEIntegrationItems {
    public static final DeferredRegister<Item> IEITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MWCore.MODID);
    public static final RegistryObject<Item> T_C = IEITEMS.register("treated_circuit",
            () -> new Item(new Item.Properties().tab(MWCore.IE)));
    public static final RegistryObject<SequencedAssemblyItem> INCOMPLETE_E_C = IEITEMS.register("incomplete_electronic_component",
            () -> new SequencedAssemblyItem(new Item.Properties().tab(MWCore.IE)));

    public static final RegistryObject<Item> D_C = IEITEMS.register("duroplast_circuit",
            () -> new Item(new Item.Properties().tab(MWCore.IE)));
    public static final RegistryObject<SequencedAssemblyItem> INCOMPLETE_A_E_C = IEITEMS.register("incomplete_advanced_electronic_component",
            () -> new SequencedAssemblyItem(new Item.Properties().tab(MWCore.IE)));
    public static final RegistryObject<SequencedAssemblyItem> INCOMPLETE_E_L_B = IEITEMS.register("light_bulb_base",
            () -> new SequencedAssemblyItem(new Item.Properties().tab(MWCore.IE)));
    public static final RegistryObject<Item> U_L_B = IEITEMS.register("unwrapped_light_bulb",
            () -> new Item(new Item.Properties().tab(MWCore.IE)));
    public static final RegistryObject<Item> E_L_B = IEITEMS.register("exposed_light_bulb",
            () -> new Item(new Item.Properties().tab(MWCore.IE)));
}
