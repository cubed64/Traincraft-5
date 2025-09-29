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

    public OreJenny(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "ORJY");
        textureDescriptionMap.put(1, "DMIR");
        textureDescriptionMap.put(2, "MILW");
        textureDescriptionMap.put(3, "WETX");
        textureDescriptionMap.put(4, "JC's period mining incorperated");
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
