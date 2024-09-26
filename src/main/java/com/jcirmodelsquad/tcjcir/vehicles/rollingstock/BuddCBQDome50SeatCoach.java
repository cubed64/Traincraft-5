package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCBQDome50SeatCoach extends AbstractPassengerCar
{
	public BuddCBQDome50SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "CB&Q Silver Bluff");
	}

	public BuddCBQDome50SeatCoach(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public double getAdditionalYOffset()
	{
		return 0.55F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.97F;
	}
}