package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.ModelBethgon_load;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class BethgonII extends AbstractStandardFreightCar
{
    public BethgonII(World world) {
        super(world);
    }
    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]
        {
                { new CargoSpecification(ModelBethgon_load.class,
                        "loads/bethgon_load_coal", "Coal", 0, 2.95, 0, 0, 0,0) },
                { new CargoSpecification(ModelBethgon_load.class,
                        "loads/bethgon_load_rock", "Rock", 0, 2.95, 0, 0, 0,0) },
                { new CargoSpecification(ModelBethgon_load.class,
                        "loads/bethgon_load_peterite", "Peterite", 0, 2.95, 0, 0, 0,0) },
                { new CargoSpecification(ModelBethgon_load.class,
                        "loads/Skinbethgon_loadDirt", "Dirt", 0, 2.95, 0, 0, 0,0) },
                { new CargoSpecification(ModelBethgon_load.class,
                        "loads/Skinbethgon_loadGravel", "Gravel", 0, 2.95, 0, 0, 0,0) },
                { new CargoSpecification(ModelBethgon_load.class,
                        "loads/Skinbethgon_loadPeagravel", "Pea Gravel", 0, 2.95, 0, 0, 0,0) },
                { new CargoSpecification(ModelBethgon_load.class,
                        "loads/Skinbethgon_loadBallast", "Ballast", 0, 2.95, 0, 0, 0,0) },
                { new CargoSpecification(ModelBethgon_load.class,
                        "loads/Skinbethgon_loadBallastPeagravel", "Ballasted Peagravel", 0, 2.95, 0, 0, 0,0) },
                { new CargoSpecification(ModelBethgon_load.class,
                        "loads/Skinbethgon_loadMarbleDust", "creth cocaiener", 0, 2.95, 0, 0, 0,0) },
        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "Generic Black");
        InsertTexture(1, "Generic Silver W/Green End");
        InsertTexture(2, "Generic Silver W/Orange End");
        InsertTexture(3, "CSXT");
        InsertTexture(4, "Generic Silver");
        InsertTexture(5, "UP");
        InsertTexture(6, "NS");
        InsertTexture(7, "C&PV (Rock Service)");
        InsertTexture(8, "C&PV (Rock Service)");
        InsertTexture(9, "GCM", train.common.enums.LockoutGroup.GCM);
    }

    @Override
    public String getInventoryName() {
        return "Bethgon II Open Top Hopper";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.57F;
    }
}
