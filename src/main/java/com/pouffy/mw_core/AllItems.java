package com.pouffy.mw_core;

import cofh.thermal.lib.common.ThermalItemGroups;
import com.pouffy.mw_core.common.mod_compats.farmersdelight.TastyFoodValues;
import com.pouffy.mw_core.content.items.RadiantQuartzItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
@SuppressWarnings("unused")
public class AllItems {
    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food).tab(MWCore.MISC);
    }
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MWCore.MODID);
    //MISC

    public static final RegistryObject<Item> CHROMATIC_DUST = ITEMS.register("chromatic_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> RAVE_TUBE = ITEMS.register("rave_tube",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> TRANSIUM_INGOT = ITEMS.register("transium_ingot",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> TRANSIUM_NUGGET = ITEMS.register("transium_nugget",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> TRANSIUM_DUST = ITEMS.register("pulverized_transium",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_DUST = ITEMS.register("aluminium_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> RAW_CREATITE = ITEMS.register("raw_creatite",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CREATITE = ITEMS.register("creatite",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_CREATITE_ORE = ITEMS.register("crushed_creatite_ore",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> SCREW = ITEMS.register("screw",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> HALITE_CRYSTALS = ITEMS.register("halite_crystals",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    //GEARS
    public static final RegistryObject<Item> TRANSIUM_GEAR = ITEMS.register("transium_gear",
            () -> new Item(new Item.Properties().tab(ThermalItemGroups.THERMAL_ITEMS)));
    public static final RegistryObject<Item> ALUMINIUM_GEAR = ITEMS.register("aluminium_gear",
            () -> new Item(new Item.Properties().tab(ThermalItemGroups.THERMAL_ITEMS)));
    //ITEMS
    public static final RegistryObject<Item> CAN = ITEMS.register("can",
            () -> new Item(new Item.Properties().stacksTo(32).tab(MWCore.MISC)));
    public static final RegistryObject<Item> DIAMOND_QUARTZ = ITEMS.register("diamond_quartz",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> POLISHED_DIAMOND_QUARTZ = ITEMS.register("polished_diamond_quartz",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    //FOODS
    public static final RegistryObject<Item> SODA = ITEMS.register("soda",
            () -> new DrinkableItem(new Item.Properties().food(TastyFoodValues.SODA)
                    .craftRemainder(AllItems.CAN.get()).tab(MWCore.MISC)));
    public static final RegistryObject<Item> MILKYWAY_BAR = ITEMS.register("milkyway_bar",
            () -> new ConsumableItem(new Item.Properties().food(TastyFoodValues.MILKYWAY_BAR).tab(MWCore.MISC)));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new ConsumableItem(new Item.Properties().food(TastyFoodValues.SALT).tab(MWCore.MISC)));
    public static final RegistryObject<Item> SALTED_BEEF = ITEMS.register("salted_beef",
            () -> new ConsumableItem(new Item.Properties().food(TastyFoodValues.SALT).tab(MWCore.MISC)));
    public static final RegistryObject<Item> RADIANT_QUARTZ = ITEMS.register("radiant_quartz",
            () -> new RadiantQuartzItem(new Item.Properties().tab(MWCore.MISC).fireResistant()));
    public static final RegistryObject<Item> STURDY_SHEET_CAST = ITEMS.register("sturdy_sheet_cast",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> POLISHED_RADIANT_QUARTZ = ITEMS.register("polished_radiant_quartz",
            () -> new RadiantQuartzItem(new Item.Properties().tab(MWCore.MISC).fireResistant()));
    public static final RegistryObject<Item> RADIANT_QUARTZ_DUST = ITEMS.register("radiant_quartz_dust",
            () -> new RadiantQuartzItem(new Item.Properties().tab(MWCore.MISC).fireResistant()));

    //INCOMPLETE ITEMS

//BLOCKS
//EXTRA SHEETS

}
