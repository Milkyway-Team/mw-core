package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class CastObject {
    private final ResourceLocation name;
    private final RegistryObject<Item> gold_cast;
    private final RegistryObject<Item> sand_cast;
    private final RegistryObject<Item> red_sand_cast;
    private final TagKey<Item> singleUseTag;
    private final TagKey<Item> multiUseTag;

    public CastObject(String name, RegistryObject<Item> gold_cast, RegistryObject<Item> sand_cast, RegistryObject<Item> red_sand_cast) {
        this.name = new ResourceLocation(name);
        this.gold_cast = gold_cast;
        this.sand_cast = sand_cast;
        this.red_sand_cast = red_sand_cast;
        this.singleUseTag = makeTag("single_use");
        this.multiUseTag = makeTag("multi_use");
    }

    protected TagKey<Item> makeTag(String type) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(name.getNamespace(), "casts/" + type + "/" + name.getPath()));
    }

    public ResourceLocation getName() {
        return name;
    }

    public TagKey<Item> getMultiUseTag() {
        return multiUseTag;
    }

    public TagKey<Item> getSingleUseTag() {
        return singleUseTag;
    }

    public RegistryObject<Item> getGoldCast() {
        return gold_cast;
    }

    public RegistryObject<Item> getSandCast() {
        return sand_cast;
    }

    public RegistryObject<Item> getRedSandCast() {
        return red_sand_cast;
    }
}
