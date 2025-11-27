package train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class EntityFreightGermanPost extends AbstractStandardFixedFreightCar
{
	public EntityFreightGermanPost(World world) {
		super(world);
	}

	@Override
	public void setupTextureDescription()
	{

	}

	@Override
	public String getInventoryName() {
		return "Freight cart";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.955F;
	}
}