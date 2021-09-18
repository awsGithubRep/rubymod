package com.dmc.rubymod.item;

import net.minecraft.item.Food;
import net.minecraft.item.Rarity;
import net.minecraft.item.SimpleFoiledItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RubyApple extends SimpleFoiledItem {
    public RubyApple() {
        super(new SimpleFoiledItem.Properties().group(ModItemGroup.RUBYMOD_GROUP)
                .rarity(Rarity.EPIC)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(10.0f)
                        .effect(new EffectInstance(Effects.ABSORPTION, 2400, 4), 1)
                        .effect(new EffectInstance(Effects.REGENERATION, 800, 4), 1)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0), 1)
                        .effect(new EffectInstance(Effects.RESISTANCE, 6000, 1), 1)
                        .effect(new EffectInstance(Effects.JUMP_BOOST, 1200, 2), 1)
                        .effect(new EffectInstance(Effects.STRENGTH, 1100,2),1)
                        .setAlwaysEdible()
                        .build()));
    }
}
