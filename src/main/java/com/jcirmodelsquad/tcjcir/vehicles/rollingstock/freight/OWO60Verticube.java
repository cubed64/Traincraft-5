package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class OWO60Verticube extends AbstractStandardFreightCar
{
    public OWO60Verticube(World world) {
        super(world);
    }

    public OWO60Verticube(World world, double x, double y, double z){
        super(world, x , y, z);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }

    @Override
    public void setupTextureDescription()
    {
        textureDescriptionMap.put(0, "FNCC (Verti-Cube)");
        textureDescriptionMap.put(1, "FNCC");
        textureDescriptionMap.put(2, "WRX (Tree Logo)");
        textureDescriptionMap.put(3, "LRR");
        textureDescriptionMap.put(4, "LRR (Large Wording)");
        textureDescriptionMap.put(5, "ANE");
        textureDescriptionMap.put(6, "ANE (Mega Cushion)");
        textureDescriptionMap.put(7, "ANE Mega Cushion (Graffiti)");
        textureDescriptionMap.put(8, "WRX Tree Logo (Graffiti)");
        textureDescriptionMap.put(9, "SNCT");
        textureDescriptionMap.put(10, "UNCLX");
        textureDescriptionMap.put(11, "WP (Early)");
        textureDescriptionMap.put(12, "WP (Late)");
        textureDescriptionMap.put(13, "FNCC (Foxtail Logo)");
        textureDescriptionMap.put(14, "FNCC (Dual Logos)");
        textureDescriptionMap.put(15, "FNCC (Olympic Range Logo)");
        textureDescriptionMap.put(16, "FBOX");
        textureDescriptionMap.put(17, "CNRC");
    }

    @Override
    public String getInventoryName() {
        return "KSFI 60' Verticube Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.95F;
    }
}
