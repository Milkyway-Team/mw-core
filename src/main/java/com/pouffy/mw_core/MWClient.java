package com.pouffy.mw_core;

import net.minecraftforge.eventbus.api.IEventBus;

public class MWClient {

    public MWClient() {
    }
    public static void onCtorClient(IEventBus modEventBus, IEventBus forgeEventBus) {
        modEventBus.addListener(AllParticleTypes::registerFactories);
    }
}
