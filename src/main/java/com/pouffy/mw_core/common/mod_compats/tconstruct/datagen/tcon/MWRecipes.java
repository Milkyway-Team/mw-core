package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon;

import com.pouffy.mw_core.AllBlocks;
import com.pouffy.mw_core.AllFluids;
import com.pouffy.mw_core.AllItems;
import com.pouffy.mw_core.MWCore;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.CompoundIngredient;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.common.crafting.conditions.NotCondition;
import net.minecraftforge.common.crafting.conditions.TagEmptyCondition;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import slimeknights.mantle.recipe.helper.ItemOutput;
import slimeknights.mantle.recipe.ingredient.EntityIngredient;
import slimeknights.mantle.recipe.ingredient.FluidIngredient;
import slimeknights.mantle.registration.object.FluidObject;
import slimeknights.tconstruct.common.TinkerTags;
import slimeknights.tconstruct.fluids.TinkerFluids;
import slimeknights.tconstruct.library.data.recipe.ICommonRecipeHelper;
import slimeknights.tconstruct.library.data.recipe.IMaterialRecipeHelper;
import slimeknights.tconstruct.library.data.recipe.ISmelteryRecipeHelper;
import slimeknights.tconstruct.library.data.recipe.IToolRecipeHelper;
import slimeknights.tconstruct.library.materials.definition.MaterialId;
import slimeknights.tconstruct.library.materials.definition.MaterialVariantId;
import slimeknights.tconstruct.library.recipe.FluidValues;
import slimeknights.tconstruct.library.recipe.alloying.AlloyRecipeBuilder;
import slimeknights.tconstruct.library.recipe.casting.ItemCastingRecipeBuilder;
import slimeknights.tconstruct.library.recipe.casting.material.CompositeCastingRecipeBuilder;
import slimeknights.tconstruct.library.recipe.casting.material.MaterialCastingRecipeBuilder;
import slimeknights.tconstruct.library.recipe.entitymelting.EntityMeltingRecipeBuilder;
import slimeknights.tconstruct.library.recipe.fuel.MeltingFuelBuilder;
import slimeknights.tconstruct.library.recipe.ingredient.MaterialIngredient;
import slimeknights.tconstruct.library.recipe.melting.MeltingRecipeBuilder;
import slimeknights.tconstruct.library.recipe.modifiers.adding.SwappableModifierRecipeBuilder;
import slimeknights.tconstruct.library.recipe.molding.MoldingRecipeBuilder;
import slimeknights.tconstruct.library.recipe.partbuilder.PartRecipeBuilder;
import slimeknights.tconstruct.library.tools.part.IMaterialItem;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.TinkerToolParts;
import slimeknights.tconstruct.tools.TinkerTools;
import slimeknights.tconstruct.tools.data.material.MaterialIds;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MWRecipes extends RecipeProvider implements IConditionBuilder, IMaterialRecipeHelper, IToolRecipeHelper, ISmelteryRecipeHelper, ICommonRecipeHelper {

    public MWRecipes(DataGenerator gen) {
        super(gen);
    }

    public void craftingRecipes(Consumer<FinishedRecipe> consumer) {

        blockIngotNuggetCompression(consumer, "aluminum", AllBlocks.ALUMINIUM_BLOCK.get().asItem(), AllItems.ALUMINIUM_INGOT.get(), AllItems.ALUMINIUM_NUGGET.get());
        blockIngotNuggetCompression(consumer, "transium", AllBlocks.TRANSIUM_BLOCK.get().asItem(), AllItems.TRANSIUM_INGOT.get(), AllItems.TRANSIUM_NUGGET.get());
    }

    public void alloyRecipes(Consumer<FinishedRecipe> consumer) {
        String alloyFolder = "smeltery/alloy/";



        AlloyRecipeBuilder.alloy(AllFluids.transium.get(), FluidValues.INGOT*4)
                .addInput(TinkerFluids.moltenCobalt.get(), FluidValues.METAL_BLOCK)
                .addInput(TinkerFluids.moltenAmethystBronze.get(), FluidValues.METAL_BLOCK)
                .addInput(TinkerFluids.moltenQuartz.get(), FluidValues.METAL_BLOCK)
                .save(consumer, modResource(alloyFolder+"transium"));


    }

    @Override
    protected void buildCraftingRecipes(@Nonnull Consumer<FinishedRecipe> consumer) {

        String materialFolder = "materials/";
        String meltingFolder = "smeltery/melting/";
        String castingFolder = "smeltery/casting/";
        String castFolder = "smeltery/casts/";
        String toolFolder = "tools/building/";
        String partFolder = "tools/parts/";
        String slotless = "tools/modifiers/slotless/";

        this.alloyRecipes(consumer);
        this.craftingRecipes(consumer);

        metalCasting(consumer, AllFluids.transium, AllBlocks.TRANSIUM_BLOCK.get(), AllItems.TRANSIUM_INGOT.get(), AllItems.TRANSIUM_NUGGET.get(), castingFolder, "transium");

        materialMeltingCasting(consumer, MWMaterialIds.transium, AllFluids.transium, materialFolder);


        metalMelting(consumer, AllFluids.transium.get(), "transium", false, meltingFolder, false);


        metalMaterialRecipe(consumer, MWMaterialIds.transium, materialFolder, "transium", false);

        Ingredient plate = Ingredient.of(TinkerTools.plateArmor.values().stream().map(ItemStack::new));

        // embellishment
        plateTexture(consumer, plate, MWMaterialIds.transium, false, slotless);
        


        MeltingRecipeBuilder.melting(Ingredient.of(MWTags.Items.ALUMINUM_CASTS), new FluidStack(TinkerFluids.moltenAluminum.get(), FluidValues.INGOT), 700, 50).save(consumer, new ResourceLocation(MWCore.MODID, "smeltery/aluminum_from_cast"));

        ShapedRecipeBuilder.shaped(AllBlocks.RAW_ALUMINIUM_BLOCK.get(), 1)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', AllItems.RAW_ALUMINIUM.get())
                .group("")
                .unlockedBy("has_item", has(AllItems.RAW_ALUMINIUM.get()))
                .save(consumer, modResource("raw_aluminum_block"));
        

        ShapelessRecipeBuilder.shapeless(AllItems.RAW_ALUMINIUM.get(), 9)
                .requires(AllBlocks.RAW_ALUMINIUM_BLOCK.get())
                .group("")
                .unlockedBy("has_item", has(AllItems.RAW_ALUMINIUM.get()))
                .save(consumer, modResource("raw_aluminum"));
        

        oreFurnace(consumer, MWTags.Items.ALUMINIUM_ORE, AllItems.ALUMINIUM_INGOT, "aluminium", false);
        oreFurnace(consumer, MWTags.Items.RAW_ALUMINUM, AllItems.ALUMINIUM_INGOT, "aluminium", true);

    }

    @Nonnull
    @Override
    public String getModId() {
        return MWCore.MODID;
    }

    private void oreFurnace(Consumer<FinishedRecipe> consumer, TagKey<Item> ore, Supplier<Item> item, String name, boolean value) {
        String end = value ? "raw": "ore";
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ore), item.get(), 0, 200).unlockedBy("has_item", has(item.get())).save(consumer, modResource("smelting/"+end+"/"+name));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ore), item.get(), 0.5f, 100).unlockedBy("has_item", has(item.get())).save(consumer, modResource("blasting/"+end+"/"+name));
    }

    private void metalComposite(Consumer<FinishedRecipe> consumer, Item input, Item output, FluidObject<?> fluid, boolean forgeTag, String folder, String name) {
        ItemCastingRecipeBuilder.tableRecipe(output)
                .setFluidAndTime(fluid, forgeTag, FluidValues.INGOT)
                .setCast(input, true)
                .setSwitchSlots()
                .save(consumer, modResource(folder + "/metal/" + name));
    }

    private void metalComposite(Consumer<FinishedRecipe> consumer, Block input, Item output, FluidObject<?> fluid, boolean forgeTag, String folder, String name) {
        ItemCastingRecipeBuilder.basinRecipe(output)
                .setFluidAndTime(fluid, forgeTag, FluidValues.GLASS_BLOCK)
                .setCast(input, true)
                .setSwitchSlots()
                .save(consumer, modResource(folder + "/metal/" + name));
    }



    public void gemBlock(Consumer<FinishedRecipe> consumer, String name, Item block, Item gem) {
        ConditionalRecipe.builder().addCondition(this.TRUE()).addRecipe(
                        ShapedRecipeBuilder.shaped(block, 1)
                                .pattern("XXX")
                                .pattern("XYX")
                                .pattern("XXX")
                                .define('X', ItemTags.create(new ResourceLocation("forge:gems/" + name)))
                                .define('Y', gem)
                                .group("")
                                .unlockedBy("has_gem", has(gem))
                                ::save
                )
                .generateAdvancement()
                .build(consumer, new ResourceLocation(MWCore.MODID, gem.getRegistryName().getPath() + "_to_block"));
    }

    public void blockIngotNuggetCompression(Consumer<FinishedRecipe> consumer, String name, Item block, Item ingot, Item nugget) {
        ConditionalRecipe.builder().addCondition(this.TRUE()).addRecipe(
                        ShapedRecipeBuilder.shaped(block, 1)
                                .pattern("XXX")
                                .pattern("XYX")
                                .pattern("XXX")
                                .define('X', ItemTags.create(new ResourceLocation("forge:ingots/" + name)))
                                .define('Y', ingot)
                                .group("")
                                .unlockedBy("has_ingot", has(ingot))
                                ::save
                )
                .generateAdvancement()
                .build(consumer, new ResourceLocation(MWCore.MODID, ingot.getRegistryName().getPath() + "_to_block"));

        ConditionalRecipe.builder().addCondition(this.TRUE()).addRecipe(
                        ShapelessRecipeBuilder.shapeless(ingot, 9)
                                .requires(block)
                                .group("")
                                .unlockedBy("has_block", has(block))
                                ::save
                )
                .generateAdvancement()
                .build(consumer, new ResourceLocation(MWCore.MODID, block.getRegistryName().getPath() + "_to_ingot"));

        ConditionalRecipe.builder().addCondition(this.TRUE()).addRecipe(
                        ShapedRecipeBuilder.shaped(ingot, 1)
                                .pattern("XXX")
                                .pattern("XYX")
                                .pattern("XXX")
                                .define('X', ItemTags.create(new ResourceLocation("forge:nuggets/" + name)))
                                .define('Y', nugget)
                                .group("")
                                .unlockedBy("has_nugget", has(nugget))
                                ::save
                )
                .generateAdvancement()
                .build(consumer, new ResourceLocation(MWCore.MODID, nugget.getRegistryName().getPath() + "_to_ingot"));

        ConditionalRecipe.builder().addCondition(this.TRUE()).addRecipe(
                        ShapelessRecipeBuilder.shapeless(nugget, 9)
                                .requires(ingot)
                                .group("")
                                .unlockedBy("has_ingot", has(ingot))
                                ::save
                )
                .generateAdvancement()
                .build(consumer, new ResourceLocation(MWCore.MODID, ingot.getRegistryName().getPath() + "_to_nugget"));
    }

    private void partRecipes(Consumer<FinishedRecipe> consumer, IMaterialItem part, CastObject cast, int cost, String partFolder, String castFolder) {
        String name = Objects.requireNonNull(part.asItem().getRegistryName()).getPath();

        // Part Builder
        PartRecipeBuilder.partRecipe(part)
                .setPattern(modResource(name))
                .setPatternItem(CompoundIngredient.of(Ingredient.of(TinkerTags.Items.DEFAULT_PATTERNS), Ingredient.of(cast.getGoldCast().get())))
                .setCost(cost)
                .save(consumer, modResource(partFolder + "builder/" + name));

        // Material Casting
        String castingFolder = partFolder + "casting/";
        MaterialCastingRecipeBuilder.tableRecipe(part)
                .setItemCost(cost)
                .setCast(cast.getMultiUseTag(), false)
                .save(consumer, modResource(castingFolder + name + "_gold_cast"));
        MaterialCastingRecipeBuilder.tableRecipe(part)
                .setItemCost(cost)
                .setCast(cast.getSingleUseTag(), true)
                .save(consumer, modResource(castingFolder + name + "_sand_cast"));
        CompositeCastingRecipeBuilder.table(part, cost)
                .save(consumer, modResource(castingFolder + name + "_composite"));

        // Cast Casting
        MaterialIngredient ingredient = MaterialIngredient.fromItem(part);
        castCreation(consumer, ingredient, cast, castFolder, Objects.requireNonNull(part.asItem().getRegistryName()).getPath());
    }

    private void castCreation(Consumer<FinishedRecipe> consumer, Ingredient input, CastObject cast, String folder, String name) {
        ItemCastingRecipeBuilder.tableRecipe(cast.getGoldCast().get())
                .setFluidAndTime(TinkerFluids.moltenGold, true, FluidValues.INGOT)
                .setCast(input, true)
                .setSwitchSlots()
                .save(consumer, modResource(folder + "gold_casts/" + name));
        MoldingRecipeBuilder.moldingTable(cast.getSandCast().get())
                .setMaterial(TinkerSmeltery.blankSandCast)
                .setPattern(input, false)
                .save(consumer, modResource(folder + "sand_casts/" + name));
        MoldingRecipeBuilder.moldingTable(cast.getRedSandCast().get())
                .setMaterial(TinkerSmeltery.blankRedSandCast)
                .setPattern(input, false)
                .save(consumer, modResource(folder + "red_sand_casts/" + name));
    }

    /** Adds recipes for a plate armor texture */
    private void plateTexture(Consumer<FinishedRecipe> consumer, Ingredient tool, MaterialId material, boolean optional, String folder) {
        plateTexture(consumer, tool, material, "ingots/" + material.getPath(), optional, folder);
    }

    private void gemMaterialRecipe(Consumer<FinishedRecipe> consumer, MaterialVariantId material, String folder, String name) {
        String matName = material.getLocation('/').getPath();
        // ingot
        TagKey<Item> gemTag = getItemTag("forge", "gems/" + name);
        materialRecipe(consumer, material, Ingredient.of(gemTag), 1, 1, folder + matName + "/gem");;

        materialRecipe(consumer, material, Ingredient.of(getItemTag("forge", "storage_blocks/" + name)), 9, 1, ItemOutput.fromTag(gemTag, 1), folder + matName + "/block");
    }

    /** Adds recipes for a plate armor texture with a custom tag */
    private void plateTexture(Consumer<FinishedRecipe> consumer, Ingredient tool, MaterialVariantId material, String tag, boolean optional, String folder) {
        Ingredient ingot = Ingredient.of(getItemTag("forge", tag));
        if (optional) {
            consumer = withCondition(consumer, tagCondition(tag));
        }
        SwappableModifierRecipeBuilder.modifier(TinkerModifiers.embellishment, material.toString())
                .setTools(tool)
                .addInput(ingot).addInput(ingot).addInput(ingot)
                .save(consumer, wrap(TinkerModifiers.embellishment.getId(), folder, "_" + material.getLocation('_').getPath()));
    }
    
}
