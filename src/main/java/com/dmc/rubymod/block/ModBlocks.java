package com.dmc.rubymod.block;

import com.dmc.rubymod.RubyMod;
import com.dmc.rubymod.item.ModItemGroup;
import com.dmc.rubymod.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, RubyMod.MOD_ID);
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.RUBYMOD_GROUP)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    // Ruby
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(3)
                    .setRequiresTool()
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(5f,6f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", RubyOre::new);
    // Malachite
    public static final RegistryObject<Block> MALACHITE_BLOCK = registerBlock("malachite_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2)
                    .setRequiresTool()
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3.5f,3f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<Block> MALACHITE_ORE = registerBlock("malachite_ore", MalachiteOre::new);
    // Malachite Stairs/Slabs
    public static final RegistryObject<Block> MALACHITE_STAIRS = registerBlock("malachite_stairs",
            () -> new StairsBlock(() -> MALACHITE_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2)
                    .setRequiresTool()
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3.5f,3f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<Block> MALACHITE_SLAB = registerBlock("malachite_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2)
                    .setRequiresTool()
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3.5f,3f)
                    .sound(SoundType.METAL)));
    // Malachite Wall
    public static final RegistryObject<Block> MALACHITE_WALL = registerBlock("malachite_wall",
            () -> new WallBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2)
                    .setRequiresTool()
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3.5f,3f)
                    .sound(SoundType.METAL)));
    // Marble
    public static final RegistryObject<Block> MARBLE_BLOCK = registerBlock("marble_block", MarbleBlock::new);
    public static final RegistryObject<Block> POLISHED_MARBLE_BLOCK = registerBlock("polished_marble_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .setRequiresTool()
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.5f,3f)
                    .sound(SoundType.STONE)));
    // Marble Stairs/Slabs
    public static final RegistryObject<Block> MARBLE_STAIRS = registerBlock("marble_stairs",
            () -> new StairsBlock(() -> MARBLE_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK)
                            .harvestLevel(1)
                            .setRequiresTool()
                            .harvestTool(ToolType.PICKAXE)
                            .hardnessAndResistance(2.5f,3f)
                            .sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_MARBLE_STAIRS = registerBlock("polished_marble_stairs",
            () -> new StairsBlock(() -> MARBLE_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .setRequiresTool()
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.5f,3f)
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_SLAB = registerBlock("marble_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .setRequiresTool()
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.5f,3f)
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_MARBLE_SLAB = registerBlock("polished_marble_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .setRequiresTool()
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.5f,3f)
                    .sound(SoundType.STONE)));
    // Marble Wall
    public static final RegistryObject<Block> MARBLE_WALL = registerBlock("marble_wall",
            () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .setRequiresTool()
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.5f,3f)
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_MARBLE_WALL = registerBlock("polished_marble_wall",
            () -> new WallBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(1)
                    .setRequiresTool()
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(2.5f,3f)
                    .sound(SoundType.STONE)));
    // Crystal
    public static final RegistryObject<Block> CRYSTAL_BLOCK = registerBlock("crystal_block", CrystalBlock::new);
    public static final RegistryObject<Block> CRYSTAL_ORE = registerBlock("crystal_ore", CrystalOre::new);
}
