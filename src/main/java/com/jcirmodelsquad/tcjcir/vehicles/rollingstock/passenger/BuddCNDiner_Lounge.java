package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCNDiner_Lounge extends AbstractPassengerCar
{
	public BuddCNDiner_Lounge(World world)
	{
		super(world);
		InsertTexture(0, "CN 300 (early)");
		InsertTexture(1, "CN 300");
		InsertTexture(2, "CN 300 (post snack bar-lounge conversion)");
	}



	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.83F;
	}
}