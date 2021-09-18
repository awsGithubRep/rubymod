package com.dmc.rubymod.block;

import com.dmc.rubymod.util.ModSoundEvents;
import net.minecraft.block.SoundType;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.util.ForgeSoundType;
import java.util.function.Supplier;

public class ModSoundType extends ForgeSoundType {
    public static final SoundType CRYSTAL = new ForgeSoundType(1.0F, 1.5F, ModSoundEvents.CRYSTAL_BREAK, ModSoundEvents.CRYSTAL_STEP, ModSoundEvents.CRYSTAL_PLACE, ModSoundEvents.CRYSTAL_HIT, ModSoundEvents.CRYSTAL_FALL);
    public ModSoundType(float volumeIn,
                        float pitchIn,
                        Supplier<SoundEvent> breakSoundIn,
                        Supplier<SoundEvent> stepSoundIn,
                        Supplier<SoundEvent> placeSoundIn,
                        Supplier<SoundEvent> hitSoundIn, 
                        Supplier<SoundEvent> fallSoundIn) {
        super(volumeIn, pitchIn, breakSoundIn, stepSoundIn, placeSoundIn, hitSoundIn, fallSoundIn);
    }
}
