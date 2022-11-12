package com.pouffy.mw_core.compat.jei;

import com.pouffy.mw_core.AllItems;
import com.pouffy.mw_core.TextStuff;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.ItemLike;
import vectorwing.farmersdelight.common.utility.TextUtils;

import java.util.List;
import java.util.stream.Collectors;

@JeiPlugin
public class JEIPlugin implements IModPlugin {
    private static final ResourceLocation ID = new ResourceLocation("mw_core", "jei_plugin");
    private static final Minecraft MC = Minecraft.getInstance();

    public JEIPlugin() {
    }

    private static List findRecipesByType(RecipeType<?> type) {
        return (List)MC.level.getRecipeManager().getRecipes().stream().filter((r) -> {
            return r.getType() == type;
        }).collect(Collectors.toList());
    }

    public void registerCategories(IRecipeCategoryRegistration registry) {
//        registry.addRecipeCategories(new IRecipeCategory[]{new CookingRecipeCategory(registry.getJeiHelpers().getGuiHelper())});
    }

    public void registerRecipes(IRecipeRegistration registration) {
//        registration.addRecipes(findRecipesByType((RecipeType) ModRecipeTypes.COOKING.get()), CookingRecipeCategory.UID);

        registration.addIngredientInfo(new ItemStack((ItemLike) AllItems.RADIANT_QUARTZ.get()), VanillaTypes.ITEM, TextStuff.getTranslation("jei.info.radiant_quartz"));
    }

    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
//        registration.addRecipeCatalyst(new ItemStack((ItemLike)ModItems.COOKING_POT.get()), new mezz.jei.api.recipe.RecipeType[]{FDRecipeTypes.COOKING});
    }


    public ResourceLocation getPluginUid() {
        return ID;
    }
}
