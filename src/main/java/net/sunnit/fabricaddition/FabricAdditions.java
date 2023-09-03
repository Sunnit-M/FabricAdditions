package net.sunnit.fabricaddition;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricAdditions implements ModInitializer {

	public  static  final String Mod_ID = "fabricadditions_sunnit";
	public static final Logger LOGGER = LoggerFactory.getLogger("fabric-addition");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}