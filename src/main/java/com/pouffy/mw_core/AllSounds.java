package com.pouffy.mw_core;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AllSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MWCore.MODID);

    public static RegistryObject<SoundEvent> VENTURE = registerSoundEvent("venture");



    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(MWCore.MODID, name)));
    }

}
