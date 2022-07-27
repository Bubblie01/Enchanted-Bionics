package io.github.bubblie.enchantedbionics.recipe;

import io.github.bubblie.enchantedbionics.EnchantedBionics;
import io.github.bubblie.enchantedbionics.registry.EnchantedBionicsRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.util.Identifier;

public class GrindingRecipe extends AbstractCookingRecipe {

	public GrindingRecipe(Identifier id, String group, Ingredient input, ItemStack output, float experience, int cookTime) {
		super(EnchantedBionics.GRINDING_RECIPE_TYPE, id, group, input, output, experience, cookTime);
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return EnchantedBionics.GRINDING_RECIPE_SERIALIZER;
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(EnchantedBionicsRegistry.GRINDER_ITEM);
	}
}
