package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PS52SeatCoach extends AbstractPassengerCar {

	public PS52SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "C&O Interior Scheme 1");
		textureDescriptionMap.put(1, "C&O Interior Scheme 2");
		textureDescriptionMap.put(2, "D&RGW Interior Scheme 1");
		textureDescriptionMap.put(3, "D&RGW Interior Scheme 2");
		textureDescriptionMap.put(4, "NKP");
		textureDescriptionMap.put(5, "NKP (Semi-Fictional)");
		textureDescriptionMap.put(6, "PM Interior Scheme 1 (Semi-Fictional)");
		textureDescriptionMap.put(7, "PM Interior Scheme 2 (Semi-Fictional)");
		textureDescriptionMap.put(8, "CNW Interior Scheme 1");
		textureDescriptionMap.put(9, "CNW Interior Scheme 2");
		textureDescriptionMap.put(10, "AMTK Phase 1 (ex-NKP)");
		textureDescriptionMap.put(11, "DLMR");
	}

	public PS52SeatCoach(World world, double posX, double posY, double posZ)
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