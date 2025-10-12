package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.Modelcoil_load2;
import com.jcirmodelsquad.tcjcir.models.loads.Modelgondola_load_flat_aggregates_small;
import com.jcirmodelsquad.tcjcir.models.loads.Modelrebar_bundle;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class ACF41Gon extends AbstractStandardFreightCar
{
    public ACF41Gon(World world) {
        super(world);
    }

    public ACF41Gon(World world, double x, double y, double z){
        super(world, x , y, z);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(Modelgondola_load_flat_aggregates_small.class, "loads/gondola_load_flat_aggregates_medium_dort",
                        "Aggregate - Dirt", 0, 2.5, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_small.class, "loads/gondola_load_flat_aggregates_medium_peagravel",
                        "Aggregate - Peagravel", 0, 2.5, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_small.class, "loads/gondola_load_flat_aggregates_medium_gravel",
                        "Aggregate - Gravel", 0, 2.5, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_small.class, "loads/gondola_load_flat_aggregates_medium_scrap1",
                        "Scrapmetal A", 0, 2.5, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_small.class, "loads/gondola_load_flat_aggregates_medium_scrap2",
                        "Scrapmetal B", 0, 2.5, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_small.class, "loads/gondola_load_flat_cullet2_medium",
                        "Cullet / Scrap Glass", 0, 2.5, 0)},
                { new CargoSpecification(Modelrebar_bundle.class, "loads/rebar_bundle2",
                        "Rebar Bundle", 0, 2.5, 0)},
                { new CargoSpecification(Modelcoil_load2.class, "loads/coils",
                        "Metal Coils", 0, 2.375, 0)},
        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "SP&S");
        InsertTexture(1, "NP");
        InsertTexture(2, "NP");
        InsertTexture(3, "FNCC");
        InsertTexture(4, "FNCC");
    }

    @Override
    public String getInventoryName() {
        return "AC&F 41' 6 Gondol";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.05F;
    }
}