package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tanker;

import com.jcirmodelsquad.tcjcir.models.loads.Modelhazmat_plac_17600;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.LiquidTank;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

public class DOT11117600 extends LiquidTank {
    public int freightInventorySize;

    public DOT11117600(World world) {
        super(world, EnumTrains.DOT11117600.getTankCapacity());
        initFreightWater();
        InsertTexture(0, "CRGX");
        InsertTexture(1, "CRGX");
        InsertTexture(2, "UTLX");
        InsertTexture(3, "UTLX");
        InsertTexture(4, "UTLX (Cargill Foods)");
        InsertTexture(5, "UTLX");
        InsertTexture(6, "UTLX (Casco)");
        InsertTexture(7, "Magnolia");
        InsertTexture(8, "CCOX (Aragonite Slurry Service)");
        InsertTexture(9, "FWRT (glHUE Service)");
        InsertTexture(10, "FWRT (Glue Service)");

        setCargoManager(new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(Modelhazmat_plac_17600.class, "loads/hazmat_plac_flammable_number",
                        "Hazmat Placard - Flammable (Bluk)", 0, 3.0, 0)},
                { new CargoSpecification(Modelhazmat_plac_17600.class, "loads/hazmat_plac_flammable",
                        "Hazmat Placard - Flammable", 0, 3.0, 0)},
                { new CargoSpecification(Modelhazmat_plac_17600.class, "loads/hazmat_plac_corrosive_number",
                        "Hazmat Placard - Corrosive (Bulk)", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_17600.class, "loads/hazmat_plac_hot",
                        "Hazmat Placard - HOT", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_17600.class, "loads/hazmat_plac_oxidizer",
                        "Hazmat Placard - Oxidizer/Oxygen", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_17600.class, "loads/hazmat_plac_class9_numbers",
                        "Hazmat Placard - Class 9 (Bulk)", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_17600.class, "loads/hazmat_plac_class9",
                        "Hazmat Placard - Class 9", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_17600.class, "loads/hazmat_plac_class6",
                        "Hazmat Placard - Class 6 (Poision, PG III, Toxic)", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_17600.class, "loads/hazmat_plac_wet",
                        "Hazmat Placard - Dangerous when Wet", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_17600.class, "loads/hazmat_plac_explosives",
                        "Hazmat Placard - Explosives", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_17600.class, "loads/hazmat_plac_radioactive",
                        "Hazmat Placard - Radioactive", 0, 3, 0)},
        }));
    }

    public void initFreightWater() {
        freightInventorySize = 2;
        cargoItems = new ItemStack[freightInventorySize];
    }

    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        checkInvent(cargoItems[0]);
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
        return "17,600 Gallon Tank car";
    }

    @Override
    public int getSizeInventory() {
        return freightInventorySize;
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        if ((super.interactFirst(entityplayer))) {
            return false;
        }
        if (!this.worldObj.isRemote) {
            entityplayer.openGui(Traincraft.instance, GuiIDs.LIQUID, worldObj, this.getEntityId(), -1, (int) this.posZ);
        }
        return true;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer) {
        return !isDead && entityplayer.getDistanceSqToEntity(this) <= 64D;
    }

    @Override
    public boolean isStorageCart() {
        return true;
    }
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.9F;
    }
}