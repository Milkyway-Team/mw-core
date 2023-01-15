package com.pouffy.mw_core.common.mod_compats.jei;

import com.pouffy.mw_core.AllItems;
import com.pouffy.mw_core.AllRecipes;
import com.pouffy.mw_core.MWCore;
import com.pouffy.mw_core.TextStuff;
import com.pouffy.mw_core.content.recipe.SoakingRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.ItemLike;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;

import java.util.List;

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
