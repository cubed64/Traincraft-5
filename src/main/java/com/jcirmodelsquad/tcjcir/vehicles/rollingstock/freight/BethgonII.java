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

    public BethgonII(World world, double x, double y, double z){
        super(world, x, y, z);
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
        textureDescriptionMap.put(0, "Generic Black");
        textureDescriptionMap.put(1, "Generic Silver W/Green End");
        textureDescriptionMap.put(2, "Generic Silver W/Orange End");
        textureDescriptionMap.put(3, "CSXT");
        textureDescriptionMap.put(4, "Generic Silver");
        textureDescriptionMap.put(5, "UP");
        textureDescriptionMap.put(6, "NS");
        textureDescriptionMap.put(7, "C&PV (Rock Service)");
        textureDescriptionMap.put(8, "C&PV (Rock Service)");
        textureDescriptionMap.put(9, "GCM");
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
