package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;

public class ACFGN60SeatCoach extends EntityRollingStock implements IPassenger {

	public ACFGN60SeatCoach(World world) {
		super(world);
		textureDescriptionMap.put(0, "GN Internationals (With Conductor's Booth)");
		textureDescriptionMap.put(1, "GN Internationals");
		textureDescriptionMap.put(2, "GN Internationals (With Conductor's Booth, Late)");
		textureDescriptionMap.put(3, "GN Internationals (Late)");
		textureDescriptionMap.put(4, "GN Red River (With Conductor's Booth)");
		textureDescriptionMap.put(5, "GN Red River");
		textureDescriptionMap.put(6, "GN Empire Builder (As delivered)");
		textureDescriptionMap.put(7, "GN Empire Builder");
		textureDescriptionMap.put(8, "GN Empire Builder (Remodeled)");
		textureDescriptionMap.put(9, "GN Empire Builder (BSB Scheme)");
		textureDescriptionMap.put(10, "BN (With Conductor's Booth)");
		textureDescriptionMap.put(11, "BN");
		textureDescriptionMap.put(12, "FNCC (With Conductor's Booth)");
		textureDescriptionMap.put(13, "FNCC");
		textureDescriptionMap.put(14, "FNCC (With Conductor's Booth, Royal Solar)");
		textureDescriptionMap.put(15, "FNCC (Royal Solar)");
	}

	public ACFGN60SeatCoach(World world, double d, double d1, double d2) {
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
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset()-0.1F, posZ);
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