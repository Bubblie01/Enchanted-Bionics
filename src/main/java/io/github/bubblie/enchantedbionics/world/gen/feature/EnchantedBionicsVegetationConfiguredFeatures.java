package io.github.bubblie.enchantedbionics.world.gen.feature;

import io.github.bubblie.enchantedbionics.EnchantedBionics;
import io.github.bubblie.enchantedbionics.registry.EnchantedBionicsRegistry;
import net.minecraft.util.Holder;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.feature.SimpleBlockFeatureConfig;
import net.minecraft.world.gen.feature.util.ConfiguredFeatureUtil;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class EnchantedBionicsVegetationConfiguredFeatures {

	public static final Holder<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PATCH_MYSTIC_JASMINE = ConfiguredFeatureUtil.register(
			EnchantedBionics.id("patch_mystic_jasmine").toString(),
			Feature.RANDOM_PATCH,
			ConfiguredFeatureUtil.createRandomPatchFeatureConfig(
					Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(EnchantedBionicsRegistry.MYSTIC_JASMINE))
			)
	);
}
