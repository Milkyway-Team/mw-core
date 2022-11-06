package com.pouffy.mw_core.common.mod_compats.thermal;

import cofh.lib.util.flags.FlagManager;

import java.util.function.BooleanSupplier;

public class MilkyFlags {
    private static final FlagManager FLAG_MANAGER = new FlagManager("mw_core");
    public static String FLAG_RESOURCE_BRASS = "brass";
    public static String FLAG_RESOURCE_ZINC = "lead";
    public static String FLAG_RESOURCE_ALUMINUM = "aluminum";


    private MilkyFlags() {
    }

    public static FlagManager manager() {
        return FLAG_MANAGER;
    }

    public static void setFlag(String flag, boolean enable) {
        FLAG_MANAGER.setFlag(flag, enable);
    }

    public static void setFlag(String flag, BooleanSupplier condition) {
        FLAG_MANAGER.setFlag(flag, condition);
    }

    public static BooleanSupplier getFlag(String flag) {
        return FLAG_MANAGER.getFlag(flag);
    }

}
