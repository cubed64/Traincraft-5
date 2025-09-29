package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Reefer64Foot extends AbstractStandardFreightCar
{
    public Reefer64Foot(World world) {
        super(world);
    }

    public Reefer64Foot(World world, double x, double y, double z){
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
        textureDescriptionMap.put(0, "ARMN");
        textureDescriptionMap.put(1, "Naked Juice");
        textureDescriptionMap.put(2, "Tropicana");
        textureDescriptionMap.put(3, "Cryotrans");
        textureDescriptionMap.put(4, "Cryotrans (Cavendish)");
        textureDescriptionMap.put(5, "Cryotrans (Carnation)");
        textureDescriptionMap.put(6, "Cryotrans (McCain)");
        textureDescriptionMap.put(7, "OWO (Coolsville)");
        textureDescriptionMap.put(8, "NEP");
        textureDescriptionMap.put(9, "NEP");
    }

    @Override
    public String getInventoryName() {
        return "Trinity 64' Mechanical Reefer";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.5F;
    }
}
