package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen;

import com.pouffy.mw_core.AllItems;
import com.pouffy.mw_core.MWCore;
import com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon.CastObject;
import com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon.CastType;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class MWItemModels extends ItemModelProvider {

    public MWItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MWCore.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


        itemWithModel(AllItems.ALUMINIUM_DUST, "item/generated");
        itemWithModel(AllItems.ALUMINIUM_INGOT, "item/generated");
        itemWithModel(AllItems.ALUMINIUM_NUGGET, "item/generated");

        itemWithModel(AllItems.TRANSIUM_DUST, "item/generated");
        itemWithModel(AllItems.TRANSIUM_INGOT, "item/generated");
        itemWithModel(AllItems.TRANSIUM_NUGGET, "item/generated");


        //for(CastType type : CastType.values()) {
        //    castModel(AllItems.casts.get(type), type);
       // }

    }

    public void castModel(CastObject object) {
        itemWithModel(object.getGoldCast(), "item/generated");
        itemWithModel(object.getSandCast(), "item/generated");
        itemWithModel(object.getRedSandCast(), "item/generated");
    }

    public void itemWithModel(RegistryObject<? extends Item> registryObject, String model) {
        ResourceLocation id = registryObject.getId();
        ResourceLocation textureLocation = new ResourceLocation(id.getNamespace(), "item/" + id.getPath());
        singleTexture(id.getPath(), new ResourceLocation(model), "layer0", textureLocation);
    }

    public void castModel(RegistryObject<? extends Item> registryObject, CastType type) {
        ResourceLocation id = registryObject.getId();
        ResourceLocation textureLocation = new ResourceLocation(id.getNamespace(), "item/cast/" + type.name().toLowerCase());
        singleTexture(id.getPath(), new ResourceLocation("item/generated"), "layer0", textureLocation);
    }
}
