package com.dmc.rubymod.util;

import com.dmc.rubymod.RubyMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RubyMod.MOD_ID);
    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(RubyMod.MOD_ID, name)));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
    // Crystal
    public static final RegistryObject<SoundEvent> CRYSTAL_BREAK =
            registerSoundEvent("crystal_break");
    public static final RegistryObject<SoundEvent> CRYSTAL_PLACE =
            registerSoundEvent("crystal_place");
    public static final RegistryObject<SoundEvent> CRYSTAL_STEP =
            registerSoundEvent("crystal_step");
    public static final RegistryObject<SoundEvent> CRYSTAL_FALL =
            registerSoundEvent("crystal_fall");
    public static final RegistryObject<SoundEvent> CRYSTAL_HIT =
            registerSoundEvent("crystal_hit");
    // Marble
    public static final RegistryObject<SoundEvent> MARBLE_BREAK =
            registerSoundEvent("marble_break");
    public static final RegistryObject<SoundEvent> MARBLE_PLACE =
            registerSoundEvent("marble_place");
    public static final RegistryObject<SoundEvent> MARBLE_STEP =
            registerSoundEvent("marble_step");
    public static final RegistryObject<SoundEvent> MARBLE_FALL =
            registerSoundEvent("marble_fall");
    public static final RegistryObject<SoundEvent> MARBLE_HIT =
            registerSoundEvent("marble_hit");

}
