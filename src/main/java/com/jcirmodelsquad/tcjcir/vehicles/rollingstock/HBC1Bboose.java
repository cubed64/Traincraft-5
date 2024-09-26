package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.library.GuiIDs;

public class HBC1Bboose extends AbstractPassengerCar
{
    public HBC1Bboose(World world) {
        super(world);
        textureDescriptionMap.put(0, "Fox, North Coast & Cascades");
        textureDescriptionMap.put(1, "Ann Arbor");
        textureDescriptionMap.put(2, "WV");
        textureDescriptionMap.put(3, "GCN");
        textureDescriptionMap.put(4, "GCM");
        textureDescriptionMap.put(5, "TIRY");
        textureDescriptionMap.put(6, "TIRY");
    }

    public HBC1Bboose(World world, double posX, double posY, double posZ)
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
        return 2.23F;
    }
}