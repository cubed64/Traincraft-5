package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.ModelWrappedWoodOptimized_slice2;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class Freight73centerbeam extends AbstractStandardFreightCar
{
    public Freight73centerbeam(World world) {
        super(world);
    }

    public Freight73centerbeam(World world, double x, double y, double z) {
        super(world, x, y, z);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][]
        {
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
        InsertTexture(0, "Transgenderbeam");
        InsertTexture(1, "WRX (Green)");
        InsertTexture(2, "MT&S");
        InsertTexture(3, "WRX (Orange)");
        InsertTexture(4, "TTZX");
        InsertTexture(5, "Generic Red");
        InsertTexture(6, "GLNT");
    }

    @Override
    public String getInventoryName() {
        return "73' Center Beam";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.875F;
    }
}