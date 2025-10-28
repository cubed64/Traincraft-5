package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.api.AbstractPassengerCombineCar;

public class OBBaggage_52SeatDividedCoach extends AbstractPassengerCombineCar
{
	public OBBaggage_52SeatDividedCoach(World world) {
		super(world);
	}

	

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "SAL");
		InsertTexture(1, "SAL (Silver)");
		InsertTexture(2, "SAL (After Renovation, Late)");
		InsertTexture(3, "SAL (After Renovation, Silver)");
		InsertTexture(4, "SAL (After Renovation, Late)");
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