package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACF2Bay extends AbstractStandardFreightCar
{
	public ACF2Bay(World world)
	{
		super(world);
	}

	public ACF2Bay(World world, double x, double y, double z) {
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
		InsertTexture(0, "B&B");
		InsertTexture(1, "FNCC");
		InsertTexture(2, "GLNT");
		InsertTexture(3, "SPB");
		InsertTexture(4, "BN");
		InsertTexture(5, "WP");
		InsertTexture(6, "AA");
		InsertTexture(7, "DRGW");
		InsertTexture(8, "GN (Early)");
		InsertTexture(9, "GN (BSB)");
		InsertTexture(10, "NP");
		InsertTexture(11, "CB&Q");
		InsertTexture(12, "LRR");
	}

	@Override
	public String getInventoryName() {
		return "AC&F 2980 Cu Ft 2-Bay Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.1F;
	}
}