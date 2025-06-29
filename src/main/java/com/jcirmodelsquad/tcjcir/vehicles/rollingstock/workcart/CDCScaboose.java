package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class CDCScaboose extends AbstractWorkCart
{
    public CDCScaboose(World world) {
        super(world);
        textureDescriptionMap.put(0, "CDCS");
        textureDescriptionMap.put(1, "CDCS (Modernized)");
        textureDescriptionMap.put(2, "NPS");
        textureDescriptionMap.put(3, "MOW");
    }

    public CDCScaboose(World world, double posX, double posY, double posZ)
    {
        super(world, posX, posY, posZ);
    }

    @Override
    public double getAdditionalYOffset()
    {
        return -0.15F;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart)
    {
        return 2.0375F;
    }
}