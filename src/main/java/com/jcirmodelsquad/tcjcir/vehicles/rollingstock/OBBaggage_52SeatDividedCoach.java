package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OBBaggage_52SeatDividedCoach extends AbstractPassengerCar
{
	public OBBaggage_52SeatDividedCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "SAL");
		textureDescriptionMap.put(1, "SAL (Silver)");
		textureDescriptionMap.put(2, "SAL (After Renovation, Late)");
		textureDescriptionMap.put(3, "SAL (After Renovation, Silver)");
		textureDescriptionMap.put(4, "SAL (After Renovation, Late)");
	}

	public OBBaggage_52SeatDividedCoach(World world, double posX, double posY, double posZ)
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