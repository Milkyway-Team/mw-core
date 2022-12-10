package com.pouffy.mw_core;


import com.pouffy.mw_core.content.items.RadiantSheetItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
@SuppressWarnings("unused")
public class AllSheets {
    public static final DeferredRegister<Item> SHEETS = DeferredRegister.create(ForgeRegistries.ITEMS, MWCore.MODID);
    public static final RegistryObject<Item> SLIMESTEEL_SHEET = SHEETS.register("slimesteel_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> QUEENS_SLIME_SHEET = SHEETS.register("queens_slime_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> HEPATIZON_SHEET = SHEETS.register("hepatizon_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CONSTANTAN_SHEET = SHEETS.register("constantan_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ROSE_GOLD_SHEET = SHEETS.register("rose_gold_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> AMETHYST_BRONZE_SHEET = SHEETS.register("amethyst_bronze_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> COBALT_SHEET = SHEETS.register("cobalt_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> MANYULLYN_SHEET = SHEETS.register("manyullyn_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> DIAMOND_SHEET = SHEETS.register("diamond_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ELECTRUM_SHEET = SHEETS.register("electrum_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ENDERIUM_SHEET = SHEETS.register("enderium_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> INVAR_SHEET = SHEETS.register("invar_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> LEAD_SHEET = SHEETS.register("lead_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> LUMIUM_SHEET = SHEETS.register("lumium_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> NETHERITE_SHEET = SHEETS.register("netherite_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> NICKEL_SHEET = SHEETS.register("nickel_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> SIGNALUM_SHEET = SHEETS.register("signalum_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> SILVER_SHEET = SHEETS.register("silver_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> TIN_SHEET = SHEETS.register("tin_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> RADIANT_QUARTZ_SHEET = SHEETS.register("radiant_quartz_sheet",
            () -> new RadiantSheetItem(new Item.Properties().tab(MWCore.MISC).fireResistant()));
    //INCOMPLETE SHEETS
    public static final RegistryObject<Item> UNPROCESSED_BRASS_SHEET = SHEETS.register("unprocessed_brass_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> UNPROCESSED_GOLD_SHEET = SHEETS.register("unprocessed_gold_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> UNPROCESSED_COPPER_SHEET = SHEETS.register("unprocessed_copper_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> UNPROCESSED_IRON_SHEET = SHEETS.register("unprocessed_iron_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> UNPROCESSED_STEEL_SHEET = SHEETS.register("unprocessed_steel_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> UNPROCESSED_TIN_SHEET = SHEETS.register("unprocessed_tin_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> UNPROCESSED_LEAD_SHEET = SHEETS.register("unprocessed_lead_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    //UPGRADED SHEETS
    public static final RegistryObject<Item> STURDY_BRASS_SHEET = SHEETS.register("sturdy_brass_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> STURDY_GOLD_SHEET = SHEETS.register("sturdy_gold_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> STURDY_COPPER_SHEET = SHEETS.register("sturdy_copper_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> STURDY_IRON_SHEET = SHEETS.register("sturdy_iron_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> STURDY_STEEL_SHEET = SHEETS.register("sturdy_steel_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> STURDY_TIN_SHEET = SHEETS.register("sturdy_tin_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> STURDY_LEAD_SHEET = SHEETS.register("sturdy_lead_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REINFORCED_BRASS_SHEET = SHEETS.register("reinforced_brass_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REINFORCED_GOLD_SHEET = SHEETS.register("reinforced_gold_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REINFORCED_COPPER_SHEET = SHEETS.register("reinforced_copper_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REINFORCED_IRON_SHEET = SHEETS.register("reinforced_iron_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REINFORCED_STEEL_SHEET = SHEETS.register("reinforced_steel_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REINFORCED_LEAD_SHEET = SHEETS.register("reinforced_lead_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    


    public static final RegistryObject<Item> REINFORCED_TIN_SHEET = SHEETS.register("reinforced_tin_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> REPROCESSED_BRASS_SHEET = SHEETS.register("reprocessed_brass_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REPROCESSED_GOLD_SHEET = SHEETS.register("reprocessed_gold_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REPROCESSED_COPPER_SHEET = SHEETS.register("reprocessed_copper_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REPROCESSED_IRON_SHEET = SHEETS.register("reprocessed_iron_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REPROCESSED_STEEL_SHEET = SHEETS.register("reprocessed_steel_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REPROCESSED_TIN_SHEET = SHEETS.register("reprocessed_tin_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> REPROCESSED_LEAD_SHEET = SHEETS.register("reprocessed_lead_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
}
