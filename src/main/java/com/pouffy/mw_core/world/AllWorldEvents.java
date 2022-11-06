package com.pouffy.mw_core.world;

import com.pouffy.mw_core.MWCore;
import com.pouffy.mw_core.world.gen.OreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MWCore.MODID)
public class AllWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        OreGeneration.generateOres(event);

    }
}
