package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACFUPRPO60 extends AbstractStandardFreightCar
{
	public ACFUPRPO60(World world)
	{
		super(world);
	}

	public ACFUPRPO60(World world, double x, double y, double z)
	{
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
		InsertTexture(0, "UP");
		InsertTexture(1, "CNW (UP paint)");
		InsertTexture(2, "GN (as delivered)");
		InsertTexture(3, "GN");
		InsertTexture(4, "GN (late)");
		InsertTexture(5, "GN (BSB)");
		InsertTexture(6, "BN");
		InsertTexture(7, "SOU");
		InsertTexture(8, "CNO&TP");
		InsertTexture(9, "SOU (black roof)");
		InsertTexture(10, "CNO&TP (black roof)");
	}

	@Override
	public String getInventoryName() {
		return "American Car & Foundry RPO(60')";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.85F;
	}
}