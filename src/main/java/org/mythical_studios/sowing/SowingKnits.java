package org.mythical_studios.sowing;

import net.fabricmc.api.ModInitializer;

import org.mythical_studios.sowing.init.ModItems;
import org.mythical_studios.sowing.init.yarn.ModYarn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class SowingKnits implements ModInitializer {
	public static final String MOD_ID = "sowing";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {



		ModItems.init();
		ModYarn.init();
		LOGGER.info("Hey, Wild");

	}
}