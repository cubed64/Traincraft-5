package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class IngotPig extends AbstractStandardFreightCar
{
    public IngotPig(World world) {
        super(world);
    }

    public IngotPig(World world, double x, double y, double z){
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
        InsertTexture(0, "FAWX");
        InsertTexture(1, "Generic");
    }

    @Override
    public String getInventoryName() {
        return "Molten Ingot Pig";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.3F;
    }
}