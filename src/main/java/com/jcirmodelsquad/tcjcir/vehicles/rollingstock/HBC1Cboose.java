package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class HBC1Cboose extends AbstractWorkCart
{
    public HBC1Cboose(World world) {
        super(world);
        textureDescriptionMap.put(0, "Western Pacific");
        textureDescriptionMap.put(1, "Steampunk Rail");
        textureDescriptionMap.put(2, "Great Lakes & Nice Tiddies");
        textureDescriptionMap.put(3, "CRL");
    }

    public HBC1Cboose(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

    @Override
    public double getAdditionalYOffset()
    {
        return -0.1F;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart)
    {
        return 2.23F;
    }
}