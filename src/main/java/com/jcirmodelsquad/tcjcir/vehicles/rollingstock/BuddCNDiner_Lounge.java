package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCNDiner_Lounge extends AbstractPassengerCar
{
	public BuddCNDiner_Lounge(World world)
	{
		super(world);
		textureDescriptionMap.put(0, "CN 300 (early)");
		textureDescriptionMap.put(1, "CN 300");
		textureDescriptionMap.put(2, "CN 300 (post snack bar-lounge conversion)");
	}

	public BuddCNDiner_Lounge(World world, double posX, double posY, double posZ)
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
		return 3.83F;
	}
}