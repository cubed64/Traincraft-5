package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.Modelroadrailer_trailer_53;
import com.jcirmodelsquad.tcjcir.models.loads.Modeltoastertiedown;
import com.jcirmodelsquad.tcjcir.models.trains.ModelAEM7;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class Gunderson89ftFlat extends AbstractStandardFreightCar
{
    public Gunderson89ftFlat(World world)
    {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(Modelroadrailer_trailer_53.class,
                        "loads/roadrailer_53_generic", "53 Ft Dryvan", 0, 2.625, 0, -0.1, -0.1,-0.1) },
                { new CargoSpecification(Modelroadrailer_trailer_53.class,
                        "loads/roadrailer_53_fernrock", "53 Ft Refrididgerator (Fernrock Foods)", 0, 2.625, 0, -0.1, -0.1,-0.1) },
                { new CargoSpecification(ModelAEM7.class, "trains/AEM-7_Grey", "highly important cargo", 0, 2.58, 0),
                        new CargoSpecification(Modeltoastertiedown.class, "loads/AEM_tiedown", "highly important cargo", 0, 2.58, 0) },
        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "TrailerTrain Cooperation");
        InsertTexture(1, "NEP");
        InsertTexture(2, "NEP");
    }

    @Override
    public String getInventoryName() {
        return "Gunderson 89' Lowbody Flat Car";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 4.4F;
    }

    @Override
    public int getInventoryStackLimit() {
        return 1;
    }

}
