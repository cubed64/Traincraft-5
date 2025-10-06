package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.api.AbstractPassengerCombineCar;

public class PSCEIRPO15_Baggage_LC_Lounge extends AbstractPassengerCombineCar
{

	public PSCEIRPO15_Baggage_LC_Lounge(World world) {
		super(world);

	}

	public PSCEIRPO15_Baggage_LC_Lounge(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "C&EI (As Delivered)");
		InsertTexture(1, "C&EI");
		InsertTexture(2, "FNCC");
		InsertTexture(3, "GC&M");
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