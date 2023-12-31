package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;

public class BuddDome46SeatCoach extends EntityRollingStock implements IPassenger {

	public BuddDome46SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "CZ Silver Dollar (WP)");
		textureDescriptionMap.put(1, "CZ Silver Ranch (CB&Q)");
		textureDescriptionMap.put(2, "CZ Silver Pony (DRGW)");
		textureDescriptionMap.put(3, "CB&Q Denver Zephyr");
		textureDescriptionMap.put(4, "NP (interior murals set 1)");
		textureDescriptionMap.put(5, "NP (interior murals set 2)");
		textureDescriptionMap.put(6, "GN");
		textureDescriptionMap.put(7, "GN (Big Sky Blue)");
		textureDescriptionMap.put(8, "GN (Cascade Green");
		textureDescriptionMap.put(9, "BN 555");
		textureDescriptionMap.put(10, "DRGW Silver Bronco (RGZ)");
		textureDescriptionMap.put(11, "DRGW Silver Mustang (RGZ)");
		textureDescriptionMap.put(12, "DRGW Silver Pony (RGZ)");
		textureDescriptionMap.put(13, "MP (Colorado Eagle)");
		textureDescriptionMap.put(14, "MP");
		textureDescriptionMap.put(15, "MP (Jenks Blue)");
		textureDescriptionMap.put(16, "IC");
		textureDescriptionMap.put(17, "AMTK 9476");
		textureDescriptionMap.put(18, "AMTK 9450");
		textureDescriptionMap.put(19, "AMTK 9458");
		textureDescriptionMap.put(20, "FNCC");
	}

	public BuddDome46SeatCoach(World world, double d, double d1, double d2) {
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
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset()+0.55F, posZ);
	}

	@Override
	public void setDead() {
		super.setDead();
		isDead = true;
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
			if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
				return true;
			}
			if (!worldObj.isRemote) {
				entityplayer.mountEntity(this);
			}
		}
		return true;
	}

	@Override
	public boolean canBeRidden() {
		return true;
	}

	@Override
	public boolean isStorageCart() {
		return false;
	}

	@Override
	public boolean isPoweredCart() {
		return false;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.97F;
	}
}