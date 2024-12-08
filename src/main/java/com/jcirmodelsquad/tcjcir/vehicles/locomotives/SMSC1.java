package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractTankSlug;
import train.common.library.EnumTrains;

public class SMSC1 extends AbstractTankSlug
{
    public SMSC1(World world)
    {
        super(world, EnumTrains.SMSC1);
        textureDescriptionMap.put(0, "FNCC S99 (KIT-L, Dual Canon)");
    }

    public SMSC1(World world, double d, double d1, double d2)
    {
        super(world, EnumTrains.SMSC1, d, d1, d2);
    }

    @Override
    public String getInventoryName() {
        return "Slug Motor System, C-C, Type 1";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.0F;
    }
}