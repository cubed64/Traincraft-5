package com.jcirmodelsquad.tcjcir.blocks;

import com.jcirmodelsquad.tcjcir.tile.TileAutoSwitchStand;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockSwitchStand;

public class BlockAutoSwitchStand extends BlockSwitchStand {
    public BlockAutoSwitchStand() {
        super();
    }
    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileAutoSwitchStand();
    }
}
