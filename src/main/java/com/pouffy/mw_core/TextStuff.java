package com.pouffy.mw_core;

import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TranslatableComponent;

public class TextStuff {
    public TextStuff() {
    }

    public static MutableComponent getTranslation(String key, Object... args) {
        return new TranslatableComponent("mw_core." + key, args);
    }
}
