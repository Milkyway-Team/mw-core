package com.pouffy.mw_core.compat;

import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public enum Mods {

    MW("mw_core"),
    MWC("mw_capsules")
        ;
    private final String id;
    public boolean reversedMetalPrefix;
    public boolean strippedIsSuffix;
    public boolean omitWoodSuffix;

    private Mods(String id) {
        this(id, (b) -> {
        });
    }

    private Mods(String id, Consumer props) {
        props.accept(new Mods.Builder());
        this.id = id;
    }

    public ResourceLocation ingotOf(String type) {
        return new ResourceLocation(this.id, this.reversedMetalPrefix ? "ingot_" + type : type + "_ingot");
    }

    public ResourceLocation nuggetOf(String type) {
        return new ResourceLocation(this.id, this.reversedMetalPrefix ? "nugget_" + type : type + "_nugget");
    }

    public ResourceLocation oreOf(String type) {
        return new ResourceLocation(this.id, this.reversedMetalPrefix ? "ore_" + type : type + "_ore");
    }

    public ResourceLocation deepslateOreOf(String type) {
        return new ResourceLocation(this.id, this.reversedMetalPrefix ? "deepslate_ore_" + type : "deepslate_" + type + "_ore");
    }

    public ResourceLocation asResource(String id) {
        return new ResourceLocation(this.id, id);
    }

    public ResourceLocation recipeId(String id) {
        return Mods.MWC.recipeId("capsule_filling");
    }

    public String getId() {
        return this.id;
    }

    class Builder {
        Builder() {
        }

        Mods.Builder reverseMetalPrefix() {
            Mods.this.reversedMetalPrefix = true;
            return this;
        }

        Mods.Builder strippedWoodIsSuffix() {
            Mods.this.strippedIsSuffix = true;
            return this;
        }

        Mods.Builder omitWoodSuffix() {
            Mods.this.omitWoodSuffix = true;
            return this;
        }
    }

}
