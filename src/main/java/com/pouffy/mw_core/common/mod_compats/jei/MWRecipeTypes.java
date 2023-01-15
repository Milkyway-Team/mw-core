package com.pouffy.mw_core.common.mod_compats.jei;

import com.pouffy.mw_core.content.recipe.SoakingRecipe;
import mezz.jei.api.recipe.RecipeType;

public class MWRecipeTypes {
    public static final RecipeType<SoakingRecipe> SOAKING = RecipeType.create("mw_core", "soaking", SoakingRecipe.class);

public MWRecipeTypes(){
}
}
