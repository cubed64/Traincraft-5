package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PS52SeatCoach extends AbstractPassengerCar {

	public PS52SeatCoach(World world) {
		super(world);
		InsertTexture(0, "C&O Interior Scheme 1");
		InsertTexture(1, "C&O Interior Scheme 2");
		InsertTexture(2, "D&RGW Interior Scheme 1");
		InsertTexture(3, "D&RGW Interior Scheme 2");
		InsertTexture(4, "NKP");
		InsertTexture(5, "NKP (Semi-Fictional)");
		InsertTexture(6, "PM Interior Scheme 1 (Semi-Fictional)");
		InsertTexture(7, "PM Interior Scheme 2 (Semi-Fictional)");
		InsertTexture(8, "CNW Interior Scheme 1");
		InsertTexture(9, "CNW Interior Scheme 2");
		InsertTexture(10, "AMTK Phase 1 (ex-NKP)");
		InsertTexture(11, "DLMR");
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