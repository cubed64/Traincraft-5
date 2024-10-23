package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PassengerTwoBilTail extends AbstractPassengerCar {
    //public TiltingHandler tiltingHandler = new TiltingHandler(7);

    public PassengerTwoBilTail(World world)
    {
        super(world);
    }

    public PassengerTwoBilTail(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

    @Override
    public float getOptimalLinkingDistance()
    {
        return 2.77F;
    }
}