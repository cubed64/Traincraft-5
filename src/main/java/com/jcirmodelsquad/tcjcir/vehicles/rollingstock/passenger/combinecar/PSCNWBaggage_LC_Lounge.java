package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.api.AbstractPassengerCombineCar;

public class PSCNWBaggage_LC_Lounge extends AbstractPassengerCombineCar
{

	public PSCNWBaggage_LC_Lounge(World world)
	{
		super(world);
	}

	public PSCNWBaggage_LC_Lounge(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public void setupTextureDescription()
	{

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