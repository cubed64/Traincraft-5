package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class ACF_SP_98seatcoach extends AbstractPassengerCar
{
	public ACF_SP_98seatcoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "SP As-Delivered");
		textureDescriptionMap.put(1, "SP Modified w/ AC");
		textureDescriptionMap.put(2, "SP Sunset Scheme");
		textureDescriptionMap.put(3, "NEP As-Delivered");
		textureDescriptionMap.put(4, "NEP As-Modified");
		textureDescriptionMap.put(5, "NEP As-Modernized");
		textureDescriptionMap.put(6, "Blank As-Delivered");
		textureDescriptionMap.put(7, "Blank As-Modified");
	}

	public ACF_SP_98seatcoach(World world, double posX, double posY, double posZ)
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
		return 3.70F;
	}
}