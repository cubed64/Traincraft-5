package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Hopper5201 extends AbstractStandardFreightCar
{
	public Hopper5201(World world)
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
		InsertTexture(0, "Generic Light Grey");
		InsertTexture(1, "GPLX");
		InsertTexture(2, "FNCC");
		InsertTexture(3, "Generic Tan");
		InsertTexture(4, "CSXT");
		InsertTexture(5, "NdeM or something idk");
		InsertTexture(6, "Blueberry");
		InsertTexture(7, "KCS");
		InsertTexture(8, "CPR");
		InsertTexture(9, "BNB (Ruined)");
	}

	@Override
	public String getInventoryName() {
		return "5201 Cubic Foot Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.4F;
	}
}