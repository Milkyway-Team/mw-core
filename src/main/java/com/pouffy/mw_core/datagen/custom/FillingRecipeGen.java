package com.pouffy.mw_core.datagen.custom;

import com.pouffy.mw_core.AllFluidCapsules;
import com.pouffy.mw_core.compat.Mods;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import slimeknights.tconstruct.fluids.TinkerFluids;

public class FillingRecipeGen extends ProcessingRecipeGen {

    GeneratedRecipe
    ass
            ;

    public FillingRecipeGen(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.FILLING;
    }
}
