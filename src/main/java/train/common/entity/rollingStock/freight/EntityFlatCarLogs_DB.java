package train.common.entity.rollingStock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.library.ItemIDs;

import java.util.ArrayList;
import java.util.List;

public class EntityFlatCarLogs_DB extends AbstractStandardFixedFreightCar
{
	public EntityFlatCarLogs_DB(World world) {
		super(world);
	}

	@Override
	public void setupTextureDescription()
	{

	}

	@Override
	public String getInventoryName() {
		return "Wood transport";
	}

	@Override
	public List<ItemStack> getItemsDropped() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(ItemIDs.minecartFlatCartLogs_DB.item));
		return items;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.84F;
	}
}