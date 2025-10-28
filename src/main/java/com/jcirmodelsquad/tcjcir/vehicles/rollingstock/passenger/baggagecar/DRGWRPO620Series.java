package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class DRGWRPO620Series extends AbstractStandardFixedFreightCar
{
	public DRGWRPO620Series(World world) {
		super(world);
	}



	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "D&RG (As Delivered)");
		InsertTexture(1, "D&RGW");
		InsertTexture(2, "D&RGW (624, Late)");
		InsertTexture(3, "D&RGW (627, Late)");
		InsertTexture(4, "WP (As Delivered)");
		InsertTexture(5, "WP");
	}

	@Override
	public String getInventoryName() {
		return "DRGW 620 Series RPO(30')";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.23F;
	}
}