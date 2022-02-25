package io.github.bubblie.enchantedbionics.registry;

import io.github.bubblie.enchantedbionics.EnchantedBionics;
import io.github.bubblie.enchantedbionics.block.GrinderBlock;
import io.github.bubblie.enchantedbionics.block.entity.GrinderBlockEntity;
import io.github.bubblie.enchantedbionics.item.FunnierItem;
import io.github.bubblie.enchantedbionics.item.FunnyItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;


@SuppressWarnings({"unused", "SameParameterValue"})
public class EnchantedBionicsRegistry {

	/*
	Blocks
	 */
	public static final Block GRINDER_BLOCK = register("grinder", new GrinderBlock(FabricBlockSettings.of(Material.STONE).strength(3.5f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static final Block MYSTIC_JASMINE_FLOWER = register("mystic_jasmine", new FlowerBlock(StatusEffects.REGENERATION,
			7, FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));

	/*
	Block Entities
	 */
	public static final BlockEntityType<GrinderBlockEntity> GRINDER_BLOCK_ENTITY = register("grinder", GrinderBlockEntity::new, GRINDER_BLOCK);

	/*
	Block Items
	 */
	public static final BlockItem GRINDER_ITEM = register("grinder", new BlockItem(GRINDER_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
	public static final BlockItem MYSTIC_JASMINE_ITEM = register("mystic_jasmine", new BlockItem(MYSTIC_JASMINE_FLOWER,
			new Item.Settings().group(ItemGroup.MISC)));

	/*
	Items
	 */
	public static final Item FUNNY_ITEM = register("funny_item", new FunnyItem(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item FUNNIER_ITEM = register("funnier_item", new FunnierItem(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item MYSTIC_JASMINE_POWDER = register("mystic_jasmine_powder", new Item(new Item.Settings().group(ItemGroup.MISC)));


	// These are helper methods to help with adding custom item and things to the mod. Add a new method as and when needed
	/**
	 * Create a Block and register it
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
		return Registry.register(Registry.ITEM, EnchantedBionics.id(id), blockItem);
	}

	/**
	 * Create an Item and register it
	 * @param id The custom Item ID
	 * @param item The Item you're registering
	 * @return The created and registered Item
	 */
	private static Item register(String id, Item item) {
		return Registry.register(Registry.ITEM, EnchantedBionics.id(id), item);
	}

	/**
	 * Create a BlockEntity and register it
	 * @param id The custom BlockEntity ID
	 * @param factory The BlockEntity class of the Block you want to make a BlockEntity for
	 * @param block The Block to create an entity for
	 * @return The created BlockEntity
	 */

	private static <T extends BlockEntity> BlockEntityType<T> register(String id, FabricBlockEntityTypeBuilder.Factory<T> factory, Block... block) {
		return Registry.register(Registry.BLOCK_ENTITY_TYPE, EnchantedBionics.id(id), FabricBlockEntityTypeBuilder.create(factory, block).build());
	}

	/**
	 * Initialize the class
	 */
	public static void init() { }
}
