package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.api.AbstractWorkCart;
import train.common.library.GuiIDs;

public class CA11 extends AbstractWorkCart
{
    public CA11(World world) {
        super(world);
        textureDescriptionMap.put(0, "UP");
        textureDescriptionMap.put(1, "WP");
        textureDescriptionMap.put(2, "FNCC (Regal)");
        textureDescriptionMap.put(3, "Generic");
        textureDescriptionMap.put(4, "GLC");
        textureDescriptionMap.put(5, "GLNT");
        textureDescriptionMap.put(6, "CNCR C1-C5");
        textureDescriptionMap.put(7, "");
        textureDescriptionMap.put(8, "");
        textureDescriptionMap.put(9, "");
    }

    public CA11(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

    @Override
    public double getAdditionalYOffset()
    {
        return -0.1F;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart)
    {
        return 2.1F;
    }
}