package com.pouffy.mw_core;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KermitamineItems {
    public static final DeferredRegister<Item> KERMIT_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MWCore.MODID);

    public static final RegistryObject<Item> EXAMPLE = KERMIT_ITEMS.register("example_item",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));

}
