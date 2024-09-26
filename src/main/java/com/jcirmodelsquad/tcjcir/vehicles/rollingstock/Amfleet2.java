package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class Amfleet2 extends AbstractPassengerCar
{
    public Amfleet2(World world)
    {
        super(world);
    }

    public Amfleet2(World world, double posX, double posY, double posZ)
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
        return 2.4F;
    }
}