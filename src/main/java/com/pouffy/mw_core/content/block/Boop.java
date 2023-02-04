package com.pouffy.mw_core.content.block;

import com.pouffy.mw_core.AllSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class Boop {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), AllSounds.SQUEAK.get(),
                        SoundSource.BLOCKS, 1, 1);
            } else {
                _level.playLocalSound(x, y, z, AllSounds.SQUEAK.get(), SoundSource.BLOCKS, 1,
                        1, false);
            }
        }
    }
}
