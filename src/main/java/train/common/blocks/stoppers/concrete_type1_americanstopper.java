package train.common.blocks.stoppers;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockAmericanStopper;
import train.common.tile.tileStopper.concrete_type1.TileConcreteType1_AmericanStopper;

public class concrete_type1_americanstopper extends BlockAmericanStopper {
    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileConcreteType1_AmericanStopper(meta);
    }
}
