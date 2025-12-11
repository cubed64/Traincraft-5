/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.tile.tileStopper;

import train.common.tile.BaseStopperTileEntity;

public class TileStopper extends BaseStopperTileEntity {
	public TileStopper() {
        super();
        //facingMeta = this.getBlockMetadata(); // Changed from this.blockMetadata to the method call to avoid receiving invalid Metadata.
	}
	
	public TileStopper(int meta){
		
		super(meta);
	}
}