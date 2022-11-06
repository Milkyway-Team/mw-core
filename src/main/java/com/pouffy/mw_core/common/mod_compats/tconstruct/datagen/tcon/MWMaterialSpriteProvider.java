package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon;

import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToColorMapping;

import javax.annotation.Nonnull;

public class MWMaterialSpriteProvider extends AbstractMaterialSpriteProvider {

    @Nonnull
    @Override
    public String getName() {
        return "Tinkers Reforged Material Sprite Provider";
    }

    @Override
    protected void addAllMaterials() {
        buildMaterial(MWMaterialIds.transium)
                .meleeHarvest()
                .fallbacks("crystal")
                .colorMapper(GreyToColorMapping.builderFromBlack().addARGB(63, 0xFF3399).addARGB(102, 0xFF675B57).addARGB(140, 0xFFB7A196).addARGB(178, 0xFFC2AEA0).addARGB(216, 0x9999CC).addARGB(255, 0xFFFFFF).build());
    }
}
