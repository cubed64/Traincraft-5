package train.common.entity.rollingStock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class EntityFreightASTFAutorack extends AbstractStandardFixedFreightCar
{
	public EntityFreightASTFAutorack(World world) {
		super(world);
	}

	@Override
	public void setupTextureDescription()
	{

	}

	@Override
	public double getMountedYOffset() {
		return (double) height * 0.0D - 0.30000001192092896D;
	}

	@Override
	public String getInventoryName() {
		return "ASTF ft-41 Auto Rack";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 4.35F;
	}

	@Override
	public int getInventoryStackLimit() {
		return 1;
	}
}