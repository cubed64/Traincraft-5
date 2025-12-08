package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class PSRPO extends AbstractStandardFixedFreightCar
{
	public PSRPO(World world) {
		super(world);
	}



	@Override
	public void setupTextureDescription()
	{

	}

	@Override
	public String getInventoryName() {
		return "Pullman Standard RPO(30')";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.23F;
	}

	@Override
	public String transportYear() {
		return "1950";
	}
}