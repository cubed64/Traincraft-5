package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class ACFGN1DR_17SeatParlorObservation extends AbstractPassengerCar
{

	public ACFGN1DR_17SeatParlorObservation(World world) {
		super(world);
		textureDescriptionMap.put(0, "GN Internationals");
		textureDescriptionMap.put(1, "GN Internationals (Late)");
		textureDescriptionMap.put(2, "AMTK (Abraham Lincoln)");
		textureDescriptionMap.put(3, "AMTK");
	}

	public ACFGN1DR_17SeatParlorObservation(World world, double posX, double posY, double posZ)
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