package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSSleeper565 extends AbstractPassengerCar
{

	public PSSleeper565(World world) {
		super(world);
		textureDescriptionMap.put(0, "C&O");
		textureDescriptionMap.put(1, "NKP");
		textureDescriptionMap.put(2, "IC");
		textureDescriptionMap.put(3, "IC (City of Miami)");
		textureDescriptionMap.put(4, "B&O");
		textureDescriptionMap.put(5, "B&O (ex-C&O)");
		textureDescriptionMap.put(6, "D&RGW (As Delivered)");
		textureDescriptionMap.put(7, "C&O (PM Scheme) (Semi-Fictional)");
	}

	public PSSleeper565(World world, double posX, double posY, double posZ)
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