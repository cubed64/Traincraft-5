package train.common.entity.rollingStock;

import com.jcirmodelsquad.tcjcir.models.ModelFreedomHeli;
import com.jcirmodelsquad.tcjcir.models.loads.Modelboulder;
import com.jcirmodelsquad.tcjcir.models.loads.Modelroadrailer_trailer_53;
import com.jcirmodelsquad.tcjcir.models.loads.Modeltoastertiedown;
import com.jcirmodelsquad.tcjcir.models.trains.*;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.client.render.models.ModelCharB1;
import train.client.render.models.ModelFT17;
import train.client.render.models.ModelGP7;
import train.client.render.models.ModelPanzerI;
import train.common.Traincraft;
import train.common.api.Freight;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.GuiIDs;

public class EntityFreightDepressedFlatbed extends Freight implements IInventory {
	public int freightInventorySize;
	public int numFreightSlots;
	public EntityFreightDepressedFlatbed(World world) {
		super(world);
		initFreightCart();

		setCargoManager(new CargoManager(new CargoSpecification[][] {
				{ new CargoSpecification(ModelCharB1.class,
						"trains/CharB1", "Char B1", 0.9, 3.075, -0.0425, -0.45, -0.4,-0.4) },
				{ new CargoSpecification(ModelPanzerI.class,
						"trains/PanzerI", "Panzer I", 0.45, 3.02, -0.11, -0.4, -0.4,-0.4) },
				{ new CargoSpecification(ModelFT17.class,
						"trains/FT17", "FT17", 0.5, 3.0, -0.09, -0.4, -0.4,-0.4) },
				//{ new CargoSpecification(ModelFreedomHeli.class,
				//		"trains/helicopterFreedom", "Freedom Helicoper", 0, 2.625, 0, 0.0, 0.0,0.0) },
				{ new CargoSpecification(ModelBoxcab23Ton.class,
						"trains/boxcab_White", "23 Ton", 0.3, 2.81, -0.1, -0.1, -0.1,-0.1) },
				//{ new CargoSpecification(ModelTGVMobile.class,
				//		"trains/tgvmobile_Orange", "tgv", 0, 2.625, 0, 0.0, 0.0,0.0) },

				//models with the renderrollingstockwithlight shit crash the game when used as cargo loads apparently lol

				{new CargoSpecification(Modelboulder.class,
						"loads/boulder2", "Washaskan Boulder", new CargoSpecification.RenderParameters().setOffset(0.3, 2.75, -0.1)),
				},
		}));
	}

	public void initFreightCart() {
		numFreightSlots = 9;
		if(trainSpec!=null)freightInventorySize = trainSpec.getCargoCapacity();
		cargoItems = new ItemStack[freightInventorySize];
	}

	public EntityFreightDepressedFlatbed(World world, double d, double d1, double d2) {
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
		return "Freight cart";
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
		entityplayer.openGui(Traincraft.instance, GuiIDs.FREIGHT, worldObj, this.getEntityId(), -1, (int) this.posZ);
		return true;
	}
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.8F;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
}