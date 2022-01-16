package io.github.bubblie.enchantedbionics.world.gen.feature;

import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.InSquarePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil;

public class EnchantedBionicsVegetationPlacedFeatures {

	public static final PlacedFeature PATCH_MYSTIC_JASMINE = register("patch_mystic_jasmine",
			EnchantedBionicsVegetationConfiguredFeatures.PATCH_MYSTIC_JASMINE.withPlacement(
					CountPlacementModifier.create(3),
					RarityFilterPlacementModifier.create(2),
					InSquarePlacementModifier.getInstance(),
					PlacedFeatureUtil.MOTION_BLOCKING_HEIGHTMAP,
					BiomePlacementModifier.getInstance()
			)
	);

	private static PlacedFeature register(String key, PlacedFeature feature) {
		return Registry.register(BuiltinRegistries.PLACED_FEATURE, key, feature);
	}
}
