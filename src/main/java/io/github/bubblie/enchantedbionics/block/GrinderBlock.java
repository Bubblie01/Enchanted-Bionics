package io.github.bubblie.enchantedbionics.block;

import io.github.bubblie.enchantedbionics.block.entity.GrinderBlockEntity;
import io.github.bubblie.enchantedbionics.registry.EnchantedBionicsRegistry;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class GrinderBlock extends AbstractFurnaceBlock {

	public GrinderBlock(Settings settings) {
		super(settings);
	}

	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return EnchantedBionicsRegistry.GRINDER_BLOCK_ENTITY.instantiate(pos, state);
	}

	@Nullable
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
		return checkType(world, type, EnchantedBionicsRegistry.GRINDER_BLOCK_ENTITY);
	}

	@Override
	protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity instanceof GrinderBlockEntity) {
			player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
			// TODO Somehow get around the Registry Freeze in 1.18.2 to add the stat
			//player.incrementStat(EnchantedBionicsStats.INTERACT_WITH_GRINDER);
		}
	}
}
