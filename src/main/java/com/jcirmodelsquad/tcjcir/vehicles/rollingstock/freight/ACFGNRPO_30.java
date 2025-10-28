package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACFGNRPO_30 extends AbstractStandardFreightCar
{
	public ACFGNRPO_30(World world)
	{
		super(world);
	}

	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "GN Internationals");
		InsertTexture(1, "GN Internationals (late)");
		InsertTexture(2, "GN Red River");
		InsertTexture(3, "GN Red River (late)");
	}

	@Override
	public String getInventoryName() {
		return "American Car & Foundry GN RPO (30' mail section)";
	}
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.97F;
	}
}