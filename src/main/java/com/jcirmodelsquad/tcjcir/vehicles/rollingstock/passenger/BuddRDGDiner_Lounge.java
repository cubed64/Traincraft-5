package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddRDGDiner_Lounge extends AbstractPassengerCar
{
	public BuddRDGDiner_Lounge(World world)
	{
		super(world);
		InsertTexture(0, "RDG 3");
		InsertTexture(1, "RDG 3 (post 1953 refurbishment)");
	}

	public BuddRDGDiner_Lounge(World world, double posX, double posY, double posZ)
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