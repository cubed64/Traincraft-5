package train.common.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.tile.TileHighStarSwitchStand;

public class BlockHighStarSwitchStand extends BlockSwitchStand {
	public BlockHighStarSwitchStand() {
		super();
	}
	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileHighStarSwitchStand();
	}
}
