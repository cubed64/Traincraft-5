package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class HBC1Bboose extends AbstractWorkCart
{
    public HBC1Bboose(World world) {
        super(world);
        textureDescriptionMap.put(0, "Ann Arbor");
        textureDescriptionMap.put(1, "WV");
        textureDescriptionMap.put(2, "GCN");
        textureDescriptionMap.put(3, "GCM");
        textureDescriptionMap.put(4, "TIRY");
        textureDescriptionMap.put(5, "TIRY");
        textureDescriptionMap.put(6, "CRL");
    }

    public HBC1Bboose(World world, double posX, double posY, double posZ)
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