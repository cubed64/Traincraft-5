package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCNCoach extends AbstractPassengerCar
{
	public BuddCNCoach(World world)
	{
		super(world);
		textureDescriptionMap.put(0, "CN 303 (early)");
		textureDescriptionMap.put(1, "CN 303");
		textureDescriptionMap.put(2, "CN 303 (late)");
		textureDescriptionMap.put(3, "CN 301 (early)");
		textureDescriptionMap.put(4, "CN 301");
		textureDescriptionMap.put(5, "CN 301 (late)");
	}

	public BuddCNCoach(World world, double posX, double posY, double posZ)
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
		return 3.72F;
	}
}