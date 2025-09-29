package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.api.AbstractPassengerCombineCar;

public class OBBaggage_52SeatDividedCoach extends AbstractPassengerCombineCar
{
	public OBBaggage_52SeatDividedCoach(World world) {
		super(world);
	}

	public OBBaggage_52SeatDividedCoach(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public void setupTextureDescription()
	{
		textureDescriptionMap.put(0, "SAL");
		textureDescriptionMap.put(1, "SAL (Silver)");
		textureDescriptionMap.put(2, "SAL (After Renovation, Late)");
		textureDescriptionMap.put(3, "SAL (After Renovation, Silver)");
		textureDescriptionMap.put(4, "SAL (After Renovation, Late)");
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