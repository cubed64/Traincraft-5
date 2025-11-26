package train.common.library;

import net.minecraft.block.Block;

public interface IBlockIDs
{
    Block getBlock();
    boolean hasItemBlock();
    Class getItemBlockClass();

    int getMaxMetaData();
}
