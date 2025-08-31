package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class SP_B50 extends AbstractStandardFreightCar
{
    public SP_B50(World world) {
        super(world);
    }

    public SP_B50(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "B-50-15 SP As-Delivered");
        textureDescriptionMap.put(1, "B-50-15 MT&L As-Delivered");
        textureDescriptionMap.put(2, "B-50-15 SP Steelsides");
        textureDescriptionMap.put(3, "B-50-15 SP OVERNIGHT Scheme");
        textureDescriptionMap.put(4, "B-50-15 SP Head-End Car");
        textureDescriptionMap.put(5, "B-50-16 SP As-Delivered");
        textureDescriptionMap.put(6, "B-50-16 SD&AE");
        textureDescriptionMap.put(7, "B-50-15 Steelsides Blank");
        textureDescriptionMap.put(8, "B-50-16 Blank");
        textureDescriptionMap.put(9, "B-50-15 Blank");
    }

    @Override
    public String getInventoryName() {
        return "Pullman Mfg 40 Ton Single-Sheath Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.2F;
    }
}