package train.common.core.plugins;

import codechicken.microblock.BlockMicroMaterial;
import codechicken.microblock.MicroMaterialRegistry;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import train.common.library.IBlockIDs;

public class ForgeMultiPart
{
    public static void registerBlocks(IBlockIDs[] blockIDs)
    {
        try
        {
            for (IBlockIDs block : blockIDs)
            {
                if (block.getBlock() instanceof BlockStairs == false && block.getBlock() instanceof BlockSlab == false)
                {
                    // Blocks that don't make since to register
                    switch (block.getMaxMetaData())
                    {
                        case -1:
                            // When the MaxMetaData is -1 this indicates that this block should never be allowed to be made a Multipart
                            // Blocks such as doors will crash the mod
                            break;
                        case 0:
                            MicroMaterialRegistry.registerMaterial(new BlockMicroMaterial(block.getBlock(), 0), BlockMicroMaterial.materialKey(block.getBlock(), 0));
                            break;
                        default:
                            for (byte i = 0; i <= block.getMaxMetaData(); i++)
                            {
                                MicroMaterialRegistry.registerMaterial(new BlockMicroMaterial(block.getBlock(), i), BlockMicroMaterial.materialKey(block.getBlock(), i));
                            }
                            break;
                    }
                }
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
