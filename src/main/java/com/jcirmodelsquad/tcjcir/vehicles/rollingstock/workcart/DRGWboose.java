package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class DRGWboose extends AbstractWorkCart
{
    public DRGWboose(World world) {
        super(world);
        textureDescriptionMap.put(0, "DRGW (4 Stripe)");
        textureDescriptionMap.put(1, "DRGW (1 Stripe)");
        textureDescriptionMap.put(2, "DRGW (1 Stripe, Removed Windows)");
        textureDescriptionMap.put(3, "DRGW (01450, Induction Antennas)");
        textureDescriptionMap.put(4, "DRGW (01451-01459, Induction Antennas)");
        textureDescriptionMap.put(5, "DRGW (01440-01469, Radio Equipped)");
        textureDescriptionMap.put(6, "DRGW (01470-01479, Radio Equipped)");
        textureDescriptionMap.put(7, "DRGW (01400-01449, As built)");
        textureDescriptionMap.put(8, "DRGW (01407-01439, Late Early)");
        textureDescriptionMap.put(9, "DRGW (01400-01449)");
        textureDescriptionMap.put(10, "DRGW (01400-01406, Switch Caboose)");
        textureDescriptionMap.put(11, "DRGW (The Action Road)");
        textureDescriptionMap.put(12, "DRGW (The Action Road, Removed Windows)");
        textureDescriptionMap.put(13, "DLMR");
        textureDescriptionMap.put(14, "C&PV");
    }

    public DRGWboose(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

    @Override
    public float getOptimalDistance(EntityMinecart cart)
    {
        return 2.4F;
    }

    @Override
    public String getInventoryName() {
        return "DRGW 01400 Series Caboose";
    }
}