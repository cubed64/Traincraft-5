package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.Modelcoil_load;
import com.jcirmodelsquad.tcjcir.models.loads.Modelgondola_load_flat_aggregates_medium;
import com.jcirmodelsquad.tcjcir.models.loads.Modelrebar_bundle;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class MillGondola extends AbstractStandardFreightCar
{
    public MillGondola(World world) {
        super(world);

    }

    public MillGondola(World world, double x, double y, double z){
        super(world, x , y, z);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]
        {
                { new CargoSpecification(Modelgondola_load_flat_aggregates_medium.class, "loads/gondola_load_flat_aggregates_medium_dort",
                        "Aggregate - Dirt", 0, 2.475, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_medium.class, "loads/gondola_load_flat_aggregates_medium_peagravel",
                        "Aggregate - Peagravel", 0, 2.475, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_medium.class, "loads/gondola_load_flat_aggregates_medium_gravel",
                        "Aggregate - Gravel", 0, 2.475, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_medium.class, "loads/gondola_load_flat_aggregates_medium_scrap1",
                        "Scrapmetal A", 0, 2.475, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_medium.class, "loads/gondola_load_flat_aggregates_medium_scrap2",
                        "Scrapmetal B", 0, 2.475, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_medium.class, "loads/gondola_load_flat_cullet2_medium",
                        "Cullet / Scrap Glass", 0, 2.475, 0)},
                { new CargoSpecification(Modelrebar_bundle.class, "loads/rebar_bundle2",
                        "Rebar Bundle", 0, 2.375, 0)},
                { new CargoSpecification(Modelcoil_load.class, "loads/coils",
                        "Metal Coils", 0, 2.375, 0)},
        });
    }

    @Override
    public void setupTextureDescription()
    {
        textureDescriptionMap.put(0, "WCRC");
        textureDescriptionMap.put(1, "GONX");
        textureDescriptionMap.put(2, "OWO");
        textureDescriptionMap.put(3, "MT&S");
        textureDescriptionMap.put(4, "FNCC");
        textureDescriptionMap.put(5, "FNCC");
        textureDescriptionMap.put(6, "FNCC");
        textureDescriptionMap.put(7, "PRD");
        textureDescriptionMap.put(8, "PRD");
        textureDescriptionMap.put(9, "PRD (DEMOMAN GRAFFITI)");
        textureDescriptionMap.put(10, "DJJX / Generic Black");
        textureDescriptionMap.put(11, "Generic Green");
    }

    @Override
    public String getInventoryName() {
        return "52' Mill Gondola";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.4F;
    }
}