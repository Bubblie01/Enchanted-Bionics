package io.github.bubblie.enchantedbionics;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnchantedBionics implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("Enchanted-Bionics");
	public static final FunnyItem FUNNY_ITEM = new FunnyItem(new Item.Settings().group(ItemGroup.MISC));
	public static final FunnierItem FUNNIER_ITEM = new FunnierItem(new Item.Settings().group(ItemGroup.MISC));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("enchantedbionics", "funny_item"), FUNNY_ITEM);
		Registry.register(Registry.ITEM, new Identifier("enchantedbionics", "funnier_item"), FUNNIER_ITEM);
	}
}
