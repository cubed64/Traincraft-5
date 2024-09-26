package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddDome46SeatCoach extends AbstractPassengerCar
{
	public BuddDome46SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "CZ Silver Dollar (WP)");
		textureDescriptionMap.put(1, "CZ Silver Ranch (CB&Q)");
		textureDescriptionMap.put(2, "CZ Silver Pony (DRGW)");
		textureDescriptionMap.put(3, "CB&Q Denver Zephyr");
		textureDescriptionMap.put(4, "NP (interior murals set 1)");
		textureDescriptionMap.put(5, "NP (interior murals set 2)");
		textureDescriptionMap.put(6, "GN");
		textureDescriptionMap.put(7, "GN (Big Sky Blue)");
		textureDescriptionMap.put(8, "GN (Cascade Green");
		textureDescriptionMap.put(9, "BN 555");
		textureDescriptionMap.put(10, "DRGW Silver Bronco (RGZ)");
		textureDescriptionMap.put(11, "DRGW Silver Mustang (RGZ)");
		textureDescriptionMap.put(12, "DRGW Silver Pony (RGZ)");
		textureDescriptionMap.put(13, "MP (Colorado Eagle)");
		textureDescriptionMap.put(14, "MP");
		textureDescriptionMap.put(15, "MP (Jenks Blue)");
		textureDescriptionMap.put(16, "IC");
		textureDescriptionMap.put(17, "AMTK 9476");
		textureDescriptionMap.put(18, "AMTK 9450");
		textureDescriptionMap.put(19, "AMTK 9458");
		textureDescriptionMap.put(20, "FNCC");
		textureDescriptionMap.put(21, "Auto-Train");
	}

	public BuddDome46SeatCoach(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public double getAdditionalYOffset()
	{
		return 0.55F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.97F;
	}
}