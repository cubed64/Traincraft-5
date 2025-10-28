package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCNCoach extends AbstractPassengerCar
{
	public BuddCNCoach(World world)
	{
		super(world);
		InsertTexture(0, "CN 303 (early)");
		InsertTexture(1, "CN 303");
		InsertTexture(2, "CN 303 (late)");
		InsertTexture(3, "CN 301 (early)");
		InsertTexture(4, "CN 301");
		InsertTexture(5, "CN 301 (late)");
	}



	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.72F;
	}
}