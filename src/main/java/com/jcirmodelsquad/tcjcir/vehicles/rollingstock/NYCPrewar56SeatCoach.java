package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class NYCPrewar56SeatCoach extends AbstractPassengerCar {

	public NYCPrewar56SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "NYC PS (As Delivered)");
		textureDescriptionMap.put(1, "NYC PS (James Whitcomb Riley)");
		textureDescriptionMap.put(2, "NYC PS (Mercury)");
		textureDescriptionMap.put(3, "NYC PS (Mercury, Removed Skirting)");
		textureDescriptionMap.put(4, "NYC PS (1940 20th Century Limited scheme)");
		textureDescriptionMap.put(5, "NYC PS (Experimental Scheme)");
		textureDescriptionMap.put(6, "NYC PS (Inverted Scheme)");
		textureDescriptionMap.put(7, "NYC PS (Pacemaker Green, Removed Skirting)");
		textureDescriptionMap.put(8, "NYC PS (Postwar)");
		textureDescriptionMap.put(9, "NYC PS (Late Postwar, Interior Scheme 1)");
		textureDescriptionMap.put(10, "NYC PS (Late Postwar, Interior Scheme 2)");
		textureDescriptionMap.put(11, "PC PS (Interior Scheme 1)");
		textureDescriptionMap.put(12, "PC PS (Interior Scheme 2)");
		textureDescriptionMap.put(13, "PC PS (Alternate Exterior Scheme)");
		textureDescriptionMap.put(14, "NYC AC&F (As Delivered)");
		textureDescriptionMap.put(15, "NYC AC&F (Inverted Scheme)");
		textureDescriptionMap.put(16, "NYC AC&F (Pacemaker Green, Removed Skirting)");
		textureDescriptionMap.put(17, "NYC AC&F (Postwar)");
		textureDescriptionMap.put(18, "NYC AC&F (Late Postwar, Interior Scheme 1)");
		textureDescriptionMap.put(19, "NYC AC&F (Late Postwar, Interior Scheme 2)");
		textureDescriptionMap.put(20, "PC AC&F (Interior Scheme 1)");
		textureDescriptionMap.put(21, "PC AC&F (Interior Scheme 2)");
		textureDescriptionMap.put(22, "NYC PSCC (As Delivered)");
		textureDescriptionMap.put(23, "NYC PSCC (Inverted Scheme)");
		textureDescriptionMap.put(24, "NYC PSCC (Pacemaker Green, Removed Skirting)");
		textureDescriptionMap.put(25, "NYC PSCC (Postwar)");
		textureDescriptionMap.put(26, "NYC PSCC (Late Postwar)");
		textureDescriptionMap.put(27, "NYC PSCC (Late Postwar, Alternate Exterior Scheme)");
		textureDescriptionMap.put(28, "NYC Budd (As Delivered, Interior Scheme 1)");
		textureDescriptionMap.put(29, "NYC Budd (As Delivered, Interior Scheme 2)");
		textureDescriptionMap.put(30, "NYC Budd (As Delivered, Interior Scheme 3)");
		textureDescriptionMap.put(31, "NYC Budd (As Delivered, Interior Scheme 4)");
		textureDescriptionMap.put(32, "NYC Budd (Postwar, Interior Scheme 1)");
		textureDescriptionMap.put(33, "NYC Budd (Postwar, Interior Scheme 2)");
		textureDescriptionMap.put(34, "NYC Budd (Postwar Interior Scheme 3)");
		textureDescriptionMap.put(35, "NYC Budd (Postwar, Interior Scheme 4)");
		textureDescriptionMap.put(36, "NYC Budd (Later Postwar, Interior Scheme 1)");
		textureDescriptionMap.put(37, "NYC Budd (Later Postwar, Interior Scheme 2)");
		textureDescriptionMap.put(38, "NYC Budd (Later Postwar Interior Scheme 3)");
		textureDescriptionMap.put(39, "NYC Budd (Later Postwar, Interior Scheme 4)");
	}

	public NYCPrewar56SeatCoach(World world, double posX, double posY, double posZ)
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