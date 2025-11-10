package train.common.entity.rollingStock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import train.common.library.EnumHeritageTrainsLegacy;

public class EntityTender4000 extends Tender
{
	public EntityTender4000(World world)
	{
		super(world, FluidRegistry.WATER, 0, EnumHeritageTrainsLegacy.Model4000GallonTender.getTankCapacity(), LiquidManager.WATER_FILTER);
	}

	@Override
	public String getInventoryName() {
		return "Tender";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2F;
	}
}