package io.github.bubblie.enchantedbionics.registry;

import io.github.bubblie.enchantedbionics.world.gen.feature.EnchantedBionicsVegetationPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class EnchantedBionicsBiomesRegistry {

	public static void init() {
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST, BiomeKeys.DARK_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, BuiltinRegistries.PLACED_FEATURE.getKey(EnchantedBionicsVegetationPlacedFeatures.PATCH_MYSTIC_JASMINE).orElseThrow());
	}

}
