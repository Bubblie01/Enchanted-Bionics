package io.github.bubblie.enchantedbionics.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen;
import net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;

import java.util.Set;

@Environment(EnvType.CLIENT)
public class GrinderScreen extends AbstractFurnaceScreen<GrinderScreenHandler> {
	private static final Identifier TEXTURE = new Identifier("textures/gui/container/furnace.png");

	public GrinderScreen(GrinderScreenHandler handler, PlayerInventory inventory, Text title) {
		super(handler, new RecipeBookScreen() ,inventory, title, TEXTURE);
	}

	@Environment(EnvType.CLIENT)
	protected static class RecipeBookScreen extends AbstractFurnaceRecipeBookScreen {
		private static final Text TOGGLE_GRINDABLE_RECIPES_TEXT = new TranslatableText("gui.recipebook.toggleRecipes.grind");

		@Override
		protected Text getToggleCraftableButtonText() {
			return TOGGLE_GRINDABLE_RECIPES_TEXT;
		}

		@Override
		protected Set<Item> getAllowedFuels() {
			return AbstractFurnaceBlockEntity.createFuelTimeMap().keySet();
		}
	}
}
