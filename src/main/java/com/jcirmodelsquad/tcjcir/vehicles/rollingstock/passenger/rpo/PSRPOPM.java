package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class PSRPOPM extends AbstractStandardFixedFreightCar
{
	public PSRPOPM(World world) {
		super(world);
	}

	

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "PM");
		InsertTexture(1, "C&O");
	}

	@Override
	public String getInventoryName() {
		return "Pullman Standard RPO(15')";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.23F;
	}

	@Override
	public String transportYear() {
		return "1946";
	}
}