package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import com.jcirmodelsquad.tcjcir.models.loads.ModelWrappedWoodOptimized_slice2;
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

public class Freight66centerbeam extends Freight implements IInventory {
    public int freightInventorySize;
    public int numFreightSlots;
    public Freight66centerbeam(World world) {
        super(world);
        initFreightCart();
        textureDescriptionMap.put(0, "TNTL");
        textureDescriptionMap.put(1, "WRX");
        textureDescriptionMap.put(2, "BN");
        textureDescriptionMap.put(3, "BN");
        textureDescriptionMap.put(4, "GAEX");
        textureDescriptionMap.put(5, "dominik fill this out if you see it k thanks");
        textureDescriptionMap.put(6, "dominik fill this out if you see it k thanks");
        textureDescriptionMap.put(7, "dominik fill this out if you see it k thanks");
        textureDescriptionMap.put(8, "dominik fill this out if you see it k thanks");
        textureDescriptionMap.put(9, "dominik fill this out if you see it k thanks");
        setCargoManager(new CargoManager(new CargoSpecification[][] {

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
        }));
    }

    public Freight66centerbeam(World world, double d, double d1, double d2){
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
        numFreightSlots = 6;
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
        return "66' Center Beam";
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
        return 3.625F;
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