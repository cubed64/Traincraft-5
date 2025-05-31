package com.jcirmodelsquad.tcjcir.blocks;

import com.jcirmodelsquad.tcjcir.tile.TileMILWSwitchStand;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockSwitchStand;

public class BlockMILWSwitchStand extends BlockSwitchStand {
	public BlockMILWSwitchStand() {
		super();
	}
	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileMILWSwitchStand();
	}
}
