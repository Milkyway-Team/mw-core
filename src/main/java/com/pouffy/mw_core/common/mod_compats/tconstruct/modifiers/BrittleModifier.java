package com.pouffy.mw_core.common.mod_compats.tconstruct.modifiers;

import net.minecraft.world.entity.LivingEntity;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

import javax.annotation.Nullable;

public class BrittleModifier extends Modifier {

    @Override
    public int getPriority() {
        return 165; //before overslime
    }

    @Override
    public int onDamageTool(IToolStackView toolStack, int level, int amount, @Nullable LivingEntity holder) {
        return (int) (amount * Math.pow(2, level));
    }
}

