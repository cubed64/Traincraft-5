package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class OBRPO15 extends AbstractStandardFixedFreightCar
{
	public OBRPO15(World world) {
		super(world);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "BAR (566-568)");
		InsertTexture(1, "BAR (569)");
		InsertTexture(2, "BAR (566-568, Grey and Sapphire)");
		InsertTexture(3, "BAR (568, Grey and Sapphire, Aroostook Flyer)");
		InsertTexture(4, "BAR (569, Grey and Sapphire)");
		InsertTexture(5, "NEP");
	}

	@Override
	public String getInventoryName() {
		return "Osgood Bradley RPO(15')";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.37F;
	}

	@Override
	public String transportYear() {
		return "1937-1938";
	}
}