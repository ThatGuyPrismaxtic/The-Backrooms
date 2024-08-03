package net.prismaxtic.thebackrooms.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.prismaxtic.thebackrooms.block.ModBlocks;
import net.prismaxtic.thebackrooms.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOMS_LEVEL_0_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        //Dupe to make new

        itemModelGenerator.register(ModItems.ALMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALMONDWATER, Models.GENERATED);
    }
}
