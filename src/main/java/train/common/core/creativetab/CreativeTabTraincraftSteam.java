package train.common.core.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.library.ItemIDs;

public class CreativeTabTraincraftSteam extends CreativeTabs
{
	public CreativeTabTraincraftSteam(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(ItemIDs.minecartMK60.item);
	}

	@Override
	public String getTranslatedTabLabel()
	{
		return super.getTabLabel();
	}

	@Override
	public Item getTabIconItem()
	{
		return ItemIDs.minecartMK60.item;
	}
}
