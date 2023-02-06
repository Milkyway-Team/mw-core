package com.pouffy.mw_core;

import com.pouffy.mw_core.common.mod_compats.farmersdelight.ConsumableItem;
import com.pouffy.mw_core.common.mod_compats.farmersdelight.DrinkableItem;
import com.pouffy.mw_core.common.mod_compats.farmersdelight.MilkywayFoodValues;
import com.pouffy.mw_core.content.items.CreativeIngotItem;
import com.pouffy.mw_core.content.items.CrushedCoalItem;
import com.pouffy.mw_core.content.items.RadiantQuartzItem;
import com.pouffy.mw_core.content.items.charms.MilksCharmItem;
import com.pouffy.mw_core.content.items.charms.PouffysCharmItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class AllItems {
    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food).tab(MWCore.MISC);
    }
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MWCore.MODID);
    public static final DeferredRegister<Item> CITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "create");

    //public static final DeferredRegister<Item> AE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "ae2");

    //MISC

    public static final RegistryObject<Item> CHROMATIC_DUST = ITEMS.register("chromatic_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CHROMATIC_STEEL = ITEMS.register("chromatic_steel",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CREATITE_INFUSED_CHROMATIC_STEEL = ITEMS.register("creatite_infused_chromatic_steel",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<CreativeIngotItem> CREATIVE_INGOT = ITEMS.register("creative_ingot",
            () -> new CreativeIngotItem(new Item.Properties().tab(MWCore.MISC).rarity(Rarity.EPIC).fireResistant()));
    public static final RegistryObject<Item> OBSIDIAN_FIBRE = ITEMS.register("obsidian_fibre",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> INCOMPLETE_INSULATION_CUBE = ITEMS.register("incomplete_insulation_cube",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> INSULATION_CUBE = ITEMS.register("insulation_cube",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<CreativeIngotItem> CREATIVE_ALLOY = ITEMS.register("creative_alloy",
            () -> new CreativeIngotItem(new Item.Properties().tab(MWCore.MISC).rarity(Rarity.EPIC).fireResistant()));
    public static final RegistryObject<CreativeIngotItem> CREATIVE_ALLOY_PLATING = ITEMS.register("creative_alloy_plating",
            () -> new CreativeIngotItem(new Item.Properties().tab(MWCore.MISC).rarity(Rarity.EPIC).fireResistant()));
    public static final RegistryObject<Item> INSULATION_SHEET = ITEMS.register("insulation_sheet",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ANDESITE_DRILL_HEAD = ITEMS.register("andesite_drill_head",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> RAVE_TUBE = ITEMS.register("rave_tube",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_COBALT_ORE = ITEMS.register("crushed_cobalt_ore",
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
    public static final RegistryObject<Item> MAGISTEEL_INGOT = ITEMS.register("magisteel_ingot",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> MAGISTEEL_DUST = ITEMS.register("magisteel_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> MAGISTEEL_NUGGET = ITEMS.register("magisteel_nugget",
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

    public static final RegistryObject<Item> ENDERSLIME_DUST = ITEMS.register("enderslime_crystal_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> SKYSLIME_DUST = ITEMS.register("skyslime_crystal_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> EARTHSLIME_DUST = ITEMS.register("earthslime_crystal_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ICHOR_DUST = ITEMS.register("ichor_crystal_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> MAGIC_COCOA_POWDER = ITEMS.register("magic_cocoa_powder",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> MAGISTEEL_CIRCUIT = ITEMS.register("printed_upgrade_circuit",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> MAGIC_PROCESSOR = ITEMS.register("upgrade_processor",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> UPGRADE_PRESS = ITEMS.register("upgrade_processor_press",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    //GEARS
    public static final RegistryObject<Item> COBALT_GEAR = ITEMS.register("cobalt_gear",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_GEAR = ITEMS.register("aluminium_gear",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    //ITEMS
    public static final RegistryObject<Item> CAN = ITEMS.register("can",
            () -> new Item(new Item.Properties().stacksTo(32).tab(MWCore.MISC)));
    public static final RegistryObject<Item> DIAMOND_QUARTZ = ITEMS.register("diamond_quartz",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> POLISHED_DIAMOND_QUARTZ = ITEMS.register("polished_diamond_quartz",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> STEEL_ROD = ITEMS.register("steel_rod",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    //FOODS
    public static final RegistryObject<Item> SODA = ITEMS.register("soda",
            () -> new DrinkableItem(new Item.Properties().food(MilkywayFoodValues.SODA)
                    .craftRemainder(AllItems.CAN.get()).tab(MWCore.MISC), true));
    public static final RegistryObject<Item> MILKYWAY_BAR = ITEMS.register("milkyway_bar",
            () -> new ConsumableItem(new Item.Properties().food(MilkywayFoodValues.MILKYWAY_BAR).tab(MWCore.MISC), true));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new ConsumableItem(new Item.Properties().food(MilkywayFoodValues.SALT).tab(MWCore.MISC)));
    public static final RegistryObject<Item> SWEET_BERRY_JUICE = ITEMS.register("sweet_berry_juice",
            () -> new DrinkableItem(new Item.Properties().food(MilkywayFoodValues.SWEET_BERRY_JUICE)
                    .craftRemainder(Items.GLASS_BOTTLE).tab(MWCore.MISC), true));
    public static final RegistryObject<Item> SYRUP_GLAZED_APPLE = ITEMS.register("syrup_glazed_apple",
            () -> new ConsumableItem(new Item.Properties().food(MilkywayFoodValues.SYRUP_GLAZED_APPLE).tab(MWCore.MISC)));
    public static final RegistryObject<Item> SYRUP_BERRIES = ITEMS.register("syrup_glazed_berries",
            () -> new ConsumableItem(new Item.Properties().food(MilkywayFoodValues.SYRUP_GLAZED_BERRIES).tab(MWCore.MISC)));

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
//CRUSHED STUFF
    public static final RegistryObject<Item> CRUSHED_CINNABAR_ORE = ITEMS.register("crushed_cinnabar_ore",
        () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_NETHER_QUARTZ_ORE = ITEMS.register("crushed_nether_quartz_ore",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_CERTUS_QUARTZ_ORE = ITEMS.register("crushed_certus_quartz_ore",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_SULFUR_ORE = ITEMS.register("crushed_sulfur_ore",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_COAL_ORE = ITEMS.register("crushed_coal_ore",
            () -> new CrushedCoalItem(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_EMERALD_ORE = ITEMS.register("crushed_emerald_ore",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_DIAMOND_ORE = ITEMS.register("crushed_diamond_ore",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_APATITE_ORE = ITEMS.register("crushed_apatite_ore",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_LAPIS_ORE = ITEMS.register("crushed_lapis_ore",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_NITER_ORE = ITEMS.register("crushed_niter_ore",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust",
            () -> new CrushedCoalItem(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> COBALT_DUST = ITEMS.register("cobalt_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CREATITE_DUST = ITEMS.register("creatite_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> MUNDABITUR_CRYSTAL = ITEMS.register("mundabitur_crystal",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));

    public static final RegistryObject<Item> ORE_ALUMINIUM = ITEMS.register("aluminium_ore_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ORE_NICKEL = ITEMS.register("nickel_ore_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ORE_LEAD = ITEMS.register("lead_ore_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ORE_SILVER = ITEMS.register("silver_ore_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ORE_URANIUM = ITEMS.register("uranium_ore_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ORE_ZINC = ITEMS.register("zinc_ore_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ORE_COBALT = ITEMS.register("cobalt_ore_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ORE_CREATITE = ITEMS.register("creatite_ore_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ORE_COPPER = ITEMS.register("copper_ore_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ORE_GOLD = ITEMS.register("gold_ore_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> ORE_IRON = ITEMS.register("iron_ore_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> URANIUM_DUST = ITEMS.register("uranium_dust",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<PouffysCharmItem> POUFFYS_CHARM = ITEMS.register("pouffys_charm",
            () -> new PouffysCharmItem(new Item.Properties().tab(MWCore.MISC).stacksTo(1)));
    public static final RegistryObject<MilksCharmItem> MILKS_CHARM = ITEMS.register("milks_charm",
            () -> new MilksCharmItem(new Item.Properties().tab(MWCore.MISC).stacksTo(1)));

    public static final RegistryObject<Item> CRUSHED_A_B = CITEMS.register("crushed_amethyst_bronze",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_B = CITEMS.register("crushed_bronze",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_C_I = CITEMS.register("crushed_cast_iron",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_C = CITEMS.register("crushed_constantan",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_EL = CITEMS.register("crushed_electrum",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_END = CITEMS.register("crushed_enderium",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_HEP = CITEMS.register("crushed_hepatizon",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_INV = CITEMS.register("crushed_invar",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_LUM = CITEMS.register("crushed_lumium",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_MAG = CITEMS.register("crushed_magisteel",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_MAN = CITEMS.register("crushed_manyullyn",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_NETH = CITEMS.register("crushed_netherite",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_P_I = CITEMS.register("crushed_pig_iron",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_Q_S = CITEMS.register("crushed_queens_slime",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_R_G = CITEMS.register("crushed_rose_gold",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_SIG = CITEMS.register("crushed_signalum",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_SLIME = CITEMS.register("crushed_slimesteel",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_STEEL = CITEMS.register("crushed_steel",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_TRANS = CITEMS.register("crushed_transium",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_N_S = CITEMS.register("crushed_nethersteel",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
    public static final RegistryObject<Item> CRUSHED_BRASS = CITEMS.register("crushed_brass",
            () -> new Item(new Item.Properties().tab(MWCore.MISC)));
}
