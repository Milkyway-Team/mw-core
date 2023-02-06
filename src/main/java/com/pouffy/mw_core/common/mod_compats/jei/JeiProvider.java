package com.pouffy.mw_core.common.mod_compats.jei;

import com.pouffy.mw_core.AllRecipes;
import com.pouffy.mw_core.MWCore;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.level.ItemLike;

@JeiPlugin
public class JeiProvider implements IModPlugin {

    private static final ResourceLocation UID = new ResourceLocation(MWCore.MODID, "jei_provider");
    @Override
    public ResourceLocation getPluginUid() {
        return UID;
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new JeiSoakingCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack((ItemLike) Items.BUCKET), MWRecipeTypes.SOAKING);
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
        registration.addRecipes(JeiSoakingCategory.RECIPE_TYPE, recipeManager.getAllRecipesFor(AllRecipes.SOAKING_RECIPE_TYPE.get()));
    }
}
