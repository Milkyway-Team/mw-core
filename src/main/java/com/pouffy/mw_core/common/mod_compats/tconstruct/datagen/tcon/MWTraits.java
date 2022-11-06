package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon;

import com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon.MWMaterialIds;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialTraitDataProvider;
import slimeknights.tconstruct.tools.TinkerModifiers;

import javax.annotation.Nonnull;

public class MWTraits extends AbstractMaterialTraitDataProvider {

    public MWTraits(DataGenerator gen, AbstractMaterialDataProvider materials) {
        super(gen, materials);
    }

    @Override
    protected void addMaterialTraits() {

        addDefaultTraits(MWMaterialIds.transium, TinkerModifiers.fiery);

    }

    @Nonnull
    @Override
    public String getName() {
        return "Milkyway Core Material Traits";
    }
}
