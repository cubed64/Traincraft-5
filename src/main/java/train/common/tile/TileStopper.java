/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileStopper extends BaseStopperTileEntity {
	public TileStopper() {
        super();
        //facingMeta = this.getBlockMetadata(); // Changed from this.blockMetadata to the method call to avoid receiving invalid Metadata.
	}
	
	public TileStopper(int meta){
		
		super(meta);
	}
}