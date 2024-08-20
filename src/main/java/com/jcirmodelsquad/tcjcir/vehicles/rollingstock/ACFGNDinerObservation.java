package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class ACFGNDinerObservation extends AbstractPassengerCar
{

	public ACFGNDinerObservation(World world) {
		super(world);
		textureDescriptionMap.put(0, "GN Red River");
		textureDescriptionMap.put(1, "GN Red River (Late)");
	}

	public ACFGNDinerObservation(World world, double posX, double posY, double posZ)
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