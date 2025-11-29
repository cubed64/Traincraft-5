package train.common.entity.rollingStock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.enums.LockoutGroup;

public class EntityFreightLongCoveredHopper extends AbstractStandardFixedFreightCar {
	public EntityFreightLongCoveredHopper(World world) {
		super(world);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(4, "Clearwater Lakes", LockoutGroup.CWL);
	}

	@Override
	public String getInventoryName() {
		return "Long Covered Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.05F;
	}
}