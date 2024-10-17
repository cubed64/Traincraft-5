package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddRDG56SeatCoach_Lounge extends AbstractPassengerCar
{
	public BuddRDG56SeatCoach_Lounge(World world)
	{
		super(world);
		textureDescriptionMap.put(0, "RDG 2");
		textureDescriptionMap.put(1, "RDG 4");
		textureDescriptionMap.put(2, "RDG 2 (post 1953 refurbishment)");
		textureDescriptionMap.put(3, "RDG 4 (post 1953 refurbishment)");
	}

	public BuddRDG56SeatCoach_Lounge(World world, double posX, double posY, double posZ)
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
		return 3.72F;
	}
}