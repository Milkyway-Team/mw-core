package com.pouffy.mw_core.kermitamine;

import com.google.gson.JsonObject;
import net.minecraft.core.Registry;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.ArmorDyeRecipe;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.SimpleRecipeSerializer;

public interface RecipeSerializer<T extends Recipe<?>> extends net.minecraftforge.registries.IForgeRegistryEntry<net.minecraft.world.item.crafting.RecipeSerializer<?>>, net.minecraftforge.common.extensions.IForgeRecipeSerializer<T> {
    SimpleRecipeSerializer<CrystalDyeRecipe> CRYSTAL_DYE = register("crafting_special_crystaldye", new SimpleRecipeSerializer<>(CrystalDyeRecipe::new));

    T fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe);

    @javax.annotation.Nullable
    T fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer);

    void toNetwork(FriendlyByteBuf pBuffer, T pRecipe);

    static <S extends net.minecraft.world.item.crafting.RecipeSerializer<T>, T extends Recipe<?>> S register(String pKey, S pRecipeSerializer) {
        return Registry.register(Registry.RECIPE_SERIALIZER, pKey, pRecipeSerializer);
    }
}
