package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;

import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PFEr_40_23Reefer extends AbstractStandardFreightCar
{
    public PFEr_40_23Reefer(World world) {
        super(world);

    }
@Override
public void setupTextureDescription()
{
    textureDescriptionMap.put(0, "PFE (SP First)");
    textureDescriptionMap.put(1, "PFE (UP First)");
    textureDescriptionMap.put(2, "Northern Pacific");
    textureDescriptionMap.put(3, "DCLX");
    textureDescriptionMap.put(4, "Steampunk Rail");
    textureDescriptionMap.put(5, "Not the SCP Foundation");
}
    public PFEr_40_23Reefer(World world, double d, double d1, double d2){
        super(world,d,d1,d2);

    }

    @Override
    public String getInventoryName() {
        return "PFE R-40-23 Ice Reefer";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.1F;
    }
    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }
}