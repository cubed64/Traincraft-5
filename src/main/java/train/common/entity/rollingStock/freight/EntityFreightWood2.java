package train.common.entity.rollingStock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.enums.CargoItemFilter;

public class EntityFreightWood2 extends AbstractStandardFixedFreightCar
{

	public EntityFreightWood2(World world) {
		super(world);
		cargoFilterCategory = CargoItemFilter.WOOD_PRODUCTS;
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
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.4F;
	}
}