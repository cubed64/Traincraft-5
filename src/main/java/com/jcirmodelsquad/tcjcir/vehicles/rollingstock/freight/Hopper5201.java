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

	public Hopper5201(World world, double x, double y, double z){
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
		textureDescriptionMap.put(0, "Generic Light Grey");
		textureDescriptionMap.put(1, "GPLX");
		textureDescriptionMap.put(2, "FNCC");
		textureDescriptionMap.put(3, "Generic Tan");
		textureDescriptionMap.put(4, "CSXT");
		textureDescriptionMap.put(5, "NdeM or something idk");
		textureDescriptionMap.put(6, "Blueberry");
		textureDescriptionMap.put(7, "KCS");
		textureDescriptionMap.put(8, "CPR");
		textureDescriptionMap.put(9, "BNB (Ruined)");
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