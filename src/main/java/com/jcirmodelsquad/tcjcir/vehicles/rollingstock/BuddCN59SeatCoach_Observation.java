package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCN59SeatCoach_Observation extends AbstractPassengerCar
{
	public BuddCN59SeatCoach_Observation(World world)
	{
		super(world);
		textureDescriptionMap.put(0, "CN 302 (post coach observation conversion)");
		textureDescriptionMap.put(1, "CN 302 (post coach observation conversion, marker lights off)");
	}

	public BuddCN59SeatCoach_Observation(World world, double posX, double posY, double posZ)
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