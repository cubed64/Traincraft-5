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
    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "FNCC");
        InsertTexture(1, "FNCC (Post '86 Logo)");
        InsertTexture(2, "FNCC (Fast as A Fox)");
        InsertTexture(3, "FNCC (Small Logo)");
        InsertTexture(4, "FNCC (Olympic Range Logo)");
        InsertTexture(5, "LRR");
        InsertTexture(6, "LRR (Words)");
        InsertTexture(7, "NSCC");
        InsertTexture(8, "UNCLX");
        InsertTexture(9, "COW");
        InsertTexture(10, "COW");
        InsertTexture(11, "COW");
        InsertTexture(12, "COW");
        InsertTexture(13, "B&B");
        InsertTexture(14, "SPB");
        InsertTexture(15, "SNCT");
        InsertTexture(16, "DLMR");
        InsertTexture(17, "DN");
        InsertTexture(18, "AG&W");
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