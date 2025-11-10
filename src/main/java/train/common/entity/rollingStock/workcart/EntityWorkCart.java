package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class EntityWorkCart extends AbstractWorkCart
{
	public EntityWorkCart(World world) {
		super(world);
	}

	

	@Override
	public String getInventoryName() {
		return "Work cart";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.8F);
	}
}