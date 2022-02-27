package io.github.bubblie.enchantedbionics.client;

import io.github.bubblie.enchantedbionics.registry.EnchantedBionicsScreenHandlers;
import io.github.bubblie.enchantedbionics.screen.GrinderScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class EnchantedBionicsClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ScreenRegistry.register(EnchantedBionicsScreenHandlers.GRINDER, GrinderScreen::new);
	}
}
