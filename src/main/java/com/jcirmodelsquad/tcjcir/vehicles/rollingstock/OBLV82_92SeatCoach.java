package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OBLV82_92SeatCoach extends AbstractPassengerCar
{

	public OBLV82_92SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "LV (82 Seat Coach)");
		textureDescriptionMap.put(1, "LV (82 Seat Coach, Late)");
		textureDescriptionMap.put(2, "LV (92 Seat Coach)");
		textureDescriptionMap.put(3, "LV (92 Seat Coach, Late)");
	}

	public OBLV82_92SeatCoach(World world, double posX, double posY, double posZ)
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