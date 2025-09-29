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
		textureDescriptionMap.put(0, "UP");
		textureDescriptionMap.put(1, "CNW (UP paint)");
		textureDescriptionMap.put(2, "GN (as delivered)");
		textureDescriptionMap.put(3, "GN");
		textureDescriptionMap.put(4, "GN (late)");
		textureDescriptionMap.put(5, "GN (BSB)");
		textureDescriptionMap.put(6, "BN");
		textureDescriptionMap.put(7, "SOU");
		textureDescriptionMap.put(8, "CNO&TP");
		textureDescriptionMap.put(9, "SOU (black roof)");
		textureDescriptionMap.put(10, "CNO&TP (black roof)");
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