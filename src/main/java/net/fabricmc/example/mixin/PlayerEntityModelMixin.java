package net.fabricmc.example.mixin;

import net.fabricmc.example.PlayerLimbInterface;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntityModel.class)
public abstract class PlayerEntityModelMixin implements PlayerLimbInterface
{


    private ModelPart rootPart;
    private String name;
    private boolean decider;

    @Inject(at = @At("TAIL"), method = "<init>")
    private void assignRoot(ModelPart root, boolean thinArms, CallbackInfo ci)
    {
        this.rootPart = root;
    }


    @Override
    public void setSpecificVisible(boolean decider, String name)
    {
        if(name != null) {
            this.name = name;
            this.decider = decider;
            ModelPart modelPart = rootPart.getChild(name);
            modelPart.visible = decider;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getDecider() {
        return decider;
    }
}
