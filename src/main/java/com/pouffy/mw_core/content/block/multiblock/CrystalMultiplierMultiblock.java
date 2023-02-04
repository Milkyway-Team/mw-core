package com.pouffy.mw_core.content.block.multiblock;

import blusunrize.immersiveengineering.common.blocks.multiblocks.IETemplateMultiblock;
import com.pouffy.mw_core.AllBlocks;
import com.pouffy.mw_core.content.block.IEIntegrationBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;

public class CrystalMultiplierMultiblock extends IETemplateMultiblock {
    public CrystalMultiplierMultiblock() {
        super(new ResourceLocation("mw_core", "multiblocks/crystal_multiplier"), new BlockPos(1, 1, 1), new BlockPos(1, 1, 2), new BlockPos(3, 3, 3), IEIntegrationBlocks.Multiblocks.CRYSTAL_MULTIPLIER);
    }

    public float getManualScale() {
        return 16.0F;
    }
}
