package com.pouffy.mw_core;

import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
@SuppressWarnings("unused")
public class AllTools {
    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, MWCore.MODID);
    public static final RegistryObject<Item> ALUMINIUM_PICKAXE = TOOLS.register("aluminium_pickaxe",
            () -> new PickaxeItem(AllTiers.ALUMINIUM, 2, -2.8F, (new Item.Properties()).tab(MWCore.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_AXE = TOOLS.register("aluminium_axe",
            () -> new AxeItem(AllTiers.ALUMINIUM, 7.5F, -3.2F, (new Item.Properties()).tab(MWCore.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_SWORD = TOOLS.register("aluminium_sword",
            () -> new SwordItem(AllTiers.ALUMINIUM,4, -2.4F, (new Item.Properties()).tab(MWCore.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_HOE = TOOLS.register("aluminium_hoe",
            () -> new HoeItem(AllTiers.ALUMINIUM, -1, -2.0F, (new Item.Properties()).tab(MWCore.MISC)));
    public static final RegistryObject<Item> ALUMINIUM_SHOVEL = TOOLS.register("aluminium_shovel",
            () -> new ShovelItem(AllTiers.ALUMINIUM, 2.0F, -3.0F, (new Item.Properties()).tab(MWCore.MISC)));

    public static final RegistryObject<Item> CREATITE_PICKAXE = TOOLS.register("creatite_pickaxe",
            () -> new PickaxeItem(AllTiers.CREATITE, 2, -2.8F, (new Item.Properties()).tab(MWCore.MISC)));
    public static final RegistryObject<Item> CREATITE_AXE = TOOLS.register("creatite_axe",
            () -> new AxeItem(AllTiers.CREATITE, 7.5F, -3.2F, (new Item.Properties()).tab(MWCore.MISC)));
    public static final RegistryObject<Item> CREATITE_SWORD = TOOLS.register("creatite_sword",
            () -> new SwordItem(AllTiers.CREATITE,4, -2.4F, (new Item.Properties()).tab(MWCore.MISC)));
    public static final RegistryObject<Item> CREATITE_HOE = TOOLS.register("creatite_hoe",
            () -> new HoeItem(AllTiers.CREATITE, -1, -2.0F, (new Item.Properties()).tab(MWCore.MISC)));
    public static final RegistryObject<Item> CREATITE_SHOVEL = TOOLS.register("creatite_shovel",
            () -> new ShovelItem(AllTiers.CREATITE, 2.0F, -3.0F, (new Item.Properties()).tab(MWCore.MISC)));
}
