package com.jcirmodelsquad.tcjcir.blocks;

import com.jcirmodelsquad.tcjcir.tile.TileMTCMarker;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockMTCMarker extends BlockContainer {

    public BlockMTCMarker(Material p_i45394_1_) {
        super(p_i45394_1_);
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileMTCMarker();
    }

    @Override
    public int getRenderType() {
        return -1;
    }


    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
        int dir = MathHelper.floor_double((player.rotationYaw / 90.0F) + 2.5D) & 3;
        world.setBlockMetadataWithNotify(x, y, z, dir, 2);
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }
}
