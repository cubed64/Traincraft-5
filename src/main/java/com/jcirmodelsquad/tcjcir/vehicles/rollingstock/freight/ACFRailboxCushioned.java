package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACFRailboxCushioned extends AbstractStandardFreightCar
{
    public ACFRailboxCushioned(World world) {
        super(world);
    }

    public ACFRailboxCushioned(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "ASAB (Cushioned)");
        textureDescriptionMap.put(1, "ADN (Cushioned)");
        textureDescriptionMap.put(2, "BN (Cushioned)");
        textureDescriptionMap.put(3, "MP (Cushioned)");
        textureDescriptionMap.put(4, "T&P (Cushioned)");
        textureDescriptionMap.put(5, "St, Maries (Cushioned)");
        textureDescriptionMap.put(6, "Blandsville & Blankerston (Cushioned)");
        textureDescriptionMap.put(7, "DLMR (Cushioned)");
        textureDescriptionMap.put(8, "AN (Cushioned)");
        textureDescriptionMap.put(9, "OC&G (Cushioned)");
    }

    @Override
    public String getInventoryName() {
        return "ACF Railbox Boxcar (Cushioned)";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.9F;
    }
}
