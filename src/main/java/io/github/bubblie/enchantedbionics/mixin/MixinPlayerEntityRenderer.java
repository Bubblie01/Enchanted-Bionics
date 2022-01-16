package io.github.bubblie.enchantedbionics.mixin;


import io.github.bubblie.enchantedbionics.item.PlayerLimbInterface;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntityRenderer.class)
public class MixinPlayerEntityRenderer extends LivingEntityRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> {
    public PlayerEntityModel<AbstractClientPlayerEntity> playerEntityModel = this.getModel();

    public MixinPlayerEntityRenderer(EntityRendererFactory.Context ctx, PlayerEntityModel<AbstractClientPlayerEntity> model, float shadowRadius) {
        super(ctx, model, shadowRadius);
    }

    @Inject(at = @At("TAIL"), method = "setModelPose")
    public void mixinToPose(CallbackInfo ci) {
        String name = ((PlayerLimbInterface) playerEntityModel).getName();
        boolean decider = ((PlayerLimbInterface) playerEntityModel).getDecider();
        ((PlayerLimbInterface) playerEntityModel).setSpecificVisible(decider, name);
    }

    @Override
    public Identifier getTexture(AbstractClientPlayerEntity entity) {
        return entity.getSkinTexture();
    }


}
