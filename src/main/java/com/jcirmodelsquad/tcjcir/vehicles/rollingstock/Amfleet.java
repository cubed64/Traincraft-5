package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class Amfleet extends AbstractPassengerCar
{
    public Amfleet(World world) {
        super(world);
        textureDescriptionMap.put(0, "AMTK ()");
        textureDescriptionMap.put(1, "AMTK ()");
        textureDescriptionMap.put(2, "AMTK ()");
        textureDescriptionMap.put(3, "AMTK ()");
        textureDescriptionMap.put(4, "AMTK ()");
        textureDescriptionMap.put(5, "AMTK ()");
        textureDescriptionMap.put(6, "AMTK ()");
        textureDescriptionMap.put(7, "AMTK ()");
        textureDescriptionMap.put(8, "AMTK ()");
    }

    public Amfleet(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

    @Override
    public double getAdditionalYOffset()
    {
        return 0.2F;
    }

    @Override
    public float getOptimalLinkingDistance()
    {
        return 2.5F;
    }
}