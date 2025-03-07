package org.mythical_studios.sowing;

import net.fabricmc.api.ModInitializer;

import org.mythical_studios.sowing.init.ModItemGroup;
import org.mythical_studios.sowing.init.ModItems;
import org.mythical_studios.sowing.init.itemGrouping.ModUpgradeTemplates;
import org.mythical_studios.sowing.init.itemGrouping.ModYarn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SowingKnits implements ModInitializer {
	public static final String MOD_ID = "sowing";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {



		ModItems.init();
		ModYarn.init();
		ModUpgradeTemplates.init();

		ModItemGroup.init();

	}
}