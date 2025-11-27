package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCombineCar;
import train.common.enums.LockoutGroup;

public class PSCEIRPO15_Baggage_LC_Lounge extends AbstractPassengerCombineCar
{

	public PSCEIRPO15_Baggage_LC_Lounge(World world) {
		super(world);

	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "C&EI (As Delivered)");
		InsertTexture(1, "C&EI");
		InsertTexture(2, "FMSR", LockoutGroup.FMSR);
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