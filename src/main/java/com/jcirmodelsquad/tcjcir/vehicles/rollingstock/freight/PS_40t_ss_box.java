package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PS_40t_ss_box extends AbstractStandardFreightCar
{
    public PS_40t_ss_box(World world) {
        super(world);
    }

    public PS_40t_ss_box(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "Western Pacific (Later)");
        textureDescriptionMap.put(1, "Western Pacific (As-Delivered)");
        textureDescriptionMap.put(2, "UNCLX");
        textureDescriptionMap.put(3, "Generic Brown");
        textureDescriptionMap.put(4, "Blank Red");
        textureDescriptionMap.put(5, "CDC&S");
        textureDescriptionMap.put(6, "E&ARR");
        textureDescriptionMap.put(7, "WPSR (Updated)");
        textureDescriptionMap.put(8, "WPSR (As-Delivered)");
    }

    @Override
    public String getInventoryName() {
        return "Pullman Mfg 40 Ton Single-Sheath Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.15F;
    }
}