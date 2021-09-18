package com.dmc.rubymod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class MarbleOre extends OreBlock {
    public MarbleOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .harvestLevel(2)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(3.2f,4f)
                .sound(ModSoundType.MARBLE));
    }
    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return 1;
    }
}
