package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;

import javax.annotation.Nonnull;

public class MWMaterials extends AbstractMaterialDataProvider {

    public MWMaterials(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void addMaterials() {
        addMaterial(MWMaterialIds.transium, 4, ORDER_END, false);
}
    @Nonnull
    @Override
    public String getName() {
        return "Milkyway Core Materials";
    }
}
