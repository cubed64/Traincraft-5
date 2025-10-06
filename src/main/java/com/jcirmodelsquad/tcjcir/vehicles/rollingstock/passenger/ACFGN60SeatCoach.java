package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

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
		InsertTexture(12, "FNCC (With Conductor's Booth)");
		InsertTexture(13, "FNCC");
		InsertTexture(14, "FNCC (With Conductor's Booth, Royal Solar)");
		InsertTexture(15, "FNCC (Royal Solar)");
		InsertTexture(16, "N&EP As-Delivered");
		InsertTexture(17, "N&EP Modernized (70s)");
	}

	public ACFGN60SeatCoach(World world, double posX, double posY, double posZ)
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