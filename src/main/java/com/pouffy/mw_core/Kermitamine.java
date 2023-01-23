package com.pouffy.mw_core;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class Kermitamine {
    //ITEMS
    public static final DeferredRegister<Item> KERMIT_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "kermitamine");

    public static final RegistryObject<Item> PURE_KERMITAMINE = KERMIT_ITEMS.register("pure_kermitamine",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> IMPURE_KERMITAMINE = KERMIT_ITEMS.register("impure_kermitamine",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> NEGATIVE_KERMITAMINE = KERMIT_ITEMS.register("negative_kermitamine",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> POSITIVE_KERMITAMINE = KERMIT_ITEMS.register("positive_kermitamine",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> ETHERIC_KERMITIDE = KERMIT_ITEMS.register("etheric_kermitide",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> CHARGED_ETHERIC_KERMITIDE = KERMIT_ITEMS.register("charged_etheric_kermitide",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> TEARDROP_OF_KERMIT = KERMIT_ITEMS.register("teardrop_of_kermit",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_OXID = KERMIT_ITEMS.register("kermitamine_oxid",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> ENRICHED_KERMITAMINE_OXID = KERMIT_ITEMS.register("enriched_kermitamine_oxid",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_DIOXIDE = KERMIT_ITEMS.register("kermitamine_dioxide",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> ENRICHED_KERMITAMINE_DIOXIDE = KERMIT_ITEMS.register("enriched_kermitamine_dioxide",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SUPERPOSITIONED_CHROMATIC_KERMITAMINE_RESONITE = KERMIT_ITEMS.register("superpositioned_chromatic_kermitamine_resonite",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PRIMED_CHROMATIC_KERMITAMINE_RESONITE = KERMIT_ITEMS.register("primed_chromatic_kermitamine_resonite",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_CHROMATIC_KERMITAMINE_RESONITE = KERMIT_ITEMS.register("unstable_chromatic_kermitamine_resonite",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> CHROMATIC_KERMITAMINE_RESONITE = KERMIT_ITEMS.register("chromatic_kermitamine_resonite",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_RESONITE = KERMIT_ITEMS.register("kermitamine_resonite",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SUPERPOSITIONED_KERMITAMINE_CRYSTAL = KERMIT_ITEMS.register("superpositioned_kermitamine_crystal",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_LAMBDA = KERMIT_ITEMS.register("kermitamine_crystal_lambda",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_LAMBDA = KERMIT_ITEMS.register("unstable_kermitamine_crystal_lambda",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_ALPHA = KERMIT_ITEMS.register("kermitamine_crystal_alpha",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_ALPHA = KERMIT_ITEMS.register("unstable_kermitamine_crystal_alpha",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_BETA = KERMIT_ITEMS.register("kermitamine_crystal_beta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_BETA = KERMIT_ITEMS.register("unstable_kermitamine_crystal_beta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_GAMMA = KERMIT_ITEMS.register("kermitamine_crystal_gamma",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_GAMMA = KERMIT_ITEMS.register("unstable_kermitamine_crystal_gamma",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_DELTA = KERMIT_ITEMS.register("kermitamine_crystal_delta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_DELTA = KERMIT_ITEMS.register("unstable_kermitamine_crystal_delta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_EPSILON = KERMIT_ITEMS.register("kermitamine_crystal_epsilon",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_EPSILON = KERMIT_ITEMS.register("unstable_kermitamine_crystal_epsilon",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_ZETA = KERMIT_ITEMS.register("kermitamine_crystal_zeta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_ZETA = KERMIT_ITEMS.register("unstable_kermitamine_crystal_zeta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_ETA = KERMIT_ITEMS.register("kermitamine_crystal_eta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_ETA = KERMIT_ITEMS.register("unstable_kermitamine_crystal_eta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_THETA = KERMIT_ITEMS.register("kermitamine_crystal_theta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_THETA = KERMIT_ITEMS.register("unstable_kermitamine_crystal_theta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_IOTA = KERMIT_ITEMS.register("kermitamine_crystal_iota",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_IOTA = KERMIT_ITEMS.register("unstable_kermitamine_crystal_iota",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_MU = KERMIT_ITEMS.register("kermitamine_crystal_mu",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_MU = KERMIT_ITEMS.register("unstable_kermitamine_crystal_mu",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_NU = KERMIT_ITEMS.register("kermitamine_crystal_nu",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_NU = KERMIT_ITEMS.register("unstable_kermitamine_crystal_nu",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_XI = KERMIT_ITEMS.register("kermitamine_crystal_xi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_XI = KERMIT_ITEMS.register("unstable_kermitamine_crystal_xi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_OMICRON = KERMIT_ITEMS.register("kermitamine_crystal_omicron",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_OMICRON = KERMIT_ITEMS.register("unstable_kermitamine_crystal_omicron",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_PI = KERMIT_ITEMS.register("kermitamine_crystal_pi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_PI = KERMIT_ITEMS.register("unstable_kermitamine_crystal_pi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_RHO = KERMIT_ITEMS.register("kermitamine_crystal_rho",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_RHO = KERMIT_ITEMS.register("unstable_kermitamine_crystal_rho",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_SIGMA = KERMIT_ITEMS.register("kermitamine_crystal_sigma",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_SIGMA = KERMIT_ITEMS.register("unstable_kermitamine_crystal_sigma",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_TAU = KERMIT_ITEMS.register("kermitamine_crystal_tau",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_TAU = KERMIT_ITEMS.register("unstable_kermitamine_crystal_tau",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_UPSILON = KERMIT_ITEMS.register("kermitamine_crystal_upsilon",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_UPSILON = KERMIT_ITEMS.register("unstable_kermitamine_crystal_upsilon",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_PHI = KERMIT_ITEMS.register("kermitamine_crystal_phi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_PHI = KERMIT_ITEMS.register("unstable_kermitamine_crystal_phi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_CHI = KERMIT_ITEMS.register("kermitamine_crystal_chi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_CHI = KERMIT_ITEMS.register("unstable_kermitamine_crystal_chi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_PSI = KERMIT_ITEMS.register("kermitamine_crystal_psi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_PSI = KERMIT_ITEMS.register("unstable_kermitamine_crystal_psi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_CRYSTAL_OMEGA = KERMIT_ITEMS.register("kermitamine_crystal_omega",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITAMINE_CRYSTAL_OMEGA = KERMIT_ITEMS.register("unstable_kermitamine_crystal_omega",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SUPERPOSITIONED_HANSONETIC_CRYSTAL = KERMIT_ITEMS.register("superpositioned_hansonetic_crystal",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_LAMBDA = KERMIT_ITEMS.register("hansonetic_crystal_lambda",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_LAMBDA = KERMIT_ITEMS.register("unstable_hansonetic_crystal_lambda",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_ALPHA = KERMIT_ITEMS.register("hansonetic_crystal_alpha",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_ALPHA = KERMIT_ITEMS.register("unstable_hansonetic_crystal_alpha",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_BETA = KERMIT_ITEMS.register("hansonetic_crystal_beta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_BETA = KERMIT_ITEMS.register("unstable_hansonetic_crystal_beta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_GAMMA = KERMIT_ITEMS.register("hansonetic_crystal_gamma",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_GAMMA = KERMIT_ITEMS.register("unstable_hansonetic_crystal_gamma",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_DELTA = KERMIT_ITEMS.register("hansonetic_crystal_delta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_DELTA = KERMIT_ITEMS.register("unstable_hansonetic_crystal_delta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_EPSILON = KERMIT_ITEMS.register("hansonetic_crystal_epsilon",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_EPSILON = KERMIT_ITEMS.register("unstable_hansonetic_crystal_epsilon",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_ZETA = KERMIT_ITEMS.register("hansonetic_crystal_zeta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_ZETA = KERMIT_ITEMS.register("unstable_hansonetic_crystal_zeta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_ETA = KERMIT_ITEMS.register("hansonetic_crystal_eta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_ETA = KERMIT_ITEMS.register("unstable_hansonetic_crystal_eta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_THETA = KERMIT_ITEMS.register("hansonetic_crystal_theta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_THETA = KERMIT_ITEMS.register("unstable_hansonetic_crystal_theta",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_IOTA = KERMIT_ITEMS.register("hansonetic_crystal_iota",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_IOTA = KERMIT_ITEMS.register("unstable_hansonetic_crystal_iota",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_MU = KERMIT_ITEMS.register("hansonetic_crystal_mu",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_MU = KERMIT_ITEMS.register("unstable_hansonetic_crystal_mu",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_NU = KERMIT_ITEMS.register("hansonetic_crystal_nu",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_NU = KERMIT_ITEMS.register("unstable_hansonetic_crystal_nu",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_XI = KERMIT_ITEMS.register("hansonetic_crystal_xi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_XI = KERMIT_ITEMS.register("unstable_hansonetic_crystal_xi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_OMICRON = KERMIT_ITEMS.register("hansonetic_crystal_omicron",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_OMICRON = KERMIT_ITEMS.register("unstable_hansonetic_crystal_omicron",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_PI = KERMIT_ITEMS.register("hansonetic_crystal_pi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_PI = KERMIT_ITEMS.register("unstable_hansonetic_crystal_pi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_RHO = KERMIT_ITEMS.register("hansonetic_crystal_rho",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_RHO = KERMIT_ITEMS.register("unstable_hansonetic_crystal_rho",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_SIGMA = KERMIT_ITEMS.register("hansonetic_crystal_sigma",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_SIGMA = KERMIT_ITEMS.register("unstable_hansonetic_crystal_sigma",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_TAU = KERMIT_ITEMS.register("hansonetic_crystal_tau",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_TAU = KERMIT_ITEMS.register("unstable_hansonetic_crystal_tau",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_UPSILON = KERMIT_ITEMS.register("hansonetic_crystal_upsilon",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_UPSILON = KERMIT_ITEMS.register("unstable_hansonetic_crystal_upsilon",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_PHI = KERMIT_ITEMS.register("hansonetic_crystal_phi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_PHI = KERMIT_ITEMS.register("unstable_hansonetic_crystal_phi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_CHI = KERMIT_ITEMS.register("hansonetic_crystal_chi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_CHI = KERMIT_ITEMS.register("unstable_hansonetic_crystal_chi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_PSI = KERMIT_ITEMS.register("hansonetic_crystal_psi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_PSI = KERMIT_ITEMS.register("unstable_hansonetic_crystal_psi",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_OMEGA = KERMIT_ITEMS.register("hansonetic_crystal_omega",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_HANSONETIC_CRYSTAL_OMEGA = KERMIT_ITEMS.register("unstable_hansonetic_crystal_omega",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> TINY_PILE_OF_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("tiny_pile_of_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> TINY_PILE_OF_ENERGIZED_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("tiny_pile_of_energized_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SMALL_PILE_OF_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("small_pile_of_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SMALL_PILE_OF_ENERGIZED_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("small_pile_of_energized_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> MEDIUM_PILE_OF_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("medium_pile_of_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> MEDIUM_PILE_OF_ENERGIZED_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("medium_pile_of_energized_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> LARGE_PILE_OF_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("large_pile_of_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> LARGE_PILE_OF_ENERGIZED_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("large_pile_of_energized_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HUGE_PILE_OF_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("huge_pile_of_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HUGE_PILE_OF_ENERGIZED_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("huge_pile_of_energized_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> MASSIVE_AMOUNT_OF_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("massive_amount_of_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> MASSIVE_AMOUNT_OF_ENERGIZED_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("massive_amount_of_energized_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> COPIOUS_AMOUNT_OF_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("copious_amount_of_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> COPIOUS_AMOUNT_OF_ENERGIZED_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("copious_amount_of_energized_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PULVERIZED_COPIOUS_AMOUNT_OF_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("pulverized_copious_amount_of_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PULVERIZED_COPIOUS_AMOUNT_OF_ENERGIZED_KERMITAMINE_DUST_X = KERMIT_ITEMS.register("pulverized_copious_amount_of_energized_kermitamine_dust_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> TINY_PILE_OF_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("tiny_pile_of_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> TINY_PILE_OF_ENERGIZED_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("tiny_pile_of_energized_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SMALL_PILE_OF_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("small_pile_of_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SMALL_PILE_OF_ENERGIZED_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("small_pile_of_energized_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> MEDIUM_PILE_OF_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("medium_pile_of_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> MEDIUM_PILE_OF_ENERGIZED_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("medium_pile_of_energized_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> LARGE_PILE_OF_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("large_pile_of_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> LARGE_PILE_OF_ENERGIZED_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("large_pile_of_energized_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HUGE_PILE_OF_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("huge_pile_of_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HUGE_PILE_OF_ENERGIZED_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("huge_pile_of_energized_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> MASSIVE_AMOUNT_OF_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("massive_amount_of_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> MASSIVE_AMOUNT_OF_ENERGIZED_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("massive_amount_of_energized_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> COPIOUS_AMOUNT_OF_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("copious_amount_of_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> COPIOUS_AMOUNT_OF_ENERGIZED_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("copious_amount_of_energized_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PULVERIZED_COPIOUS_AMOUNT_OF_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("pulverized_copious_amount_of_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PULVERIZED_COPIOUS_AMOUNT_OF_ENERGIZED_KERMITAMINE_DUST_Y = KERMIT_ITEMS.register("pulverized_copious_amount_of_energized_kermitamine_dust_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> TINY_PILE_OF_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("tiny_pile_of_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> TINY_PILE_OF_ENERGIZED_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("tiny_pile_of_energized_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SMALL_PILE_OF_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("small_pile_of_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SMALL_PILE_OF_ENERGIZED_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("small_pile_of_energized_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> MEDIUM_PILE_OF_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("medium_pile_of_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> MEDIUM_PILE_OF_ENERGIZED_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("medium_pile_of_energized_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> LARGE_PILE_OF_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("large_pile_of_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> LARGE_PILE_OF_ENERGIZED_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("large_pile_of_energized_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HUGE_PILE_OF_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("huge_pile_of_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HUGE_PILE_OF_ENERGIZED_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("huge_pile_of_energized_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> MASSIVE_AMOUNT_OF_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("massive_amount_of_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> MASSIVE_AMOUNT_OF_ENERGIZED_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("massive_amount_of_energized_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> COPIOUS_AMOUNT_OF_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("copious_amount_of_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> COPIOUS_AMOUNT_OF_ENERGIZED_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("copious_amount_of_energized_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PULVERIZED_COPIOUS_AMOUNT_OF_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("pulverized_copious_amount_of_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PULVERIZED_COPIOUS_AMOUNT_OF_ENERGIZED_KERMITAMINE_DUST_Z = KERMIT_ITEMS.register("pulverized_copious_amount_of_energized_kermitamine_dust_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PULVERIZED_HUNGOLOMGHONONOLOUGHONGOUS_AMOUNT_OF_KERMITAMINE_DUST_XYZ = KERMIT_ITEMS.register("pulverized_hungolomghononoloughongous_amount_of_kermitamine_dust_xyz",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PULVERIZED_HUNGOLOMGHONONOLOUGHONGOUS_AMOUNT_OF_ENERGIZED_KERMITAMINE_DUST_XYZ = KERMIT_ITEMS.register("pulverized_hungolomghononoloughongous_amount_of_energized_kermitamine_dust_xyz",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> FOUND_KERMITAMINE_DUST = KERMIT_ITEMS.register("found_kermitamine_dust",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> ACTIVATED_KERMITAMINE_DUST = KERMIT_ITEMS.register("activated_kermitamine_dust",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SUPERDENSE_ACTIVATED_KERMITAMINE_DUST = KERMIT_ITEMS.register("superdense_activated_kermitamine_dust",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> LAFFOSAITE_DUST = KERMIT_ITEMS.register("laffosaite_dust",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> DEMICHELEITE_DUST = KERMIT_ITEMS.register("demicheleite_dust",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> COMANCHEITE_DUST = KERMIT_ITEMS.register("comancheite_dust",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PERROUDE_DUST = KERMIT_ITEMS.register("perroude_dust",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> STRANGE_MATTER_CONTAINER_ = KERMIT_ITEMS.register("strange_matter_container_",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_PLASMA_CONTAINER = KERMIT_ITEMS.register("kermitamine_plasma_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> DIMETHYLETHER_CONTAINER = KERMIT_ITEMS.register("dimethylether_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> ORTHOCARBONIC_CONTAINER = KERMIT_ITEMS.register("orthocarbonic_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> TETRAETHYLMETHANE_CONTAINER = KERMIT_ITEMS.register("tetraethylmethane_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> ALCINDOROMYCINE_ACID_CONTAINER = KERMIT_ITEMS.register("alcindoromycine_acid_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PYRIMIDINECARBOXYLIC_ACID_CONTAINER = KERMIT_ITEMS.register("pyrimidinecarboxylic_acid_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> VOMITOXINC_ACID_CONTAINER = KERMIT_ITEMS.register("vomitoxinc_acid_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> DIAMINOMALEONITRILEC_ACID_CONTAINER = KERMIT_ITEMS.register("diaminomaleonitrilec_acid_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> TRAUMATIC_ACID_CONTAINER = KERMIT_ITEMS.register("traumatic_acid_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> METHIONYLTHREONYLTHREONYLGLUTAMINYLALANYLISOLEUCINE_CONTAINER = KERMIT_ITEMS.register("methionylthreonylthreonylglutaminylalanylisoleucine_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> DIHYDROCODEINONE_ENOL_ACETATE_CONTAINER = KERMIT_ITEMS.register("dihydrocodeinone_enol_acetate_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> DRAGONBLOODIN_CONTAINER = KERMIT_ITEMS.register("dragonbloodin_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSPECILIZED_CONTAINER = KERMIT_ITEMS.register("unspecilized_container",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_PROCESSOR_CHIP_X = KERMIT_ITEMS.register("kermitamine_processor_chip_x",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_PROCESSOR_CHIP_Y = KERMIT_ITEMS.register("kermitamine_processor_chip_y",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_PROCESSOR_CHIP_Z = KERMIT_ITEMS.register("kermitamine_processor_chip_z",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITAMINE_PROCESSOR_CHIP_XYZ = KERMIT_ITEMS.register("kermitamine_processor_chip_xyz",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HARMONIC_CONVERGENCE_STABILIZER_CHIP = KERMIT_ITEMS.register("harmonic_convergence_stabilizer_chip",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> CHAOTIC_CONVERGENCE_DESTABILIZER_CHIP = KERMIT_ITEMS.register("chaotic_convergence_destabilizer_chip",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PHTONOIC_CONVERSATION_CHIP = KERMIT_ITEMS.register("phtonoic_conversation_chip",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> ATOMIC_REARRANGER_CHIP = KERMIT_ITEMS.register("atomic_rearranger_chip",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> CONTAINER_CHIP = KERMIT_ITEMS.register("container_chip",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_PRECISE_CHIP = KERMIT_ITEMS.register("hansonetic_crystal_precise_chip",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITIDE_EGY = KERMIT_ITEMS.register("kermitide_egy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITIDE_EGY = KERMIT_ITEMS.register("unstable_kermitide_egy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITIDE_KETTO = KERMIT_ITEMS.register("kermitide_ketto",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITIDE_KETTO = KERMIT_ITEMS.register("unstable_kermitide_ketto",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITIDE_HAROM = KERMIT_ITEMS.register("kermitide_harom",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITIDE_HAROM = KERMIT_ITEMS.register("unstable_kermitide_harom",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITIDE_NEGY = KERMIT_ITEMS.register("kermitide_negy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITIDE_NEGY = KERMIT_ITEMS.register("unstable_kermitide_negy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITIDE_OT = KERMIT_ITEMS.register("kermitide_ot",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITIDE_OT = KERMIT_ITEMS.register("unstable_kermitide_ot",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITIDE_HAT = KERMIT_ITEMS.register("kermitide_hat",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITIDE_HAT = KERMIT_ITEMS.register("unstable_kermitide_hat",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KERMITIDE_HET = KERMIT_ITEMS.register("kermitide_het",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UNSTABLE_KERMITIDE_HET = KERMIT_ITEMS.register("unstable_kermitide_het",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SUPERDENSE_GLASS = KERMIT_ITEMS.register("superdense_glass",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> HANSONETIC_CRYSTAL_TUBE = KERMIT_ITEMS.register("hansonetic_crystal_tube",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> QUANTANIHEOTRIUM_ALLOY = KERMIT_ITEMS.register("quantaniheotrium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> WHEOTRIUMOTHESE_ALLOY = KERMIT_ITEMS.register("wheotriumothese_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> QABROATRIUMOSKIASTEN_ALLOY = KERMIT_ITEMS.register("qabroatriumoskiasten_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SWOYRIUMESKUENYX_ALLOY = KERMIT_ITEMS.register("swoyriumeskuenyx_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PLEORIHASLEORIUM_ALLOY = KERMIT_ITEMS.register("pleorihasleorium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> XETHIUMOSWIUNIUM_ALLOY = KERMIT_ITEMS.register("xethiumoswiunium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> OSNYXIKRUCIUM_ALLOY = KERMIT_ITEMS.register("osnyxikrucium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> STROERIUMANIKUTRAIDIAN_ALLOY = KERMIT_ITEMS.register("stroeriumanikutraidian_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> ZOBRAYRIRIOTRIUM_ALLOY = KERMIT_ITEMS.register("zobrayririotrium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SIMONIZESNAUNIUMANIADIAN_ALLOY = KERMIT_ITEMS.register("simonizesnauniumaniadian_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> XOCLIUMETHYLICPLOYSTEN_ALLOY = KERMIT_ITEMS.register("xocliumethylicploysten_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> TOSWOALIUTHAUTIUM_ALLOY = KERMIT_ITEMS.register("toswoaliuthautium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> LARANITEGRICIUM_ALLOY = KERMIT_ITEMS.register("laranitegricium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> FABREACIUMPOGLUITIUMSMENESE_ALLOY = KERMIT_ITEMS.register("fabreaciumpogluitiumsmenese_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> UGRYXTOBRYXJEFLEYNYXYUGLUTRIUM_ALLOY = KERMIT_ITEMS.register("ugryxtobryxjefleynyxyuglutrium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> XOSTUALIUMSESMEANESE_ALLOY = KERMIT_ITEMS.register("xostualiumsesmeanese_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> FREORIUMFRUOSIUM_ALLOY = KERMIT_ITEMS.register("freoriumfruosium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> ACRUOCIUMSESWEITINE_ALLOY = KERMIT_ITEMS.register("acruociumsesweitine_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> CLAUNORBRUTRIUM_ALLOY = KERMIT_ITEMS.register("claunorbrutrium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> DEFLAORHILKEGRIERIUM_ALLOY = KERMIT_ITEMS.register("deflaorhilkegrierium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PAWHUENIUMMASTUYTIUM_ALLOY = KERMIT_ITEMS.register("pawhueniummastuytium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KRATIUMBLEADIAN_ALLOY = KERMIT_ITEMS.register("kratiumbleadian_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KUPREANTINEGOCREDIANZATHAITIUM_ALLOY = KERMIT_ITEMS.register("kupreantinegocredianzathaitium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> NUSNAENESEKRUYCIUM_ALLOY = KERMIT_ITEMS.register("nusnaenesekruycium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> WOTHEABREARIUM_ALLOY = KERMIT_ITEMS.register("wotheabrearium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> FRIUTRILATRIUM_ALLOY = KERMIT_ITEMS.register("friutrilatrium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> NOCLAITIUMCLEUTIUMBLEALIUM_ALLOY = KERMIT_ITEMS.register("noclaitiumcleutiumblealium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KAPLIENIUMAES_ALLOY = KERMIT_ITEMS.register("kaplieniumaes_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> USPEOCIUMOER_ALLOY = KERMIT_ITEMS.register("uspeociumoer_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> CHIUDIOUSIUM_ALLOY = KERMIT_ITEMS.register("chiudiousium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> ASMUYTINEGEFREYRIUM_ALLOY = KERMIT_ITEMS.register("asmuytinegefreyrium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> CHUECIUMCLEUSTEN_ALLOY = KERMIT_ITEMS.register("chueciumcleusten_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> STAILIUMYODRITE_ALLOY = KERMIT_ITEMS.register("stailiumyodrite_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> XECHEATRIUMBUSLEANYX_ALLOY = KERMIT_ITEMS.register("xecheatriumbusleanyx_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> PESLIOLIUMUPROUNYX_ALLOY = KERMIT_ITEMS.register("peslioliumuprounyx_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> KROUNTINESKEARIUM_ALLOY = KERMIT_ITEMS.register("krountineskearium_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> SCUETRIUMBOCLYX_ALLOY = KERMIT_ITEMS.register("scuetriumboclyx_alloy",
            () -> new Item(new Item.Properties().tab(MWCore.KERMITAMINE)));
    public static final RegistryObject<Item> CONTAINER = KERMIT_ITEMS.register("container",
            () -> new Item ((new Item.Properties()).stacksTo(16).tab(MWCore.KERMITAMINE)));


    public static final RegistryObject<Item> LIQUID_KERMITAMINE_CONTAINER = KERMIT_ITEMS.register("liquid_kermitamine_container",
            () -> new Item(new Item.Properties().stacksTo(1).tab(MWCore.KERMITAMINE)));


}
