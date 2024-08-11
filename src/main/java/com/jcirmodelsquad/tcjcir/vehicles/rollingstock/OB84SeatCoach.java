package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OB84SeatCoach extends AbstractPassengerCar
{

	public OB84SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "NH (As Delivered)");
		textureDescriptionMap.put(1, "NH");
		textureDescriptionMap.put(2, "NH (Late)");
		textureDescriptionMap.put(3, "NH (Black Knight Scheme)");
		textureDescriptionMap.put(4, "PC");
		textureDescriptionMap.put(5, "B&M B&M (As Delivered, 1935 Batch)");
		textureDescriptionMap.put(6, "B&M Interior Scheme 1 (As Delivered, 1937 Batch)");
		textureDescriptionMap.put(7, "B&M Interior Scheme 2 (As Delivered, 1937 Batch)");
		textureDescriptionMap.put(8, "B&M (1935 Batch)");
		textureDescriptionMap.put(9, "B&M Interior Scheme 1 (1937 Batch)");
		textureDescriptionMap.put(10, "B&M Interior Scheme 2 (1937 Batch)");
		textureDescriptionMap.put(11, "BAR (As Delivered)");
		textureDescriptionMap.put(12, "BAR");
		textureDescriptionMap.put(13, "East Wind (New Haven)");
		textureDescriptionMap.put(14, "East Wind (B&M, Interior Scheme 1)");
		textureDescriptionMap.put(15, "East Wind (B&M, Interior Scheme 2)");
		textureDescriptionMap.put(16, "LIRR (Early)");
		textureDescriptionMap.put(17, "LIRR");
		textureDescriptionMap.put(18, "LIRR (Late)");
		textureDescriptionMap.put(19, "LIRR (MTBA Scheme)");
		textureDescriptionMap.put(20, "NH (64 Seat Coach-Lounge)");
		textureDescriptionMap.put(21, "NH (64 Seat Coach-Lounge, Late)");
		textureDescriptionMap.put(22, "NH (64 Seat Coach-Lounge, Black Knight Scheme)");
		textureDescriptionMap.put(23, "PC (64 Seat Coach-Lounge, Alternate Scheme)");
		textureDescriptionMap.put(24, "PC (64 Seat Coach-Lounge)");
		textureDescriptionMap.put(25, "NH (68 Seat Coach-Lounge)");
		textureDescriptionMap.put(26, "PC (68 Seat Coach-Lounge, Late)");
		textureDescriptionMap.put(27, "PC (68 Seat Coach-Lounge)");
	}

	public OB84SeatCoach(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.97F;
	}
}