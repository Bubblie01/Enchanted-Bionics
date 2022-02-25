package io.github.bubblie.enchantedbionics.registry;

import io.github.bubblie.enchantedbionics.EnchantedBionics;
import io.github.bubblie.enchantedbionics.screen.GrinderScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;

public class EnchantedBionicsScreenHandlers {
	public static final ScreenHandlerType<GrinderScreenHandler> GRINDER = ScreenHandlerRegistry.registerSimple(
			EnchantedBionics.id("grinder"),
			GrinderScreenHandler::new
	);
}
