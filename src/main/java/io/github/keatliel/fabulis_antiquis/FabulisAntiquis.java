package io.github.keatliel.fabulis_antiquis;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.keatliel.fabulis_antiquis.item.Moditems;

public class FabulisAntiquis implements ModInitializer {
	public static final String MOD_ID = "fabulis-antiquis";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Fabulis Antiquis");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Men into monsters, Monsters into myth, Myth into Legends", mod.metadata().name());

		Moditems.registerModitems();
	}
}
