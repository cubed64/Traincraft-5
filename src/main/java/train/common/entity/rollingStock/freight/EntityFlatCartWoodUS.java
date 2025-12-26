package train.common.entity.rollingStock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.enums.CargoItemFilter;

public class EntityFlatCartWoodUS extends AbstractStandardFixedFreightCar
{

	public EntityFlatCartWoodUS(World world) {
		super(world);
		cargoFilterCategory = CargoItemFilter.WOOD_PRODUCTS;
	}

	@Override
	public void setupTextureDescription()
	{

	}

	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.4, posZ);
	}

	@Override
	public String getInventoryName() {
		return "Wood transport";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.74F;
	}
}