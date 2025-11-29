package train.common.items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBlockOreTC extends ItemBlock {

	public static boolean fallInstantly;

	private final static String[] subNames = { "copperOre", "oilSands", "petroleum", "ballast", "snowgravel"};

	public ItemBlockOreTC(Block id) {
		super(id);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int damageValue) {
		return damageValue;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		if(itemstack.getItemDamage()<subNames.length){
			return super.getUnlocalizedName() + "." + subNames[itemstack.getItemDamage()];
		}else{
			return super.getUnlocalizedName() + "." + "";
		}
	}
}
