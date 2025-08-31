package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class FNCC2375Hopper extends AbstractStandardFreightCar
{
	public FNCC2375Hopper(World world) {
		super(world);
	}

	public FNCC2375Hopper(World world, double x, double y, double z){
		super(world, x, y, z);
	}

	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public void setupTextureDescription()
	{
		textureDescriptionMap.put(0, "FNCC (Plain)");
		textureDescriptionMap.put(1, "FNCC (Big Block Text)");
		textureDescriptionMap.put(2, "FNCC (Carbon Black)");
		textureDescriptionMap.put(3, "Blandsville & Blankerston");
		textureDescriptionMap.put(4, "UNCLX");
		textureDescriptionMap.put(5, "UNCLX");
		textureDescriptionMap.put(6, "Magnolia");
		textureDescriptionMap.put(7, "RUVX");
		textureDescriptionMap.put(8, "RUVX");
		textureDescriptionMap.put(9, "RUVX");
		textureDescriptionMap.put(10, "CBRR");
		textureDescriptionMap.put(11, "DLMR");
		textureDescriptionMap.put(12, "hamburger helper rayroa");
		textureDescriptionMap.put(13, "AA");
		textureDescriptionMap.put(14, "AA (Ferry in the Fog)");
		textureDescriptionMap.put(15, "SPB");
		textureDescriptionMap.put(16, "GLNT");
	}

	@Override
	public String getInventoryName() {
		return "FNCC 2375 Cu Foot Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.3F;
	}
}