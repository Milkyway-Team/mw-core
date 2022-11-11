package com.pouffy.mw_core;

import com.pouffy.mw_core.content.recipe.SoakingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.entity.EntityTypeTest;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

@SuppressWarnings("unused")
public class AllRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MWCore.MODID);
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(Registry.RECIPE_TYPE_REGISTRY, MWCore.MODID);

    public static final RegistryObject<RecipeType<SoakingRecipe>> SOAKING_RECIPE_TYPE = RECIPE_TYPES.register("soaking", () ->
            new RecipeType<>() {
                @Override
                public String toString() {
                    return SoakingRecipe.Serializer.CATEGORY;
                }
            });

    public static final RegistryObject<RecipeSerializer<SoakingRecipe>> SOAKING_RECIPE_SERIALIZER = RECIPE_SERIALIZERS.register("soaking", () ->
            new SoakingRecipe.Serializer());

    @Mod.EventBusSubscriber
    public static class EventHandler {

        @SubscribeEvent
        public static void onWorldTick(final TickEvent.WorldTickEvent event) {
            // do not execute on client side
            if(event.world.isClientSide()) {
                return;
            }
            // do not execute in end phase
            if(event.phase != TickEvent.Phase.START) {
                return;
            }
            // only execute every 5 ticks (to reduce lag)
            if(event.world.getGameTime() % 5 != 0) {
                return;
            }
            // iterate over all loaded item entities
            ServerLevel serverLevel = (ServerLevel) event.world;
            serverLevel.getEntities().get(EntityTypeTest.forClass(ItemEntity.class), EventHandler::matchSoakingRecipe);
        }

        private static void matchSoakingRecipe(final ItemEntity entity) {
            // do not execute when item cannot be picked up
            /*if(entity.hasPickUpDelay()) {
                return;
            }*/
            // do not execute for empty item
            if(entity.getItem().isEmpty()) {
                return;
            }
            // check fluid at location
            final BlockPos pos = new BlockPos(entity.position());
            final FluidState fluidState = entity.level.getFluidState(pos);
            // do not execute for empty fluid
            if(fluidState.isEmpty()) {
                return;
            }
            // create container with itemstack
            final Container container = new SimpleContainer(entity.getItem());
            // load recipe manager
            final List<SoakingRecipe> soakingRecipes = entity.level.getRecipeManager().getAllRecipesFor(AllRecipes.SOAKING_RECIPE_TYPE.get());
            // match first recipe
            for(SoakingRecipe recipe : soakingRecipes) {
                if(recipe.matches(container, fluidState)) {
                    // determine result item
                    ItemStack result = recipe.assemble(container, pos, entity.level);
                    // create item entity
                    Block.popResource(entity.level, pos, result);
                    // update entity item
                    entity.setItem(container.getItem(0));
                    return;
                }
            }
        }
    }
}
