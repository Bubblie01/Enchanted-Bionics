package io.github.bubblie.enchantedbionics;

import com.github.aws404.booking_it.BookingIt;
import io.github.bubblie.enchantedbionics.recipe.GrindingRecipe;
import io.github.bubblie.enchantedbionics.registry.EnchantedBionicsBiomesRegistry;
import io.github.bubblie.enchantedbionics.registry.EnchantedBionicsRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnchantedBionics implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("Enchanted-Bionics");
	public static final String MOD_ID = "enchantedbionics";

	public static final RecipeType<GrindingRecipe> GRINDING_RECIPE_TYPE = Registry.register(
			Registry.RECIPE_TYPE, id("grinding"),
			new RecipeType<>() {
				@Override
				public String toString() {
					return stringId("grinding");
				}
			}
	);

	public static final CookingRecipeSerializer<GrindingRecipe> GRINDING_RECIPE_SERIALIZER = Registry.register(
			Registry.RECIPE_SERIALIZER,
			id("grinding"),
			new CookingRecipeSerializer<>(GrindingRecipe::new, 100)
	);

	public static final RecipeBookCategory GRINDING_RECIPE_BOOK_CATEGORY = BookingIt.getCategory("GRINDING");

	/**
	 * Create an identifier with the mod ID as the namespace.
	 * @param path the identifier's path
	 * @return the identifer
	 */
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}

	/**
	 * Create a string identifier with the mod Id as the namespace.
	 * @param path the identifier's path
	 * @return the string identifier
	 */
	public static String stringId(String path) {
		return MOD_ID + ":" + path;
	}

	@Override
	public void onInitialize() {
		EnchantedBionicsRegistry.init();
		EnchantedBionicsBiomesRegistry.init();
	}
}
