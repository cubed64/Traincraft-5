package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PS54SeatCoach_Lounge_1950 extends AbstractPassengerCar {

	public PS54SeatCoach_Lounge_1950(World world)
	{
		super(world);
	}

	public PS54SeatCoach_Lounge_1950(World world, double posX, double posY, double posZ)
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
		return 3.97F;
	}
}