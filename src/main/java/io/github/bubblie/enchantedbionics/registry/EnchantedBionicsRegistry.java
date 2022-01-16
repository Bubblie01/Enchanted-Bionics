package io.github.bubblie.enchantedbionics.registry;

import io.github.bubblie.enchantedbionics.EnchantedBionics;
import io.github.bubblie.enchantedbionics.item.EnchantedBionicsFunnierItem;
import io.github.bubblie.enchantedbionics.item.EnchantedBionicsFunnyItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.bubblie.enchantedbionics.EnchantedBionics.MOD_ID;


public class EnchantedBionicsRegistry {

	/*
	Items
	 */
	public static final Item FUNNY_ITEM = register("funny_item", new EnchantedBionicsFunnyItem(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item FUNNIER_ITEM = register("funnier_item", new EnchantedBionicsFunnierItem(new Item.Settings().group(ItemGroup.MISC)));

	/*
	Plants
	 */
	public static final Block MYSTIC_JASMINE = register("mystic_jasmine", new FlowerBlock(StatusEffects.REGENERATION,
			7, FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));
	public static final BlockItem MYSTIC_JASMINE_ITEM = register("mystic_jasmine", new BlockItem(MYSTIC_JASMINE,
			new Item.Settings().group(ItemGroup.MISC)));

	// These are helper methods to help with adding custom item and things to the mod. Add a new method as and when needed
	/**
	 * Create a Block and add it to the game
	 * @param id The custom Block ID
	 * @param block The Block you're registering
	 * @return The created and registered Block
	 */
	private static Block register(String id, Block block) {
		return Registry.register(Registry.BLOCK, EnchantedBionics.id(id), block);
	}

	/**
	 * Create a BlockItem to assign to a block
	 * @param id The custom BlockItem ID
	 * @param blockItem The BlockItem you're registering
	 * @return The created and registered BlockItem
	 */
	private static BlockItem register(String id, BlockItem blockItem) {
		Identifier identifier = new Identifier(MOD_ID, id);
		return Registry.register(Registry.ITEM, EnchantedBionics.id(id), blockItem);
	}

	/**
	 * Create an Item and add it to the game
	 * @param id The custom Item ID
	 * @param item The Item you're registering
	 * @return The created and registered Item
	 */
	private static Item register(String id, Item item) {
		Identifier identifier = new Identifier(MOD_ID, id);
		return Registry.register(Registry.ITEM, EnchantedBionics.id(id), item);
	}

	/**
	 * Initialize the class
	 */
	public static void init() {}
}
