package com.pouffy.mw_core;

import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.sounds.Music;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
@SuppressWarnings("unused")
public class AllDiscs {
    public static Item.Properties discItem(Item.Properties properties) {
        return new Item.Properties().tab(MWCore.MISC);
    }
    public static final DeferredRegister<Item> DISCS = DeferredRegister.create(ForgeRegistries.ITEMS, MWCore.MODID);
    public static final RegistryObject<Item> VENTURE = DISCS.register("music_disc_venture",
            () -> new RecordItem(4, AllSounds.VENTURE ,new Item.Properties().tab(MWCore.MISC).stacksTo(1)));
    public static final RegistryObject<Item> SPACE_PIRATES = DISCS.register("music_disc_space_pirates",
            () -> new RecordItem(4, AllSounds.SPACE_PIRATES ,new Item.Properties().tab(MWCore.MISC).stacksTo(1)));
    public static final RegistryObject<Item> THERMAL_RISE = DISCS.register("music_disc_thermal_rise",
            () -> new RecordItem(4, AllSounds.THERMAL_RISE ,new Item.Properties().tab(MWCore.MISC).stacksTo(1)));
}
