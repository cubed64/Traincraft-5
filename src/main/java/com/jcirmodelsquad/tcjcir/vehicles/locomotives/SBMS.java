package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractTankSlug;
import train.common.library.EnumTrains;

public class SBMS extends AbstractTankSlug
{
    public SBMS(World world)
    {
        super(world, EnumTrains.SBMS);
        textureDescriptionMap.put(0, "FNCC");
        textureDescriptionMap.put(1, "WP");
        textureDescriptionMap.put(2, "Blandsville & Blasic i mean Blankerston");
        textureDescriptionMap.put(3, "TTLC (Burnt Forest Black)");
        textureDescriptionMap.put(4, "TTLC (Cedar Blue)");
        textureDescriptionMap.put(5, "TTLC (Cedar Green)");
        textureDescriptionMap.put(6, "TTLC (Evergreen)");
        textureDescriptionMap.put(7, "TTLC (Fern)");
        textureDescriptionMap.put(8, "TTLC (Fern Green)");
        textureDescriptionMap.put(9, "TTLC (Fir Green)");
        textureDescriptionMap.put(10, "TTLC (Jungle Green)");
        textureDescriptionMap.put(11, "TTLC (Pine Green)");
        textureDescriptionMap.put(12, "TTLC (Red Forest Brown)");
        textureDescriptionMap.put(13, "Galesburg Clinton & Midland");
    }

    public SBMS(World world, double d, double d1, double d2) {
        super(world, EnumTrains.SBMS, d, d1, d2);
    }

    @Override
    public String getInventoryName() {
        return "CEE SB Motor System";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.9F;
    }

}