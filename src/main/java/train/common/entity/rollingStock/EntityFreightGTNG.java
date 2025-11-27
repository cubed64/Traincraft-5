package train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class EntityFreightGTNG extends AbstractStandardFixedFreightCar {

	public EntityFreightGTNG(World world) {
		super(world);
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
		return 2.025F;
	}
}