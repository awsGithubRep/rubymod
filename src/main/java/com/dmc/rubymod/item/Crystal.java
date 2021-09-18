package com.dmc.rubymod.item;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.item.SimpleFoiledItem;

public class Crystal extends SimpleFoiledItem {
    public Crystal() {
        super(new SimpleFoiledItem.Properties().group(ModItemGroup.RUBYMOD_GROUP)
                .rarity(Rarity.RARE));
    }
}
