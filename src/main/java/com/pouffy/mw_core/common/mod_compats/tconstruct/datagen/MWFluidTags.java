package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen;

import com.pouffy.mw_core.AllFluids;
import com.pouffy.mw_core.MWCore;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

import static com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon.MWTags.Fluids.TRANSIUM;
import static com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon.MWTags.Fluids.TRANSIUM_;

public class MWFluidTags extends FluidTagsProvider {

    private static TagKey<Fluid> create(String name) {
        return FluidTags.create(new ResourceLocation(name));
    }

    public MWFluidTags(DataGenerator gen, @Nullable ExistingFileHelper existingFileHelper) {
        super(gen, MWCore.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {

        tag(TRANSIUM).add(AllFluids.transium.get());


        tag(TRANSIUM_).add(AllFluids.transium.get());

    }
}
