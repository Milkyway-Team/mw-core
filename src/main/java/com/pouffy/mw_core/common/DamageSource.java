package com.pouffy.mw_core.common;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;

public class DamageSource extends net.minecraft.world.damagesource.DamageSource {
    public static final DamageSource SKYSTONE_HOT_FLOOR = (new DamageSource("skystoneHotFloor")).setIsFire();


    private boolean damageHelmet;
    private boolean bypassArmor;
    private boolean bypassInvul;
    /** Whether or not the damage ignores modification by potion effects or enchantments. */
    private boolean bypassMagic;
    private float exhaustion = 0.1F;
    private boolean isFireSource;
    private boolean isProjectile;
    private boolean scalesWithDifficulty;
    private boolean isMagic;
    private boolean isExplosion;
    private boolean isFall;
    private boolean noAggro;
    public final String msgId;

    public boolean isBypassArmor() {
        return this.bypassArmor;
    }

    public boolean isDamageHelmet() {
        return this.damageHelmet;
    }

    /**
     * How much satiate(food) is consumed by this DamageSource
     */
    public float getFoodExhaustion() {
        return this.exhaustion;
    }

    public boolean isBypassInvul() {
        return this.bypassInvul;
    }

    /**
     * Whether or not the damage ignores modification by potion effects or enchantments.
     */
    public boolean isBypassMagic() {
        return this.bypassMagic;
    }

    public DamageSource(String p_19333_) {
        super(p_19333_);
        this.msgId = p_19333_;
    }

    @Nullable
    public Entity getEntity() {
        return null;
    }

    public DamageSource bypassArmor() {
        this.bypassArmor = true;
        this.exhaustion = 0.0F;
        return this;
    }

    public DamageSource damageHelmet() {
        this.damageHelmet = true;
        return this;
    }

    public DamageSource bypassInvul() {
        this.bypassInvul = true;
        return this;
    }

    /**
     * Sets a value indicating whether the damage is absolute (ignores modification by potion effects or enchantments),
     * and also clears out hunger damage.
     */
    public DamageSource bypassMagic() {
        this.bypassMagic = true;
        this.exhaustion = 0.0F;
        return this;
    }

    /**
     * Define the damage type as fire based.
     */
    public DamageSource setIsFire() {
        this.isFireSource = true;
        return this;
    }

    public DamageSource setNoAggro() {
        this.noAggro = true;
        return this;
    }

    /**
     * Gets the death message that is displayed when the player dies
     */
    public Component getLocalizedDeathMessage(LivingEntity pLivingEntity) {
        LivingEntity livingentity = pLivingEntity.getKillCredit();
        String s = "death.attack." + this.msgId;
        String s1 = s + ".player";
        return livingentity != null ? new TranslatableComponent(s1, pLivingEntity.getDisplayName(), livingentity.getDisplayName()) : new TranslatableComponent(s, pLivingEntity.getDisplayName());
    }

    /**
     * Returns true if the damage is fire based.
     */
    public boolean isFire() {
        return this.isFireSource;
    }

    public boolean isNoAggro() {
        return this.noAggro;
    }

    /**
     * Return the name of damage type.
     */
    public String getMsgId() {
        return this.msgId;
    }

    /**
     * Set whether this damage source will have its damage amount scaled based on the current difficulty.
     */
    public DamageSource setScalesWithDifficulty() {
        this.scalesWithDifficulty = true;
        return this;
    }

    /**
     * Return whether this damage source will have its damage amount scaled based on the current difficulty.
     */
    public boolean scalesWithDifficulty() {
        return this.scalesWithDifficulty;
    }

    /**
     * Returns true if the damage is magic based.
     */
    public boolean isMagic() {
        return this.isMagic;
    }

    /**
     * Define the damage type as magic based.
     */
    public DamageSource setMagic() {
        this.isMagic = true;
        return this;
    }

    public boolean isFall() {
        return this.isFall;
    }

    public DamageSource setIsFall() {
        this.isFall = true;
        return this;
    }

    public boolean isCreativePlayer() {
        Entity entity = this.getEntity();
        return entity instanceof Player && ((Player)entity).getAbilities().instabuild;
    }

    /**
     * Gets the location from which the damage originates.
     */
    @Nullable
    public Vec3 getSourcePosition() {
        return null;
    }
}
