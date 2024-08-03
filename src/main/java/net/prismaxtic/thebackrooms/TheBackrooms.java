package net.prismaxtic.thebackrooms;

import net.fabricmc.api.ModInitializer;

import net.prismaxtic.thebackrooms.block.ModBlocks;
import net.prismaxtic.thebackrooms.item.ModItemGroups;
import net.prismaxtic.thebackrooms.item.ModItems;
import net.prismaxtic.thebackrooms.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheBackrooms implements ModInitializer {
	public static final String MOD_ID = "the-backrooms";
    public static final Logger LOGGER = LoggerFactory.getLogger("the-backrooms");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
	}
}