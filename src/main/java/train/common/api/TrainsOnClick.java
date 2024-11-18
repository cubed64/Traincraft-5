package train.common.api;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.core.network.PacketParkingBrake;
import train.common.library.ItemIDs;

public class TrainsOnClick
{
	public boolean onClickWithStake(AbstractTrains train, ItemStack itemstack, EntityPlayer playerEntity, World world) {
		if (itemstack != null && itemstack.getItem() == ItemIDs.stake.item && !world.isRemote &&
				(FMLCommonHandler.instance().getMinecraftServerInstance().isSinglePlayer() || !train.isLinked() || train.getTrainOwner().equals(playerEntity.getDisplayName()) || train.getTrainOwner().equals("") || train.getTrainOwner()==null)) {

			if (playerEntity.isSneaking() && train instanceof Locomotive) {
				if (!train.canBeAdjusted(train)) {
					if (!world.isRemote) {
						playerEntity.addChatMessage(new ChatComponentText(((EntityRollingStock) train).getTrainName() + " can be pulled, don't forget to fuel it!"));
						playerEntity.addChatMessage(new ChatComponentText("Attach the BACK of this locomotive to the BACK of another locomotive. Otherwise you will encounter weird problems in general."));
					}
					((Locomotive) train).setCanBeAdjusted(true);
					((Locomotive) train).canBePulled = true;
					if (((Locomotive) train).mtcStatus != 0 && ((Locomotive) train).trainIsWMTCSupported()) {
						((Locomotive) train).disconnectFromServer();
					}
				} else {
					if (!world.isRemote) {
						playerEntity.addChatMessage(new ChatComponentText(((EntityRollingStock) train).getTrainName() + " can pull"));
					}
					((Locomotive) train).setCanBeAdjusted(false);
					((Locomotive) train).canBePulled = false;
				}

				return true;
			}

			if (!world.isRemote) {
				if (!train.isAttaching) {
					train.isAttaching = true;
					playerEntity.addChatMessage(new ChatComponentText("Attaching mode on for: " + ((EntityRollingStock) train).getTrainName()));
					itemstack.damageItem(1, playerEntity);

				} else {
					playerEntity.addChatMessage(new ChatComponentText("Reset, click again to couple new cart to this one"));
					train.Link1 = -1;
					train.Link2 = -1;
					if (train.cartLinked1 != null && train.cartLinked1.Link1 == train.getUniqueTrainID())
						train.cartLinked1.Link1 = -1;
					if (train.cartLinked1 != null && train.cartLinked1.Link2 == train.getUniqueTrainID())
						train.cartLinked1.Link2 = -1;
					if (train.cartLinked2 != null && train.cartLinked2.Link1 == train.getUniqueTrainID())
						train.cartLinked2.Link1 = -1;
					if (train.cartLinked2 != null && train.cartLinked2.Link2 == train.getUniqueTrainID())
						train.cartLinked2.Link2 = -1;

					if (train.cartLinked1 != null && train.cartLinked1.cartLinked1 != null && train.cartLinked1.cartLinked1.equals(train))
						train.cartLinked1.cartLinked1 = null;
					if (train.cartLinked1 != null && train.cartLinked1.cartLinked2 != null && train.cartLinked1.cartLinked2.equals(train))
						train.cartLinked1.cartLinked2 = null;
					if (train.cartLinked2 != null && train.cartLinked2.cartLinked2 != null && train.cartLinked2.cartLinked2.equals(train))
						train.cartLinked2.cartLinked2 = null;
					if (train.cartLinked2 != null && train.cartLinked2.cartLinked1 != null && train.cartLinked2.cartLinked1.equals(train))
						train.cartLinked2.cartLinked1 = null;


					train.cartLinked1 = null;
					train.cartLinked2 = null;
					train.isAttaching = false;
					train.isAttached = false;

					if (((EntityRollingStock) train).trainHandler != null) {
						((EntityRollingStock) train).trainHandler.resetTrain();
					}


					if (((EntityRollingStock) train).trainHandler != null && ((EntityRollingStock) train).trainHandler.getTrains().size() <= 1) {
						/** no more @RollingStocks in the train then remove the train object from the global list */
						EntityRollingStock.allTrains.remove(((EntityRollingStock) train).trainHandler);
						//System.out.println("Train is destroyed, remove it from the global array");
					}
				}
			}
			return true;

		} else {
			return false;
		}
	}

	public boolean onClickWithBrakeHandle(AbstractTrains entityRollingStock, ItemStack itemstack, EntityPlayer playerEntity, World world)
	{
		if (itemstack != null && itemstack.getItem() == ItemIDs.brakeStick.item && !world.isRemote
				&& (entityRollingStock instanceof Locomotive == false && entityRollingStock instanceof AbstractControlCar == false)
				&& (FMLCommonHandler.instance().getMinecraftServerInstance().isSinglePlayer()
					|| entityRollingStock.getTrainLockedFromPacket() == false
					|| entityRollingStock.getTrainOwner() == null
					|| entityRollingStock.getTrainOwner().equals("")
					|| entityRollingStock.getTrainOwner().equalsIgnoreCase(playerEntity.getDisplayName())
					|| entityRollingStock.isPlayerTrusted(playerEntity.getDisplayName())
					|| entityRollingStock.isPlayerTrustedToBreak(playerEntity.getDisplayName()))
		)
		{
			if (playerEntity.isSneaking())
			{
				if (((EntityRollingStock)entityRollingStock).parkingBrake)
				{
					if (!world.isRemote)
					{
						playerEntity.addChatMessage(new ChatComponentText(((EntityRollingStock)entityRollingStock).getTrainName() + " disengaged hand brake"));
					}
					else
					{
						Traincraft.brakeChannel.sendToServer(new PacketParkingBrake(false, entityRollingStock.getEntityId()));
					}

					return true;
				}
				else
				{
					if (!world.isRemote)
					{
						playerEntity.addChatMessage(new ChatComponentText(((EntityRollingStock)entityRollingStock).getTrainName() + " engaged hand brake"));
					}
					else
					{
						Traincraft.brakeChannel.sendToServer(new PacketParkingBrake(true, entityRollingStock.getEntityId()));
					}

					return true;
				}
			}

			return false;
		}

		return false;
	}
}
