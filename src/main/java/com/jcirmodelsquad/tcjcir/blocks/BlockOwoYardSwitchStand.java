package com.jcirmodelsquad.tcjcir.blocks;

import com.jcirmodelsquad.tcjcir.tile.TileOwoYardSwitchStand;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockSwitchStand;

public class BlockOwoYardSwitchStand extends BlockSwitchStand {
    public BlockOwoYardSwitchStand() {
        super();
    }
    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileOwoYardSwitchStand();
    }
}
