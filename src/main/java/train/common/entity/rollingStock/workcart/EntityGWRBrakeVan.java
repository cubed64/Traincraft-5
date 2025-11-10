package train.common.entity.rollingStock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;
import train.common.core.util.TraincraftUtil;

public class EntityGWRBrakeVan extends AbstractWorkCart {

	public EntityGWRBrakeVan(World world) {
		super(world);
	}



	@Override
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, -1, 0.2);
	}

	@Override
	public String getInventoryName() {
		return "GWR Brake Van";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.4F;
	}
}