package com.pouffy.mw_core.content.particle;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import com.simibubi.create.AllParticleTypes;
import com.simibubi.create.content.curiosities.bell.BasicParticleData;
import com.simibubi.create.content.curiosities.bell.CustomRotationParticle;
import com.simibubi.create.content.curiosities.bell.SoulPulseEffect;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.util.Mth;

public class KermitamineParticles extends CustomRotationParticle {
    public static Object Provider;
    private final SpriteSet animatedSprite;
    private boolean stoppedByCollision;
    private static final double MAXIMUM_COLLISION_VELOCITY_SQUARED = Mth.square(100.0D);

    protected int startTicks;
    protected int endTicks;
    protected int numLoops;
    protected int firstStartFrame = 0;
    protected int startFrames = 17;
    protected int firstLoopFrame = 17;
    protected int loopFrames = 16;
    protected int firstEndFrame = 33;
    protected int endFrames = 20;
    protected KermitamineParticles.AnimationStage animationStage;
    protected int totalFrames = 53;
    protected int ticksPerFrame = 2;
    protected boolean isPerimeter = false;
    protected boolean isExpandingPerimeter = false;
    protected boolean isVisible = true;
    protected int perimeterFrames = 8;

    public KermitamineParticles(ClientLevel worldIn, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet, ParticleOptions data) {
        super(worldIn, x, y, z, spriteSet, 0.0F);
        this.animatedSprite = spriteSet;
        this.quadSize = 0.5F;
        this.setSize(this.quadSize, this.quadSize);
        this.loopLength = this.loopFrames + (int)(this.random.nextFloat() * 5.0F - 4.0F);
        this.startTicks = this.startFrames + (int)(this.random.nextFloat() * 5.0F - 4.0F);
        this.endTicks = this.endFrames + (int)(this.random.nextFloat() * 5.0F - 4.0F);
        this.numLoops = (int)(1.0F + this.random.nextFloat() * 2.0F);
        this.setFrame(0);
        this.stoppedByCollision = true;
        this.mirror = this.random.nextBoolean();
        this.isPerimeter = data instanceof KermitamineParticles.PerimeterData;
        this.isExpandingPerimeter = data instanceof KermitamineParticles.ExpandingPerimeterData;
        this.animationStage = (KermitamineParticles.AnimationStage)(!this.isPerimeter ? new KermitamineParticles.StartAnimation(this) : new KermitamineParticles.PerimeterAnimation(this));
        if (this.isPerimeter) {
            this.yo = y -= 0.4921875;
            this.totalFrames = this.perimeterFrames;
            this.isVisible = false;
        }

    }

    public void tick() {
        this.animationStage.tick();
        this.animationStage = this.animationStage.getNext();
        BlockPos pos = new BlockPos(this.x, this.y, this.z);
        if (this.animationStage == null) {
            this.remove();
        }
        else if (this.isPerimeter) {
            this.isVisible = false;
        }

    }

    public void render(VertexConsumer builder, Camera camera, float partialTicks) {
        if (this.isVisible) {
            super.render(builder, camera, partialTicks);
        }
    }

    public void setFrame(int frame) {
        if (frame >= 0 && frame < this.totalFrames) {
            this.setSprite(this.animatedSprite.get(frame, this.totalFrames));
        }

    }

    public Quaternion getCustomRotation(Camera camera, float partialTicks) {
        return this.isPerimeter ? Vector3f.XP.rotationDegrees(90.0F) : new Quaternion(0.0F, -camera.getYRot(), 0.0F, true);
    }

    public static class PerimeterData extends BasicParticleData<KermitamineParticles> {
        public PerimeterData() {
        }

        public BasicParticleData.IBasicParticleFactory<KermitamineParticles> getBasicFactory() {
            return (worldIn, x, y, z, vx, vy, vz, spriteSet) -> {
                return new KermitamineParticles(worldIn, x, y, z, vx, vy, vz, spriteSet, this);
            };
        }

        public ParticleType<?> getType() {
            return AllParticleTypes.SOUL_PERIMETER.get();
        }
    }

    public static class ExpandingPerimeterData extends KermitamineParticles.PerimeterData {
        public ExpandingPerimeterData() {
        }

        public ParticleType<?> getType() {
            return AllParticleTypes.SOUL_EXPANDING_PERIMETER.get();
        }
    }

    public static class StartAnimation extends KermitamineParticles.AnimationStage {
        public StartAnimation(KermitamineParticles particle) {
            super(particle);
        }

        public void tick() {
            super.tick();
            this.particle.setFrame(this.particle.firstStartFrame + (int)(this.getAnimAge() / (float)this.particle.startTicks * (float)this.particle.startFrames));
        }

        public KermitamineParticles.AnimationStage getNext() {
            return (KermitamineParticles.AnimationStage)(this.animAge < this.particle.startTicks ? this : new KermitamineParticles.LoopAnimation(this.particle));
        }
    }

    public static class PerimeterAnimation extends KermitamineParticles.AnimationStage {
        public PerimeterAnimation(KermitamineParticles particle) {
            super(particle);
        }

        public void tick() {
            super.tick();
            this.particle.setFrame((int)this.getAnimAge() % this.particle.perimeterFrames);
        }

        public KermitamineParticles.AnimationStage getNext() {
            return this.animAge < (this.particle.isExpandingPerimeter ? 8 : this.particle.startTicks + this.particle.endTicks + this.particle.numLoops * this.particle.loopLength) ? this : null;
        }
    }

    public abstract static class AnimationStage {
        protected final KermitamineParticles particle;
        protected int ticks;
        protected int animAge;

        public AnimationStage(KermitamineParticles particle) {
            this.particle = particle;
        }

        public void tick() {
            ++this.ticks;
            if (this.ticks % this.particle.ticksPerFrame == 0) {
                ++this.animAge;
            }

        }

        public float getAnimAge() {
            return (float)this.animAge;
        }

        public abstract KermitamineParticles.AnimationStage getNext();
    }

    public static class EndAnimation extends KermitamineParticles.AnimationStage {
        public EndAnimation(KermitamineParticles particle) {
            super(particle);
        }

        public void tick() {
            super.tick();
            this.particle.setFrame(this.particle.firstEndFrame + (int)(this.getAnimAge() / (float)this.particle.endTicks * (float)this.particle.endFrames));
        }

        public KermitamineParticles.AnimationStage getNext() {
            return this.animAge < this.particle.endTicks ? this : null;
        }
    }

    public static class LoopAnimation extends KermitamineParticles.AnimationStage {
        int loops;

        public LoopAnimation(KermitamineParticles particle) {
            super(particle);
        }

        public void tick() {
            super.tick();
            int loopTick = this.getLoopTick();
            if (loopTick == 0) {
                ++this.loops;
            }

            this.particle.setFrame(this.particle.firstLoopFrame + loopTick);
        }

        private int getLoopTick() {
            return this.animAge % this.particle.loopFrames;
        }

        public KermitamineParticles.AnimationStage getNext() {
            return (KermitamineParticles.AnimationStage)(this.loops <= this.particle.numLoops ? this : new KermitamineParticles.EndAnimation(this.particle));
        }
    }

    public static class Data extends BasicParticleData<KermitamineParticles> {
        public Data() {
        }

        public BasicParticleData.IBasicParticleFactory<KermitamineParticles> getBasicFactory() {
            return (worldIn, x, y, z, vx, vy, vz, spriteSet) -> {
                return new KermitamineParticles(worldIn, x, y, z, vx, vy, vz, spriteSet, this);
            };
        }

        public ParticleType<?> getType() {
            return com.pouffy.mw_core.AllParticleTypes.KERMITAMINE.get();
        }
    }
}
