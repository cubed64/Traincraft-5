package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.enums.LockoutGroup;

public class ACFGN60SeatCoach extends AbstractPassengerCar
{
	public ACFGN60SeatCoach(World world) {
		super(world);
		InsertTexture(0, "GN Internationals (With Conductor's Booth)");
		InsertTexture(1, "GN Internationals");
		InsertTexture(2, "GN Internationals (With Conductor's Booth, Late)");
		InsertTexture(3, "GN Internationals (Late)");
		InsertTexture(4, "GN Red River (With Conductor's Booth)");
		InsertTexture(5, "GN Red River");
		InsertTexture(6, "GN Empire Builder (As delivered)");
		InsertTexture(7, "GN Empire Builder");
		InsertTexture(8, "GN Empire Builder (Remodeled)");
		InsertTexture(9, "GN Empire Builder (BSB Scheme)");
		InsertTexture(10, "BN (With Conductor's Booth)");
		InsertTexture(11, "BN");
		InsertTexture(12, "FMSR (With Conductor's Booth)",LockoutGroup.FMSR);
		InsertTexture(13, "FMSR",LockoutGroup.FMSR);
		InsertTexture(14, "FMSR (With Conductor's Booth, Royal Solar)",LockoutGroup.FMSR);
		InsertTexture(15, "FMSR (Royal Solar)",LockoutGroup.FMSR);
		InsertTexture(16, "N&EP As-Delivered");
		InsertTexture(17, "N&EP Modernized (70s)");
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
		return "1950";
	}
}