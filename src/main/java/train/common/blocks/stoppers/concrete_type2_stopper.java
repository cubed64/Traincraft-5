package train.common.blocks.stoppers;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockStopper;
import train.common.tile.tileStopper.concrete_type2.TileConcreteType2_Generic_Stopper;

public class concrete_type2_stopper extends BlockStopper {
    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileConcreteType2_Generic_Stopper(meta);
    }
}
