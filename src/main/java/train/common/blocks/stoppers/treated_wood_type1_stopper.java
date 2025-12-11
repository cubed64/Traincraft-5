package train.common.blocks.stoppers;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockStopper;
import train.common.tile.tileStopper.wood_type1.TileWoodType1_Stopper;

public class treated_wood_type1_stopper extends BlockStopper {
    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileWoodType1_Stopper(meta);
    }
}
