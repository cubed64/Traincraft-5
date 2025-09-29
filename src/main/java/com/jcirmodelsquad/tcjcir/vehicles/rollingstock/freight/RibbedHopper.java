package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class RibbedHopper extends AbstractStandardFreightCar
{
	public RibbedHopper(World world) {
		super(world);
	}

	public RibbedHopper(World world, double x, double y, double z){
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
		textureDescriptionMap.put(1, "Penn Central");
		textureDescriptionMap.put(2, "FM Chemicals");
		textureDescriptionMap.put(3, "ATSF");
		textureDescriptionMap.put(4, "BNSF");
		textureDescriptionMap.put(5, "Generic Tan");
		textureDescriptionMap.put(6, "messicews underwear");
		textureDescriptionMap.put(7, "messicews underwear");
		textureDescriptionMap.put(8, "DRGW");
		textureDescriptionMap.put(9, "Ex DRGW Patch");
		textureDescriptionMap.put(10, "ADMX");
		textureDescriptionMap.put(11, "Generic Bown");
		textureDescriptionMap.put(12, "CR");
		textureDescriptionMap.put(13, "CSXT");
		textureDescriptionMap.put(14, "MT&S");
		textureDescriptionMap.put(15, "SPB");
	}

	@Override
	public String getInventoryName() {
		return "Ribbed Covered Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.6F;
	}
}