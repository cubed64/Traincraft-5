package train.common.blocks.stoppers;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockAmericanStopper;
import train.common.tile.tileStopper.concrete_type2.TileConcreteType2_AmericanStopper;

public class concrete_type2_americanstopper extends BlockAmericanStopper {
    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileConcreteType2_AmericanStopper(meta);
    }
}
