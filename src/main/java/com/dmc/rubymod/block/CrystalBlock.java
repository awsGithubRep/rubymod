package com.dmc.rubymod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CrystalBlock extends Block {
    public CrystalBlock() {
        super(AbstractBlock.Properties.create(Material.GLASS)
                .harvestLevel(2)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(1.5f,0.5f)
                .sound(ModSoundType.CRYSTAL)
                .notSolid());
    }
}
