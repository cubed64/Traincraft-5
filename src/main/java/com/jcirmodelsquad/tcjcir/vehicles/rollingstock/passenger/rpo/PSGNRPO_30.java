package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class PSGNRPO_30 extends AbstractStandardFixedFreightCar
{
	public PSGNRPO_30(World world) {
		super(world);
	}

	

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "GN Empire Builder (as delivered)");
		InsertTexture(1, "GN Empire Builder");
		InsertTexture(2, "GN Winnipeg Limited");
		InsertTexture(3, "GN Winnipeg Limited (late)");
	}

	@Override
	public String getInventoryName() {
		return "Pullman Standard GN RPO (30' mail section)";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.97F;
	}

	@Override
	public String transportYear() {
		return "1947";
	}
}