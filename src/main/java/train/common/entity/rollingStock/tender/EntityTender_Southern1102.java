package train.common.entity.rollingStock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import train.common.library.EnumHeritageTrainsLegacy;

public class EntityTender_Southern1102 extends Tender
{
	public EntityTender_Southern1102(World world)
	{
		super(world, FluidRegistry.WATER, 0, EnumHeritageTrainsLegacy.tender_Southern1102.getTankCapacity(), LiquidManager.WATER_FILTER);
	}

	@Override
	public String getInventoryName() {
		return "Baldwin 4-6-0 Tender";
	}

	@Override
	public boolean canBeRidden() {
		return false;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.5F;
	}
}