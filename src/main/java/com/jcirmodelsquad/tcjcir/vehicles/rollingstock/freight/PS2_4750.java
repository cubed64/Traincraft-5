package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PS2_4750 extends AbstractStandardFreightCar
{
	public PS2_4750(World world)
	{
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
		InsertTexture(0, "Blandsville & Blankerston");
		InsertTexture(1, "Generic Tan / Foxmann Industries");
		InsertTexture(2, "KSFX 'Seed Co-Op'");
		InsertTexture(3, "KSFX 'Seed Co-Op'");
		InsertTexture(4, "FNCC (Carbo Service)");
		InsertTexture(5, "SNEED'S");
		InsertTexture(6, "UP");
		InsertTexture(7, "UP (But Boring)");
		InsertTexture(8, "CRIPple");
		InsertTexture(9, "The COCK!!!1!");
		InsertTexture(10, "MILW");
		InsertTexture(11, "MILW but Intermountain fucked up apparently");
		InsertTexture(12, "Far-Mar CO-OP");
		InsertTexture(13, "DRGW");
		InsertTexture(14, "FW&D");
		InsertTexture(15, "BN");
		InsertTexture(16, "CNW");
		InsertTexture(17, "CNW again");
		InsertTexture(18, "PC");
		InsertTexture(19, "ATSF");
		InsertTexture(20, "CSXT");
		InsertTexture(21, "NS");
		InsertTexture(22, "Soup");
		InsertTexture(23, "MKT");
		InsertTexture(24, "RI");
		InsertTexture(25, "KCS");
		InsertTexture(26, "Washington Grain Train");
		InsertTexture(27, "Washington Grain Train (Stale)");
		InsertTexture(28, "HRTX (THE GOCK!!!!1!!!1111111111111111111111111111111111111!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?!11111111111111111!!!!!!!!!!!!!!!!/)");
		InsertTexture(29, "GCM", LockoutGroup.GCM); 
		InsertTexture(30, "Cornhub");
		InsertTexture(31, "ATSF again");
		InsertTexture(32, "MNS");
		InsertTexture(33, "GTW (1972)");
		InsertTexture(34, "GTW (1979)");
		InsertTexture(35, "MP (Early)");
		InsertTexture(36, "MP (Late)");
		InsertTexture(37, "ICG");
		InsertTexture(38, "GLNT");
		InsertTexture(39, "Creston, IA");
		InsertTexture(40, "AA");
		InsertTexture(41, "AA (MIR Ferry in the Fog)");
		InsertTexture(42, "SOUTHERN SERVES THE SOUTH");
	}

	@Override
	public String getInventoryName() {
		return "PS2 4750 Cu Ft 3-Bay Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.75F;
	}
}