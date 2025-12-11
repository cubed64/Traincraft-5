package train.common.blocks.stoppers;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockAmericanStopper;
import train.common.tile.tileStopper.wood_type1.TileWoodType1_AmericanStopper;

public class treated_wood_type1_americanstopper extends BlockAmericanStopper {
    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileWoodType1_AmericanStopper(meta);
    }
}
