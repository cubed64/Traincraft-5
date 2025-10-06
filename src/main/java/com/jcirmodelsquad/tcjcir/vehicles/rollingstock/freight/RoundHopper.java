package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class RoundHopper extends AbstractStandardFreightCar
{
	public RoundHopper(World world) {
		super(world);
	}

	public RoundHopper(World world, double x, double y, double z){
		super(world, x , y, z);
	}

	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "CNWX Red");
		InsertTexture(1, "CPRail Multimark");
		InsertTexture(2, "ECYX");
		InsertTexture(3, "FKIX Patchout");
	}

	@Override
	public String getInventoryName() {
		return "Round Covered Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.1F;
	}
}