package com.pouffy.mw_core.content.items.charms;

import com.pouffy.mw_core.AllItems;
import com.pouffy.mw_core.MWCore;
import com.pouffy.mw_core.content.items.charms.abilities.NegativeEffectRemover;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class MilksCharmItem extends Item implements MilksCharmItemuse {
    public MilksCharmItem(Item.Properties pProperties) {
    super(pProperties);
    }

    @Override
    public void inventoryTick(@Nonnull ItemStack stack, Level level, @Nonnull Entity entity, int itemSlot, boolean isSelected) {
        if (!level.isClientSide() && !this.isDeactivated(stack) && entity instanceof LivingEntity livingEntity) {
        NegativeEffectRemover.clearEffects(entity);
        NegativeEffectRemover.damageStack(stack);
            //livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 40, 8, false, false, true));
        }
        super.inventoryTick(stack, level, entity, itemSlot, isSelected);
    }


    public boolean isDeactivated(ItemStack stack) {
        return stack.getOrCreateTag().getBoolean("Deactivated");
    }
    public void setDeactivated(ItemStack stack, boolean deactivated) {
        stack.getOrCreateTag().putBoolean("Deactivated", deactivated);
    }

    @Nonnull
    @Override
    public InteractionResultHolder<ItemStack> use(@Nonnull Level level, Player player, @Nonnull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        this.setDeactivated(stack, !this.isDeactivated(stack));

        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }

    @Override
    public void appendHoverText(@Nonnull ItemStack stack, @Nullable Level level, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flag) {
        super.appendHoverText(stack, level, tooltip, flag);

        Component toggle = new TranslatableComponent("tooltip." + MWCore.MODID + ".toggle").withStyle(ChatFormatting.GRAY);
        //Component desc = new TranslatableComponent("tooltip." + MWCore.MODID + ".pouffcharm").withStyle(ChatFormatting.BLUE);

        boolean deactivated = this.isDeactivated(stack);
        tooltip.add(new TranslatableComponent("tooltip." + MWCore.MODID + (deactivated ? ".deactivated" : ".activated")).withStyle(deactivated ? ChatFormatting.DARK_BLUE : ChatFormatting.LIGHT_PURPLE).append(" ").append(toggle));
    }
}
