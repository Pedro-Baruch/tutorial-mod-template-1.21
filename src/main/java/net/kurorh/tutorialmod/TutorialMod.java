package net.kurorh.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.kurorh.tutorialmod.block.ModBlocks;
import net.kurorh.tutorialmod.item.ModItemGroups;
import net.kurorh.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}