package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCN68SeatCoach_Observation extends AbstractPassengerCar
{
	public BuddCN68SeatCoach_Observation(World world)
	{
		super(world);
		textureDescriptionMap.put(0, "CN 304 (early)");
		textureDescriptionMap.put(1, "CN 304 (early, marker lights off)");
		textureDescriptionMap.put(2, "CN 304");
		textureDescriptionMap.put(3, "CN 304 (marker lights off)");
		textureDescriptionMap.put(4, "CN 304 (late)");
		textureDescriptionMap.put(5, "CN 304 (late, marker lights off)");
	}

	public BuddCN68SeatCoach_Observation(World world, double posX, double posY, double posZ)
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