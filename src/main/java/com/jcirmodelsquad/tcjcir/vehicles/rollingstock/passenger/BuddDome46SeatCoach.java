package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddDome46SeatCoach extends AbstractPassengerCar
{
	public BuddDome46SeatCoach(World world) {
		super(world);
		InsertTexture(0, "CZ Silver Dollar (WP)");
		InsertTexture(1, "CZ Silver Ranch (CB&Q)");
		InsertTexture(2, "CZ Silver Pony (DRGW)");
		InsertTexture(3, "CB&Q Denver Zephyr");
		InsertTexture(4, "NP (interior murals set 1)");
		InsertTexture(5, "NP (interior murals set 2)");
		InsertTexture(6, "GN");
		InsertTexture(7, "GN (Big Sky Blue)");
		InsertTexture(8, "GN (Cascade Green");
		InsertTexture(9, "BN 555");
		InsertTexture(10, "DRGW Silver Bronco (RGZ)");
		InsertTexture(11, "DRGW Silver Mustang (RGZ)");
		InsertTexture(12, "DRGW Silver Pony (RGZ)");
		InsertTexture(13, "MP (Colorado Eagle)");
		InsertTexture(14, "MP");
		InsertTexture(15, "MP (Jenks Blue)");
		InsertTexture(16, "IC");
		InsertTexture(17, "AMTK 9476");
		InsertTexture(18, "AMTK 9450");
		InsertTexture(19, "AMTK 9458");
		InsertTexture(20, "FNCC");
		InsertTexture(21, "Auto-Train");
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