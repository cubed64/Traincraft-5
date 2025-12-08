package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCEI60SeatCoach extends AbstractPassengerCar {

	public PSCEI60SeatCoach(World world) {
		super(world);
		InsertTexture(0, "C&EI 460 (Vigo Trail)");
		InsertTexture(1, "C&EI 461 (Vincennes Trail)");
		InsertTexture(2, "C&EI 462 (Vanderburgh Trail)");
		InsertTexture(3, "C&EI 463 (Vermilion Trail)");
		InsertTexture(4, "C&EI 464 (Hubbard Trail)");
		InsertTexture(5, "C&EI 465 (Egyptian Trail)");
		InsertTexture(6, "C&EI 466 (Horseshoe Trail)");
		InsertTexture(7, "C&EI 460 (L&N paint)");
		InsertTexture(8, "C&EI 461 (L&N paint)");
		InsertTexture(9, "C&EI 462, 465 (L&N paint)");
		InsertTexture(10, "C&EI 463, 466 (L&N paint)");
		InsertTexture(11, "C&EI 464 (L&N paint)");
		InsertTexture(12, "IC (Interior Scheme 1)");
		InsertTexture(13, "IC (Interior Scheme 2)");
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