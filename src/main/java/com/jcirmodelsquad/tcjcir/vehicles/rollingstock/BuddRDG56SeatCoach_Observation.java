package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddRDG56SeatCoach_Observation extends AbstractPassengerCar
{
	public BuddRDG56SeatCoach_Observation(World world)
	{
		super(world);
		textureDescriptionMap.put(0, "RDG 1");
		textureDescriptionMap.put(1, "RDG 1 (marker lights off)");
		textureDescriptionMap.put(2, "RDG 5");
		textureDescriptionMap.put(3, "RDG 5 (marker lights off)");
		textureDescriptionMap.put(4, "RDG 1 and 5 (post 1953 refurbishment)");
		textureDescriptionMap.put(5, "RDG 1 and 5 (post 1953 refurbishment, marker lights off)");
	}

	public BuddRDG56SeatCoach_Observation(World world, double posX, double posY, double posZ)
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