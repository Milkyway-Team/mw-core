package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon;

import com.pouffy.mw_core.MWCore;
import net.minecraft.resources.ResourceLocation;
import slimeknights.tconstruct.library.materials.definition.MaterialId;

public class MWMaterialIds {
    public static final MaterialId transium = createMaterial("transium");

    public static MaterialId createMaterial(String name) {
        return new MaterialId(new ResourceLocation(MWCore.MODID, name));
    }
}
