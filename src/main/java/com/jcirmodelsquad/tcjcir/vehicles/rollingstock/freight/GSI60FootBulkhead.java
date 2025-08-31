package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.ModelMixedLogs_gsi_53_tall;
import com.jcirmodelsquad.tcjcir.models.loads.ModelWrappedWoodOptimized_bulkhead_slice;
import com.jcirmodelsquad.tcjcir.models.loads.Modelgsi_60_foot_bulk_stakes;
import com.jcirmodelsquad.tcjcir.models.loads.Modelpipeload1;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class GSI60FootBulkhead extends AbstractStandardFreightCar
{
    public GSI60FootBulkhead(World world) {
        super(world);
    }

    public GSI60FootBulkhead(World world, double x, double y, double z){
        super(world, x , y, z);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][] {

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//washaska wood
                        "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 1.555, 0),
                        /*new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                                "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Wrapped Lumber (Washaska)", 0, 2.985, 0)*/},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//washaska wood 2
                        "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 1.555, 0),
                        /*new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                                "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Wrapped Lumber (Washaska)", 0, 2.985, 0)*/},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//tolko wood
                        "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 1.555, 0),
                        /*new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                                "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Wrapped Lumber (Tolko)", 0, 2.985, 0)*/},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//canfor wood
                        "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 1.555, 0),
                        /*new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                                "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Wrapped Lumber (Canfor)", 0, 2.985, 0)*/},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//blank wood
                        "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 1.555, 0),
                        /*new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                                "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Wrapped Lumber", 0, 2.985, 0)*/},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//foggy woob
                        "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 1.555, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Thick & Thin
                        "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 1.555, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Oak
                        "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 1.555, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Spruce
                        "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 1.555, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Birch
                        "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 1.555, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Jungle
                        "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 1.555, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Acacia
                        "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 1.555, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Dark Oak
                        "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 1.555, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Pine
                        "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 1.555, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Redwood
                        "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 1.555, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Fir
                        "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 1.555, 0),},

                { new CargoSpecification(Modelpipeload1.class,
                        "loads/pipe_falling_sfx_1", "Pipes", 0, 2.5, 0) },

                { new CargoSpecification(ModelMixedLogs_gsi_53_tall.class,
                        "loads/MixedLogs_Spruce", "Spruce Logs", 0, 2.5, 0),
                        new CargoSpecification(Modelgsi_60_foot_bulk_stakes.class,
                                "loads/gsi_53_bulk_stakes", "Spruce Logs", 0, 3, 0) },

                { new CargoSpecification(ModelMixedLogs_gsi_53_tall.class,
                        "loads/MixedLogs_Oak", "Oak Logs", 0, 2.5, 0),
                        new CargoSpecification(Modelgsi_60_foot_bulk_stakes.class,
                                "loads/gsi_53_bulk_stakes", "Oak Logs", 0, 3, 0) },

                { new CargoSpecification(ModelMixedLogs_gsi_53_tall.class,
                        "loads/MixedLogs_Redwood", "Redwood Logs", 0, 2.5, 0),
                        new CargoSpecification(Modelgsi_60_foot_bulk_stakes.class,
                                "loads/gsi_53_bulk_stakes", "Redwood Logs", 0, 3, 0) },

                { new CargoSpecification(ModelMixedLogs_gsi_53_tall.class,
                        "loads/MixedLogs_Pine", "Pine Logs", 0, 2.5, 0),
                        new CargoSpecification(Modelgsi_60_foot_bulk_stakes.class,
                                "loads/gsi_53_bulk_stakes", "Pine Logs", 0, 3, 0) },

                { new CargoSpecification(ModelMixedLogs_gsi_53_tall.class,
                        "loads/MixedLogs_Fir", "Fir Logs", 0, 2.5, 0),
                        new CargoSpecification(Modelgsi_60_foot_bulk_stakes.class,
                                "loads/gsi_53_bulk_stakes", "Fir Logs", 0, 3, 0) },

                { new CargoSpecification(ModelMixedLogs_gsi_53_tall.class,
                        "loads/MixedLogs_Jungle", "Jungle Logs", 0, 2.5, 0),
                        new CargoSpecification(Modelgsi_60_foot_bulk_stakes.class,
                                "loads/gsi_53_bulk_stakes", "Jungle Logs", 0, 3, 0) },

                { new CargoSpecification(ModelMixedLogs_gsi_53_tall.class,
                        "loads/MixedLogs_Birch", "Birch Logs", 0, 2.5, 0),
                        new CargoSpecification(Modelgsi_60_foot_bulk_stakes.class,
                                "loads/gsi_53_bulk_stakes", "Birch Logs", 0, 3, 0) },

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Douglas Fir
                        "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 1.555, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Sitka Spruce
                        "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 1.555, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Western Red Cedar
                        "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 2.5, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 2.185, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 1.87, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                                "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 1.555, 0),},
        });
    }

    @Override
    public void setupTextureDescription()
    {
        textureDescriptionMap.put(0, "GN 1");
        textureDescriptionMap.put(1, "GN 2");
        textureDescriptionMap.put(2, "BN");
        textureDescriptionMap.put(3, "SCL");
        textureDescriptionMap.put(4, "ACL 1");
        textureDescriptionMap.put(5, "ACL 2");
        textureDescriptionMap.put(6, "FNCC");
    }

    @Override
    public String getInventoryName() {
        return "GSI 60' Bulkhead Flatcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.9F;
    }
}
