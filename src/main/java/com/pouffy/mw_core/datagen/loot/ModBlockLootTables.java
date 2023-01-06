package com.pouffy.mw_core.datagen.loot;

import com.pouffy.mw_core.AllItems;
import com.simibubi.create.foundation.data.recipe.CrushingRecipeGen;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModBlockLootTables extends RecipeProvider implements IConditionBuilder {
    public ModBlockLootTables(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
    }
}
