package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.Model35FootCrate;
import com.jcirmodelsquad.tcjcir.models.loads.Model35FootDimensionalLumber;
import com.jcirmodelsquad.tcjcir.models.loads.Model35FootRails;
import com.jcirmodelsquad.tcjcir.models.loads.Model35FootTies;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class MaPa35FootFlat extends AbstractStandardFreightCar
{
    public MaPa35FootFlat(World world) {
        super(world);
    }

    public MaPa35FootFlat(World world, double x, double y, double z){
        super(world, x , y, z);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]
        {
            { new CargoSpecification(Model35FootCrate.class,
                    "loads/crate35Foot", "Crate", 0, 3.0, 0) },
            { new CargoSpecification(Model35FootDimensionalLumber.class,
                    "loads/dimensionalLumber_35Foot", "Dimensional Lumber", 0, 3.0, 0) },
            { new CargoSpecification(Model35FootRails.class,
                    "loads/rails35Foot", "Rails", 0, 3.0, 0) },
            { new CargoSpecification(Model35FootTies.class,
                    "loads/ties35Foot", "Ties", 0, 3.0, 0) },
        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "Brown");
        InsertTexture(1, "MOW");
        InsertTexture(2, "Brown (Stakes)");
        InsertTexture(3, "MOW (Stakes)");
        InsertTexture(4, "Black");
        InsertTexture(5, "Green");
        InsertTexture(6, "Green (Stakes)");
        InsertTexture(7, "Oxide Red (Stakes)");
        InsertTexture(8, "Black (Stakes)");
        InsertTexture(9, "Oxide Red (Stakes)");
    }

    @Override
    public String getInventoryName() {
        return "MA&PA 35' Flatcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.87F;
    }
}