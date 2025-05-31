package com.jcirmodelsquad.tcjcir.blocks;

import com.jcirmodelsquad.tcjcir.tile.TileMILWSwitchStand;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.blocks.BlockSwitchStand;
import train.common.library.Info;

public class BlockMILWSwitchStand extends BlockSwitchStand {
	public BlockMILWSwitchStand() {
		super();
	}
	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileMILWSwitchStand();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":milw_switch_stand");
	}
}
