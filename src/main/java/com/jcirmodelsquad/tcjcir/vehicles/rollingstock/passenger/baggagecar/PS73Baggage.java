package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class PS73Baggage extends AbstractStandardFixedFreightCar
{
	public PS73Baggage(World world) {
		super(world);
	}



	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "PM");
		InsertTexture(1, "C&O");
		InsertTexture(2, "CGW (As Delivered)");
		InsertTexture(3, "CGW");
		InsertTexture(4, "CGW (maroon)");
		InsertTexture(5, "GN (ex-CGW)");
	}

	@Override
	public String getInventoryName() {
		return "Pullman Standard 73' Baggage";
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