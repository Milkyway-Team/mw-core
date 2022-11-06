package com.pouffy.mw_core.common.mod_compats.tconstruct.modifiers;

import com.pouffy.mw_core.MWCore;
import com.pouffy.mw_core.common.mod_compats.tconstruct.modifiers.BrittleModifier;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.modifiers.util.ModifierDeferredRegister;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

public class MWCoreModifiers {
    public static ModifierDeferredRegister MODIFIERS = ModifierDeferredRegister.create(MWCore.MODID);
    public static StaticModifier<Modifier> brittle = MODIFIERS.register("brittle", BrittleModifier::new);
}
