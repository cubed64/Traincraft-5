package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class EntityCabooseWorkCart extends AbstractWorkCart
{

	public EntityCabooseWorkCart(World world) {
		super(world);
	}

	

	@Override
	public double getAdditionalYOffset()
	{
		return 0.15F;
	}

	@Override
	public String getInventoryName() {
		return "Caboose";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.45F);
	}
}