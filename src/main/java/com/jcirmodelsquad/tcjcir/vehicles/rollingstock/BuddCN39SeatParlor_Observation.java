package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCN39SeatParlor_Observation extends AbstractPassengerCar
{
	public BuddCN39SeatParlor_Observation(World world)
	{
		super(world);
		textureDescriptionMap.put(0, "CN 302 (early)");
		textureDescriptionMap.put(1, "CN 302 (early, marker lights off)");
		textureDescriptionMap.put(2, "CN 302");
		textureDescriptionMap.put(3, "CN 302 (marker lights off)");
	}

	public BuddCN39SeatParlor_Observation(World world, double posX, double posY, double posZ)
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