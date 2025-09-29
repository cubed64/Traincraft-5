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

	public PS2_4750(World world, double x, double y, double z)
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
		textureDescriptionMap.put(0, "Blandsville & Blankerston");
		textureDescriptionMap.put(1, "Generic Tan / Foxmann Industries");
		textureDescriptionMap.put(2, "KSFX 'Seed Co-Op'");
		textureDescriptionMap.put(3, "KSFX 'Seed Co-Op'");
		textureDescriptionMap.put(4, "FNCC (Carbo Service)");
		textureDescriptionMap.put(5, "SNEED'S");
		textureDescriptionMap.put(6, "UP");
		textureDescriptionMap.put(7, "UP (But Boring)");
		textureDescriptionMap.put(8, "CRIPple");
		textureDescriptionMap.put(9, "The COCK!!!1!");
		textureDescriptionMap.put(10, "MILW");
		textureDescriptionMap.put(11, "MILW but Intermountain fucked up apparently");
		textureDescriptionMap.put(12, "Far-Mar CO-OP");
		textureDescriptionMap.put(13, "DRGW");
		textureDescriptionMap.put(14, "FW&D");
		textureDescriptionMap.put(15, "BN");
		textureDescriptionMap.put(16, "CNW");
		textureDescriptionMap.put(17, "CNW again");
		textureDescriptionMap.put(18, "PC");
		textureDescriptionMap.put(19, "ATSF");
		textureDescriptionMap.put(20, "CSXT");
		textureDescriptionMap.put(21, "NS");
		textureDescriptionMap.put(22, "Soup");
		textureDescriptionMap.put(23, "MKT");
		textureDescriptionMap.put(24, "RI");
		textureDescriptionMap.put(25, "KCS");
		textureDescriptionMap.put(26, "Washington Grain Train");
		textureDescriptionMap.put(27, "Washington Grain Train (Stale)");
		textureDescriptionMap.put(28, "HRTX (THE GOCK!!!!1!!!1111111111111111111111111111111111111!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?!11111111111111111!!!!!!!!!!!!!!!!/)");
		textureDescriptionMap.put(29, "GCM");
		textureDescriptionMap.put(30, "Cornhub");
		textureDescriptionMap.put(31, "ATSF again");
		textureDescriptionMap.put(32, "MNS");
		textureDescriptionMap.put(33, "GTW (1972)");
		textureDescriptionMap.put(34, "GTW (1979)");
		textureDescriptionMap.put(35, "MP (Early)");
		textureDescriptionMap.put(36, "MP (Late)");
		textureDescriptionMap.put(37, "ICG");
		textureDescriptionMap.put(38, "GLNT");
		textureDescriptionMap.put(39, "Creston, IA");
		textureDescriptionMap.put(40, "AA");
		textureDescriptionMap.put(41, "AA (MIR Ferry in the Fog)");
		textureDescriptionMap.put(42, "SOUTHERN SERVES THE SOUTH");
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