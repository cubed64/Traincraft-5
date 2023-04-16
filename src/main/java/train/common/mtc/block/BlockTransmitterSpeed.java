package train.common.mtc.block;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dan200.computercraft.api.peripheral.IPeripheral;
import dan200.computercraft.api.peripheral.IPeripheralProvider;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.mtc.tile.TileTransmitterSpeed;


public class BlockTransmitterSpeed extends BlockContainer implements IPeripheralProvider {


    public static BlockTransmitterSpeed instance;
    public BlockTransmitterSpeed(Material p_i45386_1_) {
        super(p_i45386_1_);
        instance = this;
    }
    @Override
    public IPeripheral getPeripheral(World world, int x, int y, int z, int side) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        return (IPeripheral)tileEntity;

    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileTransmitterSpeed();
    }
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metadata, float sideX, float sideY, float sideZ) {
        // System.out.println("ting");
        if (world.isRemote) {
          openGUI(world, x, y, z);
        }
        return true;
    }

    @Override
    public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void openGUI(World world,int x, int y, int z) {
        Minecraft.getMinecraft().displayGuiScreen(new train.client.gui.GuiSpeedTransmitter(world.getTileEntity(x, y, z)));
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isBlockSolid(IBlockAccess p_149747_1_, int p_149747_2_, int p_149747_3_, int p_149747_4_, int p_149747_5_) {
        return true;
    }
}
