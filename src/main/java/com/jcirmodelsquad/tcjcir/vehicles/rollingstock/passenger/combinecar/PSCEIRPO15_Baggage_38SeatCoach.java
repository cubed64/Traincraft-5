package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCombineCar;

public class PSCEIRPO15_Baggage_38SeatCoach extends AbstractPassengerCombineCar
{

	public PSCEIRPO15_Baggage_38SeatCoach(World world) {
		super(world);

	}

	

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "C&EI (As Delivered)");
		InsertTexture(1, "C&EI");
		InsertTexture(2, "C&EI (Semi-Fictional)");
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

	@Override
	public String transportYear() {
		return "1946";
	}
}