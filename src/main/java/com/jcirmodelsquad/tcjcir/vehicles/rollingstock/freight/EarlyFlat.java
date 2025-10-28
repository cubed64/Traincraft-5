package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class EarlyFlat extends AbstractStandardFreightCar
{
	public EarlyFlat(World world) {
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
		//InsertTexture(0, "TrailerTrain Cooperation");
	}

	@Override
	public String getInventoryName() {
		return "Early Flatcar";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.4F;
	}
}