package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSDamnitAnotherDiner extends AbstractPassengerCar
{

	public PSDamnitAnotherDiner(World world) {
		super(world);
		textureDescriptionMap.put(0, "D&RGW");
		textureDescriptionMap.put(1, "D&RGW (No Lounge)");
		textureDescriptionMap.put(2, "C&O (Semi-Fictional)");
		textureDescriptionMap.put(3, "PM (Semi-Fictional) ");
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