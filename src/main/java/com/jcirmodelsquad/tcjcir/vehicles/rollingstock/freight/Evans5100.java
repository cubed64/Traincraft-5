package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Evans5100 extends AbstractStandardFreightCar
{
    public Evans5100(World world) {
        super(world);
    }

    public Evans5100(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "Evans Demo (USLX)");
        textureDescriptionMap.put(1, "PMA (USLX)");
        textureDescriptionMap.put(2, "PMA (USLX) 2");
        textureDescriptionMap.put(3, "Ogden (USLX)");
        textureDescriptionMap.put(4, "Purina (USLX)");
        textureDescriptionMap.put(5, "PIMP");
        textureDescriptionMap.put(6, "BCOL");
        textureDescriptionMap.put(7, "Georgia Pacific");
        textureDescriptionMap.put(8, "Sargento (WSOR)");
        textureDescriptionMap.put(9, "WSOR");
        textureDescriptionMap.put(10, "UP");
        textureDescriptionMap.put(11, "SFLC");
        textureDescriptionMap.put(12, "IC");
        textureDescriptionMap.put(13, "MP");
        textureDescriptionMap.put(14, "FWD");
        textureDescriptionMap.put(15, "MNS");
        textureDescriptionMap.put(16, "ITC");
        textureDescriptionMap.put(17, "GT");
        textureDescriptionMap.put(18, "CNW (Red)");
        textureDescriptionMap.put(19, "TPW");
        textureDescriptionMap.put(20, "Blandsville & Blankerston (USRE Ends)");
        textureDescriptionMap.put(21, "Aloha Shake (USLX)");
        textureDescriptionMap.put(22, "PMA (USLX) 3");
        textureDescriptionMap.put(23, "Louisiana Pacific");
        textureDescriptionMap.put(24, "CNW (Yellow)");
        textureDescriptionMap.put(25, "BM");
        textureDescriptionMap.put(26, "Blandsville & Blankerston (PS Ends)");
        textureDescriptionMap.put(27, "");
    }

    @Override
    public String getInventoryName() {
        return "Evans-USRE 5100 Cu Ft Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.875F;
    }
}
