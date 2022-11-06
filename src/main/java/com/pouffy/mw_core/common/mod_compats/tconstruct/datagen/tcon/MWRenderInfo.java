package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon;

import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialRenderInfoProvider;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;

import javax.annotation.Nonnull;

public class MWRenderInfo extends AbstractMaterialRenderInfoProvider {

    public MWRenderInfo(DataGenerator gen, AbstractMaterialSpriteProvider spriteProvider) {
        super(gen, spriteProvider);
    }

    @Override
    protected void addMaterialRenderInfo() {
        buildRenderInfo(MWMaterialIds.transium).color(0xE41A7F).fallbacks("crystal");
    }

    @Nonnull
    @Override
    public String getName() {
        return "Tinkers Reforged Render info provider!";
    }
}
