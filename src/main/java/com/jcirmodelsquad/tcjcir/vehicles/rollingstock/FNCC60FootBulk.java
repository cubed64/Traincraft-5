package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import com.jcirmodelsquad.tcjcir.models.loads.*;
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

public class FNCC60FootBulk extends Freight implements IInventory {
    public int freightInventorySize;
    public int numFreightSlots;
    public FNCC60FootBulk(World world) {
        super(world);
        initFreightCart();
        textureDescriptionMap.put(0, "FNCC (No Stakes)");
        textureDescriptionMap.put(1, "FNCC (Stakes)");
        textureDescriptionMap.put(2, "TTPX (No Stakes)");
        textureDescriptionMap.put(3, "FNCC (No Equip Slots)");
        textureDescriptionMap.put(4, "TTPX (No Stakes)");
        textureDescriptionMap.put(5, "CDP");
        textureDescriptionMap.put(6, "DN");
        textureDescriptionMap.put(7, "DN");
        setCargoManager(new CargoManager(new CargoSpecification[][] {
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

                { new CargoSpecification(Modelpipeload1.class,
                        "loads/pipe_falling_sfx_1", "Pipes", 0, 2.5, 0) },
        }));
    }

    public FNCC60FootBulk(World world, double d, double d1, double d2){
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
        return "KSFI 60' Bulkhead Flat";
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
        return 3.0F;
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
