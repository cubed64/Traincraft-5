package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.Modelcoil_load;
import com.jcirmodelsquad.tcjcir.models.loads.Modelgondola_load_flat_aggregates_medium2;
import com.jcirmodelsquad.tcjcir.models.loads.Modelrebar_bundle;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class gsco52millgon extends AbstractStandardFreightCar
{
    public int freightInventorySize;
    public int numFreightSlots;
    public gsco52millgon(World world) {
        super(world);
    }

    public gsco52millgon(World world, double x, double y, double z){
        super(world, x , y, z);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(Modelgondola_load_flat_aggregates_medium2.class, "loads/gondola_load_flat_aggregates_medium_dort",
                        "Aggregate - Dirt", 0, 2.7, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_medium2.class, "loads/gondola_load_flat_aggregates_medium_peagravel",
                        "Aggregate - Peagravel", 0, 2.7, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_medium2.class, "loads/gondola_load_flat_aggregates_medium_gravel",
                        "Aggregate - Gravel", 0, 2.7, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_medium2.class, "loads/gondola_load_flat_aggregates_medium_scrap1",
                        "Scrapmetal A", 0, 2.7, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_medium2.class, "loads/gondola_load_flat_aggregates_medium_scrap2",
                        "Scrapmetal B", 0, 2.7, 0)},
                { new CargoSpecification(Modelgondola_load_flat_aggregates_medium2.class, "loads/gondola_load_flat_cullet2_medium",
                        "Cullet / Scrap Glass", 0, 2.7, 0)},
                { new CargoSpecification(Modelrebar_bundle.class, "loads/rebar_bundle2",
                        "Rebar Bundle", 0, 2.5, 0)},
                { new CargoSpecification(Modelcoil_load.class, "loads/coils",
                        "Metal Coils", 0, 2.5, 0)},
        });
    }

    @Override
    public void setupTextureDescription()
    {
        textureDescriptionMap.put(0, "BN");
        textureDescriptionMap.put(1, "CB&Q (Green)");
        textureDescriptionMap.put(2, "CB&Q (Red)");
        textureDescriptionMap.put(3, "CB&Q (Brown)");
        textureDescriptionMap.put(4, "AA");
        textureDescriptionMap.put(5, "Generic Black");
        textureDescriptionMap.put(6, "Generic Boxcar Red");
        textureDescriptionMap.put(7, "NYC");
        textureDescriptionMap.put(8, "Erie");
        textureDescriptionMap.put(9, "EL");
        textureDescriptionMap.put(10, "SLSF (Brown)");
        textureDescriptionMap.put(11, "SLSF (Black)");
        textureDescriptionMap.put(12, "RI");
    }

    @Override
    public String getInventoryName() {
        return "GSCO 52' Drop-End Mill Gondola";
    }//GSCO 67' Mill Gondola

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.6F;
    }
}