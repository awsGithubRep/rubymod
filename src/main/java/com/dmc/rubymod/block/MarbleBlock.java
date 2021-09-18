package com.dmc.rubymod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MarbleBlock extends Block {
    public MarbleBlock() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .harvestLevel(1)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(2.5f,3f)
                .sound(SoundType.STONE));
    }
}
