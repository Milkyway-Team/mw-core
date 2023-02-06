package com.pouffy.mw_core;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class ModItemGroup extends CreativeModeTab {

    private static final String PATH = "textures/gui/container/creative_inventory/";

    public ModItemGroup(String label) {
        super(label);
        this.setBackgroundImage(new ResourceLocation(MWCore.MODID, PATH + "tab_mw_core.png"));
        this.hideTitle();
    }

    @Nonnull
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(AllItems.CREATITE.get());
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

    @Override
    public int getSearchbarWidth() {
        return 88;
    }

    @Nonnull
    @Override
    public ResourceLocation getTabsImage() {
        return new ResourceLocation(MWCore.MODID, PATH + "mw_core_tabs.png");
    }
}
