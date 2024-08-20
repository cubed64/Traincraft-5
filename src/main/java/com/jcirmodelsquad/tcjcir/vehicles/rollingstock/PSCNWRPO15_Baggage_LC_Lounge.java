package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCNWRPO15_Baggage_LC_Lounge extends AbstractPassengerCar
{

	public PSCNWRPO15_Baggage_LC_Lounge(World world)
	{
		super(world);
	}

	public PSCNWRPO15_Baggage_LC_Lounge(World world, double posX, double posY, double posZ)
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
		return 3.85F;
	}
}