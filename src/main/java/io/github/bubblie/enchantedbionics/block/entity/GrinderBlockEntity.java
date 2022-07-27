package io.github.bubblie.enchantedbionics.block.entity;

import io.github.bubblie.enchantedbionics.EnchantedBionics;
import io.github.bubblie.enchantedbionics.registry.EnchantedBionicsRegistry;
import io.github.bubblie.enchantedbionics.screen.GrinderScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class GrinderBlockEntity extends AbstractFurnaceBlockEntity {
	public GrinderBlockEntity(BlockPos pos, BlockState state) {
		super(EnchantedBionicsRegistry.GRINDER_BLOCK_ENTITY, pos, state, EnchantedBionics.GRINDING_RECIPE_TYPE);
	}

	@Override
	protected Text getContainerName() {
		return Text.translatable("container.grinder");
	}

	@Override
	protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
		return new GrinderScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
	}
}
