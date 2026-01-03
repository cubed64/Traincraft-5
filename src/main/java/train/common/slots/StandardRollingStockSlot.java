package train.common.slots;

import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.core.handlers.ItemHandler;

public class StandardRollingStockSlot extends Slot
{

    public StandardRollingStockSlot(IInventory inventory, int slotIndex, int xDisplayPosition, int yDisplayPosition)
    {
        super(inventory, slotIndex, xDisplayPosition, yDisplayPosition);
    }

    @Override
    public boolean isItemValid(ItemStack itemStack)
    {
        if(itemStack == null)
        {
            return false;
        }

        Block block = Block.getBlockFromItem(itemStack.getItem());
        if (block == null)
        {
            return false;
        }

        return ItemHandler.isBanned(itemStack);
    }
}
