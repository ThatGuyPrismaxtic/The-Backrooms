package net.prismaxtic.thebackrooms.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.prismaxtic.thebackrooms.TheBackrooms;

public class ModBlocks {
    //Dupe this to add blocks
    public static final Block BACKROOMS_LEVEL_0_WALL = registerBlock("backrooms_level_0_wall",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).strength(-1.0F, 3600000.0F).dropsNothing().allowsSpawning(Blocks::never)));

    public static final Block BACKROOMS_LEVEL_0_WALL_BOTTOM = registerBlock("backrooms_level_0_wall_bottom",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).strength(-1.0F, 3600000.0F).dropsNothing().allowsSpawning(Blocks::never)));

    public static final Block BACKROOMS_LEVEL_0_CEILING = registerBlock("backrooms_level_0_ceiling",
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF).strength(-1.0F, 3600000.0F).dropsNothing().allowsSpawning(Blocks::never)));

    public static final Block BACKROOMS_LEVEL_0_CARPET = registerBlock("backrooms_level_0_carpet",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD).strength(-1.0F, 3600000.0F).dropsNothing().allowsSpawning(Blocks::never)));

    public static final Block BACKROOMS_LEVEL_0_LIGHT = registerBlock("backrooms_level_0_light",
            new Block(FabricBlockSettings.copyOf(Blocks.LANTERN).strength(-1.0F, 3600000.0F).dropsNothing().allowsSpawning(Blocks::never).luminance(12)));

    public static final Block BACKROOMS_ALMONDWATER_BLOCK = registerBlock("backrooms_almondwater_block",
            new Block(AbstractBlock.Settings.create().noBlockBreakParticles().sounds(BlockSoundGroup.BONE).noCollision().strength(0f, 0f)));

    public static final Block BACKROOMS_VOID = registerBlock("backrooms_void",
            new Block(AbstractBlock.Settings.create().noCollision().dropsNothing()));

    //End
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TheBackrooms.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TheBackrooms.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TheBackrooms.LOGGER.info("Registering ModBlocks for " + TheBackrooms.MOD_ID);
    }
}
