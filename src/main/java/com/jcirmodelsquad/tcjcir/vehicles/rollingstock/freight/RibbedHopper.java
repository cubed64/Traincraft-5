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

	

	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "Generic Light Grey");
		InsertTexture(1, "Penn Central");
		InsertTexture(2, "FM Chemicals");
		InsertTexture(3, "ATSF");
		InsertTexture(4, "BNSF");
		InsertTexture(5, "Generic Tan");
		InsertTexture(6, "messicews underwear");
		InsertTexture(7, "messicews underwear");
		InsertTexture(8, "DRGW");
		InsertTexture(9, "Ex DRGW Patch");
		InsertTexture(10, "ADMX");
		InsertTexture(11, "Generic Bown");
		InsertTexture(12, "CR");
		InsertTexture(13, "CSXT");
		InsertTexture(14, "MT&S");
		InsertTexture(15, "SPB");
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