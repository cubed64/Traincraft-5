package train.common.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.tile.TileEmbeddedStopper;
import train.common.tile.TileStopper;

public class BlockEmbeddedStopper extends BlockStopper
{
    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEmbeddedStopper(meta);
    }
}
