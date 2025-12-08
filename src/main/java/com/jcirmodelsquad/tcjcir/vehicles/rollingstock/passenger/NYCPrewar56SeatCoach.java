package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class NYCPrewar56SeatCoach extends AbstractPassengerCar {

	public NYCPrewar56SeatCoach(World world) {
		super(world);
		InsertTexture(0, "NYC PS (As Delivered)");
		InsertTexture(1, "NYC PS (James Whitcomb Riley)");
		InsertTexture(2, "NYC PS (Mercury)");
		InsertTexture(3, "NYC PS (Mercury, Removed Skirting)");
		InsertTexture(4, "NYC PS (1940 20th Century Limited scheme)");
		InsertTexture(5, "NYC PS (Experimental Scheme)");
		InsertTexture(6, "NYC PS (Inverted Scheme)");
		InsertTexture(7, "NYC PS (Pacemaker Green, Removed Skirting)");
		InsertTexture(8, "NYC PS (Postwar)");
		InsertTexture(9, "NYC PS (Late Postwar, Interior Scheme 1)");
		InsertTexture(10, "NYC PS (Late Postwar, Interior Scheme 2)");
		InsertTexture(11, "PC PS (Interior Scheme 1)");
		InsertTexture(12, "PC PS (Interior Scheme 2)");
		InsertTexture(13, "PC PS (Alternate Exterior Scheme)");
		InsertTexture(14, "NYC AC&F (As Delivered)");
		InsertTexture(15, "NYC AC&F (Inverted Scheme)");
		InsertTexture(16, "NYC AC&F (Pacemaker Green, Removed Skirting)");
		InsertTexture(17, "NYC AC&F (Postwar)");
		InsertTexture(18, "NYC AC&F (Late Postwar, Interior Scheme 1)");
		InsertTexture(19, "NYC AC&F (Late Postwar, Interior Scheme 2)");
		InsertTexture(20, "PC AC&F (Interior Scheme 1)");
		InsertTexture(21, "PC AC&F (Interior Scheme 2)");
		InsertTexture(22, "NYC PSCC (As Delivered)");
		InsertTexture(23, "NYC PSCC (Inverted Scheme)");
		InsertTexture(24, "NYC PSCC (Pacemaker Green, Removed Skirting)");
		InsertTexture(25, "NYC PSCC (Postwar)");
		InsertTexture(26, "NYC PSCC (Late Postwar)");
		InsertTexture(27, "NYC PSCC (Late Postwar, Alternate Exterior Scheme)");
		InsertTexture(28, "NYC Budd (As Delivered, Interior Scheme 1)");
		InsertTexture(29, "NYC Budd (As Delivered, Interior Scheme 2)");
		InsertTexture(30, "NYC Budd (As Delivered, Interior Scheme 3)");
		InsertTexture(31, "NYC Budd (As Delivered, Interior Scheme 4)");
		InsertTexture(32, "NYC Budd (Postwar, Interior Scheme 1)");
		InsertTexture(33, "NYC Budd (Postwar, Interior Scheme 2)");
		InsertTexture(34, "NYC Budd (Postwar Interior Scheme 3)");
		InsertTexture(35, "NYC Budd (Postwar, Interior Scheme 4)");
		InsertTexture(36, "NYC Budd (Later Postwar, Interior Scheme 1)");
		InsertTexture(37, "NYC Budd (Later Postwar, Interior Scheme 2)");
		InsertTexture(38, "NYC Budd (Later Postwar Interior Scheme 3)");
		InsertTexture(39, "NYC Budd (Later Postwar, Interior Scheme 4)");
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

	@Override
	public String transportYear() {
		return "1941-1942";
	}
}