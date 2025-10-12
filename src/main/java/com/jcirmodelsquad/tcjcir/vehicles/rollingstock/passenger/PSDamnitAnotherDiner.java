package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSDamnitAnotherDiner extends AbstractPassengerCar
{

	public PSDamnitAnotherDiner(World world) {
		super(world);
		InsertTexture(0, "D&RGW");
		InsertTexture(1, "D&RGW (No Lounge)");
		InsertTexture(2, "C&O (Semi-Fictional)");
		InsertTexture(3, "PM (Semi-Fictional) ");
	}

	public PSDamnitAnotherDiner(World world, double posX, double posY, double posZ)
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