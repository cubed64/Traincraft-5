package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class PSCNWRPO15 extends AbstractStandardFixedFreightCar
{
	public PSCNWRPO15(World world) {
		super(world);
	}



	@Override
	public void setupTextureDescription()
	{

	}


	@Override
	public String getInventoryName() {
		return "Pullman Standard CNW RPO(15')";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.85F;
	}

	@Override
	public String transportYear() {
		return "1950";
	}
}