package train.common.core.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.library.ItemIDs;

public class CreativeTabTraincraftPassenger extends CreativeTabs
{
	public CreativeTabTraincraftPassenger(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(ItemIDs.minecartPS52seatCoach.item);
	}

	@Override
	public String getTranslatedTabLabel()
	{
		return super.getTabLabel();
	}

	@Override
	public Item getTabIconItem()
	{
		return ItemIDs.minecartPS52seatCoach.item;
	}
}
