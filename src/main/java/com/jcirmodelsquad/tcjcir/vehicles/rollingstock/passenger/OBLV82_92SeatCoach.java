package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OBLV82_92SeatCoach extends AbstractPassengerCar
{

	public OBLV82_92SeatCoach(World world) {
		super(world);
		InsertTexture(0, "LV (82 Seat Coach)");
		InsertTexture(1, "LV (82 Seat Coach, Late)");
		InsertTexture(2, "LV (92 Seat Coach)");
		InsertTexture(3, "LV (92 Seat Coach, Late)");
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