package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.api.AbstractPassengerCombineCar;

public class PSCombine extends AbstractPassengerCombineCar
{
	public PSCombine(World world)
	{
		super(world);
	}

	public PSCombine(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public void setupTextureDescription()
	{
		textureDescriptionMap.put(0, "C&O");
		textureDescriptionMap.put(1, "D&RGW");
		textureDescriptionMap.put(2, "D&RGW (As Delivered)");
		textureDescriptionMap.put(3, "D&RGW 1231 Rio Grande Zephyr Scheme 1");
		textureDescriptionMap.put(4, "D&RGW 1231 Rio Grande Zephyr Scheme 2");
		textureDescriptionMap.put(5, "D&RGW 1230 Rio Grande Zephyr");
		textureDescriptionMap.put(6, "DLMR");
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