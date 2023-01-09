package com.pouffy.mw_core.datagen;

//import com.pouffy.mw_core.AllFluidCapsules;
import com.pouffy.mw_core.MWCore;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MWCore.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {

    }
    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(Objects.requireNonNull(item.getRegistryName()).getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MWCore.MODID,"item/" + item.getRegistryName().getPath()));
    }
    private ItemModelBuilder moltenFluidCapsuleItem(Item item) {
        return withExistingParent(Objects.requireNonNull(item.getRegistryName()).getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MWCore.MODID,"sale_capsules/fluid/molten/" + item.getRegistryName().getPath()));
    }
}
