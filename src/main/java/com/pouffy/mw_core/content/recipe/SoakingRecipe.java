package com.pouffy.mw_core.content.recipe;

import com.google.gson.JsonObject;
import com.mojang.realmsclient.util.JsonUtils;
import com.pouffy.mw_core.AllRecipes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.jetbrains.annotations.Nullable;

public class SoakingRecipe implements Recipe<Container> {

    private final ResourceLocation id;
    private final Ingredient input;
    private final TagKey<Fluid> fluid;
    private final ItemStack result;
    private final boolean source;
    private final boolean remove;

    public SoakingRecipe(final ResourceLocation id, final ItemStack result,
                         final Ingredient input, final TagKey<Fluid> fluid,
                         final boolean source, final boolean remove) {
        this.id = id;
        this.result = result;
        this.input = input;
        this.fluid = fluid;
        this.source = source;
        this.remove = remove;
    }

    @Override
    public boolean matches(Container pContainer, Level pLevel) {
        return false;
    }

    public boolean matches(Container container, FluidState fluid) {
        // validate container size
        if(container.getContainerSize() < 1) {
            return false;
        }
        // check first item for match
        if(!input.test(container.getItem(0))) {
            return false;
        }
        // check fluid for match
        if(!fluid.is(getFluid()) || (isSource() && !fluid.isSource())) {
            return false;
        }
        // all checks passed
        return true;
    }

    @Override
    public ItemStack assemble(Container pContainer) {
        pContainer.removeItem(0, 1);
        return getResultItem().copy();
    }

    public ItemStack assemble(Container container, BlockPos pos, Level level) {
        if(remove) {
            level.setBlock(pos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
        }
        return assemble(container);
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return result;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return AllRecipes.SOAKING_RECIPE_SERIALIZER.get();
    }
    @Override
    public RecipeType<?> getType() {
        return AllRecipes.SOAKING_RECIPE_TYPE.get();
    }

    public Ingredient getIngredient() {
        return input;
    }

    public TagKey<Fluid> getFluid() {
        return fluid;
    }

    public boolean isSource() {
        return source;
    }

    public boolean isRemove() {
        return remove;
    }

    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<SoakingRecipe> {
        public static final String CATEGORY = "soaking";

        private static final String KEY_INGREDIENT = "ingredient";
        private static final String KEY_RESULT = "result";
        private static final String KEY_FLUID = "fluid";
        private static final String KEY_SOURCE = "source";
        private static final String KEY_REMOVE = "remove";

        @Override
        public SoakingRecipe fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
            // read from json
            final Ingredient ingredient = CraftingHelper.getIngredient(pSerializedRecipe.getAsJsonObject(KEY_INGREDIENT));
            final ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, KEY_RESULT));
            final ResourceLocation fluidId = new ResourceLocation(JsonUtils.getStringOr(KEY_FLUID, pSerializedRecipe, "minecraft:water"));
            final TagKey<Fluid> fluid = FluidTags.create(fluidId);
            final boolean source = JsonUtils.getBooleanOr(KEY_SOURCE, pSerializedRecipe, false);
            final boolean remove = JsonUtils.getBooleanOr(KEY_REMOVE, pSerializedRecipe, false);
            return new SoakingRecipe(pRecipeId, result, ingredient, fluid, source, remove);
        }

        @Nullable
        @Override
        public SoakingRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            // read from buffer (must read in same order as written in #toNetwork)
            final ResourceLocation id = pBuffer.readResourceLocation();
            final ItemStack result = pBuffer.readItem();
            final Ingredient ingredient = Ingredient.fromNetwork(pBuffer);
            final ResourceLocation fluidId = pBuffer.readResourceLocation();
            final TagKey<Fluid> fluid = FluidTags.create(fluidId);
            final boolean source = pBuffer.readBoolean();
            final boolean remove = pBuffer.readBoolean();
            // create recipe
            return new SoakingRecipe(id, result, ingredient, fluid, source, remove);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, SoakingRecipe pRecipe) {
            // write to buffer
            pBuffer.writeResourceLocation(pRecipe.getId());
            pBuffer.writeItem(pRecipe.getResultItem());
            pRecipe.getIngredient().toNetwork(pBuffer);
            pBuffer.writeResourceLocation(pRecipe.getFluid().location());
            pBuffer.writeBoolean(pRecipe.isSource());
            pBuffer.writeBoolean(pRecipe.isRemove());
        }
    }

}
