package io.github.bubblie.enchantedbionics.world.gen.feature;

import net.minecraft.util.Holder;
import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.InSquarePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil;

public class EnchantedBionicsVegetationPlacedFeatures {

	public static final Holder<PlacedFeature> PATCH_MYSTIC_JASMINE = PlacedFeatureUtil.m_yiesbcvk("patch_mystic_jasmine",
			EnchantedBionicsVegetationConfiguredFeatures.PATCH_MYSTIC_JASMINE,
			RarityFilterPlacementModifier.create(36),
			InSquarePlacementModifier.getInstance(),
			PlacedFeatureUtil.MOTION_BLOCKING_HEIGHTMAP,
			BiomePlacementModifier.getInstance());
}
