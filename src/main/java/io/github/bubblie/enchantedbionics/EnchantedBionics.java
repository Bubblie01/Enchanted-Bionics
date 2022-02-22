package io.github.bubblie.enchantedbionics;

import io.github.bubblie.enchantedbionics.registry.EnchantedBionicsBiomesRegistry;
import io.github.bubblie.enchantedbionics.registry.EnchantedBionicsRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnchantedBionics implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("Enchanted-Bionics");
	public static final String MOD_ID = "enchantedbionics";
	@Override
	public void onInitialize() {
		EnchantedBionicsRegistry.init();
		EnchantedBionicsBiomesRegistry.init();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
