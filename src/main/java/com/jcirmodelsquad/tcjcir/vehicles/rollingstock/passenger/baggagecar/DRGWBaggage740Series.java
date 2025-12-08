package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class DRGWBaggage740Series extends AbstractStandardFixedFreightCar
{
	public DRGWBaggage740Series(World world) {
		super(world);
	}

	

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "D&RGW (740)");
		InsertTexture(1, "D&RGW (741)");
		InsertTexture(2, "D&RGW (742)");
		InsertTexture(3, "D&RGW (743)");
		InsertTexture(4, "D&RGW (740, 4 stripe)");
		InsertTexture(5, "D&RGW (741, 4 stripe)");
		InsertTexture(6, "D&RGW (742, Late)");
		InsertTexture(7, "D&RGW (743, 4 stripe)");
		InsertTexture(8, "D&RGW (743, 4 stripe, Late)");
	}

	@Override
	public String getInventoryName() {
		return "DRGW 740 Series Baggage";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.25F;
	}

	@Override
	public String transportYear() {
		return "(Rebuilt) 1920";
	}
}