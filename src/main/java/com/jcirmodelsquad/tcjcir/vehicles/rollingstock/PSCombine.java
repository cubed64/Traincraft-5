package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCombine extends AbstractPassengerCar
{
	public PSCombine(World world) {
		super(world);
		textureDescriptionMap.put(0, "C&O");
		textureDescriptionMap.put(1, "D&RGW");
		textureDescriptionMap.put(2, "D&RGW (As Delivered)");
		textureDescriptionMap.put(3, "D&RGW 1231 Rio Grande Zephyr Scheme 1");
		textureDescriptionMap.put(4, "D&RGW 1231 Rio Grande Zephyr Scheme 2");
		textureDescriptionMap.put(5, "D&RGW 1230 Rio Grande Zephyr");
		textureDescriptionMap.put(6, "DLMR");
	}

	public PSCombine(World world, double posX, double posY, double posZ)
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