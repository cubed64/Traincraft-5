package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import com.jcirmodelsquad.tcjcir.models.loads.Model35FootAggregate;
import com.jcirmodelsquad.tcjcir.models.loads.Model35FootRails;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.api.Freight;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.GuiIDs;

public class MaPa35FootGondola extends AbstractStandardFreightCar {
    public MaPa35FootGondola(World world)
    {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(Model35FootAggregate.class,
                        "loads/aggregate35Foot_ballast", "Ballast", 0, 3.0, 0) },
                { new CargoSpecification(Model35FootAggregate.class,
                        "loads/aggregate35Foot_coal", "Coal", 0, 3.0, 0) },
                { new CargoSpecification(Model35FootAggregate.class,
                        "loads/aggregate35Foot_dirt", "Dirt", 0, 3.0, 0) },
                { new CargoSpecification(Model35FootAggregate.class,
                        "loads/aggregate35Foot_dirtyGravel", "Dirty Gravel", 0, 3.0, 0) },
                { new CargoSpecification(Model35FootAggregate.class,
                        "loads/aggregate35Foot_gravel", "Gravel", 0, 3.0, 0) },
                { new CargoSpecification(Model35FootRails.class,
                        "loads/rails35Foot", "Rails", 0, 3.0, 0) },
        });
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "MA&PA");
        InsertTexture(1, "MOW");
    }

    @Override
    public String getInventoryName() {
        return "MA&PA 35' Gondola";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.87F;
    }


}