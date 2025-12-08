package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PS54SeatCoach_Lounge_1950 extends AbstractPassengerCar {

	public PS54SeatCoach_Lounge_1950(World world)
	{
		super(world);
		InsertTexture(0, "C&O");
		InsertTexture(1, "PM");
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

	@Override
	public String transportYear() {
		return "1950";
	}
}