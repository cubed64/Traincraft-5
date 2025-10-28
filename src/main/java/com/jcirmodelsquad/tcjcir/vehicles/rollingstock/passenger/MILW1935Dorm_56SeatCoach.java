package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class MILW1935Dorm_56SeatCoach extends AbstractPassengerCar {

	public MILW1935Dorm_56SeatCoach(World world)
	{
		super(world);
		InsertTexture(0, "MILW (As built)");
		InsertTexture(1, "MILW (Air conditioned)");
		InsertTexture(2, "MILW (Early postwar)");
		InsertTexture(3, "MILW (Postwar)");
		InsertTexture(4, "MILW (Postwar, ribbed)");
		InsertTexture(5, "MILW (UP scheme)");
		InsertTexture(6, "MILW (UP scheme, ribbed)");
		InsertTexture(7, "PGE");
		InsertTexture(8, "PGE (Ribbed)");
	}

	public MILW1935Dorm_56SeatCoach(World world, double posX, double posY, double posZ)
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