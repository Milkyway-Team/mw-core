package com.pouffy.mw_core;

import com.pouffy.mw_core.content.particle.KermitamineParticles;
import com.simibubi.create.content.contraptions.particle.ICustomParticleData;
import com.simibubi.create.foundation.utility.Lang;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public enum AllParticleTypes {

    KERMITAMINE(KermitamineParticles.Data::new);


    private final AllParticleTypes.ParticleEntry<?> entry;

    private AllParticleTypes(Supplier typeFactory) {
        String name = Lang.asId(this.name());
        this.entry = new AllParticleTypes.ParticleEntry(name, typeFactory);
    }

    public static void register(IEventBus modEventBus) {
        AllParticleTypes.ParticleEntry.REGISTER.register(modEventBus);
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerFactories(ParticleFactoryRegisterEvent event) {
        ParticleEngine particles = Minecraft.getInstance().particleEngine;
        AllParticleTypes[] var2 = values();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            AllParticleTypes particle = var2[var4];
            particle.entry.registerFactory(particles);
        }

    }

    public ParticleType<?> get() {
        return (ParticleType)this.entry.object.get();
    }

    public String parameter() {
        return this.entry.name;
    }

    private static class ParticleEntry<D extends ParticleOptions> {
        private static final DeferredRegister<ParticleType<?>> REGISTER;
        private final String name;
        private final Supplier<? extends ICustomParticleData<D>> typeFactory;
        private final RegistryObject<ParticleType<D>> object;

        public ParticleEntry(String name, Supplier<? extends ICustomParticleData<D>> typeFactory) {
            this.name = name;
            this.typeFactory = typeFactory;
            this.object = REGISTER.register(name, () -> {
                return ((ICustomParticleData)this.typeFactory.get()).createType();
            });
        }

        @OnlyIn(Dist.CLIENT)
        public void registerFactory(ParticleEngine particles) {
            ((ICustomParticleData)this.typeFactory.get()).register((ParticleType)this.object.get(), particles);
        }

        static {
            REGISTER = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, "mw_core");
        }
    }
}
