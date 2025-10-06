package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PScenterDiner extends AbstractPassengerCar
{

	public PScenterDiner(World world) {
		super(world);
		InsertTexture(0, "PM");
		InsertTexture(1, "C&O");
	}

	public PScenterDiner(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.97F;
	}
}