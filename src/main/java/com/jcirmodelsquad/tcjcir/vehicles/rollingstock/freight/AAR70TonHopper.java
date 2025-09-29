package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.ModelAAR70TonHopperLoad;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class AAR70TonHopper extends AbstractStandardFreightCar
{
    public AAR70TonHopper(World world) {
        super(world);
    }

    public AAR70TonHopper(World world, double x, double y, double z){
        super(world, x, y, z);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(ModelAAR70TonHopperLoad.class,
                        "loads/AAR_70Ton_hopper_load_coal", "Coal", 0, 3.05, 0) },
                { new CargoSpecification(ModelAAR70TonHopperLoad.class,
                        "loads/AAR_70Ton_hopper_load_gravel", "Gravel", 0, 3.05, 0) }
        });
    }

    @Override
    public void setupTextureDescription()
    {
        textureDescriptionMap.put(0, "NKP");
        textureDescriptionMap.put(1, "GC&M");
        textureDescriptionMap.put(2, "AGW");
        textureDescriptionMap.put(3, "TNO As-Delivered");
        textureDescriptionMap.put(4, "TNO Later");
    }

    @Override
    public String getInventoryName() {
        return "AAR 70 ton hopper";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.275F;
    }

}
