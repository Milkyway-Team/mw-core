package com.pouffy.mw_core;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import slimeknights.mantle.registration.deferred.FluidDeferredRegister;
import slimeknights.mantle.registration.object.FluidObject;
@SuppressWarnings("unused")
public class AllFluids {
    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(MWCore.MODID);

    public static FluidObject<ForgeFlowingFluid> transium = register("molten_transium", 1200);

    private static FluidObject<ForgeFlowingFluid> register(String name, int temp) {
        String still = String.format("mw_core:block/fluid/%s/still", name);
        String flow = String.format("mw_core:block/fluid/%s/flowing", name);
        return FLUIDS.register(name, FluidAttributes.builder(new ResourceLocation(still), new ResourceLocation(flow)).density(2000).viscosity(10000).temperature(temp).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA), Material.LAVA, 15);
    }
}
