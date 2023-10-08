package com.jcirmodelsquad.tcjcir.blocks;

import com.jcirmodelsquad.tcjcir.tile.TileCircleSwitchStand;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockSwitchStand;

public class BlockCircleSwitchStand extends BlockSwitchStand {
    public BlockCircleSwitchStand() {
        super();
    }
    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileCircleSwitchStand();
    }
}
