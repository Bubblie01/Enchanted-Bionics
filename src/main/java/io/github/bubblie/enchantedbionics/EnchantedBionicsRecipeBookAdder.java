package io.github.bubblie.enchantedbionics;

import com.github.aws404.booking_it.RecipeBookAdder;
import io.github.bubblie.enchantedbionics.Recipe.GrindingRecipe;

import java.util.List;

public class EnchantedBionicsRecipeBookAdder implements RecipeBookAdder {
	@Override
	public List<RecipeCategoryOptions> getCategories() {
		return List.of(
				RecipeBookAdder.builder("GRINDING")
						.addGroup("ALL", recipe -> recipe instanceof GrindingRecipe, "enchantedbionics:mystic_jasmine")
						.build()
		);
	}
}
