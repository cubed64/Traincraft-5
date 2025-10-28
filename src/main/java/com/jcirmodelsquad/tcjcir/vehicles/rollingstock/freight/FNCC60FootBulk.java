package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.ModelMixedLogs;
import com.jcirmodelsquad.tcjcir.models.loads.ModelWrappedWoodOptimized_bulkhead_slice;
import com.jcirmodelsquad.tcjcir.models.loads.Modelfncc60bulk_wrappedstack_tiedowns;
import com.jcirmodelsquad.tcjcir.models.loads.Modelpipeload1;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class FNCC60FootBulk extends AbstractStandardFreightCar
{
    public FNCC60FootBulk(World world)
    {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]
        {
            { new CargoSpecification(ModelMixedLogs.class,//spruce log
                    "loads/MixedLogs_Spruce", "Spruce Logs", 0.5,2.99,0.1),//maximum length, minimum height, maximum width
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Spruce", "Spruce Logs", -0.28,2.95,-0.05),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Spruce", "Spruce Logs", 0.1,2.75,-0.11),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Spruce", "Spruce Logs", 0.25,2.83,0.073),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Spruce", "Spruce Logs", -0.5,2.7,-0.034)},

            { new CargoSpecification(ModelMixedLogs.class,// oak log
                    "loads/MixedLogs_Oak", "Oak Logs", 0.5,2.99,0.1),//maximum length, minimum height, maximum width
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Oak", "Oak Logs", -0.28,2.95,-0.05),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Oak", "Oak Logs", 0.1,2.75,-0.11),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Oak", "Oak Logs", 0.25,2.83,0.073),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Oak", "Oak Logs", -0.5,2.7,-0.034)},

            { new CargoSpecification(ModelMixedLogs.class,// redwood log
                    "loads/MixedLogs_Redwood", "Redwood Logs", 0.5,2.99,0.1),//maximum length, minimum height, maximum width
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Redwood", "Redwood Logs", -0.28,2.95,-0.05),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Redwood", "Redwood Logs", 0.1,2.75,-0.11),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Redwood", "Redwood Logs", 0.25,2.83,0.073),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Redwood", "Redwood Logs", -0.5,2.7,-0.034)},

            { new CargoSpecification(ModelMixedLogs.class,// pine log
                    "loads/MixedLogs_Pine", "Pine Logs", 0.5,2.99,0.1),//maximum length, minimum height, maximum width
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Pine", "Pine Logs", -0.28,2.95,-0.05),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Pine", "Pine Logs", 0.1,2.75,-0.11),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Pine", "Pine Logs", 0.25,2.83,0.073),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Pine", "Pine Logs", -0.5,2.7,-0.034)},

            { new CargoSpecification(ModelMixedLogs.class,// fir log
                    "loads/MixedLogs_Fir", "Fir Logs", 0.5,2.99,0.1),//maximum length, minimum height, maximum width
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Fir", "Fir Logs", -0.28,2.95,-0.05),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Fir", "Fir Logs", 0.1,2.75,-0.11),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Fir", "Fir Logs", 0.25,2.83,0.073),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Fir", "Fir Logs", -0.5,2.7,-0.034)},

            { new CargoSpecification(ModelMixedLogs.class,// jungle log
                    "loads/MixedLogs_Jungle", "Jungle Logs", 0.5,2.99,0.1),//maximum length, minimum height, maximum width
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Jungle", "Jungle Logs", -0.28,2.95,-0.05),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Jungle", "Jungle Logs", 0.1,2.75,-0.11),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Jungle", "Jungle Logs", 0.25,2.83,0.073),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Jungle", "Jungle Logs", -0.5,2.7,-0.034)},

            { new CargoSpecification(ModelMixedLogs.class,// birch log
                    "loads/MixedLogs_Birch", "Birch Logs", 0.5,2.99,0.1),//maximum length, minimum height, maximum width
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Birch", "Birch Logs", -0.28,2.95,-0.05),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Birch", "Birch Logs", 0.1,2.75,-0.11),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Birch", "Birch Logs", 0.25,2.83,0.073),
                    new CargoSpecification(ModelMixedLogs.class,
                            "loads/MixedLogs_Birch", "Birch Logs", -0.5,2.7,-0.034)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//washaska wood
                    "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Wrapped Lumber (Washaska)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//washaska wood 2
                    "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Wrapped Lumber (Washaska)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//tolko wood
                    "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Wrapped Lumber (Tolko)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//canfor wood
                    "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Wrapped Lumber (Canfor)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//blank wood
                    "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Wrapped Lumber", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//foggye wood
                    "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Wrapped Lumber (Foggy River)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Thick & Thin
                    "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Wrapped Lumber (Thick & Thin)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Oak
                    "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Unwrapped Lumber (Oak)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Spruce
                    "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Unwrapped Lumber (Spruce)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Birch
                    "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Unwrapped Lumber (Birch)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Jungle
                    "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Unwrapped Lumber (Jungle)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Acacia
                    "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Unwrapped Lumber (Acacia)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Dark Oak
                    "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Unwrapped Lumber (Dark Oak)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Pine
                    "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Unwrapped Lumber (Pine)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Redwood
                    "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Unwrapped Lumber (Redwood)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Fir
                    "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Unwrapped Lumber (Fir)", 0, 2.985, 0)},

            { new CargoSpecification(Modelpipeload1.class,
                    "loads/pipe_falling_sfx_1", "Pipes", 0, 2.5, 0) },

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Douglas Fir
                    "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Unwrapped Lumber (Douglas Fir)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Sitka Spruce
                    "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Unwrapped Lumber (Sitka Spruce)", 0, 2.985, 0)},

            { new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,//Western Red Cedar
                    "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 2.5, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 2.185, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 1.87, 0),
                    new CargoSpecification(ModelWrappedWoodOptimized_bulkhead_slice.class,
                            "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 1.555, 0),
                    new CargoSpecification(Modelfncc60bulk_wrappedstack_tiedowns.class,
                            "loads/FNCC60FootBulk_WrappedStack_tiedowns", "Unwrapped Lumber (Western Red Cedar)", 0, 2.985, 0)},
        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "FNCC (No Stakes)");
        InsertTexture(1, "FNCC (Stakes)");
        InsertTexture(2, "TTPX (No Stakes)");
        InsertTexture(3, "FNCC (No Equipment Pockets)");
        InsertTexture(4, "TTPX");
        InsertTexture(5, "CDP");
        InsertTexture(6, "DN");
        InsertTexture(7, "DN");
        InsertTexture(8, "BN");
        InsertTexture(9, "BN (Stakes)");
        InsertTexture(10, "GCM");
    }

    @Override
    public String getInventoryName() {
        return "KSFI 60' Bulkhead Flat";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.0F;
    }
}
