package com.jcirmodelsquad.tcjcir.blocks;

import com.jcirmodelsquad.tcjcir.tile.TileOwoSwitchStand;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockSwitchStand;

public class BlockOwoSwitchStand extends BlockSwitchStand {
    public BlockOwoSwitchStand() {
        super();
    }
    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileOwoSwitchStand();
    }
}

