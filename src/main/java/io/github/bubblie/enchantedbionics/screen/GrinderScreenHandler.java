package io.github.bubblie.enchantedbionics.screen;

import io.github.bubblie.enchantedbionics.EnchantedBionics;
import io.github.bubblie.enchantedbionics.registry.EnchantedBionicsScreenHandlers;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;

public class GrinderScreenHandler extends AbstractFurnaceScreenHandler {
	public GrinderScreenHandler(int syncId, PlayerInventory playerInventory) {
		super(EnchantedBionicsScreenHandlers.GRINDER, EnchantedBionics.GRINDING_RECIPE_TYPE, EnchantedBionics.GRINDING_RECIPE_BOOK_CATEGORY, syncId, playerInventory);
	}

	public GrinderScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
		super(EnchantedBionicsScreenHandlers.GRINDER, EnchantedBionics.GRINDING_RECIPE_TYPE, EnchantedBionics.GRINDING_RECIPE_BOOK_CATEGORY, syncId, playerInventory, inventory, propertyDelegate);
	}
}
