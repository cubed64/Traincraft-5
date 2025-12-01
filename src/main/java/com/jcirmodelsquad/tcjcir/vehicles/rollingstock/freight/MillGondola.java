package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.*;
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
                { new CargoSpecification(Modelmill_gondola_ties.class, "loads/gondola_load_millgondola_ties",
                        "Ties", 0, 3, 0)},
                { new CargoSpecification(Modelmill_gondola_CSXT_tie_crib.class, "loads/gondola_load_millgondola_ties_crib_orange",
                        "CSXT Tie Crib With Ties (Orange)", 0, 2.999, 0)},
                { new CargoSpecification(Modelmill_gondola_CSXT_tie_crib.class, "loads/gondola_load_millgondola_ties_crib_yellow",
                        "CSXT Tie Crib With Ties (Yellow)", 0, 2.999, 0)},
                { new CargoSpecification(Modelmill_gondola_CSXT_tie_crib.class, "loads/gondola_load_millgondola_ties_crib_orange_empty",
                        "CSXT Tie Crib (Yellow)", 0, 2.999, 0)},
                { new CargoSpecification(Modelmill_gondola_CSXT_tie_crib.class, "loads/gondola_load_millgondola_ties_crib_yellow_empty",
                        "CSXT Tie Crib (Yellow)", 0, 2.999, 0)},
        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "WCRC");
        InsertTexture(1, "GONX");
        InsertTexture(2, "OWO");
        InsertTexture(3, "MT&S");
        InsertTexture(4, "FNCC");
        InsertTexture(5, "FNCC");
        InsertTexture(6, "FNCC");
        InsertTexture(7, "PRD");
        InsertTexture(8, "PRD");
        InsertTexture(9, "PRD (DEMOMAN GRAFFITI)");
        InsertTexture(10, "DJJX / Generic Black");
        InsertTexture(11, "Generic Green");
        InsertTexture(12, "CSX");
        InsertTexture(13, "CSX MoW (Orange)");
        InsertTexture(14, "CSX MoW (Yellow)");
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