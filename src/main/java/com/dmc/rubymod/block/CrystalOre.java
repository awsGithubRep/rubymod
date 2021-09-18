package com.dmc.rubymod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class CrystalOre extends OreBlock {
    public CrystalOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .harvestLevel(2)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(3f, 2f)
                .sound(SoundType.STONE));
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return 3;
    }

    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        float chance = 0.45f;
        if (chance < rand.nextFloat()) {
            worldIn.addParticle(ParticleTypes.END_ROD, pos.getX() + rand.nextDouble(),
                    pos.getY() + 0D, pos.getZ() + rand.nextDouble(),
                    0.0d, -0.05d, 0.0d);
        }
    }
}
