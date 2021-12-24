package net.fabricmc.example;


import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModelPartNames;

public interface PlayerLimbInterface
{


     void setSpecificVisible(boolean decider, String name);
     String getName();
     boolean getDecider();

}
