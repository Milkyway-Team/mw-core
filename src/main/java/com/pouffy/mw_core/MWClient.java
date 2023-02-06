package com.pouffy.mw_core;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class MWClient {

    public MWClient() {
    }
    public static void init(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(AllBlocks.MILKFUR_PLUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllBlocks.POUFFY_PLUSH.get(), RenderType.cutout());

    }
    public static void onCtorClient(IEventBus modEventBus, IEventBus forgeEventBus) {

    }
}
