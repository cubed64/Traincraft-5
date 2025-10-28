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



    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "ARMN");
        InsertTexture(1, "Naked Juice");
        InsertTexture(2, "Tropicana");
        InsertTexture(3, "Cryotrans");
        InsertTexture(4, "Cryotrans (Cavendish)");
        InsertTexture(5, "Cryotrans (Carnation)");
        InsertTexture(6, "Cryotrans (McCain)");
        InsertTexture(7, "OWO (Coolsville)");
        InsertTexture(8, "NEP");
        InsertTexture(9, "NEP");
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
