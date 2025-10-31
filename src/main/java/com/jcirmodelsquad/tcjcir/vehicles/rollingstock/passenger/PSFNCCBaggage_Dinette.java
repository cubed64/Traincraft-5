package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.enums.LockoutGroup;

public class PSFNCCBaggage_Dinette extends AbstractPassengerCar {

	public PSFNCCBaggage_Dinette(World world) {
		super(world);
		InsertTexture(0, "FMSR", LockoutGroup.FMSR);
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