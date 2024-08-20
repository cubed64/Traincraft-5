package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.api.AbstractPassengerCar;

public class StampedeRack extends AbstractPassengerCar
{
	public StampedeRack(World world) {
		super(world);
		textureDescriptionMap.put(0, "Stampeed Rack");
	}

	public StampedeRack(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		playerEntity = entityplayer;
		if ((super.interactFirst(entityplayer))) {
			return false;
		}
		if (!worldObj.isRemote) {
			ItemStack itemstack = entityplayer.inventory.getCurrentItem();
			if(lockThisCart(itemstack, entityplayer))return true;
		}
		if (!worldObj.isRemote) {
			if (riddenByEntity != null) {
				riddenByEntity.mountEntity(this);
				riddenByEntity.ridingEntity = null;
				return true;
			}
		}
		return true;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return !isDead && entityplayer.getDistanceSqToEntity(this) <= 64D;
	}

	@Override
	public double getAdditionalYOffset()
	{
		return 0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.75F;
	}


	/*@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
		if (riddenByEntity != null) {

			NBTTagCompound c = new NBTTagCompound();
			if(riddenByEntity.writeMountToNBT(c)) {
				nbttagcompound.setTag("mob2", c);
			}
		}
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
		if(nbttagcompound.hasKey("mob2")){
			readEntityFromNBT(nbttagcompound.getCompoundTag("mob2"));
		}
	}*/

}