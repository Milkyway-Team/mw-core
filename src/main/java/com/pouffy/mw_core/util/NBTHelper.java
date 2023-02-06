package com.pouffy.mw_core.util;

import net.minecraft.core.Vec3i;
import net.minecraft.nbt.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.common.extensions.IForgeItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class NBTHelper {
    public NBTHelper() {
    }

    public static void putMarker(CompoundTag nbt, String marker) {
        nbt.putBoolean(marker, true);
    }

    public static <T extends Enum<?>> T readEnum(CompoundTag nbt, String key, Class<T> enumClass) {
        T[] enumConstants = (T[]) enumClass.getEnumConstants();
        if (enumConstants == null) {
            throw new IllegalArgumentException("Non-Enum class passed to readEnum: " + enumClass.getName());
        } else {
            if (nbt.contains(key, 8)) {
                String name = nbt.getString(key);
                Enum[] var5 = enumConstants;
                int var6 = enumConstants.length;

                for(int var7 = 0; var7 < var6; ++var7) {
                    T t = (T) var5[var7];
                    if (t.name().equals(name)) {
                        return t;
                    }
                }
            }

            return enumConstants[0];
        }
    }

    public static <T extends Enum<?>> void writeEnum(CompoundTag nbt, String key, T enumConstant) {
        nbt.putString(key, enumConstant.name());
    }

    public static <T> ListTag writeCompoundList(Iterable<T> list, Function<T, CompoundTag> serializer) {
        ListTag listNBT = new ListTag();
        list.forEach((t) -> {
            CompoundTag apply = (CompoundTag)serializer.apply(t);
            if (apply != null) {
                listNBT.add(apply);
            }
        });
        return listNBT;
    }

    public static <T> List<T> readCompoundList(ListTag listNBT, Function<CompoundTag, T> deserializer) {
        List<T> list = new ArrayList(listNBT.size());
        listNBT.forEach((inbt) -> {
            list.add(deserializer.apply((CompoundTag)inbt));
        });
        return list;
    }

    public static <T> void iterateCompoundList(ListTag listNBT, Consumer<CompoundTag> consumer) {
        listNBT.forEach((inbt) -> {
            consumer.accept((CompoundTag)inbt);
        });
    }

    public static ListTag writeItemList(Iterable<ItemStack> stacks) {
        return writeCompoundList(stacks, IForgeItemStack::serializeNBT);
    }

    public static List<ItemStack> readItemList(ListTag stacks) {
        return readCompoundList(stacks, ItemStack::of);
    }

    public static ListTag writeAABB(AABB bb) {
        ListTag bbtag = new ListTag();
        bbtag.add(FloatTag.valueOf((float)bb.minX));
        bbtag.add(FloatTag.valueOf((float)bb.minY));
        bbtag.add(FloatTag.valueOf((float)bb.minZ));
        bbtag.add(FloatTag.valueOf((float)bb.maxX));
        bbtag.add(FloatTag.valueOf((float)bb.maxY));
        bbtag.add(FloatTag.valueOf((float)bb.maxZ));
        return bbtag;
    }

    public static AABB readAABB(ListTag bbtag) {
        return bbtag != null && !bbtag.isEmpty() ? new AABB((double)bbtag.getFloat(0), (double)bbtag.getFloat(1), (double)bbtag.getFloat(2), (double)bbtag.getFloat(3), (double)bbtag.getFloat(4), (double)bbtag.getFloat(5)) : null;
    }

    public static ListTag writeVec3i(Vec3i vec) {
        ListTag tag = new ListTag();
        tag.add(IntTag.valueOf(vec.getX()));
        tag.add(IntTag.valueOf(vec.getY()));
        tag.add(IntTag.valueOf(vec.getZ()));
        return tag;
    }

    public static Vec3i readVec3i(ListTag tag) {
        return new Vec3i(tag.getInt(0), tag.getInt(1), tag.getInt(2));
    }

    @Nonnull
    public static Tag getINBT(CompoundTag nbt, String id) {
        Tag inbt = nbt.get(id);
        return (Tag)(inbt != null ? inbt : new CompoundTag());
    }
}
