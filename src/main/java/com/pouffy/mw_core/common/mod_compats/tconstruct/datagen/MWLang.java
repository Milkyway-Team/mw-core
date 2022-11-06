package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen;

import com.pouffy.mw_core.AllBlocks;
import com.pouffy.mw_core.AllFluids;
import com.pouffy.mw_core.AllItems;
import com.pouffy.mw_core.MWCore;
import com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon.MWMaterialIds;
import com.pouffy.mw_core.common.mod_compats.tconstruct.modifiers.MWCoreModifiers;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import org.apache.commons.lang3.StringUtils;
import slimeknights.mantle.registration.object.FluidObject;
import slimeknights.tconstruct.library.materials.definition.MaterialId;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

public class MWLang extends LanguageProvider {

    public MWLang(DataGenerator gen) {
        super(gen, MWCore.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addGroup("Tinkers Reforged Items");
        add("pattern.tinkers_reforged.great_blade", "Great Blade Pattern");
        add("pattern.tinkers_reforged.large_round_plate", "Large Round Plate Pattern");
        addItem(AllItems.CAN, "Can");
        addItem(AllItems.SODA, "Soda");
        addBlock(AllBlocks.ALUMINIUM_BLOCK, "Aluminum Block");
        addBlock(AllBlocks.ALUMINIUM_ORE, "Bauxite Ore");
        addBlock(AllBlocks.DEEPSLATE_ALUMINIUM_ORE, "Deepslate Bauxite Ore");
        addItem(AllItems.ALUMINIUM_DUST, "Aluminum Dust");
        addItem(AllItems.ALUMINIUM_INGOT, "Aluminum Ingot");
        addItem(AllItems.ALUMINIUM_NUGGET, "Aluminum Nugget");
        addBlock(AllBlocks.TRANSIUM_BLOCK, "Transium Block");
        addItem(AllItems.TRANSIUM_DUST, "Pulverised Transium");
        addItem(AllItems.TRANSIUM_INGOT, "Transium Ingot");
        addItem(AllItems.TRANSIUM_NUGGET, "Blazing Copper Nugget");
        addItem(AllItems.RAW_ALUMINIUM, "Raw Bauxite");
        addBlock(AllBlocks.RAW_ALUMINIUM_BLOCK, "Raw Bauxite Block");
        
        addFluid(AllFluids.transium, "Gender Fluid");
        add(AllFluids.transium.get().getBucket(), "Gender Fluid Bucket");
        
        

        addMaterial(MWMaterialIds.transium, "Transium", "Strong and durable", "Transium Alloy");

        addModifier(MWCoreModifiers.brittle, "mw_core Test Modifier", "testing", "sussy baka");

    }



    public void addMaterial(MaterialId material, String name, String flavour, String desc) {
        String id = material.getPath();
        add("material.tinkers_reforged." + id, name);
        if (!flavour.equals(""))
            add("material.tinkers_reforged." + id + ".flavor", flavour);
        if (!desc.equals(""))
            add("material.tinkers_reforged." + id + ".encyclopedia", desc);
    }

    public void addModifier(StaticModifier<Modifier> modifier, String name, String flavour, String desc) {
        String id = modifier.getId().getPath();
        add("modifier.tinkers_reforged." + id, name);
        add("modifier.tinkers_reforged." + id + ".flavor", flavour);
        add("modifier.tinkers_reforged." + id + ".description", desc);
    }

    public void addFluid(FluidObject<ForgeFlowingFluid> supplier, String name) {
        add(String.format("fluid.%s.%s", MWCore.MODID, supplier.getId().getPath().replace("_flowing", "")), name);
    }

    public void addGroup(String value) {
        add(String.format("itemGroup.%s", MWCore.MODID), value);
    }

    public String capitalize(String input) {
        if(input.contains("_")) {
            String[] split = input.split("_");
            StringBuilder output = new StringBuilder();
            for(String s : split) {
                output.append(StringUtils.capitalize(s));
                output.append(" ");
            }
            return output.toString().trim();
        }
        return StringUtils.capitalize(input);
    }
}
