package train.common.entity.rollingStock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.enums.CargoItemFilter;

public class EntityFreightMinetrain extends AbstractStandardFixedFreightCar
{
	public EntityFreightMinetrain(World world) {
		super(world);
		cargoFilterCategory = CargoItemFilter.OPAQUE_BLOCKS;
	}

	@Override
	public void setupTextureDescription()
	{

	}
	@Override
	public String getInventoryName() {
		return "Minecart";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.7F;
	}
}