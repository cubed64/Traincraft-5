package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import com.jcirmodelsquad.tcjcir.models.loads.Modelhazmat_plac_natx30600;
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

public class NATX30600 extends LiquidTank {
    public int freightInventorySize;

    public NATX30600(World world) {
        super(world, EnumTrains.NATX30600.getTankCapacity());
        initFreightWater();
        textureDescriptionMap.put(0, "NATX");
        textureDescriptionMap.put(1, "NATX (National Byproducts)");
        textureDescriptionMap.put(2, "NATX (Monoco)");
        textureDescriptionMap.put(3, "NATX (America's 100 Years Bicentennial)");
        textureDescriptionMap.put(4, "NATX (Cider something)");
        textureDescriptionMap.put(5, "NATX (Indiana Trash Society)");
        textureDescriptionMap.put(6, "Magnolia");
        textureDescriptionMap.put(7, "CCOX");
        textureDescriptionMap.put(8, "PCTX PENN CENTRAL WOO OH YEAH WOO");

        setCargoManager(new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(Modelhazmat_plac_natx30600.class, "loads/hazmat_plac_flammable_number",
                        "Hazmat Placard - Flammable (Bluk)", 0, 3.0, 0)},
                { new CargoSpecification(Modelhazmat_plac_natx30600.class, "loads/hazmat_plac_flammable",
                        "Hazmat Placard - Flammable", 0, 3.0, 0)},
                { new CargoSpecification(Modelhazmat_plac_natx30600.class, "loads/hazmat_plac_corrosive_number",
                        "Hazmat Placard - Corrosive (Bulk)", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_natx30600.class, "loads/hazmat_plac_hot",
                        "Hazmat Placard - HOT", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_natx30600.class, "loads/hazmat_plac_oxidizer",
                        "Hazmat Placard - Oxidizer/Oxygen", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_natx30600.class, "loads/hazmat_plac_class9_numbers",
                        "Hazmat Placard - Class 9 (Bulk)", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_natx30600.class, "loads/hazmat_plac_class9",
                        "Hazmat Placard - Class 9", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_natx30600.class, "loads/hazmat_plac_class6",
                        "Hazmat Placard - Class 6 (Poision, PG III, Toxic)", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_natx30600.class, "loads/hazmat_plac_wet",
                        "Hazmat Placard - Dangerous when Wet", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_natx30600.class, "loads/hazmat_plac_explosives",
                        "Hazmat Placard - Explosives", 0, 3, 0)},
                { new CargoSpecification(Modelhazmat_plac_natx30600.class, "loads/hazmat_plac_radioactive",
                        "Hazmat Placard - Radioactive", 0, 3, 0)},
        }));
    }

    public NATX30600(World world, double d, double d1, double d2){
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
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
        return "NATX 30,600 Gallon Tank car";
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
        return 2.75F;
    }

}