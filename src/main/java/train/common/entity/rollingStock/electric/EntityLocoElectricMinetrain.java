package train.common.entity.rollingStock.electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricMinetrain extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoElectricMineTrain;
	}

	public EntityLocoElectricMinetrain(World world) {
		super(world);
	}

	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.10F, posZ);
	}

	

	@Override
	public String getInventoryName() {
		return "Cart hauler";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.53F;
	}

	
	
}