package com.pouffy.mw_core.mw_capsules;

import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import vectorwing.farmersdelight.common.Configuration;

import javax.annotation.Nullable;
import java.util.List;

public class ToolTipItem extends Item {
    private final boolean hasFoodEffectTooltip;
    private final boolean hasCustomTooltip;

    public ToolTipItem(Item.Properties properties) {
        super(properties);
        this.hasFoodEffectTooltip = false;
        this.hasCustomTooltip = false;
    }

    public ToolTipItem(Item.Properties properties, boolean hasFoodEffectTooltip) {
        super(properties);
        this.hasFoodEffectTooltip = hasFoodEffectTooltip;
        this.hasCustomTooltip = false;
    }

    public ToolTipItem(Item.Properties properties, boolean hasFoodEffectTooltip, boolean hasCustomTooltip) {
        super(properties);
        this.hasFoodEffectTooltip = hasFoodEffectTooltip;
        this.hasCustomTooltip = hasCustomTooltip;
    }

//    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity consumer) {
//        if (!level.isClientSide) {
//            this.affectConsumer(stack, level, consumer);
//        }
//
//        ItemStack containerStack = stack.getContainerItem();
//        Player player;
//        if (stack.isEdible()) {
//            super.finishUsingItem(stack, level, consumer);
//        } else {
//            player = consumer instanceof Player ? (Player)consumer : null;
//            if (player instanceof ServerPlayer) {
//                CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer)player, stack);
//            }
//
//            if (player != null) {
//                player.awardStat(Stats.ITEM_USED.get(this));
//                if (!player.getAbilities().instabuild) {
//                    stack.shrink(1);
//                }
//            }
//        }
//
//        if (stack.isEmpty()) {
//            return containerStack;
//        } else {
//            if (consumer instanceof Player) {
//                player = (Player)consumer;
//                if (!((Player)consumer).getAbilities().instabuild && !player.getInventory().add(containerStack)) {
//                    player.drop(containerStack, false);
//                }
//            }
//
//            return stack;
//        }
//    }

//    public void affectConsumer(ItemStack stack, Level level, LivingEntity consumer) {
//    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
        if ((Boolean)Configuration.FOOD_EFFECT_TOOLTIP.get()) {
            if (this.hasCustomTooltip) {
                MutableComponent textEmpty = TextUtils.getTranslation("tooltip." + this, new Object[0]);
                tooltip.add(textEmpty.withStyle(ChatFormatting.AQUA));
            }

            if (this.hasFoodEffectTooltip) {
                TextUtils.addFoodEffectTooltip(stack, tooltip, 1.0F);
            }
        }

    }
}
