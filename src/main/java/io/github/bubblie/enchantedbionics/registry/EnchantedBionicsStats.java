package io.github.bubblie.enchantedbionics.registry;

import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnchantedBionicsStats {
	public static final Identifier INTERACT_WITH_GRINDER = register("interact_with_grinder", StatFormatter.DEFAULT);

	private static Identifier register(String id, StatFormatter formatter) {
		Identifier identifier = new Identifier(id);
		Registry.register(Registry.CUSTOM_STAT, identifier, identifier);
		Stats.CUSTOM.getOrCreateStat(identifier, formatter);
		return identifier;
	}
}
