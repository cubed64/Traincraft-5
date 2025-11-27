package train.common.entity.rollingStock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class EntityFreight100TonHopper extends AbstractStandardFixedFreightCar {
	public EntityFreight100TonHopper(World world) {
		super(world);
	}

	@Override
	public void setupTextureDescription()
	{

	}

	@Override
	public String getInventoryName() {
		return "Freight Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.9F;
	}
}