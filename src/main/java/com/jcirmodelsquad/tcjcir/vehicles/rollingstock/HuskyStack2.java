package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import com.jcirmodelsquad.tcjcir.models.containers.ModelISO_40FT_Item;
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

public class HuskyStack2 extends Freight implements IInventory {
	public int freightInventorySize;
	public int numFreightSlots;
	EntityPlayer playerEntity;

	public HuskyStack2(World world) {
		super(world);
		initFreightGrain();
		textureDescriptionMap.put(0, "TTX Corp");
		textureDescriptionMap.put(1, "Generic Blue");
		textureDescriptionMap.put(2, "WP");
		textureDescriptionMap.put(3, "CSLX");
		textureDescriptionMap.put(4, "CSLX");
		textureDescriptionMap.put(5, "MT&S");

		setCargoManager(new CargoManager(new CargoSpecification[][] {
				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
						"Dual Containers (Generic)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
						"Dual Containers (Generic)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MAERSK",
						"Dual Containers (Maersk)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MAERSK",
								"Dual Containers (Maersk)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_CSX_Blue",
						"Dual Containers (CSX)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_CSX_White",
								"Dual Containers (CSX)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_CSX_White",
						"Dual Containers (CSX2)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_CSX_Blue",
								"Dual Containers (CSX2)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Cosco",
						"Dual Containers (Cosco)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Cosco",
								"Dual Containers (Cosco)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_K-Line",
						"Dual Containers (K-Line)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_K-Line",
								"Dual Containers (K-Line)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Boop",
						"Dual Containers (Boop Express)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Boop",
								"Dual Containers (Boop Express)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MSC",
						"Dual Containers (MSC)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MSC",
								"Dual Containers (MSC)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Blue",
						"Dual Containers (Generic Blue)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Blue",
								"Dual Containers (Generic Blue)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
						"Dual Containers (Generic White)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
								"Dual Containers (Generic White)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
						"Dual Containers (North Fox Container Lines)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
								"Dual Containers (North Fox Container Lines)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Blue",
						"Dual Containers (Mix 1)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
								"Dual Containers (Mix 1)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
						"Dual Containers (Mix 2)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Blue",
								"Dual Containers (Mix 2)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_K-Line",
						"Dual Containers (Mix 3)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MSC",
								"Dual Containers (Mix 3)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
						"Dual Containers (Mix 4)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
								"Dual Containers (Mix 4)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
						"Dual Containers (Mix 5)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Boop",
								"Dual Containers (Mix 5)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Cosco",
						"Dual Containers (Mix 6)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
								"Dual Containers (Mix 6)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Cosco",
						"Dual Containers (Mix 7)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Boop",
								"Dual Containers (Mix 7)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Boop",
						"Dual Containers (Mix 8)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
								"Dual Containers (Mix 8)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
						"Dual Containers (Mix 9)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
								"Dual Containers (Mix 9)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
						"Dual Containers (Mix 10)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Blue",
								"Dual Containers (Mix 10)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
						"Dual Containers (Mix 11)", 0, 2.845, 0),
						new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_K-Line",
								"Dual Containers (Mix 11)", 0, 1.533, 0) },

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_NFCU",
						"Single Container (NFCU)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_K-Line",
						"Single Container (K-Line)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Cosco",
						"Single Container (Cosco)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MSC",
						"Single Container (MSC)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Boop",
						"Single Container (Boop)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_Blue",
						"Single Container (Generic Blue)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_White",
						"Single Container (Generic White)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_LightGrey",
						"Single Container (Generic LightGrey)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_MAERSK",
						"Single Container (Maersk)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_CSX_White",
						"Single Container (CSX1)", 0, 2.845, 0)},

				{ new CargoSpecification(ModelISO_40FT_Item.class, "containers/ISO_40FT_CSX_Blue",
						"Single Container (CSX2)", 0, 2.845, 0)},
		}));
	}

	public void initFreightGrain() {
		numFreightSlots = 9;
		if(trainSpec!=null)freightInventorySize = trainSpec.getCargoCapacity();
		cargoItems = new ItemStack[freightInventorySize];
	}

	public HuskyStack2(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + (double) yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
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
		return "Gunderson 40' Husky Stack Wellcar";
	}

	@Override
	public int getSizeInventory() {
		return freightInventorySize;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		playerEntity = entityplayer;
		if ((super.interactFirst(entityplayer))) {
			return false;
		}
		if (!this.worldObj.isRemote) {
			entityplayer.openGui(Traincraft.instance, GuiIDs.FREIGHT, worldObj, this.getEntityId(), -1, (int) this.posZ);
		}
		return true;
	}
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.3F;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
}