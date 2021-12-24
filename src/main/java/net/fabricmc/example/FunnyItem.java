package net.fabricmc.example;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.*;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.ResourceReloader;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.ClickType;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class FunnyItem extends Item  {
    private int counter = 0;
    PlayerEntityModel playerEntityModel;
    public FunnyItem(Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        if(world.isClient) {
            MinecraftClient client = MinecraftClient.getInstance();
            EntityRenderer renderer = client.getEntityRenderDispatcher().getRenderer((AbstractClientPlayerEntity) client.player);
            PlayerEntityModel playerEntityModel = ((PlayerEntityRenderer) (renderer)).getModel();
            this.playerEntityModel = playerEntityModel;
            (((PlayerLimbInterface) playerEntityModel)).setSpecificVisible(false, EntityModelPartNames.LEFT_ARM);

        }

        return super.use(world, user, hand);

    }

    @Override
    public boolean isUsedOnRelease(ItemStack stack) {
        return super.isUsedOnRelease(stack);
    }

    @Override
    public boolean onClicked(ItemStack stack, ItemStack otherStack, Slot slot, ClickType clickType, PlayerEntity player, StackReference cursorStackReference) {
       if(clickType == ClickType.LEFT) {
           (((PlayerLimbInterface) playerEntityModel)).setSpecificVisible(true, EntityModelPartNames.LEFT_ARM);
       }
        return super.onClicked(stack, otherStack, slot, clickType, player, cursorStackReference);
    }
}
