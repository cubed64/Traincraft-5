package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class FNCC50Foot extends AbstractStandardFreightCar
{
    public FNCC50Foot(World world) {
        super(world);
    }

    public FNCC50Foot(World world, double x, double y, double z){
        super(world, x, y, z);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }

    @Override
    public void setupTextureDescription()
    {
        textureDescriptionMap.put(0, "FNCC");
        textureDescriptionMap.put(1, "FNCC (Post '86 Logo)");
        textureDescriptionMap.put(2, "FNCC (Fast as A Fox)");
        textureDescriptionMap.put(3, "FNCC (Small Logo)");
        textureDescriptionMap.put(4, "FNCC (Olympic Range Logo)");
        textureDescriptionMap.put(5, "LRR");
        textureDescriptionMap.put(6, "LRR (Words)");
        textureDescriptionMap.put(7, "NSCC");
        textureDescriptionMap.put(8, "UNCLX");
        textureDescriptionMap.put(9, "COW");
        textureDescriptionMap.put(10, "COW");
        textureDescriptionMap.put(11, "COW");
        textureDescriptionMap.put(12, "COW");
        textureDescriptionMap.put(13, "B&B");
        textureDescriptionMap.put(14, "SPB");
        textureDescriptionMap.put(15, "SNCT");
        textureDescriptionMap.put(16, "DLMR");
        textureDescriptionMap.put(17, "DN");
        textureDescriptionMap.put(18, "AG&W");
    }

    @Override
    public String getInventoryName() {
        return "KSFI 50' Mini-Highcube Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.4F;
    }
}