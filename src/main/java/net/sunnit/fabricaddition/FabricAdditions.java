package net.sunnit.fabricaddition;

import net.fabricmc.api.ModInitializer;

import net.sunnit.fabricaddition.block.ModBlocks;
import net.sunnit.fabricaddition.item.ModItemGroups;
import net.sunnit.fabricaddition.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricAdditions implements ModInitializer {

	public  static  final String Mod_ID = "fabricaddition";
	public static final Logger LOGGER = LoggerFactory.getLogger("fabric-addition");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}