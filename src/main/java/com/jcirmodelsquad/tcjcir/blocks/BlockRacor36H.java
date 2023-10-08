package com.jcirmodelsquad.tcjcir.blocks;

import com.jcirmodelsquad.tcjcir.tile.TileRacor36H;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockSwitchStand;

public class BlockRacor36H extends BlockSwitchStand {
    public BlockRacor36H() {
        super();
    }
    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileRacor36H();
    }
}
