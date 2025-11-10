package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class EntityCaboose3 extends AbstractWorkCart
{

	public EntityCaboose3(World world) {
		super(world);
	}



	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.3F;
	}
}