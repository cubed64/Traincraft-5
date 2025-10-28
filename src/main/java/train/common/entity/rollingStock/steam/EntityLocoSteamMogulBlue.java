package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.EnumHeritageTrainsLegacy;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamMogulBlue extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamMogulBlue;
	}
	public EntityLocoSteamMogulBlue(World world) {
		super(world, EnumHeritageTrainsLegacy.locoSteamMogul.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	


	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.45, posZ);// default
	}
@Override
	public String getInventoryName() {
		return "Mogul";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.7F;
	}

	
}