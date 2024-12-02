/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import train.common.Traincraft;
import train.common.adminbook.ItemAdminBook;
import train.common.library.EnumTracks;
import train.common.library.Info;
import train.common.library.ItemIDs;

public class TCItems {

	public static void init() {
		loadItems();
		registerItems();
	}

	private static void loadItems() {
		for (ItemIDs items : ItemIDs.values()) {
			if (items.className != null) {
				if (items.className.equals("ItemTrain")) {
					items.item = new ItemPart(items.iconName);
				}
				else if (items.className.equals("ItemRollingStock"))
				{
					items.item = new ItemRollingStock(items.iconName, items.TypeOfRollingStock);
				}
				else if (items.className.equals("ItemRotativeDigger")) {
					items.item = new ItemRotativeDigger();
				}
				else if (items.className.equals("ItemContainer")) {
					items.item = new ItemContainer(items.iconName);
				}
			}
		}
		//ItemIDs.signal.item = new ItemSignal(ItemIDs.signal.itemID, BlockIDs.activeSignal.block).setIconIndex(ItemIDs.signal.iconIndex);
		ItemIDs.chunkLoaderActivator.item = new ItemChunkLoaderActivator();
		ItemIDs.recipeBook.item = new ItemRecipeBook();
		ItemIDs.adminBook.item = new ItemAdminBook();
		ItemIDs.creditsBook.item = new ItemCreditsBook();
		ItemIDs.paintbrushThing.item = new ItemPaintbrushThing();
		ItemIDs.padlock.item = new ItemPadlock();

		ItemIDs.stake.item = new ItemStacked(1200);
		ItemIDs.brakeStick.item = new ItemBrakeStick();
		ItemIDs.interchangeTransferReportBoard.item = new ItemInterchangeTransferReportBoard();
		ItemIDs.airship.item = new ItemZeppelins(0);
		ItemIDs.zeppelin.item = new ItemZeppelins(1);
		ItemIDs.overalls.item = new ItemTCArmor(ItemIDs.overalls.iconName, Traincraft.instance.armor, Traincraft.trainArmor, 2,0);
		ItemIDs.jacket.item = new ItemTCArmor(ItemIDs.jacket.iconName, Traincraft.instance.armor, Traincraft.trainArmor, 1,0);
		ItemIDs.hat.item = new ItemTCArmor(ItemIDs.hat.iconName, Traincraft.instance.armor, Traincraft.trainArmor, 0,0);

		/**Paintable armors:*/
		ItemIDs.pants_ticketMan_paintable.item = new ItemTCArmor(ItemIDs.pants_ticketMan_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 2,0xdedede);
		ItemIDs.jacket_ticketMan_paintable.item = new ItemTCArmor(ItemIDs.jacket_ticketMan_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 1,0x002cdb);
		ItemIDs.hat_ticketMan_paintable.item = new ItemTCArmor(ItemIDs.hat_ticketMan_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 0,0x9fafb5);

		ItemIDs.pants_driver_paintable.item = new ItemTCArmor(ItemIDs.pants_driver_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 2,0x1535d4);
		ItemIDs.jacket_driver_paintable.item = new ItemTCArmor(ItemIDs.jacket_driver_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 1,0x1469d9);
		ItemIDs.hat_driver_paintable.item = new ItemTCArmor(ItemIDs.hat_driver_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 0,0x1469d9);

		ItemIDs.boots_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.boots_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 3,0x1535d4);
		ItemIDs.pants_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.pants_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 2,0x1535d4);
		ItemIDs.jacket_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.jacket_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 1,0x1469d9);
		ItemIDs.helmet_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.helmet_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 0,0x1469d9);

		ItemIDs.composite_wrench.item = new ItemWrench();

		/**Tracks*/
		ItemIDs.tcRailMediumTurn.item = new ItemTCRail(EnumTracks.MEDIUM_TURN);
		ItemIDs.tcRailLargeTurn.item = new ItemTCRail(EnumTracks.LARGE_TURN);
		ItemIDs.tcRailVeryLargeTurn.item = new ItemTCRail(EnumTracks.VERY_LARGE_TURN);
		ItemIDs.tcRailLongStraight.item = new ItemTCRail(EnumTracks.LONG_STRAIGHT);
		ItemIDs.tcRailMediumStraight.item = new ItemTCRail(EnumTracks.MEDIUM_STRAIGHT);
		ItemIDs.tcRailSmallStraight.item = new ItemTCRail(EnumTracks.SMALL_STRAIGHT);
		ItemIDs.tcRailMediumSwitch.item = new ItemTCRail(EnumTracks.MEDIUM_SWITCH);
		ItemIDs.tcRailLargeSwitch.item = new ItemTCRail(EnumTracks.LARGE_SWITCH);
		ItemIDs.tcRailSmallRoadCrossing.item = new ItemTCRail(EnumTracks.SMALL_ROAD_CROSSING);
		ItemIDs.tcRailSmallRoadCrossing1.item = new ItemTCRail(EnumTracks.SMALL_ROAD_CROSSING_1);
		ItemIDs.tcRailSmallRoadCrossing2.item = new ItemTCRail(EnumTracks.SMALL_ROAD_CROSSING_2);
		ItemIDs.tcRailMediumParallelSwitch.item = new ItemTCRail(EnumTracks.MEDIUM_PARALLEL_SWITCH);

		ItemIDs.tcRailTwoWaysCrossing.item = new ItemTCRail(EnumTracks.TWO_WAYS_CROSSING);

		/*Embedded Crossways*/
		ItemIDs.tcRailEmbeddedTwoWaysCrossing.item = new ItemTCRail(EnumTracks.EMBEDDED_TWO_WAYS_CROSSING);

		/* Embedded Switches*/
		////ItemIDs.tcRailEmbeddedMediumSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_SWITCH);
		////ItemIDs.tcRailEmbeddedLargeSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_SWITCH);
		//ItemIDs.tcRailEmbeddedVeryLargeSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_VERY_LARGE_SWITCH);
		//ItemIDs.tcRailEmbeddedMediumParallelSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_PARALLEL_SWITCH);
		//ItemIDs.tcRailEmbeddedLargeParallelSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_PARALLEL_SWITCH);
		//ItemIDs.tcRailEmbeddedMedium45DegreeSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_45DEGREE_SWITCH);
		//ItemIDs.tcRailEmbeddedLarge45DegreeSwitch.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_45DEGREE_SWITCH);

		/** Normal Slopes*/
		ItemIDs.tcRailSlopeWood.item = new ItemTCRail(EnumTracks.SLOPE_WOOD);
		ItemIDs.tcRailSlopeGravel.item = new ItemTCRail(EnumTracks.SLOPE_GRAVEL);
		ItemIDs.tcRailSlopeBallast.item = new ItemTCRail(EnumTracks.SLOPE_BALLAST);
		ItemIDs.tcRailSlopeDynamic.item = new ItemTCRail(EnumTracks.SLOPE_DYNAMIC);
		ItemIDs.tcRailLargeSlopeWood.item = new ItemTCRail(EnumTracks.LARGE_SLOPE_WOOD);
		ItemIDs.tcRailLargeSlopeGravel.item = new ItemTCRail(EnumTracks.LARGE_SLOPE_GRAVEL);
		ItemIDs.tcRailLargeSlopeBallast.item = new ItemTCRail(EnumTracks.LARGE_SLOPE_BALLAST);
		ItemIDs.tcRailVeryLargeSlopeWood.item = new ItemTCRail(EnumTracks.VERY_LARGE_SLOPE_WOOD);
		ItemIDs.tcRailVeryLargeSlopeGravel.item = new ItemTCRail(EnumTracks.VERY_LARGE_SLOPE_GRAVEL);
		ItemIDs.tcRailVeryLargeSlopeBallast.item = new ItemTCRail(EnumTracks.VERY_LARGE_SLOPE_BALLAST);
		ItemIDs.tcRailLargeSlopeDynamic.item = new ItemTCRail(EnumTracks.LARGE_SLOPE_DYNAMIC);
		ItemIDs.tcRailSlopeSnowGravel.item = new ItemTCRail(EnumTracks.SLOPE_SNOW_GRAVEL);
		ItemIDs.tcRailLargeSlopeSnowGravel.item = new ItemTCRail(EnumTracks.LARGE_SLOPE_SNOW_GRAVEL);
		ItemIDs.tcRailVeryLargeSlopeSnowGravel.item = new ItemTCRail(EnumTracks.VERY_LARGE_SLOPE_SNOW_GRAVEL);
		ItemIDs.tcRailSlopePeaGravel.item = new ItemTCRail(EnumTracks.SLOPE_PEA_GRAVEL);
		ItemIDs.tcRailLargeSlopePeaGravel.item = new ItemTCRail(EnumTracks.LARGE_SLOPE_PEA_GRAVEL);
		ItemIDs.tcRailVeryLargeSlopePeaGravel.item = new ItemTCRail(EnumTracks.VERY_LARGE_SLOPE_PEA_GRAVEL);
		ItemIDs.tcRailVeryLargeSlopeDynamic.item = new ItemTCRail(EnumTracks.VERY_LARGE_SLOPE_DYNAMIC);

		ItemIDs.tcRailSuperLargeTurn.item = new ItemTCRail(EnumTracks.SUPER_LARGE_TURN);
		ItemIDs.tcRailVeryLongStraight.item = new ItemTCRail(EnumTracks.VERY_LONG_STRAIGHT);
		ItemIDs.tcRailSmallParallelCurve.item = new ItemTCRail(EnumTracks.SMALL_PARALLEL_CURVE);
		ItemIDs.tcRailMediumParallelCurve.item = new ItemTCRail(EnumTracks.MEDIUM_PARALLEL_CURVE);
		ItemIDs.tcRailLargeParallelCurve.item = new ItemTCRail(EnumTracks.LARGE_PARALLEL_CURVE);

		/*Embedded Straights*/
		ItemIDs.tcRailEmbeddedSmallStraight.item = new ItemTCRail(EnumTracks.EMBEDDED_SMALL_STRAIGHT);
		ItemIDs.tcRailEmbeddedMediumStraight.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_STRAIGHT);
		ItemIDs.tcRailEmbeddedLongStraight.item = new ItemTCRail(EnumTracks.EMBEDDED_LONG_STRAIGHT);
		ItemIDs.tcRailEmbeddedVeryLongStraight.item = new ItemTCRail(EnumTracks.EMBEDDED_VERY_LONG_STRAIGHT);

		/* Embedded Parallel Curves*/
		ItemIDs.tcRailEmbeddedSmallParallelCurve.item = new ItemTCRail(EnumTracks.EMBEDDED_SMALL_PARALLEL_CURVE);
		ItemIDs.tcRailEmbeddedMediumParallelCurve.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_PARALLEL_CURVE);
		ItemIDs.tcRailEmbeddedLargeParallelCurve.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_PARALLEL_CURVE);

		ItemIDs.tcRailEmbeddedMediumTurn.item = new ItemTCRail(EnumTracks.EMBEDDED_MEDIUM_TURN);
		ItemIDs.tcRailEmbeddedLargeTurn.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_TURN);
		ItemIDs.tcRailEmbeddedVeryLargeTurn.item = new ItemTCRail(EnumTracks.EMBEDDED_VERY_LARGE_TURN);
		ItemIDs.tcRailEmbeddedSuperLargeTurn.item = new ItemTCRail(EnumTracks.EMBEDDED_SUPER_LARGE_TURN);

		/* Embedded Slopes*/
		ItemIDs.tcRailEmbeddedSlopeDynamic.item = new ItemTCRail(EnumTracks.EMBEDDED_SLOPE_DYNAMIC);
		ItemIDs.tcRailEmbeddedLargeSlopeDynamic.item = new ItemTCRail(EnumTracks.EMBEDDED_LARGE_SLOPE_DYNAMIC);
		ItemIDs.tcRailEmbeddedVeryLargeSlopeDynamic.item = new ItemTCRail(EnumTracks.EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC);


			ItemIDs.wirelessTransmitter.item = new ItemWirelessTransmitter();
			ItemIDs.atoCard.item = new ItemATOCard();
			ItemIDs.pennCentral.item = new ItemPennCentralSimCard();

		//ItemIDs.signalPairingDevice.item = new ItemSignalPairingDevice();
		ItemIDs.remoteController.item = new ItemRemoteController();
		ItemIDs.remoteControllerModule.item = new ItemRemoteControllerModule();
	}

	private static void registerItems() {
		for (ItemIDs items : ItemIDs.values()) {
			if (items.item != null) {
				items.item.setUnlocalizedName(Info.modID + ":" + items.name());
				GameRegistry.registerItem(items.item, items.name());
			}
		}
	}

}
