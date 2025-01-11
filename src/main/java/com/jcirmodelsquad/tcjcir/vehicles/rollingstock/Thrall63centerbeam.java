package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import com.jcirmodelsquad.tcjcir.models.loads.ModelWrappedWoodOptimized_sliceAAA;
import com.jcirmodelsquad.tcjcir.models.loads.Modelthrall63tiedownsA;
import com.jcirmodelsquad.tcjcir.models.loads.Modelthrall63tiedownsB;
import com.jcirmodelsquad.tcjcir.models.loads.Modelthrall63tiedownsLoaded;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.Freight;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.GuiIDs;

public class Thrall63centerbeam extends Freight implements IInventory {
    public int freightInventorySize;
    public int numFreightSlots;
    public Thrall63centerbeam(World world) {
        super(world);
        initFreightCart();
        textureDescriptionMap.put(0, "BN");
        textureDescriptionMap.put(1, "TTZX");
        textureDescriptionMap.put(2, "Generic Red");
        textureDescriptionMap.put(3, "COER 'CENTERBEAM'");
        textureDescriptionMap.put(4, "WRX");
        textureDescriptionMap.put(5, "FNCC");
        textureDescriptionMap.put(6, "DN");
        textureDescriptionMap.put(7, "GLNT");

        setCargoManager(new CargoManager(new CargoSpecification[][] {

                //is 0.315 5 mb? is 0.063 1 mb? bigger positive number means lower, smaller positive number means higher
                { new CargoSpecification(Modelthrall63tiedownsA.class,//tiedowns empty 1
                        "trains/thrall63footcenterbeam_tiedowns", "Empty Tiedowns", 0, 3.00, 0)},

                { new CargoSpecification(Modelthrall63tiedownsB.class,//tiedowns empty 2
                        "trains/thrall63footcenterbeam_tiedowns", "Empty Tiedowns", 0, 3.00, 0)},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//washaska wood
                        "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Washaska_Straps", "Wrapped Lumber (Washaska)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Wrapped Lumber (Washaska)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//washaska wood 2
                        "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Washaska_Straps2", "Wrapped Lumber (Washaska)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Wrapped Lumber (Washaska)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//tolko wood
                        "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Tolko_Straps", "Wrapped Lumber (Tolko)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Wrapped Lumber (Tolko)", 0, 3, 0),},
//some other old values that might be useful should i revisit this: 2.437 2.122 1.807 1.492 1.177
                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//canfor wood
                        "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Canfor_Straps", "Wrapped Lumber (Canfor)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Wrapped Lumber (Canfor)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//blank wood
                        "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Blank_Straps", "Wrapped Lumber", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Wrapped Lumber", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//foggyriver wood
                        "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_FRLC_Straps", "Wrapped Lumber (Foggy River)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Wrapped Lumber (Foggy River)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//thick & thin wood
                        "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/WrappedWood3_Thick_n_Thin_Straps", "Wrapped Lumber (Thick & Thin)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Wrapped Lumber (Thick & Thin)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//oak
                        "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_oak", "Unwrapped Lumber (Oak)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Unwrapped Lumber (Oak)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//Spruce
                        "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_spruce", "Unwrapped Lumber (Spruce)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Unwrapped Lumber (Spruce)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//Birch
                        "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_birch", "Unwrapped Lumber (Birch)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Unwrapped Lumber (Birch)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//Jungle
                        "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_jungle", "Unwrapped Lumber (Jungle)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Unwrapped Lumber (Jungle)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//Acacia
                        "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_acacia", "Unwrapped Lumber (Acacia)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Unwrapped Lumber (Acacia)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//Dark Oak
                        "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_darkoak", "Unwrapped Lumber (Dark Oak)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Unwrapped Lumber (Dark Oak)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//Pine
                        "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_pine", "Unwrapped Lumber (Pine)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Unwrapped Lumber (Pine)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//Redwood
                        "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_redwood", "Unwrapped Lumber (Redwood)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Unwrapped Lumber (Redwood)", 0, 3, 0),},

                { new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,//Fir
                        "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", -0.0315, 2.54, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", -0.0315, 2.225, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", -0.0315, 1.91, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", -0.0315, 1.595, 0),
                        new CargoSpecification(ModelWrappedWoodOptimized_sliceAAA.class,
                                "loads/UnwrappedWood_fir", "Unwrapped Lumber (Fir)", -0.0315, 1.283, 0),
                        new CargoSpecification(Modelthrall63tiedownsLoaded.class,
                                "trains/thrall63footcenterbeam_tiedowns", "Unwrapped Lumber (Fir)", 0, 3, 0),},
        }));
    }

    public Thrall63centerbeam(World world, double d, double d1, double d2){
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
        initFreightCart();
    }

    public void initFreightCart() {
        numFreightSlots = 5;
        freightInventorySize = trainSpec.getCargoCapacity();
        cargoItems = new ItemStack[freightInventorySize];
    }
    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        super.writeEntityToNBT(nbttagcompound);
        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < cargoItems.length; i++) {
            if (cargoItems[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte) i);
                cargoItems[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        nbttagcompound.setTag("Items", nbttaglist);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
        super.readEntityFromNBT(nbttagcompound);

        NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        cargoItems = new ItemStack[getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); i++) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 0xff;
            if (j >= 0 && j < cargoItems.length) {
                cargoItems[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }

    @Override
    public String getInventoryName() {
        return "Thrall 63' Centerbeam";
    }

    @Override
    public int getSizeInventory() {
        return freightInventorySize;
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        if ((super.interactFirst(entityplayer))) {
            return true;
        }
        entityplayer.openGui(Traincraft.instance, GuiIDs.FREIGHT, worldObj, this.getEntityId(), -1, (int) this.posZ);
        return true;
    }

    @Override
    public boolean isStorageCart() {
        return true;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.45F;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return true;
    }
}