package train.common.entity.rollingStock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class EntityFreightIceWagon extends AbstractStandardFixedFreightCar
{
	public EntityFreightIceWagon(World world) {
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
		return 0.75F;
	}

}