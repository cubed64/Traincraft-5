package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.ModelWrappedWoodOptimized_slice2;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class Freight66centerbeam extends AbstractStandardFreightCar
{
    public Freight66centerbeam(World world) {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][] {

                //is 0.315 5 mb? is 0.063 1 mb? bigger positive number means lower, smaller positive number means higher
                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//washaska wood
                        "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//washaska wood 2
                        "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//tolko wood
                        "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//canfor wood
                        "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//blank wood
                        "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//foggy river
                        "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Thick & Thin
                        "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Oak
                        "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Spruce
                        "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Birch
                        "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Jungle
                        "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Acacia
                        "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Dark Oak
                        "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Pine
                        "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Redwood
                        "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Fir
                        "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Douglas Fir
                        "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_douglas_fir", "Unwrapped Lumber (Douglas Fir)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Sitka Spruce
                        "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_sitka_spruce", "Unwrapped Lumber (Sitka Spruce)", 0, 1.177, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,//Western Red Cedar
                        "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 2.437, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 2.122, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 1.807, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 1.492, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_slice2.class,
                                "loads/UnwrappedWood_western_red_cedar", "Unwrapped Lumber (Western Red Cedar)", 0, 1.177, 0),},
        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "TNTL");
        InsertTexture(1, "WRX");
        InsertTexture(2, "NP");
        InsertTexture(3, "BN 1");
        InsertTexture(4, "BN 2");
        InsertTexture(5, "HTCX");
        InsertTexture(6, "GLNT");
        InsertTexture(7, "Generic (Teal)");
        InsertTexture(8, "Generic (Orange)");
        InsertTexture(9, "Generic (Blue)");
        InsertTexture(10, "Generic (Yellow)");
    }

    @Override
    public String getInventoryName() {
        return "66' Center Beam";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.625F;
    }
}