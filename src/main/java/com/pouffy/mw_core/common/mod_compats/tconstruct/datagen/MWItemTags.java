package com.pouffy.mw_core.common.mod_compats.tconstruct.datagen;

import com.pouffy.mw_core.AllBlockItems;
import com.pouffy.mw_core.AllItems;
import com.pouffy.mw_core.MWCore;
import com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon.CastType;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import slimeknights.tconstruct.common.TinkerTags;

import javax.annotation.Nullable;

import static com.pouffy.mw_core.common.mod_compats.tconstruct.datagen.tcon.MWTags.Items.*;

public class MWItemTags extends ItemTagsProvider {

    private static TagKey<Item> create(String name) {
        return ItemTags.create(new ResourceLocation(name));
    }

    public MWItemTags(DataGenerator gen, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(gen, blockTagsProvider, MWCore.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {


        tag(RAW_ALUMINUM).add(AllItems.RAW_ALUMINIUM.get());

        tag(RAW_ALUMINUM_BLOCK).add(AllBlockItems.RAW_ALUMINIUM_BLOCK.get());

        tag(Tags.Items.ORES).add(
                AllBlockItems.ALUMINIUM_ORE.get(),
                AllBlockItems.DEEPSLATE_ALUMINIUM_ORE.get()
        );

        tag(Tags.Items.STORAGE_BLOCKS)
                .add(
                        AllBlockItems.RAW_ALUMINIUM_BLOCK.get(),
                        AllBlockItems.ALUMINIUM_BLOCK.get(),
                        AllBlockItems.TRANSIUM_BLOCK.get()
                );

        tag(ALUMINIUM_BLOCK).add(AllBlockItems.ALUMINIUM_BLOCK.get());
        tag(TRANSIUM_BLOCK).add(AllBlockItems.TRANSIUM_BLOCK.get());



        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(
                AllItems.ALUMINIUM_INGOT.get(),
                AllItems.TRANSIUM_INGOT.get()
        );

        tag(Tags.Items.INGOTS).add(
                AllItems.ALUMINIUM_INGOT.get(),
                AllItems.TRANSIUM_INGOT.get()
        );

        tag(Tags.Items.DUSTS).add(
                AllItems.ALUMINIUM_DUST.get(),
                AllItems.TRANSIUM_DUST.get()
        );

        tag(Tags.Items.NUGGETS).add(
                AllItems.ALUMINIUM_NUGGET.get(),
                AllItems.TRANSIUM_NUGGET.get()
        );

        tag(TRANSIUM_INGOT).add(AllItems.TRANSIUM_INGOT.get());
        tag(TRANSIUM_DUST).add(AllItems.TRANSIUM_DUST.get());
        tag(TRANSIUM_NUGGET).add(AllItems.TRANSIUM_NUGGET.get());

        tag(ALUMINIUM_ORE).add(AllBlockItems.ALUMINIUM_ORE.get(), AllBlockItems.DEEPSLATE_ALUMINIUM_ORE.get());
        tag(ALUMINUM_INGOT).add(AllItems.ALUMINIUM_INGOT.get());
        tag(ALUMINUM_DUST).add(AllItems.ALUMINIUM_DUST.get());
        tag(ALUMINUM_NUGGET).add(AllItems.ALUMINIUM_NUGGET.get());
        tag(TinkerTags.Items.ANVIL_METAL)
                .add(
                        AllBlockItems.TRANSIUM_BLOCK.get(),
                        AllBlockItems.RAW_ALUMINIUM_BLOCK.get(),
                        AllBlockItems.ALUMINIUM_BLOCK.get()
                );

        TagsProvider.TagAppender<Item> builder = tag(ALUMINUM_CASTS);

    }

}
