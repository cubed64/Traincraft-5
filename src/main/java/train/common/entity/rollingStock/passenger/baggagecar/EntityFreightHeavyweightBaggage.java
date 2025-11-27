package train.common.entity.rollingStock.passenger.baggagecar;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class EntityFreightHeavyweightBaggage extends AbstractStandardFixedFreightCar
{
	public EntityFreightHeavyweightBaggage(World world) {
		super(world);
	}

	@Override
	public void setupTextureDescription()
	{

	}

	@Override
	public String getInventoryName() {
		return "Heavyweight Baggage";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 5F;
	}
}