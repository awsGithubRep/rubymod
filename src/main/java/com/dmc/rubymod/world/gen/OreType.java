package com.dmc.rubymod.world.gen;

import com.dmc.rubymod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    RUBY(Lazy.of(ModBlocks.RUBY_ORE), 3,5,13,3),
    MALACHITE(Lazy.of(ModBlocks.MALACHITE_ORE), 7,5,36,8),
    CRYSTAL(Lazy.of(ModBlocks.CRYSTAL_ORE), 5,5,29,4),
    MARBLE(Lazy.of(ModBlocks.MARBLE_ORE),6,5,39,5);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int count;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int count) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.count = count;
    }
    public Lazy<Block> getBlock() {
        return block;
    }
    public int getMaxVeinSize() {
        return maxVeinSize;
    }
    public int getMinHeight() {
        return minHeight;
    }
    public int getMaxHeight() {
        return maxHeight;
    }
    public int getCount() {
        return count;
    }
    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if(block == ore.block){
                return ore;
            }
        }
        return null;
    }
}
