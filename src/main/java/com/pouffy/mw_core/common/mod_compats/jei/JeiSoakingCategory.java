package com.pouffy.mw_core.common.mod_compats.jei;

import com.mojang.blaze3d.vertex.PoseStack;
import com.pouffy.mw_core.MWCore;
import com.pouffy.mw_core.content.recipe.SoakingRecipe;
import mezz.jei.api.forge.ForgeTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.builder.IRecipeSlotBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class JeiSoakingCategory implements IRecipeCategory<SoakingRecipe> {

    public static final RecipeType<SoakingRecipe> RECIPE_TYPE = new RecipeType<>(new ResourceLocation(MWCore.MODID, "soaking"), SoakingRecipe.class);

    private static final ResourceLocation TEXTURE = new ResourceLocation(MWCore.MODID, "textures/gui/jei.png");

    private static final int WIDTH = 120;
    private static final int HEIGHT = 60;
    private static final int INPUT_X = 5;
    private static final int INPUT_Y = 22;
    private static final int ARROW_WIDTH = 22;
    private static final int ARROW_HEIGHT = 15;
    private static final int ARROW1_X = INPUT_X + 18 + 4;
    private static final int CATALYST_X = ARROW1_X + ARROW_WIDTH + 4;
    private static final int ARROW2_X = CATALYST_X + 18 + 4;
    private static final int OUTPUT_X = ARROW2_X + ARROW_WIDTH + 4;

    private final IGuiHelper guiHelper;
    private final IDrawable background;
    private final IDrawable icon;
    private final IDrawable arrow;
    private final Component title;

    public JeiSoakingCategory(final IGuiHelper guiHelper) {
        this.title = new TranslatableComponent("jei." + RECIPE_TYPE.getUid().getNamespace() + "." + RECIPE_TYPE.getUid().getPath());
        this.guiHelper = guiHelper;
        this.background = guiHelper.createBlankDrawable(WIDTH, HEIGHT);
        this.icon = guiHelper.createDrawableIngredient(ForgeTypes.FLUID_STACK, new FluidStack(Fluids.FLOWING_WATER, 500));
        this.arrow = guiHelper.createDrawable(TEXTURE, 0, 0, ARROW_WIDTH, ARROW_HEIGHT);
    }

    @Override
    public Component getTitle() {
        return title;
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    /* This method is required so we delegate to its non-deprecated replacement */
    @SuppressWarnings("deprecated")
    @Override
    public ResourceLocation getUid() {
        return getRecipeType().getUid();
    }

    /* This method is required so we delegate to its non-deprecated replacement */
    @SuppressWarnings("deprecated")
    @Override
    public Class<? extends SoakingRecipe> getRecipeClass() {
        return getRecipeType().getRecipeClass();
    }

    @Override
    public RecipeType<SoakingRecipe> getRecipeType() {
        return RECIPE_TYPE;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, SoakingRecipe recipe, IFocusGroup focuses) {
        // add input slot
        builder.addSlot(RecipeIngredientRole.INPUT, INPUT_X, INPUT_Y)
                .addIngredients(recipe.getIngredient());
        // create fluid tooltips
        // add fluid slot
        final IRecipeSlotBuilder fluidSlotBuilder = builder.addSlot(RecipeIngredientRole.CATALYST, CATALYST_X, INPUT_Y);
        // add tooltips
        final String sourceKey = "jei.mw_core.soaking.catalyst.tooltip." + (recipe.isSource() ? "source" : "flowing_or_source");
        final String removeKey = (recipe.isRemove() ? "jei.mw_core.soaking.catalyst.tooltip.remove" : "");
        fluidSlotBuilder.addTooltipCallback((view, tooltip) -> {
            tooltip.add(new TranslatableComponent(sourceKey).withStyle(ChatFormatting.ITALIC, ChatFormatting.WHITE));
            if(!removeKey.isEmpty()) {
                tooltip.add(new TranslatableComponent(removeKey).withStyle(ChatFormatting.YELLOW));
            }
        });
        // add fluid ingredients
        final int amount = recipe.isSource() ? 1000 : 500;
        ForgeRegistries.FLUIDS.tags().getTag(recipe.getFluid()).stream()
                .filter(fluid -> !recipe.isSource() || !ForgeRegistries.FLUIDS.getKey(fluid).getPath().contains("flowing")).forEach(fluid ->
                fluidSlotBuilder.addIngredient(ForgeTypes.FLUID_STACK, new FluidStack(fluid, amount)));
        // add output slot
        builder.addSlot(RecipeIngredientRole.OUTPUT, OUTPUT_X, INPUT_Y)
                .addItemStack(recipe.getResultItem());
    }

    @Override
    public void draw(SoakingRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        IRecipeCategory.super.draw(recipe, recipeSlotsView, stack, mouseX, mouseY);
        arrow.draw(stack, ARROW1_X, INPUT_Y);
        arrow.draw(stack, ARROW2_X, INPUT_Y);
    }
}
