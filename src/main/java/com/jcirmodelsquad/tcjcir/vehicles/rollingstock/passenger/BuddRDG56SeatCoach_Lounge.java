package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddRDG56SeatCoach_Lounge extends AbstractPassengerCar
{
	public BuddRDG56SeatCoach_Lounge(World world)
	{
		super(world);
		InsertTexture(0, "RDG 2");
		InsertTexture(1, "RDG 4");
		InsertTexture(2, "RDG 2 (post 1953 refurbishment)");
		InsertTexture(3, "RDG 4 (post 1953 refurbishment)");
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