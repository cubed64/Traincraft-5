package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class ACFGN60SeatCoach extends AbstractPassengerCar
{
	public ACFGN60SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "GN Internationals (With Conductor's Booth)");
		textureDescriptionMap.put(1, "GN Internationals");
		textureDescriptionMap.put(2, "GN Internationals (With Conductor's Booth, Late)");
		textureDescriptionMap.put(3, "GN Internationals (Late)");
		textureDescriptionMap.put(4, "GN Red River (With Conductor's Booth)");
		textureDescriptionMap.put(5, "GN Red River");
		textureDescriptionMap.put(6, "GN Empire Builder (As delivered)");
		textureDescriptionMap.put(7, "GN Empire Builder");
		textureDescriptionMap.put(8, "GN Empire Builder (Remodeled)");
		textureDescriptionMap.put(9, "GN Empire Builder (BSB Scheme)");
		textureDescriptionMap.put(10, "BN (With Conductor's Booth)");
		textureDescriptionMap.put(11, "BN");
		textureDescriptionMap.put(12, "FNCC (With Conductor's Booth)");
		textureDescriptionMap.put(13, "FNCC");
		textureDescriptionMap.put(14, "FNCC (With Conductor's Booth, Royal Solar)");
		textureDescriptionMap.put(15, "FNCC (Royal Solar)");
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