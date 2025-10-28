package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class OreJenny extends AbstractStandardFreightCar
{
    public OreJenny(World world)
    {
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
        InsertTexture(0, "ORJY");
        InsertTexture(1, "DMIR");
        InsertTexture(2, "MILW");
        InsertTexture(3, "WETX");
        InsertTexture(4, "JC's period mining incorperated");
    }

    @Override
    public String getInventoryName() {
        return "Ore Jenni lul bean sus";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.1F;
    }
}
