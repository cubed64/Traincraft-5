package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.library.GuiIDs;

public class CA11 extends AbstractPassengerCar
{
    public CA11(World world) {
        super(world);
        textureDescriptionMap.put(0, "UP");
        textureDescriptionMap.put(1, "WP");
        textureDescriptionMap.put(2, "FNCC (Regal)");
        textureDescriptionMap.put(3, "Generic");
        textureDescriptionMap.put(4, "GLC");
        textureDescriptionMap.put(5, "");
        textureDescriptionMap.put(6, "");
        textureDescriptionMap.put(7, "");
        textureDescriptionMap.put(8, "");
        textureDescriptionMap.put(9, "");
    }

    public CA11(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

    @Override
    public void pressKey(int i) {
        if(locked && riddenByEntity != null && riddenByEntity instanceof EntityPlayer&& !((EntityPlayer)riddenByEntity).getDisplayName().toLowerCase().equals(this.trainOwner.toLowerCase())){
            return;
        }
        if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.CRAFTING_CART, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }

    }

    @Override
    public double getAdditionalYOffset()
    {
        return -0.1F;
    }

    @Override
    public float getOptimalLinkingDistance()
    {
        return 2.1F;
    }
}