package io.github.bubblie.enchantedbionics.registry;

import io.github.bubblie.enchantedbionics.item.FunnierItem;
import io.github.bubblie.enchantedbionics.item.FunnyItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.bubblie.enchantedbionics.EnchantedBionics.MOD_ID;


public class EnchantedBionicsRegistry {

	public static final Item FUNNY_ITEM = register("funny_item", new FunnyItem(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item FUNNIER_ITEM = register("funnier_item", new FunnierItem(new Item.Settings().group(ItemGroup.MISC)));

	// These are helper methods to help with adding custom item and things to the mod. Add a new method as and when needed
	/**
	 * Create a Block and add it to the game
	 * @param id The custom Block ID
	 * @param block The Block you're registering
	 * @return The created and registered Block
	 */
	private static Block register(String id, Block block) {
		Identifier identifier = new Identifier(MOD_ID, id);
		return Registry.register(Registry.BLOCK, identifier, block);
	}

	/**
	 * Create a BlockItem to assign to a block
	 * @param id The custom BlockItem ID
	 * @param blockItem The BlockItem you're registering
	 * @return The created and registered BlockItem
	 */
	private static BlockItem register(String id, BlockItem blockItem) {
		Identifier identifier = new Identifier(MOD_ID, id);
		return Registry.register(Registry.ITEM, identifier, blockItem);
	}

	/**
	 * Create an Item and add it to the game
	 * @param id The custom Item ID
	 * @param item The Item you're registering
	 * @return The created and registered Item
	 */
	private static Item register(String id, Item item) {
		Identifier identifier = new Identifier(MOD_ID, id);
		return Registry.register(Registry.ITEM, identifier, item);
	}

	/**
	 * Initialize the class
	 */
	public static void init() {}
}
