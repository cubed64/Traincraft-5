package train.common.library;

import com.jcirmodelsquad.tcjcir.vehicles.locomotives.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.*;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import train.common.api.AbstractTrains;
import train.common.core.util.TraincraftUtil;
import train.common.entity.rollingStock.*;

import java.lang.reflect.InvocationTargetException;

public enum EnumTrains {

	/**
	 * Passengers
	 */
	passengerCartBlue("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"}), 18, 0),
	passengerCartBlackSmall("Passenger Small Black", EntityPassenger2.class, ItemIDs.minecartPassenger2.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
	passengerLongGreen("Passenger Green Long", EntityPassenger5.class, ItemIDs.minecartPassenger5.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Yellow"}), 18, 0),
	passengerShortGreen("Passenger Short Green", EntityPassenger7.class, ItemIDs.minecartPassenger7.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
	passenger_1class_DB("Passenger 1Class DB", EntityPassenger_1class_DB.class, ItemIDs.minecartPassenger8_1class_DB.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
	passenger_2class_DB("Passenger 2Class DB", EntityPassenger_2class_DB.class, ItemIDs.minecartPassenger9_2class_DB.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Cyan"}), 18, 0),
	passengerHighSpeedZeroED("Passenger High Speed Zero ED", EntityPassengerHighSpeedCarZeroED.class, ItemIDs.minecartPassengerHighSpeedCarZeroED.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "LightGrey", "Grey"}), 18, 0),
	passengerTramNY("Passenger Tram NY", EntityPassengerTramNY.class, ItemIDs.minecartPassengerTramNY.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "White"}), 18, 0),
	passengerAdler("Passenger Adler", EntityPassengerAdler.class, ItemIDs.minecartPassengerAdler.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
	passengerDBOriental("Passenger DB oriental", EntityPassengerDBOriental.class, ItemIDs.minecartPassengerDBOriental.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Blue", "White"}), 18, 0),
	passengerIC4_DSB_FG("Passenger IC4 DSB FG", PassengerIC4_DSB_FG.class, ItemIDs.minecartIC4_DSB_FG.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 10, 0, (new String[]{"Unfinished, Creative Only"})),
	passengerIC4_DSB_FH("Passenger IC4 DSB FH", PassengerIC4_DSB_FH.class, ItemIDs.minecartIC4_DSB_FH.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 10, 0, (new String[]{"Unfinished, Creative Only"})),
	passengerICE1_Class1("Passenger ICE 1st Class", EntityPassengerICE_1class.class, ItemIDs.minecartICE1_1stClass.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Red"}), 10, 0),
	passengerICE1_Class2("Passenger ICE 2nd Class", EntityPassengerICE_2class.class, ItemIDs.minecartICE1_2ndClass.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Red"}), 10, 0),
	passengerICE1_Restaurant("ICE Restaurant", EntityPassengerICE_Restaurant.class, ItemIDs.minecartICE1_Restaurant.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Red"}), 10, 0),
	passengerGS4("Passenger GS4", EntityPassengerGS4.class, ItemIDs.minecartGS4_Passenger.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "White", "Yellow", "Brown", "Green", "Lime", "Red", "Grey", "Green", "LightGrey", "Blue", "Black", "LightBlue"}), 11, 0),
	passengerGS4Observatory("Passenger GS4 Observatory", EntityPassengerGS4_Observatory.class, ItemIDs.minecartGS4_Observatory.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"}), 11, 0),
	passengerGS4_Tail("Passenger GS4 Tail", EntityPassengerGS4_Tail.class, ItemIDs.minecartGS4_Tail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"}), 11, 0),

	passengerDenverRioGrange("Passenger Denver Rio Grande", EntityPassengerDenverRioGrande.class, ItemIDs.minecartDenverRioGrandePassenger.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "Green"}), 10, 0),
	passengerDenverRioGrandeCombo("Passenger Denver Rio Grande Combo", EntityPassengerDenverRioGrandeCombo.class, ItemIDs.minecartDenverRioGrandeCombo.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "Green"}), 10, 0),

	passengerRheingold("Passenger Rheingold", EntityPassengerRheingold.class, ItemIDs.minecartPassengerRheingold.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime", "Cyan"}), 18, 0),
	passengerRheingoldDining1("Rheingold Dining", EntityPassengerRheingoldDining1.class, ItemIDs.minecartPassengerRheingoldDining1.item, "work", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime"}), 18, 0),
	passengerRheingoldDining2("Rheingold Dining Alternate", EntityPassengerRheingoldDining2.class, ItemIDs.minecartPassengerRheingoldDining2.item, "work", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime"}), 18, 0),
	passengerRheingoldPanorama("Rheingold Panorama", EntityPassengerRheingoldPanorama.class, ItemIDs.minecartPassengerRheingoldPanorama.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red"}), 18, 0),

	passengerMILW("Passenger MILW", EntityPassengerMILW.class, ItemIDs.minecartPassengerMILW.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
	passengerMILWTail("Passenger MILW Tail", EntityPassengerMILWTail.class, ItemIDs.minecartPassengerMILWTail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
	//passengerMILWDiner("Passenger MILW Diner",EntityPassengerMILWDiner.class, ItemIDs.minecartPassengerMILWDiner.item,"passenger",0,0,1,0,0,0,0,0,0,null,18,0),

	passengerBamboo("Bamboo Flatcar Passenger", EntityPassengerBamboo.class, ItemIDs.minecartPassengerBamboo.item, "passenger", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"}), 18, 0),


	/**
	 * Caboose
	 */
	cabooseRed("Caboose Red", EntityCaboose.class, ItemIDs.minecartCaboose.item, "caboose", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
	cabooseBlack("Caboose Black", EntityCaboose3.class, ItemIDs.minecartCaboose3.item, "caboose", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),

	/**
	 * Specials
	 **/
	GWRBrakeVan("GWR Toad Brake Van", EntityGWRBrakeVan.class, ItemIDs.minecartGWRBrakeVan.item, "work", 0, 0, 0.7, 0, 0, 0, 0, 0, 0, null, 18, 0),
	stockCar("Stock Cart", EntityStockCar.class, ItemIDs.minecartStockCar.item, "stock car", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Yellow", "White"}), 18, 0),
	drwgStockCar("DRWG Stock Cart", EntityStockCarDRWG.class, ItemIDs.minecartDRWGStockCar.item, "stock car", 0, 0, 2, 0, 0, 0, 0, 0, 0, null, 18, 0),
	workCart("Work Cart Yellow", EntityWorkCart.class, ItemIDs.minecartWork.item, "work", 0, 0, 0.7, 0, 0, 0, 0, 0, 0, null, 18, 0),
	flatCart("Flat Cart", EntityFlatCart.class, ItemIDs.minecartFlatCart.item, "flat", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, null, 18, 0),
	workCaboose("Work Caboose", EntityCabooseWorkCart.class, ItemIDs.minecartCabooseWork.item, "work", 0, 0, 0.6, 0, 0, 0, 0, 0, 0, null, 18, 0),
	cabooseLogging("Caboose Logging", EntityCabooseLogging.class, ItemIDs.minecartCabooseLogging.item, "work", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Cyan", "Grey"}), 18, 0),
	cabooseLoggingPRR("PRR Caboose Logging", EntityCabooseLoggingPRR.class, ItemIDs.minecartCabooseLoggingPRR.item, "work", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Blue", "Green", "Orange"}), 18, 0),
	mailWagen_DB("Mail Wagon DB", EntityMailWagen_DB.class, ItemIDs.minecartMailWagon_DB.item, "work", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 18, 0),
	jukeBoxCart("JukeBox Cart", EntityJukeBoxCart.class, ItemIDs.minecartJukeBoxCart.item, "special", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, null, 18, 0),
	flatCartSU("Flat Cart SU", EntityFlatCartSU.class, ItemIDs.minecartFlatCartSU.item, "flat", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, null, 18, 0),
	flatCartUS("Flat Cart US", EntityFlatCartUS.class, ItemIDs.minecartFlatCartUS.item, "flat", 0, 0, 0.4, 0, 0, 0, 0, 0, 0, null, 18, 0),
	tracksBuilder("Tracks Builder", EntityTracksBuilder.class, ItemIDs.minecartBuilder.item, "special", 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 14, 0),
	flatCar_DB("Flat Cart DB", EntityFlatCar_DB.class, ItemIDs.minecartFlatCart_DB.item, "flat", 0, 0, 0.2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Green"}), 18, 0),
	BUnitEMDF7("EMD F7 B Unit", EntityBUnitEMDF7.class, ItemIDs.minecartLocoEMDF7B.item, "b-unit", 0, 0, 5, 0, 0, 0, 0, 0, 12000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Lime", "Red", "Brown", "Green", "Orange", "Yellow"}), 18, 0, (new String[]{"Reduces weight carried by 50 tons when fueled"})),
	BUnitEMDF3("EMD F3 B Unit", EntityBUnitEMDF3.class, ItemIDs.minecartLocoEMDF3B.item, "b-unit", 0, 0, 5, 0, 0, 0, 0, 0, 12000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Orange", "Blue", "Brown", "Green", "Magenta"}), 18, 0, (new String[]{"Reduces weight carried by 50 tons when fueled"})),
	BUnitDD35("DD35 B Unit", EntityBUnitDD35.class, ItemIDs.minecartLocoDD35B.item, "b-unit", 0, 0, 8, 0, 0, 0, 0, 0, 12000, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Black"}), 18, 0, (new String[]{"Reduces weight carried by 80 tons when fueled"})),
	propagandaUs("Propaganda USA", EntityPropagandaUS.class, ItemIDs.minecartPropagandaUs.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "White", "Red", "Green", "Orange", "Lime"}), 14, 0),
	propagandaUSSR("Propaganda USSR", EntityPropagandaUSSR.class, ItemIDs.minecartPropagandaUSSR.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "White", "Red"}), 14, 0),
	propagandaJapan("Propaganda Japan", EntityPropagandaJapan.class, ItemIDs.minecartPropagandaJapan.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "White", "Yellow"}), 14, 0),
	propagandaBritain("Propaganda Britain", EntityPropagandaBritain.class, ItemIDs.minecartPropagandaBritish.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "White", "Yellow"}), 14, 0),

	/**
	 * Freight
	 */
	freightCartRed("Freight Cart Red", EntityFreightCart2.class, ItemIDs.minecartFreightCart2.item, "freight", 3, (TraincraftUtil.getBytesFromColors(new String[]{"Red", "White", "Orange"})), 18, 36,(new String[]{"Cargo: any"})),
	freightCartYellow("Freight Cart Yellow", EntityFreightCart.class, ItemIDs.minecartChest.item, "freight", 3, null, 18, 36,(new String[]{"Cargo: any"})),
	freightWood("Freight Flat Cart Log", EntityFreightWood.class, ItemIDs.minecartWood.item, "freight", 3, null, 18, 27, (new String[]{"Cargo: only Logs"})),
	freightHopper("Freight Hopper Green", EntityFreightGrain.class, ItemIDs.minecartGrain.item, "freight", 4, (TraincraftUtil.getBytesFromColors(new String[]{"Green", "White"})), 18, 36, (new String[]{"Cargo: wheat, seeds"})),
	freightKClassRailBox("Freight K Class Rail Box", EntityFreightKClassRailBox.class, ItemIDs.minecartKClassRailBox.item, "freight", 4, (TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange"})), 18, 36,(new String[]{"Fictional. Cargo: any"})),
	freightShortCoveredHopper("Freight Short Covered Hopper", EntityFreightShortCoveredHopper.class, ItemIDs.minecartShortCoveredHopper.item, "freight", 4, (TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Orange", "LightBlue", "Lime", "Yellow", "Blue", "Cyan", "Skin16"})), 18, 36,(new String[]{"Cargo: any"})),
	freightLongCoveredHopper("Freight Long Covered Hopper", EntityFreightLongCoveredHopper.class, ItemIDs.minecartLongCoveredHopper.item, "freight", 6, (TraincraftUtil.getBytesFromColors(new String[]{"LightGrey", "Grey","Pink", "White", "Green", "Orange", "Lime", "Cyan"})), 18, 54,(new String[]{"Cargo: any"})),
	freightOpenWagon("Freight Open Wagon", EntityFreightOpenWagon.class, ItemIDs.minecartOpenWagon.item, "freight", 2, (TraincraftUtil.getBytesFromColors(new String[]{"Red", "Brown", "Pink"})), 18, 36, (new String[]{"Cargo: blocks, vanilla items"})),//"train_hopper" for open wagon => weird
	freightHopperUS("Freight Hopper US", EntityFreightHopperUS.class, ItemIDs.minecartFreightHopperUS.item, "freight", 4, (TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Grey", "LightGrey", "Blue", "Red", "Yellow", "Black", "LightBlue", "Purple", "Green", "Magenta", "Orange","Skin17"})), 18, 27, (new String[]{"Cargo: blocks"})),
	freight100TonHopper("Freight 100 Ton Hopper", EntityFreight100TonHopper.class, ItemIDs.minecartFreight100TonHopper.item, "freight", 4, (TraincraftUtil.getBytesFromColors(new String[]{"Red", "Black", "Blue", "Grey", "LightGrey", "Brown"})), 18, 54, (new String[]{"Cargo: blocks"})),
	flatCartWoodUS("Freight Flat Cart Wood US", EntityFlatCartWoodUS.class, ItemIDs.minecartFlatCartWoodUS.item, "freight", 3, (TraincraftUtil.getBytesFromColors(new String[]{"Red", "White"})), 18, 27, (new String[]{"Cargo: wood stuff"})),

	bulkheadFlatCartWood("Freight Bulkhead Flat Cart", EntityBulkheadFlatCart.class, ItemIDs.minecartBulkheadFlatCart.item, "freight", 3, (TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Yellow", "Green"})), 18, 27, (new String[]{"Cargo: only planks"})),
	freightCartUS("Freight Cart US", EntityFreightCartUS.class, ItemIDs.minecartFreightCartUS.item, "freight", 3.5, (TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Yellow", "Black", "Blue", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "White"})), 18, 36,(new String[]{"Cargo: blocks, vanilla items"})),
	freightBoxCartUS("Freight Box Cart US", EntityBoxCartUS.class, ItemIDs.minecartBoxCartUS.item, "freight", 2, (TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Purple", "Orange", "Grey", "Skin16", "Skin17", "Skin18"})), 18, 45,(new String[]{"Cargo: any"})),
	freightBoxCartPRR("Freight Box Cart PRR", EntityBoxCartPRR.class, ItemIDs.minecartBoxCartPRR.item, "freight", 2, null, 18, 45,(new String[]{"Cargo: any"})),
	freightCartSmall("Freight Cart Small", EntityFreightCartSmall.class, ItemIDs.minecartFreightCartSmall.item, "freight", 1, null, 18, 36,(new String[]{"Cargo: any"})),
	freightMinetrain("Freight Minecart Yellow", EntityFreightMinetrain.class, ItemIDs.minecartMineTrain.item, "freight", 0.5, null, 18, 18, (new String[]{"Cargo: opaque blocks"})),
	freightGTNG("Freight GTNG Ore Wagon", EntityFreightGTNG.class, ItemIDs.minecartFreightGTNG.item, "freight", 0.5, null, 18, 18,(new String[]{"Cargo: opaque blocks"})),
	flatCartWoodLogs("Freight Flat Logs", EntityFreightWood2.class, ItemIDs.minecartFreightWood2.item, "freight", 3, null, 18, 18, (new String[]{"Cargo: only logs"})),
	freightClosedRedBrown("Freight Cart Closed RedBrown", EntityFreightClosed.class, ItemIDs.minecartFreightClosed.item, "freight", 2.5, null, 18, 36,(new String[]{"Cargo: any"})),
	freightOpenRedBrown("Freight Open RedBrown", EntityFreightOpen2.class, ItemIDs.minecartFreightOpen2.item, "freight", 5, null, 18, 21,(new String[]{"Cargo: any"})),
	freightWagen_DB("Freight Wagon DB", EntityFreightWagenDB.class, ItemIDs.minecartFreightWagon_DB.item, "freight", 4, (TraincraftUtil.getBytesFromColors(new String[]{"Red", "Green", "Yellow", "Orange", "Pink"})), 18, 54,(new String[]{"Cargo: any"})),
	flatCarRails_DB("Freight Flat Cart Rails DB", EntityFlatCarRails_DB.class, ItemIDs.minecartFlatCartRail_DB.item, "freight", 5, (TraincraftUtil.getBytesFromColors(new String[]{"Red", "Green", "Cyan", "Yellow"})), 18, 36, (new String[]{"Cargo: only rails"})),
	ASTFAutorack("Freight ASTF Autorack", EntityFreightASTFAutorack.class, ItemIDs.minecartASTFAutorack.item, "freight", 5, null, 18, 36, (new String[]{"Cargo: any | Stack limit 1"})),
	flatCarLogs_DB("Freight Flat Cart Logs DB", EntityFlatCarLogs_DB.class, ItemIDs.minecartFlatCartLogs_DB.item, "freight", 4, (TraincraftUtil.getBytesFromColors(new String[]{"Red", "Green", "Black", "Blue", "Brown", "Cyan", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "White", "Yellow"})), 18, 45, (new String[]{"Cargo: only logs"})),
	slateWagon("Freight Slate Wagon", EntityFreightSlateWagon.class, ItemIDs.minecartSlateWagon.item, "freight", 0.5, null, 18, 38, (new String[]{"Cargo: only stone and ores"})),
	iceWagon("Freight Ice Wagon", EntityFreightIceWagon.class, ItemIDs.minecartIceWagon.item, "freight", 0.5, null, 18, 38, (new String[]{"Cargo: only ice"})),
	freightCartGS4("Freight Cart GS4 Baggage", EntityFreightGS4_Baggage.class, ItemIDs.minecartGS4_Baggage.item, "freight", 1, (TraincraftUtil.getBytesFromColors(new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"})), 11, 45,(new String[]{"Cargo: any"})),
	freightGondola_DB("Freight Gondola DB", EntityFreightGondola_DB.class, ItemIDs.minecartFreightGondola_DB.item, "freight", 3.5, (TraincraftUtil.getBytesFromColors(new String[]{"Red", "Green", "Black", "Brown", "Grey", "LightGrey", "Lime", "Orange", "Pink", "White", "Yellow"})), 18, 45, (new String[]{"Cargo: blocks, vanilla items"})),
	freightCenterBeam_Empty("Freight Center Beam Empty", EntityFreightCenterbeam_Empty.class, ItemIDs.minecartFreightCenterBeam_Empty.item, "freight", 0.5, (TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey"})), 18, 54,(new String[]{"Cargo: any"})),
	freightCenterBeam_Wood1("Freight Center Beam Wood1", EntityFreightCenterbeam_Wood_1.class, ItemIDs.minecartFreightCenterBeam_Wood_1.item, "freight", 3, (TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Blue", "White"})), 18, 54, (new String[]{"Cargo: wood stuff"})),
	freightCenterBeam_Wood2("Freight Center Beam Wood2", EntityFreightCenterbeam_Wood_2.class, ItemIDs.minecartFreightCenterBeam_Wood_2.item, "freight", 3, (TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Yellow", "White"})), 18, 54, (new String[]{"Cargo: wood stuff"})),
	//freightWellcar("Freight Well Car",EntityFreightWellcar.class, ItemIDs.minecartFreightWellcar.item,"freight",3,TraincraftUtil.getBytesFromColors(new String[] {"Blue","Red","Green","LightGrey","Grey", "Yellow"}),18,54,(new String[] {"Cargo: any"})),
	freightWellcar("Freight Well Car", EntityFreightWellcar.class, ItemIDs.minecartFreightWellcar.item, "freight", 3, (TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Green", "Black", "Grey", "Cyan", "Brown", "Lime", "LightBlue", "LightGrey", "Magenta", "Orange", "Pink", "Purple", "White", "Yellow"})), 18, 54,(new String[]{"Cargo: any"})),
	freightTrailer("Freight Trailer", EntityFreightTrailer.class, ItemIDs.minecartFreightTrailer.item, "freight", 3, (TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "LightBlue", "Red", "Grey", "LightGrey", "Magenta", "Orange", "Pink", "Purple", "Lime", "White", "Green"})), 18, 54,(new String[]{"Cargo: any"})),
	freightDenverRioGrange("Denver Rio Grande Baggage", EntityFreightDenverRioGrande.class, ItemIDs.minecartDenverRioGrandeBaggage.item, "freight", 0.5, (TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "Green"})), 18, 54,(new String[]{"Cargo: any"})),
	freightMILWBaggage("MILW Baggage", EntityFreightBaggageMILW.class, ItemIDs.minecartBaggageMILW.item, "freight", 0.5, null, 18, 54,(new String[]{"Cargo: any"})),
	freightheavyweight("Heavyweight Freight Car", EntityFreightHeavyweight.class, ItemIDs.minecartHeavyweightMailcar.item, "freight", 0.5, null, 18, 27,(new String[]{"Cargo: any"})),
	freightCartBamboo("Bamboo Flatcar Freight", EntityFreightBamboo.class, ItemIDs.minecartFreightBamboo.item, "freight", 0.1, (TraincraftUtil.getBytesFromColors(new String[] {"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"})), 18, 36,(new String[]{"Cargo: any"})),
	freightGermanPost("Freight German Post", EntityFreightGermanPost.class, ItemIDs.minecartFreightGermanPost.item, "freight", 0.1, (TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "Blue"})), 18, 36, (new String[]{"Cargo: non-blocks"})),
	freightDepressedFlatbed("Freight Depressed Flatcar", EntityFreightDepressedFlatbed.class, ItemIDs.minecartFreightDepressedFlatbed.item, "freight", 0.1, (TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "LightGrey", "Blue", "Yellow", "White"})), 18, 36,(new String[]{"Cargo: any"})),
	freightCarL("Freight Car L", EntityFreightCartL.class, ItemIDs.minecartFreightL.item, "freight", 3, (TraincraftUtil.getBytesFromColors(new String[]{"Red", "Blue"})), 18, 27,(new String[]{"Cargo: any"})),
	freightHeavyweight("Freight Heavyweight Baggage", EntityFreightHeavyweightBaggage.class, ItemIDs.minecartHeavyweightFreight.item, "freight", 3, (TraincraftUtil.getBytesFromColors(new String[]{"Red", "Grey"})), 18, 36,(new String[]{"Cargo: any"})),

	/**
	 * Tanks
	 **/
	tankWagon_DB("Tank Wagon DB", EntityTankWagon_DB.class, ItemIDs.minecartTankWagon_DB.item, "tank", 0, 0, 6, 0, 0, 0, 0, 0, 50000, (TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Green"})), 18, 0, (new String[]{"Capacity: 50000mb"})),
	tankThreeDome("Tank Wagon Three Dome", EntityTankWagonThreeDome.class, ItemIDs.minecartTankWagonThreeDome.item, "tank", 0, 0, 7.5, 0, 0, 0, 0, 0, 90000, (TraincraftUtil.getBytesFromColors(new String[]{"Green", "White"})), 18, 0, (new String[]{"Capacity: 90000mb"})),
	tankWagonUS("Tank Wagon US", EntityTankWagonUS.class, ItemIDs.minecartTankWagonUS.item, "tank", 0, 0, 6, 0, 0, 0, 0, 0, 70000, (TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "Yellow", "White", "LightGrey", "Green", "Blue", "Lime", "Orange", "Cyan", "Pink", "Purple", "LightBlue", "Magenta","Red","Brown"})), 18, 0, (new String[]{"Capacity: 70000mb"})),
	tankWagonGrey("Tank Wagon Grey", EntityTankWagon2.class, ItemIDs.minecartTankWagon2.item, "tank", 0, 0, 3, 0, 0, 0, 0, 0, 40000, (TraincraftUtil.getBytesFromColors(new String[]{"Blue", "White", "Orange", "Black"})), 18, 0, (new String[]{"Capacity: 40000mb"})),
	tankCartLava("Tank Lava", EntityTankLava.class, ItemIDs.minecartWatertransp.item, "tank", 0, 0, 5, 0, 0, 0, 0, 0, 30000, (TraincraftUtil.getBytesFromColors(new String[]{"Empty", "Full"})), 18, 0, (new String[]{"Lava Capacity: 30000mb"})),
	tankWagonYellow("Tank Wagon Yellow", EntityTankWagon.class, ItemIDs.minecartTankWagon.item, "tank", 0, 0, 6, 0, 0, 0, 0, 0, 40000, null, 18, 0, (new String[]{"Capacity: 40000mb"})),

	/**
	 * Tenders
	 */
	tenderSmall("Tender Small Black", EntityTenderSmall.class, ItemIDs.minecartTender.item, "tender", 0, 0, 0.1, 0, 0, 0, 0, 0, 5000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "Blue", "Green", "Yellow"}), 18, 0, (new String[]{"Water capacity: 5000mb"})),
	tenderHeavy("Tender Heavy", EntityTenderHeavy.class, ItemIDs.minecartTenderHeavy.item, "tender", 0, 0, 2, 0, 0, 0, 0, 0, 14000, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey"}), 18, 0, (new String[]{"Water capacity: 14000mb"})),
	tenderGS4("Tender GS4", EntityTenderGS4.class, ItemIDs.minecartGS4_Tender.item, "tender", 0, 0, 2, 0, 0, 0, 0, 0, 18000, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "White"}), 18, 0, (new String[]{"Water capacity: 18000mb"})),
	Model4000GallonTender("4000GallonTender",EntityTender4000.class, ItemIDs.minecart4000GallonTender.item,"tender",0,0,2,0,0,0,0,0,15000,TraincraftUtil.getBytesFromColors(new String[]{"Green", "Blue", "Red", "Lime"}),18,0,(new String[] {"Water capacity: 15000mb"})),
	ModelFowler4FTender("Fowler 4F Tender",EntityTenderFowler4F.class, ItemIDs.minecartFowler4FTender.item,"tender",0,0,2,0,0,0,0,0,15000, null, 18,0,(new String[] {"Water capacity: 15000mb"})),
	Model225Tender("1225 tender",EntityTenderBerk1225.class, ItemIDs.minecarttenderBerk1225.item,"tender",0,0,2,0,0,0,0,0,15000,TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey","LightGrey"}),18,0,(new String[] {"Water capacity: 15000mb"})),
	tender4_4_0("Tender 4-4-0", EntityTender4_4_0.class,  ItemIDs.minecartSteamRedTender.item, "tender", 0, 0, 0.2, 0, 0, 0, 0, 0, 8000, TraincraftUtil.getBytesFromColors(new String[] { "Black", "White", "Brown", "Blue", "Green", "Red", "Purple" }), 18, 0, (new String[] { "Water capacity: 8000mb" })),
	tenderA4("Tender A4 Mallard", EntityTenderA4.class,  ItemIDs.minecartLocoA4MallardTender.item,"tender", 0, 0, 0.2, 0, 0, 0, 0, 0, 6000, TraincraftUtil.getBytesFromColors(new String[] { "Blue", "Lime", "Black", "Green", "White" }), 18,0, (new String[] { "Water capacity: 6000mb" })),
	tenderBR01("Tender BR01",EntityTenderBR01_DB.class, ItemIDs.minecartTenderBR01_DB.item,"tender",0,0,0.5,0,0,0,0,0,20000,null,18,0,(new String[] {"Water capacity: 20000mb"})),
	tenderCoranationClass("Tender Coranation Class",EntityTenderCoranationClass.class,ItemIDs.minecartLocoCoranationClassTender.item,"tender",0,0,0.5,0,0,0,0,0,20000,null,18,0,(new String[] {"Water capacity: 20000mb"})),
	tenderEr_Ussr("Tender ER_USSR",EntityTenderEr_Ussr.class, ItemIDs.minecartTenderEr.item,"tender",0,0,2,0,0,0,0,0,16000,null,18,0,(new String[] {"Water capacity: 16000mb"})),
	tenderC62Class("Tender C62Class", EntityTenderC62Class.class, ItemIDs.minecartTenderC62Class.item, "tender", 0, 0, 0.5, 0, 0, 0, 0, 0, 14000, TraincraftUtil.getBytesFromColors(new String[] { "Black", "Red" }), 18, 0, (new String[] { "Water capacity: 14000mb" })),
	tenderD51("Tender D51", EntityTenderD51.class, ItemIDs.minecartTenderD51.item, "tender", 0, 0, 0.5, 0, 0, 0, 0, 0, 14000, null, 18, 0, (new String[] { "Water capacity: 12000mb" })),
	tenderAdler("Tender Adler",EntityTenderAdler.class, ItemIDs.minecartTenderAdler.item,"tender",0,0,0.5,0,0,0,0,0,4000,null,18,0,(new String[] {"Water capacity: 4000mb"})),
	tender_C41("Tender C41",EntityTender_C41.class, ItemIDs.minecartTenderC41.item,"tender",0,0,1.5,0,0,0,0,0,16000,TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey"}),18,0,(new String[] {"Water capacity: 16000mb"})),
	tender_Southern1102("Tender Southern1102",EntityTender_Southern1102.class, ItemIDs.minecartTenderSouthern1102.item,"tender",0,0,1.5,0,0,0,0,0,16000,null,18,0,(new String[] {"Water capacity: 16000mb"})),
	tender_MILW("Tender MILW",EntityTenderMILW.class, ItemIDs.minecartMILWTender.item,"tender",0,0,1.5,0,0,0,0,0,16000,null,18,0,(new String[] {"Water capacity: 16000mb"})),

	/** Diesel */
	locoDieselKOF("Loco Diesel KOF DB",EntityLocoDieselKof_DB.class,ItemIDs.minecartKof_DB.item, "diesel",750,45,0,60,0,170,0.66,0.96,5000,TraincraftUtil.getBytesFromColors(new String[] {"Red","Green","Yellow","Black","Blue","Cyan"}),17,-1.6),
	locoDieselGP40("Loco Diesel CD742", EntityLocoDieselCD742.class,  ItemIDs.minecartCD742.item, "diesel", 1727, 70, 0, 50, 0, 250, 0.8, 0.966, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Yellow", "White", "Blue", "Orange", "LightBlue" }), 15, -2.5),
	locoDieselChME3("Loco Diesel ChME3", EntityLocoDieselChME3.class,  ItemIDs.minecartChmE3.item,"diesel", 2383, 95, 0, 60, 0, 170, 0.66, 0.96, 5000, null, 15,  -1.2),
	locoDieselGP7Red("Loco Diesel GP7",EntityLocoDieselGP7Red.class, ItemIDs.minecartGP7Red.item,"diesel",2464,105,0,50,0,200,0.74,0.96,20000,(TraincraftUtil.getBytesFromColors(new String[] {"Red","Blue","Black","Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21"})),15,-1.4),
	locoDieselSD40("Loco Diesel SD40",EntityLocoDieselSD40.class, ItemIDs.minecartLocoSD40.item,"diesel",3041,105,0,60,0,200,0.8,0.97,20000,(TraincraftUtil.getBytesFromColors(new String[] {"Red","Yellow","Black","Green","Orange","Magenta","Blue", "Pink"})),10,-2.3),
	locoDieselSD70("Loco Diesel SD70",EntityLocoDieselSD70.class, ItemIDs.minecartLocoSD70.item,"diesel",4055,120,0,60,0,200,0.8,0.97,20000,(TraincraftUtil.getBytesFromColors(new String[] {"Orange","Yellow","Red","Blue","Magenta","Black", "Pink", "Green"})),10,-2.3),
	locoDieselShunter("Loco Diesel Shunter", EntityLocoDieselShunter.class,  ItemIDs.minecartShunter.item,"diesel", 354, 32, 0, 70, 0, 260, 0.6, 0.94, 8000,TraincraftUtil.getBytesFromColors(new String[] { "Blue", "Green", "Red", "Black", "Cyan" }), 14,  -2.58),
	locoDieselV60_DB("Loco Diesel V60 DB",EntityLocoDieselV60_DB.class, ItemIDs.minecartV60_DB.item,"diesel",1058,60,0,60,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[] {"Red","Green","Yellow","Cyan","LightBlue"}),15,-1.3),
	locoDieselIC4_DSB_MG("Loco Diesel IC4 DSB MG",EntityLocoDieselIC4_DSB_MG.class, ItemIDs.minecartIC4_DSB_MG.item,"diesel",760,200,0,60,0,200,0.8,0.97,20000,TraincraftUtil.getBytesFromColors(new String[] {"White","Red"}),10,-6, (new String[]{"Unfinished, Creative Only"})),
	//locoDieselMILW_H1044("Loco Diesel MILW H10-44",EntityLocoDieselMILW_H1044.class,ItemIDs.minecartMILW_H1044.item,"diesel",1618,97,0,60,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Yellow", "Black", "Red", "Blue", "Grey"}),15,-4.4),
	locoDieselEMDF7("Loco Diesel EMD F-7", EntityLocoDieselEMDF7.class, ItemIDs.minecartLocoEMDF7.item, "diesel", 1600, 150, 0, 50, 0, 200, 0.8, 0.97, 12000,TraincraftUtil.getBytesFromColors(new String[]{"Black", "Lime", "Red", "Brown", "Green", "Orange", "Yellow"}), 10, -2.4),
	locoDieselEMDF3("Loco Diesel EMD F-3", EntityLocoDieselEMDF3.class, ItemIDs.minecartLocoEMDF3.item, "diesel", 1500, 166, 0, 55, 0, 200, 0.8, 0.97, 12000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Orange", "Blue", "Brown", "Green", "Magenta"}), 10, -2.25),
	locoDieselEWSClass66("Loco Electric EWS Class 66", EntityLocoDieselClass66.class, ItemIDs.minecartLocoEWSClass66.item, "diesel", 3678, 121, 0, 10, 0, 170, 0.7, 0.965, 6400, TraincraftUtil.getBytesFromColors(new String[] { "Pink", "Green", "Red"}), 18, -5.5),
	locoDieselDeltic("Loco Diesel Deltic", EntityLocoDieselDeltic.class, ItemIDs.minecartLocoDeltic.item, "diesel", 1997, 161, 0, 10, 0, 170, 0.7, 0.965, 6400, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan"}), 18, -5),
	locoDieselDD35A("Loco Diesel DD35A", EntityLocoDieselDD35A.class, ItemIDs.minecartLocoDD35A.item, "diesel", 5000, 90, 0, 10, 0, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Black", "Pink"}), 18, -4.75),
	locoDiesel44TonSwitcher("GE 44-ton Diesel switcher", EntityLocoDiesel44TonSwitcher.class, ItemIDs.minecartLoco44TonSwitcher.item, "diesel", 400, 56, 0, 10, 0, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Cyan"}), 18, -2.75),
	locoDieselBamboo("Bamboo Flatcar Engine", EntityLocoDieselBamboo.class, ItemIDs.minecartTrainBamboo.item, "diesel", 30, 20, 0, 10, 0, 170, 0.7, 0.965, 3000,  TraincraftUtil.getBytesFromColors(new String[] {"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"}), 18, -2),
	locoDieselWLs40("Loco WLs40", EntityLocoDieselWLs40.class, ItemIDs.minecartLocoWLs40.item, "diesel", 60, 17, 0, 10, 0, 170, 0.7, 0.965, 3000, null, 18, -3),
	locoDieselFOL_M1("Loco FOL-M1", EntityLocoDieselFOLM1.class, ItemIDs.minecartLocoFOLM1.item, "diesel", 5000, 110, 0, 10, 0, 170, 0.7, 0.965, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Blue", "Black"}), 12, -3.9, (new String[] {"Fictional loco from Factorio"})),

	/** Electric */
	locoElectricVL10("Loco Electric VL10", EntityLocoElectricVL10.class,  ItemIDs.minecartVL10.item, "electric", 6250, 100, 0, 8, 0, 400, 1.1, 0.956, 0, null, 14, -2.3),
	locoElectricBR_E69("Loco Electric BR_E69",EntityLocoElectricBR_E69.class, ItemIDs.minecartBR_E69.item,"electric",400,50,0,5,0,400,0.9,0.946,0,TraincraftUtil.getBytesFromColors(new String[] {"Green","Red","Black","Grey","Blue","Cyan"}),18,0),
	locoElectricMineTrain("Loco Electric Minetrain",EntityLocoElectricMinetrain.class,ItemIDs.minecartLocoMineTrain.item,"electric",500,40,0,80,0,160,0.5,0.97,0,null,18,-1),
	locoElectricSpeedZeroED("Loco Electric High Speed ZeroED", EntityLocoElectricHighSpeedZeroED.class, ItemIDs.minecartLocoHighSpeedZeroED.item, "electric", 700, 240, 0, 3, 0,230, 1.4, 0.98, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "LightGrey", "Grey"}), 13,  -3.4),
	locoElectricICE1("Loco Electric ICE 1", EntityLocoElectricICE1.class, ItemIDs.minecartICE1_Loco.item, "electric", 4300, 280, 0, 4, 0, 250, 1.5, 0.98, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Red"}), 13, -5),
	//locoSpeedGrey("Loco High Speed",EntityLocoElectricNewHighSpeedLoco.class, null,null),
	locoElectricTramYellow("Loco Electric Yellow Wood Tram",EntityLocoElectricTramWood.class, ItemIDs.minecartTramWood.item,"electric",300,55,0,10,0,140,0.5,0.965,0,null,14,-2),
	locoElectricTramNY("Loco Electric Tram NY", EntityLocoElectricTramNY.class,  ItemIDs.minecartNYTram.item, "electric", 1327, 89, 0, 10, 0, 170, 0.7, 0.965, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "White"}), 18, -3),
	locoElectricBR185("Loco Electric BR 185", EntityLocoElectricBR185.class, ItemIDs.minecartLocoBR185.item, "electric", 2428, 160, 0, 6, 0, 170, 0.7, 0.965, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Blue", "Magenta", "Cyan", "Grey", "LightBlue", "LightGrey", "Orange", "Pink", "Purple", "White", "Yellow", "Black", "Brown", "Skin16", "Skin17"}), 18, -5),
	locoDieselE10lDB("Loco Electric E10 DB",EntityLocoElectricE10_DB.class, ItemIDs.minecartE10_DB.item,"electric",2473,150,0,8,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[] {"Blue","Red", "Grey", "Brown", "Green", "LightGrey", "Lime", "Pink", "Purple", "Cyan"}),15,-3.8),
	locoDieselE103("Loco Electric E103",EntityLocoElectricE103.class, ItemIDs.minecartE103.item,"electric",2806,200,0,8,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[] {"Red","Blue"}),15,-3.6),
	locoElectricClass85("Loco Electric Class 85", EntityLocoElectricClass85.class, ItemIDs.minecartLocoClass85.item, "electric", 1997, 160, 0, 10, 0, 170, 0.7, 0.965, 0, null, 18, -5),
	locoElectricCD151("Loco Electric CD151", EntityLocoElectricCD151.class, ItemIDs.minecartLocoCD151.item, "electric", 1133, 150, 0, 10, 0, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "Red"}), 18, -4),
	locoElectricBP4("Loco Electric BP4",EntityLocoElectricBP4.class, ItemIDs.minecartLocoBP4.item,"electric",1520,105,0,60,0,200,0.8,0.97,8650,TraincraftUtil.getBytesFromColors(new String[]{"Green", "Purple", "Cyan", "Grey", "Blue"}),14,-3),

	/** Steam */
	locoSteamA4("Loco Steam A4 Mallard", EntityLocoSteamMallardA4.class,  ItemIDs.minecartLocoA4Mallard.item, "steam", 1418, 203, 0, 60, 200, 160, 0.65, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Blue", "Lime", "Black", "Green", "White" }), 7, -5 ),
	locosteamHallClass("Loco Hall Class", EntityLocoSteamHallClass.class,  ItemIDs.minecartLocoHallClass.item, "steam", 1091, 164, 0, 60, 200, 160, 0.65, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Green", "Red", "Lime" }), 7, -4.95 ),
	locosteamBerk1225("Loco Berkshire 1225", EntityLocoSteamBerk1225.class,  ItemIDs.minecartLocoBerk1225.item, "steam", 2775, 164, 0, 60, 200, 160, 0.65, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String [] {"Black", "LightGrey"}), 7, -4.25 ),
	locosteamBerk765("Loco Berkshire 765", EntityLocoSteamBerk765.class,  ItemIDs.minecartLocoBerk765.item, "steam", 2563, 164, 0, 60, 200, 160, 0.65, 0.97, 10000, null, 7, -4.25 ),
	locosteamFowler("Loco Fowler", EntityLocoSteamFowler.class,  ItemIDs.minecartLocoFowler.item, "steam", 980, 102, 0, 60, 200, 160, 0.65, 0.97, 10000, null, 7, -3.25 ),
	locosteamKingClass("Loco King Class", EntityLocoSteamKingClass.class,  ItemIDs.minecartLocoKingClass.item, "steam", 1613, 174, 0, 60, 200, 160, 0.65, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Green", "Blue", "Lime" }), 7, -5.35 ),
	locoSteamMILW("Loco Steam MILW Class A", EntityLocoSteamMILWClassA.class,  ItemIDs.minecartLocoMILWClassA.item, "steam", 1228, 193, 0, 60, 150, 160, 0.65, 0.97, 10000, null, 7, -4.5 ),
	locoSteamCherepanov("Loco Steam Cherepanov",EntityLocoSteamCherepanov.class, ItemIDs.minecartLocoCherepanov.item,"steam",60,30,0,40,120,120,0.3D,0.98D,3000,null,18,-1.7),
	locoSteamBR80("Loco Steam BR80",EntityLocoSteamBR80_DB.class,ItemIDs.minecartLocoBR80_DB.item,"steam",575,45,0,100,130,135,0.45,0.97,7000,TraincraftUtil.getBytesFromColors(new String [] {"Black", "Green"}),16,-1.1),
	locoSteam4_4_0("Loco Steam 4-4-0",EntityLocoSteam4_4_0.class, ItemIDs.minecartPower.item,"steam",400,50,0,40,160,190,0.65,0.95,5000,TraincraftUtil.getBytesFromColors(new String[] {"Red","White","Blue","Brown","Green","Black", "Purple"}),16,-2),
	locoSteamSmall("Loco Steam Small",EntityLocoSteamSmall.class,  ItemIDs.minecartLoco3.item, "steam",250,45,0,140,140,160,0.5D,0.968D,5000,TraincraftUtil.getBytesFromColors(new String[] {"Blue","Red","Green","Yellow","Black","LightBlue"}),18,-1.7),
	locoSteamLSSP7("Loco Steam LSSP7",EntityLocoSteamLSSP7.class,  ItemIDs.minecartLocoLSSP7.item, "steam",250,45,0,140,140,160,0.5D,0.968D,5000,null,18,-1.1),
	locoHeavySteam("Loco Steam Heavy",EntityLocoSteamHeavy.class, ItemIDs.minecartHeavySteam.item,"steam",3000, 65, 0, 40, 140, 190,0.4D, 0.9D, 10000, null, 7, -3),//SIKE ITS BACK
	locoSteamC62Class("Loco Steam C62Class", EntityLocoSteamC62Class.class,  ItemIDs.minecartLocoC62Class.item,
			"steam", 1223, 129, 0, 60, 180, 160, 0.7, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Black", "Red" }), 7, -5.66),
	locoSteamD51Short("Loco Steam D51 Short Streamlining", EntityLocoSteamD51.class,  ItemIDs.minecartLocoD51Short.item,
			"steam", 1658, 85, 0, 60, 180, 160, 0.7, 0.97, 10000,  TraincraftUtil.getBytesFromColors(new String[] { "Black", "Grey" }), 7, -5.66),
	locoSteamD51Long("Loco Steam D51 Long Streamlining", EntityLocoSteamD51Long.class,  ItemIDs.minecartLocoD51Long.item,
			"steam", 1658, 85, 0, 60, 180, 160, 0.7, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Black", "Grey" }), 7, -5.66),
	locoSteamBR01_DB("Loco Steam BR01", EntityLocoSteamBR01_DB.class, ItemIDs.minecartLocoBR01_DB.item,"steam", 2120, 130, 0, 60, 200, 300, 0.6, 0.97, 10000, null, 10,  -3.7),
	locoSteamCoranationClass("Loco Steam Coranation Class", EntityLocoSteamCoranationClass.class,
			ItemIDs.minecartLocoCoranationClass.item, "steam", 1619, 183, 0, 60, 200, 300, 0.6, 0.97, 10000, null, 10,
			-6),
	locoSteamGS4("Loco Steam GS4", EntityLocoSteamGS4.class,  ItemIDs.minecartGS4_Loco.item, "steam", 2653, 180, 0, 60, 350, 450, 0.6, 0.95, 8800, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "White"}), 10, -6 ),
	locoSteamEr_USSR("Loco Steam ER_USSR", EntityLocoSteamEr_Ussr.class, ItemIDs.minecartLocoEr.item,"steam", 800, 80, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -3.7 ),
	locoSteamC41("Loco Steam C41", EntityLocoSteamC41.class, ItemIDs.minecartLocoC41.item,"steam", 1484, 120, 0, 80, 100, 200, 0.35, 0.975, 4000, null, 10, -3.4 ),
	locoSteamC41_080("Loco Steam C41 0-8-0", EntityLocoSteamC41_080.class, ItemIDs.minecartLocoC41_080.item,"steam", 1484, 120, 0, 80, 100, 200, 0.35, 0.975, 4000, null, 10, -3.4 ),
	locoSteamAlcoSc4("Loco Steam Alco SC4", EntityLocoSteamAlcoSC4.class, ItemIDs.minecartLocoAlcoSC4.item,"steam", 800, 120, 0, 80, 100, 200, 0.35, 0.975, 4000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey"}), 10, -3.4 ),
	locoSteamSouthern1102("Loco Steam Southern 1102", EntityLocoSteamSouthern1102.class, ItemIDs.minecartLocoSouthern1102.item,"steam", 1236, 118, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -3.4 ),
	locoSteamUSATCUS("Loco Steam USATCUS", EntityLocoSteamUSATCUS.class, ItemIDs.minecartLocoUSATCUS.item,"steam", 197, 75, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -2.5 ),
	locoSteamUSATCUK("Loco Steam USATCUK", EntityLocoSteamUSATCUK.class, ItemIDs.minecartLocoUSATCUK.item,"steam", 197, 75, 0, 80, 100, 200, 0.35, 0.975, 10000, null, 10, -2.5 ),
	locoSteamC41T("Loco Steam C41T", EntityLocoSteamC41T.class, ItemIDs.minecartLocoC41T.item,"steam", 1484, 110, 0, 80, 100, 200, 0.35, 0.975, 16000, null, 10, -3.4 ),
	locoSteamForney("Loco Steam Forney",EntityLocoSteamForneyRed.class, ItemIDs.minecartLocoForneyRed.item,"steam",600,70,0,60,160,130,0.44,0.968,8000,TraincraftUtil.getBytesFromColors(new String[] {"Red","Grey","Yellow","Brown","Blue","Green"}),15,-1.35),
	locoSteamMogul("Loco Steam Mogul",EntityLocoSteamMogulBlue.class, ItemIDs.minecartLocomogulBlue.item,"steam",500,65,0,50,180,180,0.56,0.967,5000,TraincraftUtil.getBytesFromColors(new String[] {"Blue","Black","Brown","Green","Red","White"}),15,-2.2),
	locoSteamShay("Loco Steam Shay",EntityLocoSteamShay.class, ItemIDs.minecartLocoSteamShay.item,"steam",250,50,0,50,160,130,0.5,0.968,4000,null,15,-1),
	locoSteamVBShay("Loco Steam VB Shay",EntityLocoSteamVBShay.class, ItemIDs.minecartLocoSteamVBShay.item,"steam",250,32,0,40,140,100,0.5,0.968,3000,null,15,-0.5),
	locoSteamClimax("Loco Steam Climax",EntityLocoSteamClimax.class, ItemIDs.minecartLocoSteamClimax.item,"steam",250,45,0,50,160,130,0.5,0.968,4000,null,15,-1.5),
	locoSteamPannier("Loco Steam Pannier",EntityLocoSteamPannier.class, ItemIDs.minecartLocoSteamPannier.item,"steam",903,80,0,50,160,130,0.5,0.968,8000,null,15,-3.5),
	locoSteamAlice("Loco Steam Alice",EntityLocoSteamAlice0_4_0.class, ItemIDs.minecartLocoSteamAlice.item,"steam",200,32,0,60,160,200,0.5,0.968,3750,null,15,-2),
	locoSteamGLYN("Loco Steam glyn",EntityLocoSteamGLYN042T.class, ItemIDs.minecartLocoSteamGLYN.item,"steam",600,32,0,60,160,200,0.45,0.968,3750,null,15,-2.5),
	locoSteam262T("Loco Steam 262T",EntityLocoSteam262T.class, ItemIDs.minecartLocoSteam262T.item,"steam",300,70,0,60,160,300,0.5,0.968,4250,null,15,-3),
	locoSteam040VB("Loco Steam 040VB",EntityLocoSteam040VB.class, ItemIDs.minecartLocoSteam040vb.item,"steam",200,32,0,40,120,200,0.5,0.968,2500,null,15,-1.1),
	locoSteamAdler("Loco Steam Adler",EntityLocoSteamAdler.class, ItemIDs.minecartLocoSteamAdler.item,"steam",200,65,0,60,160,300,0.5,0.968,3000,null,15,-1.5),
	locoSteamSnowPlow("Loco Steam Snow Plow", EntityLocoSteamSnowPlow.class, ItemIDs.minecartLocoSnowPlow.item, "steam, snow plow", 200, 20, 0, 10, 120, 170, 0.7, 0.965, 6850, null, 18, -4.75),

	/** Heritage*/
	CF7_H_Angle("CF7_H_Angle", DieselCF7_H_Angle.class, ItemIDs.minecartCF7_H_Angle.item, "diesel", 1500, 116, 0, 50,0,200,0.74,0.96,18000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Pink", "White", "Purple"}), 16, -2, (new String[] {"Heritage"})),
	CF7_H_Round("CF7_H_Round", DieselCF7_H_Round.class, ItemIDs.minecartCF7_H_Round.item, "diesel", 1500, 116, 0, 50,0,200,0.74,0.96,18000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow"}), 16, -2, (new String[] {"Heritage"})),


	/** Fox-TC*/

	//stEAmeeee//
	Climax2("2TruckClimax", SteamClimaxNew.class, ItemIDs.minecartClimaxNew.item, "steam", 680,35,0,50,160,120,0.7,0.8,8000, null,15,-1.0),
	VBShay("2TruckVerticalBoilerShay", SteamVBShay2.class, ItemIDs.minecartVBShay2.item, "steam", 630,35,0,50,160,120,0.7,0.8,6000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey"}),15,-1.3),
	Skook("Skookum", SteamSkook.class, ItemIDs.minecartSkook.item, "steam", 1470, 75, 0, 75, 75, 190, 0.8, 0.91, 2000, null, 10, -2.4),
	SkookTender("Skookum Tender", TenderSkookTender.class, ItemIDs.minecartSkookTender.item,"tender",0,0,2,0,0,0,0,0,15000,null,18,0, (new String[] {"Water capacity: 15000mb."})),
	Shay3Truck("3 Truck Shay", SteamShay3Truck.class, ItemIDs.minecartShay3Truck.item, "steam", 838, 35, 0, 75, 75, 190, 0.8, 0.9, 4000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "White"}), 15, -1.8),
	Shay3TruckTender("3 Truck Shay Tender", TenderShay3Truck.class, ItemIDs.minecartShay3TruckTender.item,"tender",0,0,2,0,0,0,0,0,10000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "White"}),22,0,(new String[] {"Water capacity: 10000mb."})),

	F01("F01", SteamF01.class, ItemIDs.minecartF01.item, "steam", 450,65,0,50,160,120,0.7,0.8,9000, null,16,-1.7),
	P01a("P01a", SteamP01a.class, ItemIDs.minecartP01a.item, "steam", 1475, 85, 0, 75, 75, 190, 0.85, 0.8, 4000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Green"}), 18, -1.8),
	VanderbackTender("VanderbackTender", TenderVanderback.class, ItemIDs.minecartVanderbackTender.item,"tender",0,0,2,0,0,0,0,0,29000, TraincraftUtil.getBytesFromColors(new String[] {"Grey"}),18,0,(new String[] {"Water capacity: 29000mb."})),
	SquanderbackTender("SquanderbackTender", TenderSquanderback.class, ItemIDs.minecartSquanderbackTender.item,"tender",0,0,2.1,0,0,0,0,0,34000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Green"}),18,0,(new String[] {"Water capacity: 34000mb. this started life a shitpost but i liked it too much"})),

	BKno2a("BKno2a", SteamBKno2a.class, ItemIDs.minecartBKno2a.item, "steam", 1450,80,0,50,160,120,0.7,0.8,15000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Orange"}),18,-1.3,(new String[] {"Place facing forward"})),
	BKno2b("BKno2b", SteamBKno2b.class, ItemIDs.minecartBKno2b.item, "steam", 1450,80,0,50,160,120,0.7,0.8,15000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Orange"}),15,-1.2,(new String[] {"Place facing backward"})),
	WCPBuckingBull("WCPBuckingBull", SteamBuckingBull.class, ItemIDs.minecartWCPBuckingBull.item, "steam", 2200, 70, 0, 25, 70, 170, 0.78, 0.9, 2000, null, 10, -2.4),
	WCPBaler("WCPBaler", TenderBaler.class, ItemIDs.minecartWCPBaler.item,"tender",0,0,3,0,0,0,0,0,15000, null,18,0, (new String[] {"Water capacity: 15000mb."})),
	WCPMacky("WCPMacky", SteamMacky.class, ItemIDs.minecartWCPMacky.item, "steam", 2069, 66, 0, 25, 90, 170, 0.66, 0.9, 2000, null, 10, -2.2),
	ClimaxB("ClimaxB", SteamClimaxB.class, ItemIDs.minecartClimaxB.item, "steam", 838, 35, 0, 80, 80, 190, 0.8, 0.9, 9000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "LightGrey"}), 15, -1.8),
	Alco2102("Alco2102", SteamAlco2102.class, ItemIDs.minecartalco2102.item, "steam", 1613, 65, 0, 75, 75, 190, 0.85, 0.8, 17000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20"}), 14, -2.4),
	MK60("MK60", SteamMK60.class, ItemIDs.minecartMK60.item, "steam", 2765, 98, 0, 75, 75, 190, 0.85, 0.8, 2000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Purple"}), 14, -2.6),
	Tender10k("Tender10k", Tender10k.class, ItemIDs.minecartTender10k.item,"tender",0,0,3,0,0,0,0,0,38000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "Skin17", "Skin18", "Yellow", "Purple", "Pink"}),18,0, (new String[] {"Water capacity: 38000mb."})),
	TenderDeseret("TenderDeseret", TenderDeseret.class, ItemIDs.minecartTenderDeseret.item,"tender",0,0,4,0,0,0,0,0,57000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "Skin17", "Skin18"}),18,0, (new String[] {"Water capacity: 57000mb."})),

	C11("Loco Steam C11", SteamC11.class, ItemIDs.minecartLocoC11.item,"steam", 1030, 97, 0, 80, 100, 200, 0.35, 0.975, 16000, null, 10, -3.0),
	Onion("Onion", SteamOnion.class, ItemIDs.minecartOnion.item, "steam", 350,1555,0,50,140,100,0.7,0.99,8000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Orange", "Blue", "Grey", "Red", "Yellow", "White", "Brown", "LightGrey", "Pink"}),17,-1.3),
	OnionTender("Onion Tender", TenderOnion.class, ItemIDs.minecartOnionTender.item, "tender", 0, 0, 0.1, 0, 0, 0, 0, 0, 12000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Orange", "Blue", "Grey", "Red", "Yellow", "White", "Brown", "LightGrey", "Pink"}), 17, 0, (new String[] {"Water capacity: 12000mb."})),
	NP_L9("NP_L9", SteamNP_L9.class, ItemIDs.minecartNP_L9.item, "steam", 1200,65,0,80,180,140,0.7,0.725,3000, TraincraftUtil.getBytesFromColors(new String[] {"Grey"}),16,-1.7),
	NP_11C_Tender("NP_11C_Tender", TenderNP_11C.class, ItemIDs.minecartNP_11C_tender.item,"tender",0,0,3.5,0,0,0,0,0,26000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Black"}),18,0,(new String[] {"Water capacity: 26000mb."})),
	NP_13C_Tender("NP_13C_Tender", TenderNP_13C.class, ItemIDs.minecartNP_13C_tender.item,"tender",0,0,3.75,0,0,0,0,0,31000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Black"}),18,0,(new String[] {"Water capacity: 31000mb."})),

	PELoco("Loco Steam PELoco", SteamPELoco.class, ItemIDs.minecartPELocomotive.item,"steam", 1484, 120, 0, 80, 100, 200, 0.35, 0.975, 4000, null, 10, -3.4 ),
	PETender("Tender PETender",TenderPETender.class, ItemIDs.minecartPETender.item,"tender",0,0,1.5,0,0,0,0,0,20000,null,18,0,(new String[] {"Water capacity: 20000mb"})),

	//EMD//
	F3A("F3A", DieselF3A.class, ItemIDs.minecartF3A.item, "diesel", 1500, 133, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightGrey", "Grey", "Black"}), 18, -2.5),
	F7A("F7A", DieselF7A.class, ItemIDs.minecartF7A.item, "diesel", 1500, 133, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "LightGrey", "White", "Orange", "Black", "Yellow", "Grey", "Magenta", "LightBlue", "Pink", "Cyan", "Brown", "Red", "Lime", "Blue", "Purple", "Skin16", "Skin17", "Skin25", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin26", "Skin27"}), 18, -2.70),
	F7B("F7B", DieselF7B.class, ItemIDs.minecartF7B.item, "diesel", 1500, 133, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "LightGrey", "White", "Orange", "Black", "Yellow", "Grey", "Magenta", "LightBlue", "Pink", "Cyan", "Brown", "Red", "Lime", "Blue", "Purple", "Skin16", "Skin17", "Skin25", "Skin18", "Skin21", "Skin22", "Skin26", "Skin27"}), 18, -2.4),
	//BUnitF7B("BUnitF7B", BUnitF7.class, ItemIDs.minecartBUnitF7B.item, "b-unit", 0, 0, 7, 0, 0, 0, 0, 0, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Green", "LightGrey", "White", "Orange", "Black", "Yellow", "Grey", "Magenta", "LightBlue", "Pink", "Cyan", "Brown", "Red", "Lime", "Blue", "Purple", "Skin16", "Skin17", "Skin18", "Skin21", "Skin22", "Skin19"}), 18, 0, (new String[] {"Reduces weight carried by 70 tons when fueled"})),
	FP7A("FP7A", DieselFP7A.class, ItemIDs.minecartFP7A.item, "diesel", 1500, 192, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "LightGrey", "Skin16", "Orange", "Skin17", "Cyan", "Purple"}), 16, -2.70),
	FP9A("FP9A", DieselFP9A.class, ItemIDs.minecartFP9A.item, "diesel", 1750, 169, 0, 25, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Blue"}), 16, -2.70),

	CF7angle("CF7angle", DieselCF7angle.class, ItemIDs.minecartCF7angle.item, "diesel", 1500, 116, 0, 25, 0, 200, 0.65, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Skin29", "Red", "Green", "Brown", "Skin16", "Skin17", "Orange", "Skin18", "Skin19", "Skin20", "Skin21", "Black", "Magenta", "Purple", "LightBlue", "Skin27", "Skin33", "Skin34", "Skin38"}), 15, -2.5),
	CF7round("CF7round", DieselCF7round.class, ItemIDs.minecartCF7round.item, "diesel", 1500, 116, 0, 25, 0, 200, 0.65, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Yellow", "Skin18", "Grey"}), 15, -2.5),
	CF7round3("CF7round3", DieselCF7round3.class, ItemIDs.minecartCF7round3.item, "diesel", 1500, 116, 0, 25, 0, 200, 0.65, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Pink", "Cyan", "Skin19", "White", "LightBlue", "Skin20", "Skin24", "Lime", "Skin17", "Skin16"}), 15, -2.5),
	CF7angle2("CF7angle2", DieselCF7angle2.class, ItemIDs.minecartCF7angle2.item, "diesel", 1470, 90, 0, 15, 0, 200, 0.6, 0.9, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Skin16", "Green", "White", "Skin17", "Cyan", "Skin18"}), 15, -2.5),
	CF7angle3("CF7angle3", DieselCF7angle3.class, ItemIDs.minecartCF7angle3.item, "diesel", 1500, 116, 0, 25, 0, 200, 0.65, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"White", "Pink", "Cyan", "Skin22", "Yellow", "Orange", "Skin26", "Skin36", "Skin37", "Skin28", "LightGrey", "Skin30", "Skin31", "Skin39", "Skin40", "Skin35", "Skin24", "Grey", "Lime", "Skin25", "Skin32"}), 15, -2.5),
	CF7hh("CF7hh", DieselCF7hh.class, ItemIDs.minecartCF7hh.item, "diesel", 1500, 120, 0, 20, 0, 200, 0.6, 0.7, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Lime"}), 15, -2.5),
	F40PH("F40PH", DieselF40PH.class, ItemIDs.minecartF40PH.item, "diesel", 3000, 103, 0, 20, 0, 200, 0.9, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Red", "Yellow"}), 14, -3.5),

	E7A("E7A", DieselE7A.class, ItemIDs.minecartE7A.item, "diesel", 2000, 188, 4.5, 20, 0, 180, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Magenta", "Cyan", "Skin43", "Green", "Lime", "Brown", "Black", "Orange", "Blue", "LightBlue", "Yellow", "Grey", "LightGrey", "Purple", "Red", "Pink", "White", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin42", "Skin37" ,"Skin41", "Skin38", "Skin39", "Skin40"}), 12, -3.65),
	E7B("E7B", DieselE7B.class, ItemIDs.minecartE7B.item, "diesel", 2000, 188, 4.5, 20, 0, 180, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Magenta", "Orange", "Yellow", "Grey", "LightGrey", "Purple", "Red", "Pink", "Skin27", "Skin37", "Black", "Skin28", "Skin29"}), 12, -3.77),
	//BUnitE7B("BUnitE7B", BUnitE7B.class, ItemIDs.minecartBUnitE7B.item, "diesel", 0, 0, 5, 0, 0, 0, 0, 0, 11000, TraincraftUtil.getBytesFromColors(new String[] {"Magenta", "Orange", "Yellow", "Grey", "LightGrey", "Purple", "Red", "Pink"}), 10, 0, (new String[] {"Reduces weight carried by 50 tons when fueled"})),
	E8A("E8A", DieselE8A.class, ItemIDs.minecartE8A.item, "diesel", 2250, 188, 0, 25, 0, 200, 0.8, 0.69, 11000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Purple", "Cyan", "Blue", "Brown", "Red", "Pink", "Skin21", "Yellow", "Lime", "Grey", "LightGrey", "White", "Green", "LightBlue", "Black", "Magenta", "Skin17", "Skin18", "Skin19", "Skin20"}), 12, -3.65),
	E8B("E8B", DieselE8B.class, ItemIDs.minecartE8B.item, "diesel", 2250, 188, 0, 25, 0, 200, 0.8, 0.69, 11000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Blue", "Red", "Grey", "LightGrey"}), 12, -3.77),
	//BUnitE8B("BUnitE8B", BUnitE8B.class, ItemIDs.minecartBUnitE8B.item, "diesel", 0, 0, 5, 0, 0, 0, 0, 0, 11000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Blue", "Red", "Grey", "LightGrey"}), 10, 0, (new String[] {"Reduces weight carried by 50 tons when fueled"})),
	E9A("E9A", DieselE9A.class, ItemIDs.minecartE9A.item, "diesel", 2400, 188, 0, 25, 0, 200, 0.8, 0.69, 11000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Skin16"}), 12, -3.75),
	E9B("E9B", DieselE9B.class, ItemIDs.minecartE9B.item, "diesel", 2400, 188, 0, 25, 0, 200, 0.8, 0.69, 11000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey"}), 12, -3.6875),
	//BUnitE9B("BUnitE9B", BUnitE9B.class, ItemIDs.minecartBUnitE9B.item, "diesel", 0, 0, 5, 0, 0, 0, 0, 0, 11000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey"}), 10, 0, (new String[] {"Reduces weight carried by 50 tons when fueled"})),
	CE8("CE8", DieselCE8.class, ItemIDs.minecartCE8.item, "diesel", 2250, 116, 0, 25, 0, 200, 0.8, 0.69, 11000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Black", "LightGrey", "Grey", "LightBlue"}), 12, -3.65),

	GP7("GP7", DieselGP7.class, ItemIDs.minecartGP7.item, "diesel", 1500, 105, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"White", "Green", "Black", "Skin26", "Skin19", "LightGrey", "Skin20", "Skin21", "Lime", "Purple", "Blue", "Skin16", "Skin17", "Skin18", "Grey", "Orange", "Pink", "Skin35", "Skin36", "Skin37", "Skin38", "Skin22", "Brown", "Skin23", "LightBlue", "Skin24", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin39", "Skin40", "Skin41", "Skin42", "Skin43", "Skin44", "Skin45", "Red", "Magenta", "Skin46", "Skin47", "Skin48", "Skin49"}), 16, -2.9),
	GP7b("GP7b", DieselGP7b.class, ItemIDs.minecartGP7b.item, "diesel", 1500, 105, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightGrey", "White"}), 16, -2.9),
	GP7u("GP7u",DieselGP7u.class, ItemIDs.minecartGP7u.item, "diesel", 1500, 100, 0, 25, 0, 200, 0.65, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Blue", "LightGrey", "White", "Skin16", "Grey", "Green"}), 16, -2.9),
	GP7f("GP7f", DieselGP7f.class, ItemIDs.minecartGP7f.item, "diesel", 1800, 100, 0, 25, 0, 200, 0.85, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Blue", "Skin16", "LightGrey", "Skin17", "Skin18"}), 16, -2.9),
	GPFDL("GPFDL", DieselGPFDL.class, ItemIDs.minecartGPFDL.item, "diesel", 2250, 105, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan","LightGrey", "Skin16", "Green"}), 16, -2.9),
	GP9("GP9", DieselGP9.class, ItemIDs.minecartGP9.item, "diesel", 1750, 100, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Black", "Skin21", "Orange", "Skin25", "White", "Skin18", "Skin16", "Skin17", "LightGrey", "Skin19", "Skin20", "Pink", "Magenta", "Skin35", "Skin36", "Skin37", "LightBlue", "Skin23", "Skin24", "Skin26", "Skin31", "Skin28", "Skin29", "Skin30", "Skin33", "Skin34", "Skin38", "Yellow", "Blue", "Skin39", "Skin40", "Purple", "Lime", "Skin41", "Skin42", "Skin43", "Skin44", "Skin45", "Skin46", "Skin47", "Skin48", "Skin49", "Skin50", "Red", "Skin51", "Skin52"}), 16, -2.9),
	GP9b("GP9b", DieselGP9b.class, ItemIDs.minecartGP9b.item, "diesel", 1750, 100, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Black", "Grey"}), 16, -2.9),
	//GP7old("GP7old", DieselGP7old.class, ItemIDs.minecartGP7old.item, "diesel", 1500, 105, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Blue", "White", "Brown", "Black", "Red", "Green", "Purple", "LightGrey", "Grey", "Lime", "Cyan", "Pink", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22"}), 16, -2.9),
	GP13("GP13", DieselGP13.class, ItemIDs.minecartGP13.item, "diesel", 2510,90,0,25,0,200,0.74,0.85,15000, TraincraftUtil.getBytesFromColors(new String[]{"Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Blue", "LightBlue", "Black", "Orange", "White", "Yellow", "Cyan"}), 18, 1.4, (new String[] {"Uses the heritage GP40 Model"})),
	GP15("GP15", DieselGP15.class, ItemIDs.minecartGP15.item, "diesel", 1500, 105, 0, 15, 0, 200, 0.85, 0.85, 15000, TraincraftUtil.getBytesFromColors(new  String[] {"Yellow", "LightGrey", "Cyan", "LightBlue", "Skin26", "Skin16", "Blue"}), 16, -2.6),
	GP18("GP18", DieselGP18.class, ItemIDs.minecartGP18.item, "diesel", 1800, 100, 0, 25, 0, 200, 0.80, 0.85, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Green", "Blue", "Pink", "Skin16", "Skin17", "Purple", "Skin18", "Skin19", "LightGrey", "Skin20"}), 16, -2.9),
	GP30("GP30", DieselGP30.class, ItemIDs.minecartGP30.item, "diesel", 2250, 134, 0, 30, 0, 200, 0.8, 0.85, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Black", "Blue", "LightBlue", "Grey", "Skin17", "Yellow", "Green", "Skin18", "Skin16", "Purple", "Pink", "Red", "Skin19", "LightGrey", "Skin20", "Skin21", "Skin22", "Magenta"}), 15, -2.9),
	GP35("GP35", DieselGP35.class, ItemIDs.minecartGP35.item, "diesel", 2500, 105, 0, 25, 0, 190, 0.8, 0.85, 15000, TraincraftUtil.getBytesFromColors(new  String[] {"Red", "Skin19", "Black", "Magenta", "Skin16", "Grey", "Skin17", "LightBlue", "LightGrey", "Skin18", "Pink", "Yellow", "Purple", "Lime", "Cyan", "Skin20", "Skin21", "White", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29"}), 15, -2.9),
	GP38dash9W("GP38dash9W", DieselGP38dash9W.class, ItemIDs.minecartGP38dash9W.item, "diesel", 2000, 105, 0, 45, 0, 200, 0.5, 0.85, 10000, null, 14, -3.2),
	GP38H3("GP38H3", DieselGP38H3.class, ItemIDs.minecartGP38h3.item, "diesel", 2000, 169, 0, 25, 0, 200, 0.8, 0.85, 16000, TraincraftUtil.getBytesFromColors(new  String[] {"White", "Blue"}), 14, -3.25),
	GP38("GP38", DieselGP38.class, ItemIDs.minecartGP38.item, "diesel", 2000, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"LightGrey", "Cyan", "Grey", "Skin18", "Skin26", "Skin21", "Skin22", "Skin23", "Skin24", "Magenta", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Red", "Skin33", "Skin34"}), 14, -2.9),
	GP38Dash2("GP38Dash2", DieselGP38dash2.class, ItemIDs.minecartGP38dash2.item, "diesel", 2000, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Yellow", "Green", "Skin16", "Blue", "Black", "Skin17", "Skin19", "Skin20", "Orange", "Skin25", "Skin29", "Skin30", "Skin31"}), 14, -3.1),
	GP39("GP39", DieselGP39.class, ItemIDs.minecartGP39.item, "diesel", 2300, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Green", "Grey", "Blue"}), 14, -2.9),
	GP39Dash2("GP39Dash2", DieselGP39Dash2.class, ItemIDs.minecartGP39Dash2.item, "diesel", 2300, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Green", "Skin16", "Skin18", "Skin19", "LightBlue"}), 14, -2.9),
	GP39TDash2("GP39TDash2", DieselGP39TDash2.class, ItemIDs.minecartGP39TDash2.item, "diesel", 2300, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Green"}), 14, -2.9),
	GP39TDash2B("GP39TDash2B", DieselGP39TDash2B.class, ItemIDs.minecartGP39TDash2B.item, "diesel", 2300, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Green"}), 14, -2.9),
	GP40("GP40", DieselGP40.class, ItemIDs.minecartGP40.item, "diesel", 3000, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Pink", "Red", "Skin20", "Grey", "Orange", "Skin21", "Skin22", "Green", "Magenta", "Skin19", "Skin23", "Skin24", "Skin25", "Skin28", "Skin30", "Skin32", "Skin33", "Skin34", "Cyan", "Skin35", "Lime"}), 14, -2.9),
	GP40Dash2("GP40Dash2", DieselGP40Dash2.class, ItemIDs.minecartGP40Dash2.item, "diesel", 3000, 105, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Skin31", "Skin16", "Skin17", "Skin27", "Lime", "White", "Skin18", "Blue", "LightGrey", "Black", "Skin26", "Skin29"}), 14, -2.9),
	GP40TC("GP40TC", DieselGP40TC.class, ItemIDs.minecartGP40tc.item, "diesel", 3000, 169, 0, 25, 0, 200, 0.8, 0.85, 16000, TraincraftUtil.getBytesFromColors(new  String[] {"Blue", "White"}), 14, -3.25),
	GP49("GP49", DieselGP49.class, ItemIDs.minecartGP49.item, "diesel", 2800, 105, 0, 35, 0, 200, 0.65, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Blue", "LightGrey"}), 14, -3.1),

	SD9("SD9", DieselSD9.class, ItemIDs.minecartSD9.item, "diesel", 1750, 104, 0, 35, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Black", "Orange", "Skin17", "Cyan", "LightGrey", "Skin18", "Yellow", "Magenta", "Skin19", "Skin20"}), 14, -3.05),
	SD38("SD38", DieselSD38.class, ItemIDs.minecartSD38.item, "diesel", 2000, 105, 0, 10, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"White", "LightGrey", "LightBlue", "Blue", "Skin16", "Cyan", "Skin17", "Black", "Skin18", "Grey", "Skin19"}), 12, -3.45),
	SD39("SD39", DieselSD39.class, ItemIDs.minecartSD39.item, "diesel", 2300, 105, 0, 10, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "LightGrey", "Brown", "Skin18", "Skin19", "Skin20", "Cyan", "Purple"}), 12, -3.45),
	SDL39("SDL39", DieselSDL39.class, ItemIDs.minecartSDL39.item, "diesel", 2300, 152, 0, 5, 0, 200, 0.75, 0.85, 7000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Pink", "Magenta", "Red", "Skin16", "Skin17"}), 14, -2.9),
	SD40("SD40", DieselSD40.class, ItemIDs.minecartSD40.item, "diesel", 3000, 105, 0, 20, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightGrey", "Skin16", "Red", "Skin17", "Cyan", "Black", "Skin18", "Skin20", "Skin21"}), 12, -3.45),
	SD40dash2("SD40-2", DieselSD40dash2.class, ItemIDs.minecartSD40dash2.item, "diesel", 3000, 105, 0, 20, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Magenta", "Green", "White", "Skin18", "Yellow", "Orange", "Skin20", "Purple", "Skin21", "LightBlue", "Red", "Pink", "Black", "Skin22", "Skin23", "Skin16", "Skin17", "Skin19", "Brown", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Skin34", "Skin35", "Skin36", "Skin37"}), 12, -3.45),
	SD40T2("SD40T-2", DieselSD40T2.class, ItemIDs.minecartSD40T2.item, "diesel", 3000, 105, 0, 10, 0, 200, 0.75, 0.85, 14000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "Red", "Skin17", "Yellow", "Magenta", "Blue", "LightGrey", "LightBlue", "Skin16", "Skin18", "Green", "White", "Cyan", "Skin19", "Skin20", "Skin21"}), 12, -3.45),
	SD40dash2B("SD40-2B", DieselSD40dash2B.class, ItemIDs.minecartSD40dash2B.item, "diesel", 3000, 105, 0, 5, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Red"}), 12, -3.8),
	SD40R("SD40R", DieselSD40R.class, ItemIDs.minecartSD40R.item, "diesel", 3000, 105, 0, 20, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Skin16", "Skin17"}), 12, -3.45),
	SD40A("SD40A", DieselSD40A.class, ItemIDs.minecartSD40A.item, "diesel", 3000, 105, 0, 20, 0, 200, 0.75, 0.85, 14000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Skin16", "Black", "Skin17", "Orange", "Grey"}), 12, -3.45),
	SDP40("SDP40", DieselSDP40.class, ItemIDs.minecartSDP40.item, "diesel", 3000, 160, 0, 5, 0, 200, 0.75, 0.85, 14000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Skin16", "Skin17", "Grey", "LightGrey", "Skin18", "Purple", "Blue", "Orange", "Skin19"}), 12, -3.45),
	SDP40F("SDP40F",DieselSDP40F.class, ItemIDs.minecartSDP40F.item, "diesel", 3000, 160, 0, 10, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "White", "LightGrey", "Grey", "Yellow"}), 12, -3.95),
	SD40dash3("SD40-3", DieselSD40dash3.class, ItemIDs.minecartSD40dash3.item, "diesel", 3000, 113, 0, 10, 0, 200, 0.75, 0.85, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Yellow", "Orange"}), 12, -3.45),
	SD45("SD45", DieselSD45dash2.class, ItemIDs.minecartSD45dash2.item, "diesel", 3600, 132, 0, 10, 0, 200, 0.75, 0.85, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Blue","Skin16","Green","Pink","Grey","Black","Skin17","Skin18","Orange","Skin19","Yellow","Skin20","Red","Skin21","Skin22","Skin23","Skin24","Skin25","Skin26","LightGrey","Skin27","Skin28", "Skin29", "Skin30", "Purple", "Skin31"}), 12, -3.45),
	SD45dash2B("SD45-2B", DieselSD45dash2B.class, ItemIDs.minecartSD45dash2B.item, "diesel", 3600, 132, 0, 10, 0, 200, 0.75, 0.85, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Yellow", "Red", "White"}), 12, -3.8),
	SDP45("SDP45", DieselSDP45.class, ItemIDs.minecartSDP45.item, "diesel", 3600, 160, 0, 20, 0, 200, 0.75, 0.85, 14000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Grey", "Blue", "Green", "Skin16", "Purple", "Pink"}), 12, -3.45),
	FP45("FP45",DieselFP45.class, ItemIDs.minecartFP45.item, "diesel", 3600, 145, 0, 10, 0, 200, 0.75, 0.85, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Yellow", "LightGrey", "Grey"}), 12, -3.95),
	F45("F45",DieselF45.class, ItemIDs.minecartF45.item, "diesel", 3600, 145, 0, 10, 0, 200, 0.75, 0.58, 16000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Green", "Blue", "Yellow", "Red"}), 12, -3.65),
	SD50("SD50", DieselSD50.class, ItemIDs.minecartSD50.item, "diesel", 3600, 142, 0, 20, 0, 200, 0.75, 0.85, 23000, TraincraftUtil.getBytesFromColors(new String[] {"Purple", "Pink", "Blue", "LightBlue", "Brown", "Black", "White", "LightGrey", "Green"}), 12, -3.725),
	SD60("SD60", DieselSD60.class, ItemIDs.minecartSD60.item, "diesel", 3800, 113, 0, 20, 0, 200, 0.75, 0.85, 23000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Skin16", "Red", "Yellow", "Brown", "LightBlue", "LightGrey", "Purple", "Green"}), 12, -3.725),
	SD70Mac("SD70Mac", DieselSD70Mac.class, ItemIDs.minecartSD70Mac.item, "diesel", 4000, 112, 0, 10, 0, 200, 0.7, 0.85, 20000, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Blue", "Grey", "LightGrey", "LightBlue", "Yellow", "Black","Green", "Orange", "Lime", "Pink", "Magenta", "Brown", "Cyan"}), 12, -4),
	SD70ACe("SD70ACe", DieselSD70ACe.class, ItemIDs.minecartSD70ACe.item, "diesel", 4300, 110, 0, 45, 0, 180, 0.8, 0.87, 21000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Blue", "LightBlue", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26"}), 12, -4.0),
	SD70ACe_H("SD70ACe_H", DieselSD70ACe_H.class, ItemIDs.minecartSD70ACe_H.item, "diesel", 4300, 110, 0, 45, 0, 180, 0.8, 0.87, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Skin16", "Purple", "Grey", "Yellow", "Green", "Orange", "White", "Blue", "Lime", "Black", "LightGrey"}), 12, -4.0),

	SW1("SW1", DieselSW1.class, ItemIDs.minecartSW1.item, "diesel", 600, 105, 0, 35, 0, 160, 0.6, 0.890, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Green", "Skin22", "LightBlue", "Skin16", "Black", "Skin17", "Pink", "Purple", "Skin18", "Skin19", "Lime", "Skin20", "Skin21", "Skin23", "Skin24", "Skin25", "Skin26", "Cyan", "Skin27", "Skin28", "Skin29"}), 16, -2),
	SW8("SW8", DieselSW8.class, ItemIDs.minecartSW8.item, "diesel", 800, 105, 0, 35, 0, 200, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[]{"Red", "LightGrey", "Skin17", "Skin18", "Skin19", "Skin20" }), 16, -2.0),
	SW9("SW9", DieselSW9.class, ItemIDs.minecartSW9.item, "diesel", 1200, 105, 0, 35, 0, 180, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Green", "Cyan", "Blue", "Magenta"}), 16, -2),
	SW10("SW10", DieselSW10.class, ItemIDs.minecartSW10.item, "diesel", 1200, 81, 0, 45, 0, 200, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "LightGrey", "Cyan", "Skin16", "Skin17", "Skin18", "Purple"}), 16, -2.0),
	SW900("SW900", DieselSW900.class, ItemIDs.minecartSW900.item, "diesel", 900, 105, 0, 35, 0, 180, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "LightBlue", "Cyan", "White", "LightGrey", "Magenta", "Skin16", "Skin17", "Purple", "Skin18", "Blue", "Orange"}), 16, -2),
	SW1000("SW1000", DieselSW1000.class, ItemIDs.minecartSW1000.item, "diesel", 1000, 105, 0, 25, 0, 200, 0.85, 0.7, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "LightGrey", "Purple", "Yellow", "Skin16", "Skin19", "Skin20", "Magenta", "Skin21", "Skin22"}), 16, -2),
	SW1200("SW1200", DieselSW1200.class, ItemIDs.minecartSW1200.item, "diesel", 1200, 105, 0, 25, 0, 200, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Blue", "Skin17", "Black", "Lime", "Yellow", "Brown", "Cyan", "Orange", "Red", "Skin16"}), 16, -2),
	SW1500("SW1500", DieselSW1500.class, ItemIDs.minecartSW1500.item, "diesel", 1500, 105, 0, 25, 0, 200, 0.85, 0.7, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "LightGrey", "Grey", "Purple", "Black", "Magenta", "Pink", "Cyan", "Skin18", "Orange", "Skin16", "Blue", "Skin17", "Green", "Skin24", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Red", "Lime", "Skin25", "Skin26", "Skin27"}), 16, -2),
	SW1600("SW1600", DieselSW1600.class, ItemIDs.minecartSW1600.item, "diesel", 1600, 105, 0, 25, 0, 200, 0.85, 0.7, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan"}), 16, -2),
	MP900("MP900", DieselMP900.class, ItemIDs.minecartMP900.item, "diesel", 950, 81, 0, 45, 0, 200, 0.95, 0.65, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightGrey", "Cyan"}), 16, -2),
	MP15DCW9("MP15DCW9", DieselMP15DCW9.class, ItemIDs.minecartMP15DCW9.item, "diesel", 1500, 97, 0, 0, 0, 200, 0.85, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Skin16", "White"}), 16, -2.3),

	Beep("Beep", DieselBeep.class, ItemIDs.minecartBeep.item, "diesel", 1500, 105, 0, 25, 0, 200, 0.89, 0.8, 9000, null, 10, -2.2),

	//GE//
	GE44Ton("GE 44-ton", DieselGE44Ton.class, ItemIDs.minecart44Ton.item, "diesel", 360, 56, 0, 10, 0, 200, 0.7, 0.75, 7000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Pink", "LightGrey", "Skin16", "Black", "Skin17", "Skin18", "Magenta", "Purple", "Skin19", "Red"}), 18, -2.0),
	Boxcab23Ton("23 Ton Boxcab", DieselBoxcab23Ton.class, ItemIDs.minecartBoxcab23Ton.item, "diesel", 150, 40, 0, 10, 0, 200, 0.6, 0.6, 4000,  TraincraftUtil.getBytesFromColors(new String[] {"Blue", "White", "Black", "Green"}), 16, -1.5),
	//note on the boxcab: check the RenderEnum for more info related to its hitboxes
	GE25Ton("GE 25-ton", DieselGE25Ton.class, ItemIDs.minecart25Ton.item, "diesel", 150, 50, 0, 10, 0, 200, 0.65, 0.7, 4000, TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Pink", "Cyan", "Orange", "Green"}), 20, -1),

	U18B("U18B", DieselU18B.class, ItemIDs.minecartU18B.item, "diesel", 1800, 113, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Orange","Skin16", "Red", "Skin17", "LightGrey", "Pink", "Magenta", "Cyan", "Purple", "Lime", "Yellow", "Grey", "Skin18", "Skin19", "Black", "Skin20", "Skin22", "Brown", "LightBlue", "Blue", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27"}), 16, -2.5),
	U18BB("U18BB", DieselU18BB.class, ItemIDs.minecartU18BB.item, "diesel", 1800, 113, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Lime", "Skin27"}), 16, -2.5),
	U18BW("U18BW", DieselU18BW.class, ItemIDs.minecartU18BW.item, "diesel", 1800, 120, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "White", "Orange", "Grey", "Lime", "Skin27"}), 16, -2.5),
	U18Balt("U18Balt", DieselU18Balt.class, ItemIDs.minecartU18Balt.item, "diesel", 1800, 113, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Cyan", "White", "LightGrey", "Skin16", "Skin17", "Skin18"}), 16, -2.6),
	U18BWH("U18BWH", DieselU18BWH.class, ItemIDs.minecartU18BWH.item, "diesel", 1800, 188, 0, 25, 0, 160, 0.75, 0.86, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Pink", "LightGrey", "Purple"}), 14, -3.1),
	U23B("U23B", DieselU23B.class, ItemIDs.minecartU23B.item, "diesel", 2250, 113, 0, 25, 0, 180, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Grey", "LightBlue", "LightGrey", "Skin17", "Skin21", "Skin22", "Blue", "Skin25", "Magenta", "Black", "Pink", "Green", "Skin18", "Skin20", "Skin23", "Skin24", "Skin26", "Skin27", "Skin28", "Orange", "Skin19", "Skin29", "Skin30", "Red", "Skin31", "Skin32"}), 14, -3.1),
	U23BU("U23BU", DieselU23BU.class, ItemIDs.minecartU23BU.item, "diesel", 2250, 113, 0, 30, 0, 160, 0.75, 0.86, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Skin17", "Skin29", "Skin19", "Skin16", "Black", "LightGrey", "Skin20", "Skin21", "Skin18", "Skin22", "Skin23", "Skin24"}), 14, -3.1),
	U23BW("U23BW", DieselU23BW.class, ItemIDs.minecartU23BW.item, "diesel", 2250, 113, 0, 30, 0, 160, 0.75, 0.86, 20000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey"}), 14, -3.1),
	U25B("U25B", DieselU25B.class, ItemIDs.minecartU25B.item, "diesel", 2500, 113, 0, 25, 0, 200, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "LightGrey", "Skin18", "Blue", "Orange", "Pink", "Green", "Skin16", "Red", "Skin17", "Skin19", "Skin20", "Skin21", "Brown"}), 14, -3.3),
	U30BH("U30BH", DieselU30BH.class, ItemIDs.minecartU30BH.item, "diesel", 2950, 188, 0, 35, 0, 180, 0.8, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "LightGrey", "Purple"}), 14, -3.1),
	U36B("U36B", DieselU36B.class, ItemIDs.minecartU36B.item, "diesel", 3600, 121, 0, 20, 0, 180, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Purple", "Blue", "Grey", "LightGrey", "LightBlue", "Green", "Skin16", "Skin17"}), 14, -3.1),
	U23C("U23C", DieselU23C.class, ItemIDs.minecartU23C.item, "diesel", 2250, 113, 0, 25, 0, 200, 0.7, 0.88, 21000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Skin17", "LightGrey"}), 12, -3.3),
	U30C("U30C", DieselU30C.class, ItemIDs.minecartU30C.item, "diesel", 3000, 113, 0, 20, 0, 200, 0.7, 0.88, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "LightGrey", "Cyan", "Grey", "Skin17", "Skin18", "Lime", "Orange"}), 12, -3.3),
	SF30C("SF30C", DieselSF30C.class, ItemIDs.minecartSF30C.item, "diesel", 3000, 121, 0, 20, 0, 200, 0.7, 0.8, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Red"}), 12, -4.3),
	U36C("U36C", DieselU36C.class, ItemIDs.minecartU36C.item, "diesel", 3600, 113, 0, 20, 0, 200, 0.75, 0.84, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Blue", "Red", "Yellow", "Orange", "Cyan"}), 12, -3.75),
	U50("U50", DieselU50.class, ItemIDs.minecartU50.item, "diesel", 5000, 110, 0, 10, 0, 200, 0.8, 0.85, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "LightGrey", "Skin16", "Skin17", "Black", "Skin18"}), 10, -4.35),
	U56("U56", DieselU56.class, ItemIDs.minecartU56.item, "diesel", 5600, 110, 0, 10, 0, 200, 0.8, 0.85, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Cyan"}), 10, -4.35),

	SB18R("SB18R", DieselSB18R.class, ItemIDs.minecartSB18R.item, "diesel", 1800, 113, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Green", "Skin17", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26"}), 16, -2.6),
	SB18E("SB18E", DieselSB18E.class, ItemIDs.minecartSB18E.item, "diesel", 1800, 113, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Blue", "Green", "Skin17", "Skin20", "Skin21", "Skin22"}), 16, -2.6),
	SB18B("SB18B", DieselSB18B.class, ItemIDs.minecartSB18B.item, "diesel", 1800, 113, 0, 30, 0, 200, 0.7, 0.88, 10000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Skin20", "Skin21", "Skin22", "Skin23"}), 16, -2.6),
	B23("B23-7", DieselB23.class, ItemIDs.minecartB23.item, "diesel", 2250, 113, 0, 25, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Grey", "Skin17", "Cyan", "Magenta", "Purple", "Skin20", "Pink", "LightBlue", "Black", "LightGrey", "Brown", "Skin18", "Blue", "Yellow", "Skin19", "Skin21", "Green", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin29", "Orange", "Skin27", "Skin28"}), 14, -3.1),
	B23_wrx("B23-7_wrx", DieselB23_wrx.class, ItemIDs.minecartB23_wrx.item, "diesel", 2250, 101, 0, 23, 0, 185, 0.84, 0.92, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Skin16", "Skin17"}), 14, -3.1),
	B23S7("B23-S7", DieselB23S7.class, ItemIDs.minecartB23S7.item, "diesel", 2250, 113, 0, 25, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Grey", "Skin17", "LightGrey", "Cyan", "Green", "Skin18"}), 14, -3.1),
	BQ23("BQ23-7", DieselBQ23.class, ItemIDs.minecartBQ23.item, "diesel", 2250, 113, 0, 25, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Red", "Skin17", "Cyan", "LightGrey", "Skin18", "LightBlue", "Pink", "Skin16"}), 14, -3.1),
	SB23R("SB23R", DieselSB23R.class, ItemIDs.minecartSB23R.item, "diesel", 2300, 113, 0, 25, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Cyan", "Magenta", "LightGrey"}), 14, -3.1),
	SB23E("SB23E", DieselSB23E.class, ItemIDs.minecartSB23E.item, "diesel", 2300, 113, 0, 25, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Skin16", "Cyan", "LightGrey", "Blue", "Magenta"}), 14, -3.1),
	B30("B30-7", DieselB30.class, ItemIDs.minecartB30.item, "diesel", 3000, 113, 0, 20, 0, 200, 0.74, 0.91, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Yellow"}), 14, -3.4),
	SB36X("SB36X", DieselSB36X.class, ItemIDs.minecartSB36X.item, "diesel", 3600, 113, 0, 15, 0, 200, 0.54, 0.96, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightBlue", "Cyan", "Purple", "Green", "Orange", "Pink", "Red", "Magenta", "Yellow", "White"}), 14, -3.1),

	Dash832BWH("Dash832BWH", DieselDash832BWH.class, ItemIDs.minecartDash832BWH.item, "diesel", 3200, 166, 0, 20, 0, 200, 0.85, 0.9, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Blue", "Orange", "Skin16"}), 12, -3.6),
	Dash839C("Dash839C", DieselDash839C.class, ItemIDs.minecartDash839C.item, "diesel", 3900, 120, 0, 45, 0, 180, 0.8, 0.87, 20000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Grey", "Black", "Blue", "Skin17", "Cyan", "LightGrey", "Skin16", "Brown", "Orange"}), 12, -4.0),
	Dash839CE("Dash839CE", DieselDash839CE.class, ItemIDs.minecartDash839CE.item, "diesel", 3900, 113, 0, 45, 0, 180, 0.8, 0.87, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Skin18", "Skin19", "Black", "LightGrey"}), 12, -4.0),
	Dash839B("Dash839B", DieselDash839B.class, ItemIDs.minecartDash839B.item, "diesel", 3900, 113, 0, 40, 0, 200, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Grey", "Orange", "Skin16", "Skin17", "LightGrey", "Cyan", "Skin18", "Brown"}), 12, -3.6),
	Dash840B("Dash840B", DieselDash840B.class, ItemIDs.minecartDash840B.item, "diesel", 4000, 113, 0, 40, 0, 200, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Yellow", "Orange", "LightBlue", "Pink", "Purple"}), 12, -3.6),
	Dash840BB("Dash840BB", DieselDash840BB.class, ItemIDs.minecartDash840BB.item, "diesel", 4000, 113, 0, 40, 0, 200, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Skin17"}), 14, -3.3),
	//BUnitDash840B("BUnitDash840B", BUnitDash840B.class, ItemIDs.minecartBUnitDash840BB.item, "diesel", 0, 0, 9, 0, 0, 0, 0, 0, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red"}), 14, 0, (new String[] {"Reduces weight carried by 90 tons when fueled"})),
	Dash840BW("Dash840BW", DieselDash840BW.class, ItemIDs.minecartDash840BW.item, "diesel", 4000, 113, 0, 40, 0, 200, 0.7, 0.88, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Orange", "LightGrey", "Skin16", "Pink"}), 12, -3.6),
	Dash840C("Dash840C", DieselDash840C.class, ItemIDs.minecartDash840C.item, "diesel", 4000, 113, 0, 40, 0, 200, 0.8, 0.88, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Grey", "LightBlue", "Blue", "Skin16", "LightGrey", "Skin17", "Purple", "Skin22"}), 12, -4),
	Dash841C("Dash841C", DieselDash841C.class, ItemIDs.minecartDash841C.item, "diesel", 4100, 113, 0, 39, 0, 180, 0.8, 0.87, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "LightGrey", "Pink", "Orange", "Skin16", "Green", "Skin17"}), 12, -4.0),

	Dash940C("Dash940C", DieselDash940C.class, ItemIDs.minecartDash940C.item, "diesel", 4000, 119, 0, 45, 0, 180, 0.8, 0.87, 21000, TraincraftUtil.getBytesFromColors(new String[] {"White"}), 12, -4.0),
	Dash944CW("Dash944CW", DieselDash944CW.class, ItemIDs.minecartDash944CW.item, "diesel", 4400, 119, 0, 45, 0, 180, 0.8, 0.87, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "LightGrey", "Grey", "Orange", "Magenta", "Skin17", "Pink", "Green", "White", "Skin27", "Skin18", "Red", "Skin19", "LightBlue", "Skin28"}), 12, -4.0),
	AC4400CW("AC4400CW", DieselAC4400CW.class, ItemIDs.minecartAC4400CW.item, "diesel", 4400, 119, 0, 45, 0, 180, 0.8, 0.87, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Skin16", "LightGrey"}), 12, -4.0),
	AC4400C("AC4400C", DieselAC4400C.class, ItemIDs.minecartAC4400C.item, "diesel", 4400, 119, 0, 45, 0, 180, 0.8, 0.87, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Cyan", "Skin16", "LightBlue", "Grey", "Blue"}), 12, -4.0),

	ES44("ES44", DieselES44.class, ItemIDs.minecartES44.item, "diesel", 4400, 120, 0, 10, 0, 200, 0.7, 0.8, 21000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Orange", "Skin17", "Red", "Yellow", "Blue", "LightGrey", "Grey", "Black", "Skin18", "Skin19", "Pink", "Purple", "Lime", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24"}), 12, -4.0),
	ES44h("ES44h", DieselES44h.class, ItemIDs.minecartES44h.item, "diesel", 4400, 120, 0, 10, 0, 200, 0.7, 0.8, 21000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey","LightBlue", "Green", "Black", "Cyan", "Brown", "Blue", "White", "Lime", "Orange", "Red", "Skin16", "Skin22", "Skin18", "Skin19", "Skin20", "Skin21", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin35", "Skin36", "Skin37", "Skin39", "Skin40", "Skin41", "Skin42", "Skin43", "Skin32", "Skin33", "Skin34", "Skin23", "Skin24" }), 12, -4.0),
	P32("P32", DieselP32.class, ItemIDs.minecartP32.item, "diesel", 3200, 177, 0, 30, 0, 175, 0.93, 0.84, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Red", "LightGrey"}), 10, -3.5),
	geGenesis("P40", DieselP40.class, ItemIDs.minecartGeGenesis.item, "diesel", 4000, 177, 0, 30, 0, 175, 0.93, 0.84, 15000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey"}), 10, -3.5),
	P42("P42", DieselP42.class, ItemIDs.minecartP42.item, "diesel", 4250, 177, 0, 30, 0, 175, 0.93, 0.84, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Cyan", "Skin16", "Blue"}), 10, -3.5),

	CEE4ED172T("4ED172T", Diesel4ED172T.class, ItemIDs.minecart4ED172T.item, "diesel", 1725, 95, 0, 25, 0, 200, 0.74, 0.91, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Pink", "Cyan", "Orange", "Black", "Yellow", "LightGrey", "Skin16", "Skin17"}), 14, -2.85),

	//ALCO//
	AlcoPA1("PA1", DieselPA1.class, ItemIDs.minecartAlcoPA1.item, "diesel", 2000, 188, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Pink", "Black", "Blue", "Cyan", "Purple", "Yellow", "Orange", "Grey", "Brown", "LightGrey", "Green", "Lime", "LightBlue", "Magenta", "White", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24"}), 12, -3.15),
	AlcoPB1("PB1", DieselPB1.class, ItemIDs.minecartAlcoPB1.item, "diesel", 2000, 188, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Black", "Yellow", "Orange", "LightGrey", "Magenta", "Skin19", "Skin24"}), 12, -3.1),
	FA1("FA1", DieselFA1.class, ItemIDs.minecartFA1.item, "diesel", 1600, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Green", "Magenta", "Yellow", "Orange", "Lime", "White", "Purple", "Skin16", "Skin17"}), 15, -2.845),
	FB1("FB1", DieselFB1.class, ItemIDs.minecartFB1.item, "diesel", 1600, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Green", "Magenta", "Yellow", "Orange", "Lime", "White"}), 15, -2.825),
	FA2("FA2", DieselFA2.class, ItemIDs.minecartFA2.item, "diesel", 1600, 120, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Yellow", "Blue", "Black", "Orange", "Green", "Purple", "Lime", "LightGrey", "White", "Magenta"}), 15, -2.845),
	FB2("FB2", DieselFB2.class, ItemIDs.minecartFB2.item, "diesel", 1600, 120, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Yellow", "Black", "Orange", "Green", "LightGrey", "White", "Magenta"}), 15, -2.825),
	FPA4("FPA4", DieselFPA4.class, ItemIDs.minecartFPA4.item, "diesel", 1800, 148, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Cyan", "Green", "Red", "LightBlue", "Purple", "Brown", "Lime", "White", "Yellow", "Black", "Grey"}), 15, -2.845),
	FPB4("FPB4", DieselFPB4.class, ItemIDs.minecartFPB4.item, "diesel", 1800, 148, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Green", "Red", "Purple", "Brown", "Lime", "White", "Yellow"}), 15, -2.825),
	FAFDL("FAFDL", DieselFAFDL.class, ItemIDs.minecartFAFDL.item, "diesel", 2250, 111, 0, 30, 0, 200, 0.7, 0.79, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "LightGrey", "Pink", "Magenta"}), 15, -2.845),
	FBFDL("FBFDL", DieselFBFDL.class, ItemIDs.minecartFBFDL.item, "diesel", 2250, 111, 0, 30, 0, 200, 0.7, 0.79, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "LightGrey", "Pink", "Orange"}), 15, -2.825),

	RS1("RS1", DieselRS1.class, ItemIDs.minecartRS1.item, "diesel", 1000, 105, 0, 30, 0, 200, 0.7, 0.8, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Blue", "Green", "LightGrey", "Skin17", "Skin18", "Cyan", "LightBlue", "Purple" }), 16, -2.5),
	RS2("RS2", DieselRS2.class, ItemIDs.minecartRS2.item, "diesel", 1500, 105, 0, 28, 0, 200, 0.7, 0.8, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightGrey", "LightBlue", "White", "Magenta", "Brown"}), 16, -2.5),
	RS3("RS3", DieselRS3.class, ItemIDs.minecartRS3.item, "diesel", 1600, 137, 0, 28, 0, 200, 0.7, 0.8, 8000, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "LightGrey", "Yellow", "Magenta"}), 16, -2.5),
	RSFDL("RSFDL", DieselRSFDL.class, ItemIDs.minecartRSFDL.item, "diesel", 1800, 105, 0, 40, 0, 200, 0.7, 0.8, 8000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Cyan"}), 16, -2.5),

	C415H("C415H", DieselC415H.class, ItemIDs.minecartC415H.item, "diesel", 1500, 106, 0, 35, 0, 200, 0.87, 0.93, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Purple", "Magenta", "Brown", "Red", "Pink", "Green"}), 16, -2.4),
	C415S("C415S", DieselC415S.class, ItemIDs.minecartC415S.item, "diesel", 1500, 106, 0, 35, 0, 200, 0.87, 0.93, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Brown", "Yellow", "Blue", "LightGrey", "Skin18", "Skin19"}), 16, -2.5),
	C415L("C415L", DieselC415L.class, ItemIDs.minecartC415L.item, "diesel", 1500, 106, 0, 35, 0, 200, 0.87, 0.93, 17000, TraincraftUtil.getBytesFromColors(new String[] {"Black"}), 16, -2.5),
	C424("C424",DieselC424.class, ItemIDs.minecartC424.item, "diesel", 2400, 113, 0, 40, 0, 200, 0.7, 0.8, 18000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "Black", "Pink", "Brown", "Magenta", "Skin17", "LightGrey", "Skin16", "Skin18", "Skin19", "Cyan", "Green"}), 14, -2.8),
	C425("C425", DieselC425.class, ItemIDs.minecartC425.item, "diesel", 2500, 113, 0, 40, 0, 200, 0.7, 0.8, 18000, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Yellow", "Skin16", "Green"}), 14, -2.8),
	DH643("DH643", DieselDH643.class, ItemIDs.minecartDH643.item, "diesel", 4300, 124, 0, 60, 0, 200, 0.7, 0.87, 16000, null, 12, -4.1),
	C855a("C855a", DieselC855a.class, ItemIDs.minecartC855a.item, "diesel", 5500, 106, 0, 40, 0, 200, 0.8, 0.85, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Cyan", "Skin16"}), 10, -4.25),
	C855b("C855b", DieselC855b.class, ItemIDs.minecartC855b.item, "diesel", 5500, 106, 0, 40, 0, 200, 0.8, 0.85, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Cyan", "Skin16"}), 10, -4.25),

	HH660("HH660", DieselHH660.class, ItemIDs.minecartHH660.item, "diesel", 660, 50, 0, 15, 0, 200, 0.9, 0.95, 6000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Orange", "Black", "Red", "Cyan", "Skin16"}), 16, -2),
	S2("S2",  DieselS2.class, ItemIDs.minecartS2.item, "diesel", 1000, 96, 0, 15, 0, 200, 0.7, 0.965, 6000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "Green", "Orange", "Pink", "White", "Blue", "LightGrey", "Magenta", "Red", "Skin16", "Skin17"}), 16, -2),

	RSD15("RSD15", DieselRSD15.class, ItemIDs.minecartRSD15.item, "diesel", 2400, 105, 0, 30, 0, 200, 0.7, 0.91, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Blue","Cyan", "Grey", "Red"}), 12, -3.7),

	M420("M420", DieselM420.class, ItemIDs.minecartM420.item, "diesel", 2000, 108, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Lime", "Pink", "Cyan"}), 15, -2.8),
	M420B("M420B", DieselM420B.class, ItemIDs.minecartM420B.item, "diesel", 2000, 108, 0, 25, 0, 200, 0.8, 0.85, 20000, TraincraftUtil.getBytesFromColors(new  String[] {"Lime", "Pink", "Cyan"}), 15, -2.8),

	M630("M630", DieselM630.class, ItemIDs.minecartM630.item, "diesel", 3000, 120, 0, 15, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Skin17", "LightGrey", "Cyan", "Purple", "Brown"}), 12, -3.45),
	M630R("M630R", DieselM630R.class, ItemIDs.minecartM630R.item, "diesel", 3000, 120, 0, 15, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey"}), 12, -3.45),
	M630W("M630W", DieselM630W.class, ItemIDs.minecartM630W.item, "diesel", 3000, 120, 0, 15, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Cyan", "Red"}), 12, -3.45),
	M636("M636", DieselM636.class, ItemIDs.minecartM636.item, "diesel", 3600, 120, 0, 10, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Skin16", "Blue", "Grey", "LightGrey"}), 12, -3.45),
	M636R("M636R", DieselM636R.class, ItemIDs.minecartM636R.item, "diesel", 3600, 120, 0, 10, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "LightGrey"}), 12, -3.45),
	M640("M640", DieselM640.class, ItemIDs.minecartM640.item, "diesel", 4000, 120, 0, 7, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Skin16", "LightGrey", "Skin17", "Skin18", "Skin19"}), 12, -3.45),
	M640W("M640W", DieselM640W.class, ItemIDs.minecartM640W.item, "diesel", 4000, 120, 0, 7, 0, 190, 0.7, 0.8, 12000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Brown", "LightGrey", "Skin17"}), 12, -3.45),

	//BRuhMOMent//
	VO1000("VO1000", DieselVO1000.class, ItemIDs.minecartVO1000.item, "diesel", 1000, 67, 0, 20, 0, 200, 0.8, 0.9, 6000, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Pink", "Blue", "LightBlue", "Skin16"}), 16, -2.2),
	DS441000("DS441000", DieselDS441000.class, ItemIDs.minecartDS441000.item, "diesel", 1000, 97, 0, 35, 0, 180, 0.75, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Green", "Grey", "Black"}), 16, -2.2),
	S12("S12", DieselS12.class, ItemIDs.minecartS12.item, "diesel", 1200, 97, 0, 35, 0, 180, 0.75, 0.7, 8000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "LightGrey", "Brown", "Skin16", "White", "Cyan", "Skin17", "Skin18", "Black"}), 16, -2.2),

	DR441500Phase2("DR441500Phase2", DieselDR441500Phase2.class, ItemIDs.minecartDR441500Phase2.item, "diesel", 1500, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Cyan", "Black", "LightGrey", "Yellow", "Red", "White", "Grey", "Magenta", "Purple"}), 15, -2.845),
	DR441500BPhase2("DR441500BPhase2", DieselDR441500BPhase2.class, ItemIDs.minecartDR441500BPhase2.item, "diesel", 1500, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Cyan", "Black", "LightGrey", "Red", "White", "Grey", "Magenta", "Purple"}), 15, -2.675),
	DR441500Shark("DR441500Shark", DieselDR441500Shark.class, ItemIDs.minecartDR441500Shark.item, "diesel", 1500, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Orange", "Blue", "Cyan", "LightBlue", "Grey"}), 15, -2.845),
	DR441500BShark("DR441500BShark", DieselDR441500BShark.class, ItemIDs.minecartDR441500BShark.item, "diesel", 1500, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Orange", "Blue", "Cyan", "Grey"}), 15, -2.675),
	RF16("RF16", DieselRF16.class, ItemIDs.minecartRF16.item, "diesel", 1600, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Yellow", "LightGrey", "Blue", "Cyan", "LightBlue", "Grey", "Black", "Orange", "Magenta", "Red"}), 15, -2.845),
	RF16B("RF16B", DieselRF16B.class, ItemIDs.minecartRF16B.item, "diesel", 1600, 105, 0, 25, 0, 200, 0.7, 0.79, 15000, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Blue", "Cyan", "Grey", "Black", "Orange", "Magenta", "Red", "Purple"}), 15, -2.675),

	//Fairbanks Morse//
	H1044("H1044", DieselH1044.class, ItemIDs.minecartH1044.item, "diesel", 1000, 97, 0, 25, 0, 200, 0.75, 0.85, 10000, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Yellow", "Black", "Red", "Blue", "Grey", "LightBlue", "Orange", "White", "Lime", "LightGrey", "Skin16"}), 18, -2.2),
	H16_66("H16-66", DieselH16_66.class, ItemIDs.minecartH16_66.item, "diesel", 1600, 130, 0, 45, 0, 200, 0.87, 0.93, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Yellow", "LightGrey", "Green", "Lime", "Black", "Grey", "Orange", "Brown", "Red", "Pink", "Magenta", "Skin16"}), 12, -3.35),
	H24_66("H24-66", DieselH24_66.class, ItemIDs.minecartH24_66.item, "diesel", 2400, 130, 0, 45, 0, 200, 0.87, 0.93, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Black", "Brown", "Yellow", "Grey", "LightGrey", "Lime"}), 12, -3.75),
	H24_66L("H24-66L", DieselH24_66L.class, ItemIDs.minecartH24_66L.item, "diesel", 2400, 130, 0, 45, 0, 200, 0.87, 0.93, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Green"}), 12, -3.75),
	H24_66C("H24-66C", DieselH24_66C.class, ItemIDs.minecartH24_66C.item, "diesel", 2400, 130, 0, 45, 0, 200, 0.87, 0.93, 18000, TraincraftUtil.getBytesFromColors(new String[] {"Magenta", "Grey", "Yellow"}), 12, -3.75),

	//other MOtOEr Shuite//
	NRE3gs21b("NRE3gs21b", DieselNRE3gs21b.class, ItemIDs.minecartNRE3gs21b.item, "diesel genset", 2100, 104, 0, 10,0,  200, 0.78, 0.8, 14000, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange", "Grey", "LightGrey", "Skin16"}), 12, -3.1),
	gtavthing("gtavthing", Dieselgtavthing.class, ItemIDs.minecartgtavthing.item, "diesel", 1550, 110, 0, 45, 0, 200, 0.85, 0.9, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Yellow"}), 14, -3.2, (new String[] {"Fictional locomotive from GTA-V"})),
	FOLM1B("FOL-M1B", DieselFOLM1B.class, ItemIDs.minecartFOLM1B.item, "diesel", 5000, 110, 0, 10, 0, 200, 0.7, 0.965, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Blue", "Black"}), 12, -3.8, (new String[] {"Fictional B unit for the Fictional loco from Factorio"})),
	//BUnitFOLM1B("BUnitFOL-M1B", BUnitFOLM1B.class, ItemIDs.minecartBUnitFOLM1B.item, "b-unit", 0, 0, 9, 0, 0, 0, 0, 0, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Blue"}), 18, 0, (new String[]{"Reduces weight carried by 90 tons when fueled"})),
	Krautt("Krautt", DieselKrautt.class, ItemIDs.minecartKrautt.item, "diesel", 3540, 113, 0, 65, 0, 200, 0.75, 0.85, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Black", "Red"}), 13, -3.3),
	//ILMC("ILMC", DieselILMC.class, ItemIDs.minecartILMC.item, "diesel", 600, 45, 0, 25, 0, 200, 0.75, 0.85, 7000, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Blue"}), 16, -1),
	DD55("DD55", DieselDD55.class, ItemIDs.minecartDD55.item, "diesel", 2000, 80, 0, 80, 0, 190, 0.7, 0.9555, 10000, TraincraftUtil.getBytesFromColors(new  String[] {"Lime", "Purple", "LightGrey", "Pink", "Blue"}), 15, -2.9),
	TB27("TB27",DieselTB27.class, ItemIDs.minecartTB27.item, "diesel", 2700, 110, 0, 40, 0, 200, 0.7, 0.8, 18000, TraincraftUtil.getBytesFromColors(new String[]{"Red", "LightGrey", "White", "Purple"}), 14, -2.8),

	SlugMA("SlugMA", SlugMA.class, ItemIDs.minecartSlugMA.item, "slug", 0, 0, 7, 0, 0, 0, 0, 0, 18000, TraincraftUtil.getBytesFromColors(new String[] {"White", "Skin16", "Magenta", "Blue"}), 16, 0, (new String[] {"Reduces train weight when fueled"})),
	F7BSlug("F7BSlug", BUnitF7.class, ItemIDs.minecartF7BSlug.item, "slug", 0, 0, 7, 0, 0, 0, 0, 0, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Skin19"}), 18, 0, (new String[] {"Reduces train weight when fueled"})),
	//S1BL("S1BL", S1BL.class, ItemIDs.minecartS1BL.item, "road slug", 0, 0, 8, 0, 0, 0, 0, 0, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan"}), 10, 0, (new String[] {"WIP. Reduces train weight. Is also equipped to 'lead' consists"})),
	SMSC1("SMSC1", SMSC1.class, ItemIDs.minecartSMSC1.item, "slug", 0, 0, 8, 0, 0, 0, 0, 0, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan"}), 12, 0, (new String[] {"It'le pull your socks off, if it wasnt busy having frame sag"})),
	CEEslug("CEEslug", ElectricCEEslug.class, ItemIDs.minecartCEEslug.item, "'slug'", 3000, 113, 0, 15, 0, 200, 0.89, 0.91, 0, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Cyan", "Skin16", "LightGrey"}), 14, -3.1),
	SBMS("SBMS", SBMS.class, ItemIDs.minecartSBMS.item, "slug", 0, 0, 7, 0, 0, 0, 0, 0, 20000, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Green", "LightGrey", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Pink"}), 12, 0, (new String[] {"Reduces train weight when fueled"})),

	//based electrics//
	EF1("EF1",ElectricEF1.class, ItemIDs.minecartEF1.item, "electric", 1720, 64, 0, 55, 0, 200, 0.65, 0.75, 12500, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Yellow", "Red", "Green", "Black", "Grey"}), 10, -3.4375),
	EF1B("EF1B",ElectricEF1B.class, ItemIDs.minecartEF1B.item, "electric", 1720, 64, 0, 55, 0, 200, 0.65, 0.75, 12500, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Red", "Black", "Pink"}), 10, -2.3125),
	EP1A("EP1A",ElectricEP1A.class, ItemIDs.minecartEP1A.item, "electric", 2500, 120, 0, 55, 0, 200, 0.75, 0.85, 12500, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Red"}), 10, -3.4375),

	GM6C("GM6C",ElectricGM6C_2.class, ItemIDs.minecartGM6C.item, "electric", 6000, 115, 0, 55, 0, 200, 0.65, 0.79, 12500, TraincraftUtil.getBytesFromColors(new String[] {"White", "LightGrey", "LightBlue", "Black", "Skin17", "Cyan", "Skin18"}), 12, -3.45),

	//ILMA("Loco Electric ILMA", ElectricILMA.class, ItemIDs.minecartILMA.item,"electric",400,40,0,45,0,400,0.9,0.946,0,TraincraftUtil.getBytesFromColors(new String[] {"Green", "Lime"}),18,-1),
	//ILMB("Loco Electric ILMB", ElectricILMB.class, ItemIDs.minecartILMB.item,"electric",500,40,0,45,0,400,0.9,0.946,0,TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Lime"}),18,-1),
	JT7("JT7", ElectricJT7.class, ItemIDs.minecartJT7.item,"electric",3900,90,0,5,0,200,0.7,0.7,0,TraincraftUtil.getBytesFromColors(new String[] {"Lime", "Green", "LightGrey"}),12,-4),

	AEM7("AEM7", ElectricAEM7.class, ItemIDs.minecartAEM7.item,"electric",7000,201,0,10,0,200,0.9,0.946,0,TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey"}),10,-2),

	B_BEL("B-BEL", ElectricB_BEL.class, ItemIDs.minecartB_BEL.item, "battery electric", 2000, 113, 0, 15, 0, 200, 0.89, 0.91, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Skin16", "Green", "Pink", "LightGrey", "Purple", "Yellow"}), 14, -3.1),

	//FrERf//
	RoundHopper("Freight Round Covered Hopper", RoundHopper.class, ItemIDs.minecartRoundHopper.item, "Covered Hopper", 3, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Black", "White", "LightGrey"}), 15, 36,(new String[] {"Cargo: Any."})),
	RibbedHopper("Freight Ribbed Covered Hopper", RibbedHopper.class, ItemIDs.minecartRibbedHopper.item, "Covered Hopper", 3, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Cyan", "LightGrey", "Red", "Brown", "White", "Pink", "Skin16", "Orange", "Skin20", "Skin17", "Skin18", "Skin19", "Skin21", "Green", "Skin22"}), 15, 36,(new String[] {"Cargo: Any."})),
	Hopper5201("5201 Cu Foot Hopper", Hopper5201.class, ItemIDs.minecartHopper5201.item, "Covered Hopper", 3, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Cyan", "Black", "Skin16", "Skin17", "LightGrey", "Blue", "Skin18", "Skin19", "Skin20"}), 15, 36,(new String[] {"Cargo: Any."})),
	Hopper6260("6260 Cu Foot Jumbo Hopper", Hopper6260.class, ItemIDs.minecartHopper6260.item, "Covered Hopper", 4, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "White", "Brown", "Skin16", "Skin17"}), 14, 45,(new String[] {"Cargo: Any."})),
	FNCC2375Hopper("FNCC2375Hopper", FNCC2375Hopper.class, ItemIDs.minecartFNCC2375Hopper.item, "Covered Hopper", 2.5, TraincraftUtil.getBytesFromColors(new String[]{"Cyan", "Green", "Black", "LightGrey", "Blue", "Skin16", "Skin17", "Purple", "Magenta", "Pink", "Yellow", "Red", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22"}), 15, 27,(new String[] {"Cargo: Any."})),
	PDH2800("PDH2800", PDH2800.class, ItemIDs.minecartPDH2800.item, "Covered Hopper", 2, TraincraftUtil.getBytesFromColors(new String[]{"LightGrey","Yellow","Grey","Brown","Magenta", "Skin16", "Skin17"}), 18, 27,(new String[] {"Cargo: Any."})),
	ACF2Bay("ACF2Bay", ACF2Bay.class, ItemIDs.minecartACF2Bay.item, "Covered Hopper", 2.5, TraincraftUtil.getBytesFromColors(new String[]{"LightGrey", "Black", "Magenta", "Skin16", "Grey", "Red", "Orange", "Skin17", "Skin18", "Blue", "Skin19", "Skin20"}), 15, 27,(new String[] {"Cargo: Any."})),
	ACF4650("ACF4650", ACF4650.class, ItemIDs.minecartACF4650.item, "Covered Hopper", 3, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "Skin18", "Grey", "LightGrey", "Skin16", "Skin17", "Brown", "White", "Skin19", "Blue", "Orange", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31", "Skin32"}), 15, 36,(new String[] {"Cargo: Any."})),
	PS2_4750("PS2_4750", PS2_4750.class, ItemIDs.minecartPS2_4750.item, "Covered Hopper", 3, TraincraftUtil.getBytesFromColors(new String[]{"LightGrey", "White", "Skin17", "Skin18", "Skin16", "Skin20", "Grey", "Skin19", "LightBlue", "Skin21", "Yellow", "Skin22", "Orange", "Magenta", "Green", "Lime", "Purple", "Skin23", "Cyan", "Brown", "Pink", "Skin24", "Skin25", "Skin28", "Skin27", "Skin29", "Skin30", "Skin31", "Skin32", "Skin33", "Black", "Skin34", "Blue", "Skin35", "Skin36", "Skin37", "Skin38", "Skin39"}), 15, 36,(new String[] {"Cargo: Any."})),

	Freight60centerbeam("60centerbeam",  Freight60centerbeam.class, ItemIDs.minecart60centerbeam.item, "Centerbeam Flat", 3, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Yellow", "Green", "LightGrey"}), 10, 54, (new String[] {"Cargo: Woodthings."})),
	Freight66centerbeam("66centerbeam",  Freight66centerbeam.class, ItemIDs.minecart66centerbeam.item, "Centerbeam Flat", 3, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Cyan", "Green", "Lime", "LightBlue", "Pink", "Blue", "Yellow", "Red", "Black"}), 10, 54, (new String[] {"Cargo: Woodthings."})),
	Freight73centerbeam("73centerbeam",  Freight73centerbeam.class, ItemIDs.minecart73centerbeam.item, "Centerbeam Flat", 3.5, TraincraftUtil.getBytesFromColors(new String[] {"Pink", "Cyan", "Green", "Orange", "Yellow", "Red"}), 10, 54, (new String[] {"Cargo: Woodthings."})),
	GSI60FootBulkhead("GSI_Bulkhead", GSI60FootBulkhead.class, ItemIDs.minecartGSI60FootBulkhead.item, "Bulkhead Flat", 3, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Skin16", "Green", "Black", "Skin17", "Brown", "Cyan"}), 10, 45, (new String[] {"Cargo: Bulkhead Items."})),
	GSC60FootFlatcar("GSC_Flatcar", GSC60FootFlat.class, ItemIDs.minecartGSC60FootFlatcar.item, "Flatcar", 2.5, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Orange", "Yellow", "Skin17", "Brown", "Green", "Skin16"}), 12, 45, (new String[] {"Cargo: whatever flatcars carry i guess"})),
	Thrall63centerbeam("63centerbeam",  Thrall63centerbeam.class, ItemIDs.minecartthrall63centerbeam.item, "Centerbeam Flat", 3, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Yellow", "Red", "Black", "Cyan", "Skin16", "Skin17"}), 12, 45, (new String[] {"Cargo: Woodthings."})),
	FNCC60FootBulk("FNCC60FootBulk", FNCC60FootBulk.class, ItemIDs.minecartFNCC60FootBulk.item, "Bulkhead Flat", 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Green", "Yellow", "Skin16", "Skin17", "Lime", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22"}), 12, 45, (new String[] {"Cargo: Bulkhead Stuff."})),
	GSC53FootFlatcar("GSC_53Flatcar", GSC53FootFlat.class, ItemIDs.minecartGSC53FootFlatcar.item, "Flatcar", 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Brown", "Green", "Lime", "Black", "White", "Grey", "LightGrey"}), 12, 45, (new String[] {"Cargo: whatever flatcars carry i guess"})),
	GSC53Foot6_6Bulkhead("GSC_53_66Bulkhead", GSC53Foot66Bulkhead.class, ItemIDs.minecartGSC5366FootBulkhead.item, "Bulkhead Flat", 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Red", "Black", "Grey"}), 12, 45, (new String[] {"Cargo: Bulkhead Items."})),
	GSC53Foot8_6Bulkhead("GSC_53_86Bulkhead", GSC53Foot86Bulkhead.class, ItemIDs.minecartGSC5386FootBulkhead.item, "Bulkhead Flat", 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Green", "Red", "Purple", "Black", "Lime", "White", "Grey", "Yellow"}), 12, 45, (new String[] {"Cargo: Bulkhead Items."})),

	PS140("PS140", PS140.class, ItemIDs.minecartPS140.item, "Boxcar", 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Red", "LightBlue", "Green", "Cyan", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Yellow", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Magenta"}), 15, 27, (new String[] {"Cargo: Any."})),
	PS150("PS150", PS150.class, ItemIDs.minecartPS150.item, "Boxcar", 3, TraincraftUtil.getBytesFromColors(new String[] {"White", "Lime", "Red", "Yellow", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Brown", "Cyan", "Skin21"}), 14, 36, (new String[] {"Cargo: Any."})),
	PS160("PS160", PS160.class, ItemIDs.minecartPS160.item, "Boxcar", 3.25, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Orange", "Cyan", "White"}), 13, 45, (new String[] {"Cargo: Any."})),
	OWO60Verticube("OWO 60 Verticube", OWO60Verticube.class, ItemIDs.minecartOWO60Verticube.item, "Highcube Boxcar", 3.75, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Lime", "Green", "Brown", "White", "Pink", "Purple", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Yellow"}), 10, 54, (new String[] {"Cargo: Any."})),
	MILW40boxcar("MILW40boxcar", MILW40boxcar.class, ItemIDs.minecartMILW40boxcar.item, "Boxcar", 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Brown", "Yellow", "Green", "Blue", "Purple", "Orange", "Lime"}), 15, 27, (new String[] {"Cargo: Any."})),
	Freight40highcube("40highcube", Freight40highcube.class, ItemIDs.minecart40highcube.item, "Highcube Boxcar", 3, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Green", "Cyan", "Orange", "Grey", "Red", "Lime", "LightGrey", "Pink", "Purple", "Blue", "Black", "White", "Magenta", "Skin16", "Skin17"}), 15, 40, (new String[] {"Cargo: Any."})),
	Hicube60("60 Foot Hi-Cube Boxcar", Hicube60foot.class, ItemIDs.minecarthicube60foot.item, "Highcube Boxcar", 4, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Red", "Pink", "Blue", "Skin16", "Skin17", "Lime", "White", "Cyan", "Green", "Purple", "Skin18"}), 12, 54, (new String[] {"Cargo: Any."})),
	Reefer64("Reefer64", Reefer64Foot.class, ItemIDs.minecartReefer64.item, "Refrigerated Boxcar", 4, TraincraftUtil.getBytesFromColors(new String[] {"White", "LightGrey", "Grey", "Orange", "Green", "Red", "Black", "Cyan", "Skin16", "Skin17"}), 10, 54, (new String[] {"Cargo: Any."})),
	FNCC50Foot("FNCC50FootBoxcar",  FNCC50Foot.class, ItemIDs.minecartFNCC50Foot.item, "Boxcar", 3, TraincraftUtil.getBytesFromColors(new String[] {"Cyan", "Green", "Black", "Skin18", "Skin19", "Brown", "Pink", "Skin16", "Blue", "Skin23", "Skin22", "Skin21", "Yellow", "White", "Skin17", "Magenta", "Skin24", "Skin25"}), 16, 36, (new String[] {"Cargo: Any."})),
	GN40("GN40",  GN40.class, ItemIDs.minecartGN40.item, "Boxcar", 2.5, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Red"}), 16, 27, (new String[] {"Cargo: Any."})),
	R70Reefer("R70Reefer", R70Reefer.class, ItemIDs.minecartR70Reefer.item, "Refrigerated Boxcar", 3, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Cyan", "White", "Yellow", "Skin16", "Orange", "Skin17", "Skin18", "Green", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27", "Skin28", "Skin29", "Skin30", "Skin31"}), 10, 54, (new String[] {"Cargo: Cold Stuff lol"})),
	R70Reefer2("R70Reefer2", R70Reefer2.class, ItemIDs.minecartR70Reefer2.item, "Refrigerated Boxcar", 3, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey"}), 10, 54, (new String[] {"Cargo: Cold Stuff lol"})),
	NSCReefer("NSCReefer",  NSCReefer.class, ItemIDs.minecartNSCchildHUH.item, "Refrigerated Boxcar", 2.75, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Orange"}), 16, 36, (new String[] {"Cargo: meet and HUH!?"})),
	PCF6033("PCF6033", PCF6033.class, ItemIDs.minecartPCF6033.item, "Highcube Boxcar", 3.75, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Skin16", "Pink", "Blue", "Red", "Skin17", "Yellow", "Magenta", "Cyan", "Skin18", "Skin19", "LightGrey", "Skin20", "Skin21", "Skin22"}), 10, 54, (new String[] {"Cargo: Any."})),
	ACFRailbox("ACF Railbox", ACFRailbox.class, ItemIDs.minecartACFRailbox.item, "Boxcar", 4, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Red", "Blue", "Black", "Orange", "Pink", "LightBlue", "White", "Magenta", "Cyan", "Grey"}), 12, 54, (new String[] {"Cargo: Any."})),
	ACFRailboxCushioned("ACF Railbox (Cushioned)", ACFRailboxCushioned.class, ItemIDs.minecartACFRailboxCushioned.item, "Boxcar", 4, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Lime", "White", "Brown", "Red", "Blue", "Grey", "Orange", "Yellow"}), 12, 54, (new String[] {"Cargo: Any."})),

	VersaLongi("VersaLongi", VersaLongi.class, ItemIDs.minecartVersaLongi.item, "Open Top Hopper", 2.75, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Black", "Orange", "Brown", "Skin16", "Grey"}), 15, 36, (new String[] {"Cargo: Aggregates."})),
	VersaTrans("VersaTrans", VersaTrans.class, ItemIDs.minecartVersaTrans.item, "Open Top Hopper", 2.75, TraincraftUtil.getBytesFromColors(new String[] {"LightBlue", "Grey", "LightGrey"}), 15, 36, (new String[] {"Cargo: Aggregates."})),
	MillGondola("52footMillGondola", MillGondola.class, ItemIDs.minecartMillGondola.item, "Gondola", 3, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Black", "Orange", "Green", "Grey", "Skin16", "Skin18", "Blue", "Lime", "Skin17", "Brown", "Pink"}), 14, 45, (new String[] {"Cargo: Any."})),
	WoodchipHopper("Woodchip Hopper", WoodchipHopper.class, ItemIDs.minecartWoodchipHopper.item, "Open Top Hopper", 3, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Blue", "Green", "Orange", "Red", "White", "Cyan", "Skin18", "Skin19", "Skin16", "Skin17"}), 14, 45, (new String[] {"Cargo: Woodchips/Sawdust."})),
	OreJenny("Ore Jenny", OreJenny.class, ItemIDs.minecartOreJenny.item, "Open Top Hopper", 2, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Red", "Orange", "Pink", "Black"}), 18, 27, (new String[] {"Cargo: Ores."})),
	PRRGLaHopper("PRR GLa hopper", PRRGLaHopper.class, ItemIDs.minecartPRRGLaHopper.item, "Open Top Hopper", 2, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Black", "Yellow", "Magenta", "Blue", "LightGrey"}), 16, 27, (new String[] {"Cargo: Ores."})),
	ACF41Gon("ACF41Gon", ACF41Gon.class, ItemIDs.minecartACF41Gon.item, "Gondola", 2.75, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Black", "Grey", "Brown", "Skin16"}), 15, 27, (new String[] {"Cargo: Gonstuff"})),
	BethgonII("BethgonII", BethgonII.class, ItemIDs.minecartBethgonII.item, "Open Top Hopper", 4, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Green", "Orange", "Yellow", "Grey", "Magenta", "Pink", "Purple", "Skin16", "Skin17"}), 14, 45, (new String[] {"Cargo: Coal n shid"})),
	gsco67millgon("67millgon", gsco67millgon.class, ItemIDs.minecart67millgon.item, "Gondola", 3.5, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Green", "Brown", "Blue", "Grey", "Skin16", "Skin17", "Purple", "Skin18"}), 12, 45, (new String[] {"Cargo: Any."})),
	gsco52millgon("52millgon", gsco52millgon.class, ItemIDs.minecart52millgon.item, "Gondola", 3.0, TraincraftUtil.getBytesFromColors(new String[] {"Green", "Lime", "Red", "Skin16", "Black", "Grey", "Purple", "Brown", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21"}), 12, 45, (new String[] {"Cargo: Any."})),
	AAR50TonHopper("AAR 50 Ton Hopper", AAR50TonHopper.class, ItemIDs.minecartAAR50TonHopper.item, "Open Top Hopper", 2, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Purple"}), 16, 27, (new String[] {"Cargo: Ores."})),
	AAR70TonHopper("AAR 70 Ton Hopper", AAR70TonHopper.class, ItemIDs.minecartAAR70TonHopper.item, "Open Top Hopper", 2, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Magenta"}), 16, 27, (new String[] {"Cargo: Ores."})),

	DOT11111000( "DOT11000", DOT11111000.class, ItemIDs.minecart11000DOT111.item, "Tankcar", 0, 0, 2.25, 0, 0, 0, 0, 0, 41000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "LightGrey", "Grey"}), 16, 0, (new String[] {"Capacity: 41000mb."})),
	DOT11120600( "DOT20600", DOT11120600.class, ItemIDs.minecart20600DOT111.item, "Tankcar", 0, 0, 3, 0, 0, 0, 0, 0, 78000, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Black", "White", "Green", "LightGrey"}), 14, 0, (new String[] {"Capacity: 78000mb."})),
	DOT11129080( "DOT29080", DOT11129080.class, ItemIDs.minecart29080DOT111.item, "Tankcar", 0, 0, 3.25, 0, 0, 0, 0, 0, 110000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Orange", "LightGrey", "White", "Grey", "Skin16", "Skin17", "Skin18"}), 12, 0, (new String[] {"Capacity: 110000mb."})),
	DOT11117600( "DOT17600", DOT11117600.class, ItemIDs.minecart17600DOT111.item, "Tankcar", 0, 0, 2.5, 0, 0, 0, 0, 0, 67000, TraincraftUtil.getBytesFromColors(new String[] {"White", "Black", "Blue", "LightGrey", "Grey", "Yellow", "Brown", "Purple", "Skin16", "Skin17", "Skin18"}), 16, 0, (new String[] {"Capacity: 67000mb."})),
	NATX30600( "NATX30600", NATX30600.class, ItemIDs.minecartNATX30600.item, "Tankcar", 0, 0, 3.25, 0, 0, 0, 0, 0, 116000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Grey", "Green", "Red", "Yellow", "Pink", "Skin16", "Skin17", "LightBlue"}), 12, 0, (new String[] {"Capacity: 116000mb."})),
	gatc10000( "gatc10000", GATC10000.class, ItemIDs.minecartgatc10000.item, "Tankcar", 0, 0, 2, 0, 0, 0, 0, 0, 38000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Skin16", "Skin17", "LightBlue", "Grey", "Skin18", "Skin19"}), 15, 0, (new String[] {"Capacity: 38000mb."})),

	CoffinCar( "CoffinCar", CoffinCar.class, ItemIDs.minecartCoffinCar.item, "Tankcar", 0, 0, 1.5, 0, 0, 0, 0, 0, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Black"}), 14, 0, (new String[] {"Capacity: 16000mb."})),
	SkeletonCar("Skeleton", SkeletonLogCar.class, ItemIDs.minecartSkeletonLogCar.item, "Log Flat", 1, TraincraftUtil.getBytesFromColors(new String[]{"Black","Grey", "LightGrey"}), 18, 18, (new String[] {"Cargo: Logs."})),
	EarlyFlat("EarlyFlat", EarlyFlat.class, ItemIDs.minecartEarlyFlat.item, "Flatcar", 0, 0, 0.7, 0, 0, 0, 0, 0, 0, null, 18, 0),

	Gunderson89FootAutorack("89ftAutorack", Gunderson89ftAutorack.class, ItemIDs.minecartGunderson89ftAutorack.item, "Autorack", 4.75, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange", "LightGrey", "Blue", "Black", "Brown", "Pink"}), 8, 54, (new String[] {"Cargo: Any"})),
	Gunderson89FootFlat("89ftFlat", Gunderson89ftFlat.class, ItemIDs.minecartGunderson89ftFlat.item, "Flatcar", 3.25, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Blue", "Purple"}), 8, 54, (new String[] {"Cargo: Any"})),
	StampedeRack("StampedeRack", StampedeRack.class, ItemIDs.minecartStampedeRack.item, "Livestock Car", 0, 0, 3.75, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Brown"}), 10, 0),
	HuskyStackWellcar("40ftHuskyStackWellcar", HuskyStack2.class, ItemIDs.minecartHuskyStackWellcar.item, "Wellcar", 3, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Blue", "Brown", "Green", "Pink", "Skin16"}), 10,54, (new String[] {"Will carry containers (for REAL) Eventually!"})),

	IngotPig("IngotPig", IngotPig.class, ItemIDs.minecartIngotPig.item, "Other", 2, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Black"}), 18, 9, (new String[] {"Cargo: Ingots."})),
	SteelSlabFlat("SteelSlabFlat", SteelSlabFlat.class, ItemIDs.minecartSteelSlabFlat.item, "Other", 2.5, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Black"}), 16, 9, (new String[] {"Cargo: steel and metal ig."})),


	// Passenger //
	pch120commute("PCH-120 Commute", PCH120Commute.class, ItemIDs.minecartPCH120Commute.item, "electric",1400, 120, 0, 55, 0, 160, 0.8, 0.985, 0, TraincraftUtil.getBytesFromColors(new String[] {"White", "Blue", "Red", "Green", "Lime"}), 14, -2.7),
	pch120coach("PCH-120 Commute Car", PCH120Coach.class, ItemIDs.minecartPCH120Car.item, "passenger",0, 0, 2, 0, 0, 0, 0, 0, 0,TraincraftUtil.getBytesFromColors(new String[] {"White", "Blue", "Red", "Green", "Lime", "Purple", "Pink", "Yellow"}), 14, 0),

	pch130commute2("PCH-130 Commute2", PCH130Commute2.class, ItemIDs.minecartPCH130Commute2.item, "electric",1450, 130, 0, 60, 0, 160, 0.9, 0.995, 0, TraincraftUtil.getBytesFromColors(new String[] {"White"}), 18, -3.7 ),
	pch130car2("PCH-130 Commute2 Car", PCH130Coach.class, ItemIDs.minecartPCH130Car2.item, "passenger",0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"White"}), 10,0),

	PCH100H("PCH-100H", PCH100H.class, ItemIDs.minecartExperimentalHydrogenTrain.item, "hydrogen",900, 100, 0, 6, 0, 160, 0.8, 0.985, 7000, TraincraftUtil.getBytesFromColors(new String[]{"LightBlue", "Blue", "Lime", "Red"}), 18,  -2.6, (new String[] {"Powered by Mekanism Hydrogen"})),
	PCH100Coach("PCH-100H Coach", PCH100HCoach.class, ItemIDs.minecartPCH100HCoach.item, "passenger",0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"LightBlue", "Blue", "Lime", "Red"}), 10, 0),

	aipkitExplorer("Aipkit Explorer", AipkitExplorer.class, ItemIDs.minecartAipkitExplorer.item, "passenger",0, 0, 2, 0, 0, 0, 0, 0, 0, null, 10, 0),
	aipkitExplorer2("Aipkit Explorer-II", AipkitExplorer2.class, ItemIDs.minecartAipkitExplorer2.item, "passenger",0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Grey","Lime"}), 10, 0),

	PSRPO("PSRPO", PSRPO.class, ItemIDs.minecartPSRPO.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Blue", "Cyan", "Orange"}), 12, 27,null),
	PS85Baggage("Freight PS 85 Baggage", PS85Baggage.class, ItemIDs.minecartPS85Baggage.item, "freight", 2, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Blue", "Orange"}), 10, 27, null),
	PSCombine("PS Combine Coach", PSCombine.class, ItemIDs.minecartPScombine.item, "passenger/combine", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "Orange", "LightGrey", "Grey", "White", "Red"}), 10, 0),
	PS52SeatCoach("PS 52 Seat Coach", PS52SeatCoach.class, ItemIDs.minecartPS52seatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "LightBlue", "Yellow", "Orange", "Cyan", "Grey", "LightGrey", "Purple", "Green", "Lime", "White", "Red"}), 10, 0),
	PSDamnitAnotherDiner("PS Center Diner 2", PSDamnitAnotherDiner.class, ItemIDs.minecartPSDamnitAnotherDiner.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange", "Blue", "Cyan"}), 10, 0),
	PSSleeper565("PS 5-6-5 Sleeper", PSSleeper565.class, ItemIDs.minecartPSSleeper565.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "Brown", "Orange", "LightBlue", "Grey", "Yellow", "LightGrey"}), 10, 0),
	PSSleeper565DRGW("PS 5-6-5 Sleeper DRGW Edition", PSSleeper565DRGW.class, ItemIDs.minecartPSSleeper565DRGW.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange"}), 10, 0),
	PSLunchCounter_Lounge("PS Lunch Counter-Lounge", PSLunchCounter_Lounge.class, ItemIDs.minecartPSLunchCounter_Lounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "Yellow", "Orange", "LightBlue", "Purple", "LightGrey", "Grey", "White", "Red"}), 10, 0, null),
	PS30SeatParlor("PS 30 Seat Parlor", PS30SeatParlor.class, ItemIDs.minecartPS30SeatParlor.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "LightBlue", "Orange", "Red"}), 10, 0, null),

	PSRPOPM("PSPMRPO", PSRPOPM.class, ItemIDs.minecartPSRPOPM.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow"}), 12, 27,null),
	PS73Baggage("Freight PS 73 Baggage", PS73Baggage.class, ItemIDs.minecartPS73Baggage.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "Green", "Red", "Magenta", "Orange"}), 12, 27, null),
	PS54SeatCoach_Lounge("PS 54 Seat Coach-Lounge", PS54SeatCoach_Lounge.class, ItemIDs.minecartPS54SeatCoach_Lounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "LightBlue", "LightGrey", "Grey"}), 10, 0, null),
	PS54SeatCoach_Lounge_1950("PS 54 Seat Coach-Lounge 1950", PS54SeatCoach_Lounge_1950.class, ItemIDs.minecartPS54SeatCoach_Lounge_1950.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan"}), 10, 0, null),
	PScenterDiner("PS Center Diner", PScenterDiner.class, ItemIDs.minecartPSCenterDiner.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan"}), 10, 0),
	PS58SeatCoach_Observation("PS 58 Seat Coach-Observation", PS58SeatCoach_Observation.class, ItemIDs.minecartPS58SeatCoach_Observation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "LightBlue", "Purple", "Orange", "Red", "Magenta", "Pink", "Green", "Lime", "Brown", "Black", "LightGrey", "Grey", "White", "Skin16", "Yellow"}), 10, 0, null),

	PSBMCombine("PS B&M Combine", PSBMCombine.class, ItemIDs.minecartPSBMCombine.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Magenta", "Brown", "Green", "Blue"}), 10, 0, null),
	PSBM56SeatCoach("PS B&M 56 Seat Coach", PSBM56SeatCoach.class, ItemIDs.minecartPSBM56SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Magenta", "LightGrey", "Grey", "Brown", "Red", "Pink", "Green", "Lime", "Yellow", "Blue", "Cyan", "LightBlue", "Purple", "Black", "Orange", "White"}), 10, 0, null),
	PSBMDiner_Lounge("PS B&M Diner_Lounge", PSBMDiner_Lounge.class, ItemIDs.minecartPSBMDiner_Lounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Magenta", "Brown", "Green", "Blue", "Cyan", "LightGrey"}), 10, 0, null),

	ACFGNRPO_30("AC&F GN RPO (30' mail)", ACFGNRPO_30.class, ItemIDs.minecartACFGNRPO_30.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Yellow", "Green", "Lime"}), 10, 27,null),
	ACFGN60SeatCoach("AC&F GN 60 Seat Coach", ACFGN60SeatCoach.class, ItemIDs.minecartACFGN60SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Yellow", "Brown", "LightBlue", "Green", "LightGrey", "Black", "White", "Cyan", "Blue", "Lime", "Grey", "Skin16", "Skin17", "Skin18", "Skin19"}), 10, 0, null),
	ACFGNDinerObservation("AC&F GN Diner-Observation", ACFGNDinerObservation.class, ItemIDs.minecartACFGNDiner_Observation.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Green"}), 10, 27,null),
	ACFGN28SeatCoach_Dinette("AC&F GN 28 Seat Coach-Dinette", ACFGN28SeatCoach_Dinette.class, ItemIDs.minecartACFGN28SeatCoach_Dinette.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Green", "Blue", "White"}), 10, 0, null),
	ACFGN1DR_17SeatParlorObservation("AC&F GN 1DR-17 Seat Parlor-Observation", ACFGN1DR_17SeatParlorObservation.class, ItemIDs.minecartACFGN1DR_17SeatParlor_Observation.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Green", "Blue", "White"}), 10, 27,null),
	PSGNRPO_30("PS GN RPO (30' mail)", PSGNRPO_30.class, ItemIDs.minecartPSGNRPO_30.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Green", "Yellow", "Lime"}), 10, 27,null),

	OB84SeatCoach("OB 84 Seat Coach", OB84SeatCoach.class, ItemIDs.minecartOB84SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "Brown", "Black", "White", "Grey", "LightBlue", "Yellow", "Magenta", "Red", "Pink", "Blue", "LightGrey", "Purple", "Cyan", "Orange", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26", "Skin27"}), 10, 0, null),
	OB92SeatCoach("OB 92 Seat Coach", OB92SeatCoach.class, ItemIDs.minecartOB92SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "LightGrey", "Grey", "Brown", "Red", "Black", "White", "Yellow"}), 10, 0, null),
	OBNHGrillCar("OB NH Grill Car", OBNHGrillCar.class, ItemIDs.minecartOBNHGrillCar.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Yellow", "Lime"}), 10, 0, null),
	OBNHLounge5107("OB NH Commuter Lounge 5107", OBNHLounge5107.class, ItemIDs.minecartOBNHLounge5107.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Red"}), 10, 0, null),
	OBBaggage_52SeatDividedCoach("OB Baggage-52 Seat Divided Coach", OBBaggage_52SeatDividedCoach.class, ItemIDs.minecartOBBaggage_52SeatDividedCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "LightGrey", "Lime", "Grey", "Yellow"}), 10, 0, null),
	OB76SeatDividedCoach("OB 76 Seat Divided Coach", OB76SeatDividedCoach.class, ItemIDs.minecartOB76SeatDividedCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Grey", "Yellow", "Lime", "Black", "Blue", "Orange", "Brown", "LightGrey", "Red", "Cyan"}), 10, 0, null),
	OBLV82_92SeatCoach("OB LV 82/92 Seat Coach", OBLV82_92SeatCoach.class, ItemIDs.minecartOBLV82_92SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Red", "White", "Pink"}), 10, 0, null),
	OBRPO15("OB RPO (15' mail)", OBRPO15.class, ItemIDs.minecartOBRPO15.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "Grey", "Cyan", "LightGrey", "Blue"}), 12, 27,null),
	OB24SeatCoach_Dinette("OB 24 Seat Coach-Dinette", OB24SeatCoach_Dinette.class, ItemIDs.minecartOB24SeatCoach_Dinette.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Brown", "Green", "Pink", "Lime", "Grey", "Blue"}), 10, 0, null),
	OBBAR52SeatCoach_Dinette("OB BAR 52 Seat Coach-Dinette", OBBAR52SeatCoach_Dinette.class, ItemIDs.minecartOBBAR52SeatCoach_Dinette.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "Blue"}), 10, 0, null),

	PSCNW56SeatCoach("PS CNW 56 Seat Coach", PSCNW56SeatCoach.class, ItemIDs.minecartPSCNW56SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Skin19", "Green", "Lime", "Skin20", "White", "Brown", "Skin21", "Grey", "LightGrey", "Skin22", "Skin16", "Skin17", "Skin18", "Purple", "Orange", "Red", "Blue", "Skin23", "Cyan", "LightBlue", "Pink", "Magenta"}), 10, 0, null),
	PSCNW48SeatCoach_Lounge("PS CNW 48 Seat Coach-Lounge", PSCNW48SeatCoach_Lounge.class, ItemIDs.minecartPSCNW48SeatCoachLounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black"}), 10, 0, null),
	PSCNW20SeatCoach_Lounge("PS CNW 20 Seat Coach-Lounge", PSCNW20SeatCoach_Lounge.class, ItemIDs.minecartPSCNW20SeatCoachLounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black"}), 10, 0, null),
	PSCNW36SeatCoach_Dinette("PS CNW 36 Seat Coach-Dinette", PSCNW36SeatCoach_Dinette.class, ItemIDs.minecartPSCNW36SeatCoach_Dinette.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Green"}), 10, 0, null),
	PSCNW56SeatDiner("PS CNW 56 Seat Diner", PSCNW56SeatDiner.class, ItemIDs.minecartPSCNW56SeatDiner.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green"}), 10, 0, null),
	PSCNW48SeatDiner("PS CNW 48 Seat Diner", PSCNW48SeatDiner.class, ItemIDs.minecartPSCNW48SeatDiner.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Green"}), 10, 0, null),
	PSCNW1DR_22SeatParlor("PS CNW 1DR-22 Seat Parlor", PSCNW1DR_22SeatParlor.class, ItemIDs.minecartPSCNW1DR_22SeatParlor.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green", "Lime", "Blue", "White", "Grey", "LightBlue", "Cyan", "LightGrey", "Brown", "Orange", "Red", "Pink", "Magenta", "Purple", "Skin16"}), 10, 0, null),
	PSCNW16_1_3Sleeper("PS CNW 16-1-3 Sleeper", PSCNW16_1_3Sleeper.class, ItemIDs.minecartPSCNW16_1_3Sleeper.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green"}), 10, 0, null),
	PSCNW12SeatParlor_Observation("PS CNW 12 Seat Parlor-Observation", PSCNW12SeatParlor_Observation.class, ItemIDs.minecartPSCNW12SeatParlor_Observation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green", "Lime"}), 10, 0, null),
	PSCNWRPO15("PS CNW RPO(15')", PSCNWRPO15.class, ItemIDs.minecartPSCNWRPO15.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Green"}), 10, 27,null),
	PSCNWRPO60("PS CNW RPO(60')", PSCNWRPO60.class, ItemIDs.minecartPSCNWRPO60.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Green", "Orange", "Red", "Grey", "LightGrey", "Grey", "White", "Magenta", "Brown", "Lime"}), 10, 27,null),
	PSCNWBaggage_LC_Lounge("PS CNW Baggage-LC-Lounge", PSCNWBaggage_LC_Lounge.class, ItemIDs.minecartPSCNWBaggage_LC_Lounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green", "Lime", "Grey", "LightGrey", "White", "Magenta"}), 10, 0, null),
	PSCNWRPO15_Baggage_LC_Lounge("PS CNW RPO(15')-Baggage-LC-Lounge", PSCNWRPO15_Baggage_LC_Lounge.class, ItemIDs.minecartPSCNWRPO15_Baggage_LC_Lounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green", "Lime", "Grey", "LightGrey"}), 10, 0, null),
	PSCNWBaggage_LC_Diner("PS CNW Baggage-LC-Diner", PSCNWBaggage_LC_Diner.class, ItemIDs.minecartPSCNWBaggage_LC_Diner.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Black", "Green", "Lime", "Grey"}), 10, 0, null),
	PSCNW20SeatCoach_Lounge_1959("PS CNW 20 Seat Coach-Lounge (1959)", PSCNW20SeatCoach_Lounge_1959.class, ItemIDs.minecartPSCNW20SeatCoachLounge_1959.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow"}), 10, 0, null),
	PSCNWCommuterLounge("PS CNW Commuter Lounge", PSCNWCommuterLounge.class, ItemIDs.minecartPSCNWCommuterLounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Green"}), 10, 0, null),
	PSCNW27SeatParlor_Observation("PS CNW 27 Seat Parlor-Observation", PSCNW27SeatParlor_Observation.class, ItemIDs.minecartPSCNW27SeatParlor_Observation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Green", "Black", "Lime"}), 10, 0, null),

	BuddRDG56SeatCoach_Lounge("Budd RDG 56 Seat Coach-Lounge", BuddRDG56SeatCoach_Lounge.class, ItemIDs.minecartBuddRDG56SeatCoachLounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "Grey", "LightGrey"}), 10, 0, null),
	BuddRDGDiner_Lounge("Budd RDG Diner-Lounge", BuddRDGDiner_Lounge.class, ItemIDs.minecartBuddRDGDiner_Lounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan"}), 10, 0, null),
	BuddRDG56SeatCoach_Observation("Budd RDG 56 Seat Coach-Observation", BuddRDG56SeatCoach_Observation.class, ItemIDs.minecartBuddRDG56SeatCoach_Observation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "Grey", "LightGrey", "LightBlue", "White"}), 10, 0, null),

	BuddCRIP52SeatCoach("Budd CRIP 52 Seat Coach", BuddCRIP52SeatCoach.class, ItemIDs.minecartBuddCRIP52SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "Blue", "White", "Cyan"}), 10, 0, null),

	BuddNYC52SeatCoach("Budd NYC 52 Seat Coach", BuddNYC52SeatCoach.class, ItemIDs.minecartBuddNYC52SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Red"}), 10, 0, null),

	BuddCBQ52SeatCoach("Budd CB&Q 52 Seat Coach", BuddCBQ52SeatCoach.class, ItemIDs.minecartBuddCBQ52SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Brown", "Purple"}), 10, 0, null),
	BuddDome46SeatCoach("Budd Dome-46 Seat Coach", BuddDome46SeatCoach.class, ItemIDs.minecartBuddDome46SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "White", "Brown", "Green", "Lime", "Orange", "Blue", "Black", "Magenta", "Yellow", "Red", "Pink", "Cyan", "LightBlue", "Purple", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21"}), 10, 0),
	BuddCBQDome50SeatCoach("Budd CB&Q Dome-50 Seat Coach", BuddCBQDome50SeatCoach.class, ItemIDs.minecartBuddCBQDome50SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Grey"}), 10, 0),
	BuddPrewarBaggage("Budd Prewar Baggage", BuddPrewarBaggage.class, ItemIDs.minecartBuddPrewarBaggage.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "White", "Red", "Yellow", "Black"}), 12, 27, null),

	BuddATSF52SeatCoach("Budd ATSF 52 Seat Coach", BuddATSF52SeatCoach.class, ItemIDs.minecartBuddATSF52SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Orange", "Green", "Pink", "Blue", "Lime", "Purple", "Brown", "Grey"}), 10, 0, null),
	BuddATSF48SeatCoach("Budd ATSF 48 Seat Coach", BuddATSF48SeatCoach.class, ItemIDs.minecartBuddATSF48SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Cyan"}), 10, 0, null),
	BuddATSF50SeatCoach_observation("Budd ATSF 50 Seat Coach-Observation", BuddATSF50SeatCoach_Observation.class, ItemIDs.minecartBuddATSF50SeatCoachObservation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey"}), 10, 0, null),
	BuddATSF34SeatParlor_observation("Budd ATSF 34 Seat Parlor-Observation", BuddATSF34SeatParlor_Observation.class, ItemIDs.minecartBuddATSF34SeatParlorObservation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "Brown", "Blue"}), 10, 0, null),
	BuddATSF58SeatCoach_observation("Budd ATSF 58 Seat Coach-Observation", BuddATSF58SeatCoach_Observation.class, ItemIDs.minecartBuddATSF58SeatCoachObservation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Orange", "Cyan", "Purple"}), 10, 0, null),
	PSATSF50SeatCoach_observation("PS ATSF 50 Seat Coach-Observation", PSATSF50SeatCoach_Observation.class, ItemIDs.minecartPSATSF50SeatCoachObservation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "Blue", "Orange"}), 10, 0, null),

	ACFUPRPO60("AC&F UP RPO(60')", ACFUPRPO60.class, ItemIDs.minecartACFUPRPO60.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Red", "Orange", "Brown", "Green", "Blue", "Lime", "Grey", "LightGrey", "Black", "White"}), 10, 27,null),

	BuddDome54SeatCoach("Budd Dome-54 Seat Coach", BuddDome54SeatCoach.class, ItemIDs.minecartBuddDome54SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "LightBlue", "Grey", "LightGrey", "White", "Red"}), 10, 0),

	PSCEIRPO15_Baggage_LC_Lounge("PS C&EI RPO(15')-Baggage-LC-Lounge", PSCEIRPO15_Baggage_LC_Lounge.class, ItemIDs.minecartPSCEIRPO15_Baggage_LC_Lounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Orange", "Cyan", "Red"}), 10, 0, null),
	PSCEIRPO15_Baggage_38SeatCoach("PS C&EI RPO(15')-Baggage-38 Seat Coach", PSCEIRPO15_Baggage_38SeatCoach.class, ItemIDs.minecartPSCEIRPO15_Baggage_38SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Orange", "Cyan", "Red"}), 10, 0, null),
	PSCEI60SeatCoach("PS C&EI 60 Seat Coach", PSCEI60SeatCoach.class, ItemIDs.minecartPSCEI60SeatCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Orange", "Cyan", "LightBlue", "Purple", "Yellow", "Pink", "Grey", "Green", "LightGrey", "Black", "Lime", "Brown", "Magenta", "Red"}), 10, 0, null),
	PSCEIDiner("PS C&EI Diner", PSCEIDiner.class, ItemIDs.minecartPSCEIDiner.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "Red"}), 10, 0, null),
	PSCEI1DR_28SeatParlor_Observation("PS C&EI 1DR-28 Seat Parlor-Observation", PSCEI1DR_28SeatParlor_Observation.class, ItemIDs.minecartPSCEI1DR28SeatParlorObservation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Orange", "Red"}), 10, 0, null),

	OBHWNH5570_5589Baggage("OB HW NH 5570-5589 Series Baggage", OBHWNH5570_5589Baggage.class, ItemIDs.minecartOBHWNH5570_5589Baggage.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Lime", "Yellow", "Grey", "LightGrey", "Black", "Red"}), 12, 27,null),

	BuddCN68SeatCoach_Observation("Budd CN 68 Seat Coach-Observation", BuddCN68SeatCoach_Observation.class, ItemIDs.minecartBuddCN68SeatCoach_Observation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "LightGrey", "Red", "Pink", "White"}), 10, 0, null),
	BuddCNCoach("Budd CN 72 or 54 Seat Coach-Observation", BuddCNCoach.class, ItemIDs.minecartBuddCNCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "LightGrey", "Red", "Pink", "White"}), 10, 0, null),
	BuddCNDiner_Lounge("Budd CN Diner-Lounge", BuddCNDiner_Lounge.class, ItemIDs.minecartBuddCNDiner_Lounge.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "LightGrey"}), 10, 0, null),
	BuddCN39SeatParlor_Observation("Budd CN 39 Seat Parlor-Observation", BuddCN39SeatParlor_Observation.class, ItemIDs.minecartBuddCN39SeatParlor_Observation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey", "LightGrey", "Red"}), 10, 0, null),
	BuddCN59SeatCoach_Observation("Budd CN 59 Seat Coach-Observation", BuddCN59SeatCoach_Observation.class, ItemIDs.minecartBuddCN59SeatCoach_Observation.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Black", "Grey"}), 10, 0, null),
	NSCCNBaggage("NSC CN Baggage", NSCCNBaggage.class, ItemIDs.minecartNSCCNBaggage.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Yellow", "LightBlue", "Black", "Lime", "Orange", "Red", "Pink", "Grey", "LightGrey", "Brown", "White", "Blue", "Cyan", "Purple", "Magenta", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20"}), 12, 27, null),

	PSSOUBaggage("PS SOU Baggage", PSSOUBaggage.class, ItemIDs.minecartPSSOUBaggage.item, "freight", 2, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "White", "Black", "Brown", "Magenta"}), 10, 27, null),
	PSSOURPO_30("PS SOU RPO (30' mail)", PSSOURPO_30.class, ItemIDs.minecartPSSOURPO_30.item, "freight", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"Grey", "LightGrey", "White", "Black"}), 10, 27,null),

	PRECOPendulumCoach("PRECO Pendulum Coach", PRECOPendulumCoach.class, ItemIDs.minecartPRECOPendulumCoach.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Black", "White", "Grey", "LightGrey", "Magenta", "LightBlue", "Cyan", "Lime", "Orange", "Green", "Red"}), 10, 0, null),

	PSFNCCBaggage_Dinette("PS FNCC Baggage-Dinette", PSFNCCBaggage_Dinette.class, ItemIDs.minecartPSFNCCBaggage_Dinette.item, "passenger", 0, 0, 3, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green"}), 10, 0, null),

	amfleet("Amfleet", Amfleet.class, ItemIDs.minecartAmfleet.item, "passenger", 3, TraincraftUtil.getBytesFromColors(new String[] {"White", "Grey", "LightGrey", "LightBlue", "Red", "Blue", "Green", "Skin16", "Skin17"}), 14, 0, null),
	amfleet2("Amfleet2", Amfleet2.class, ItemIDs.minecartAmfleet2.item, "passenger", 3, TraincraftUtil.getBytesFromColors(new String[] {"Blue","LightGrey", "Grey", "Red", "LightBlue", "Skin16", "Skin17"}), 14, 0, null),
	amfleetcab("AmfleetCab", AmfleetCab.class, ItemIDs.minecartAmfleetCab.item, "passenger", 3, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "LightBlue", "Red", "White", "Skin16", "Skin17"}), 14, 0, null),
	amcafe("AmCafe", AmCafe.class, ItemIDs.minecartAmCafe.item, "passenger", 3, TraincraftUtil.getBytesFromColors(new String[] {"White", "Grey", "LightGrey", "LightBlue", "Red", "Blue", "Cyan", "Skin16", "Skin17"}), 14, 0, null),
	amcafe2("AmCafe2", AmCafe2.class, ItemIDs.minecartAmCafe2.item, "passenger", 3, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey", "Red", "Blue", "Skin16", "Skin17"}), 14, 0, null),

	PEcoach("PEcoach", PEcoach.class, ItemIDs.minecartPEcooch.item, "festive passenger",  0, 0, 6, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan", "Green", "Lime", "Skin16", "Purple", "Red", "Skin17"}), 10, 0),
	PEobserve("PEobserve", PEobserve.class, ItemIDs.minecartPEobserve.item, "festive passenger",  0, 0, 6, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Cyan"}), 10, 0),

	//or as i like to call it the cabussy//
	WVcaboose("WVcaboose",WVcaboose.class, ItemIDs.minecartWVcaboose.item, "caboose", 2, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Green", "Lime", "Cyan", "White", "Purple", "Skin16"}), 16, 0, null),
	HBC1C("HBC1C",HBC1Cboose.class, ItemIDs.minecartHBC1Ccaboose.item, "caboose", 2, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Purple", "Magenta"}), 16, 0, null),
	HBC1B("HBC1B",HBC1Bboose.class, ItemIDs.minecartHBC1Bcaboose.item, "caboose", 2, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Blue", "Pink", "Purple", "Green", "Skin17"}), 16, 0, null),
	DRGWCaboose("DRGWCaboose", DRGWboose.class, ItemIDs.minecartDRGWCaboose.item, "caboose", 2, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Brown", "Green", "Lime", "Yellow", "Cyan", "Black", "White", "Magenta", "Red", "Orange", "Pink", "Skin16", "Purple"}), 16, 0, null),
	ICCBaywindowWP("ICCBaywindowWP",ICCBaywindowWP.class, ItemIDs.minecartICCBaywindowWP.item, "caboose", 2, TraincraftUtil.getBytesFromColors(new String[] {"Brown", "Red", "Skin16", "Green", "Cyan", "Skin17", "Orange", "Skin18", "Skin19", "Skin20"}), 16, 0, null),
	CA11("CA11",CA11.class, ItemIDs.minecartCA11.item, "caboose", 2, TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Red", "Cyan", "Skin17", "Skin18"}), 16, 0, null),
	WPShops600Series("WPShops600Series",WPShops600Series.class, ItemIDs.minecartWPShops600Series.item, "caboose", 2, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Brown", "Yellow", "Green"}), 16, 0, null),

	//meme
	BigMeme("BigMeme", BigMeme.class, ItemIDs.minecartBigMeme.item, "awesome", 1, 200, 0, 50, 0, 0, 0.9, 0.9, 8000, TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey"}),16 , -1.1),
	BombCart("Payload", BombCart.class, ItemIDs.minecartBombCart.item, "misc", 1.5, TraincraftUtil.getBytesFromColors(new String[]{"LightBlue", "Red", "Black", "Blue", "Cyan", "Green", "Grey", "Brown", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Yellow", "White"}), 18, 0, (new String[] {"Who is not pushing ze Cart!?"})),
	Thanos("Thanos", Thanos.class, ItemIDs.minecartThanos.item, "electric", 696969, 6210000, 0, 69, 0, 1, 6, 30, 0, null, 18, -1, (new String[] {"You don't want to mess with the Universe's Best"})),
	TGVmobile("TGVmobile", DieselTGVmobile.class, ItemIDs.minecartTGVMobile.item, "diesel", 200, 350, 0, 10, 0, 140, 0.9, 0.9, 1000,null,18, 2.7),
	HHgregg("HHgregg", DieselHHgregg.class, ItemIDs.minecartHHgregg.item, "awesome", 9932, 299, 0, 42, 0, 48, 0.9, 0.9, 7000, null, 10, -2, (new String[] {"hhhgregg, Panasonic Blu-ray nintey-nine dollars, thirty-two inch LCD TV two-nintey nine, LG fourty-two inch HD TV only four eighty-nine, everything on sale during chirstmas in"})),

	//dont speak americano
	//Class345("Class 345", ElectricClass345.class, ItemIDs.minecartClass345engine.item, "electric", 1500, 290, 0,6, 0, 100, 2, 1.5, 1000, null, 18, -3),
	//Class345Coach("Class345", Class345Coach.class, ItemIDs.minecartClass345car.item, "passenger", 0, 0, 1.5,0 , 0, 0, 0,0,0,null,0,0),
	//LUengine("London Underground Engine", ElectricLUengine.class, ItemIDs.minecartLUengine.item, "electric", 600, 100, 0, 10, 0, 100, 0.7, 0.8, 1000, null, 18, -2),
	//LUpassenger("London Underground Passenger Car", LUpassenger.class, ItemIDs.minecartLUcar.item, "passenger", 0.3, null, 0, 0, null),
	Class74("Class74",ElectricClass74.class, ItemIDs.minecartClass74.item, "electric", 2426, 140, 0, 50, 0, 10, 0.6, 0.7, 13, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Purple", "Red"}), 10, -2, (new String[] {"Not BAP, but gets to be included"})),
	TwoBil("TwoBil",ElectricTwoBil.class, ItemIDs.minecartTwoBil.item, "electric", 428, 121, 0, 7, 0, 0, 0.5, 0.9, 0, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Lime", "Green", "Grey", "LightGrey"}), 11, -3.4, (new String[] {"Not BAP, but gets to be included"})),
	TwoBilTail("TwoBilTail", PassengerTwoBilTail.class, ItemIDs.minecartTwoBilTail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Lime", "Green", "Grey", "LightGrey"}), 11, 0, (new String[] {"Not BAP, but gets to be included"})),

	KawasakiLRV("KawasakiLRV", ElectricKawasakiLRV.class,  ItemIDs.minecartKawasakiLRV.item, "electric", 200, 80, 0, 10, 0, 170, 0.7, 0.9, 0, null, 10, -3, (new String[] {"Not BAP, but gets to be included"})),
	CQ310PO("CQ310PO", ElectricCQ310PO.class,  ItemIDs.minecartCQ310PO.item, "electric", 350, 100, 0, 10, 0, 170, 0.7, 0.9, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Black"}), 10, -3, (new String[] {"Not BAP, but gets to be included"})),
	CQ310PA("CQ310PA", CQ310PA.class, ItemIDs.minecartCQ310PA.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "Black"}), 18, 0, (new String[] {"Not BAP, but gets to be included"})),
	PCC("PCC", ElectricPCC.class,  ItemIDs.minecartPCC.item, "electric", 220, 80, 0, 10, 0, 170, 0.7, 0.875, 0, TraincraftUtil.getBytesFromColors(new String[] {"Black", "White"}), 10, -3, (new String[] {"Not BAP, but gets to be included"})),

	//old and extras
	geometryCar("NXTrack Geometry Car", ExperimentalGeometryCar.class, ItemIDs.minecartGeometryCar.item, "geometry car", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "LightGrey"}), 18, 0, (new String[] {"Checks the railroad for things up to standard"})),
	HighrailTruck("Highrail Truck", DieselHighrailTruck.class, ItemIDs.minecartHighrailTruck.item, "diesel", 90, 80, 0, 10, 0, 140, 0.7, 0.8, 1000,TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "White", "LightGrey"}),18, 2.7),
	FRED("FRED", FRED.class, ItemIDs.minecartFRED.item, "misc", 0.2, null, 0, 1, (new String[] {"the least used item in the mod"})),
	//testControlCar("Test Control Car", TestControlCar.class, ItemIDs.testControlCar.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "LightGrey"}), 18, 0),
	//Hustler("Hustler", DieselHustler.class, ItemIDs.minecartHustler.item, "diesel", 150, 30, 0, 50, 0, 170, 0.6, 0.7, 9000,  TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "Black", "Blue", "Brown"}), 10, -2),
	BoulderWagon("BoulderWagon", BoulderWagon.class, ItemIDs.minecartBoulderWagon.item, "freight", 5, TraincraftUtil.getBytesFromColors(new String[]{"Grey","skin16"}), 0, 9, null),
	//LogcarNP("LogcarNP",LogcarNP.class, ItemIDs.minecartLogcarNP.item,"freight",2, TraincraftUtil.getBytesFromColors(new String[]{"Brown","Black"}), 0, 18, null),
	//CF7R("CF7R", DieselCF7R.class, ItemIDs.minecartCF7R.item, "diesel", 2350, 105, 0, 5, 0, 185, 0.8, 0.9, 7000, TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Yellow", "Black"}), 10, -3, TraincraftUtil.getBytesFromColors(new String[] {"CF7 Rebuild Rebuilt"})),
	HighrailVan("Highrail Van", DieselHighrailVan.class, ItemIDs.minecartHighrailVan.item, "diesel", 90, 80, 0, 10, 0, 140, 0.7, 0.8, 1000,TraincraftUtil.getBytesFromColors(new String[] {"Yellow", "White", "Grey", "Orange", "Green"}),18, 2.7),


	WorkdayHyrail("WorkdayHyrail", DieselWorkdayHyrail.class, ItemIDs.minecartWorkdayHyrail.item, "diesel", 110, 115, 0, 2, 0, 10, 0.95, 0.8, 2000,TraincraftUtil.getBytesFromColors(new String[] {"LightGrey", "Grey", "Cyan", "Yellow"}),20, -2.0),

	;

//String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] colors,

	private String internalName;
	private Class entityClass;
	private Item item;
	private String trainType;
	private int MHP;
	public int maxSpeed;
	private double mass;
	private int fuelConsumption;
	private int waterConsumption;
	private int heatingTime;
	private double accelerationRate;
	private double brakeRate;
	private int tankCapacity;
	private int[] colors;
	private int guiRenderScale;
	private double bogieLocoPosition;
	private String[] additionnalTooltip;
	private int cargoCapacity;

	/**
	 *
	 * @param internalName : Only used by EntityRegistry
	 * @param entityClass
	 * @param item
	 * @param trainType: "steam", "diesel", "freight", "passenger", "special", "flat", "electric"
	 * @param MHP: power of the locomotive
	 * @param maxSpeed
	 * @param mass (will be multiplied by 10 internally. That means putting 0.1 here will create a mass of 1 Ton in game)
	 * @param fuelConsumption: 1 unit is consumed every x ticks
	 * @param waterConsumption: 1 unit is consumed every x ticks
	 * @param heatingTime
	 * @param accelerationRate: generally around 0.45
	 * @param brakeRate: generally around 0.98
	 * @param tankCapacity
	 * @param colors: an array with all possible colors. Index 0 is used as default color when train is first spawned. leave null if no color available
	 * @param guiRenderScale: scale at which the entity will be rendered inside the GUI (crafting GUI)
	 */
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPosition){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.MHP=MHP;
		this.maxSpeed=maxSpeed;
		this.mass=mass;
		this.fuelConsumption=fuelConsumption;
		this.waterConsumption=waterConsumption;
		this.heatingTime=heatingTime;
		this.accelerationRate=accelerationRate;
		this.brakeRate=brakeRate;
		this.tankCapacity=tankCapacity;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.bogieLocoPosition = bogieLocoPosition;
	}

	private EnumTrains(String internalName,Class entityClass, Item item, EnumTrainType trainType,int MHP,int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPosition)
	{
		this(  internalName, entityClass,  item,  trainType.TrainType, MHP, maxSpeed,  mass,  fuelConsumption,  waterConsumption,  heatingTime,  accelerationRate,  brakeRate,  tankCapacity,  colors,  guiRenderScale,  bogieLocoPosition);
	}

	/**
	 * Constructor for additionnal tooltips on the item
	 * @param internalName
	 * @param entityClass
	 * @param item
	 * @param trainType
	 * @param MHP
	 * @param maxSpeed
	 * @param mass
	 * @param fuelConsumption
	 * @param waterConsumption
	 * @param heatingTime
	 * @param accelerationRate
	 * @param brakeRate
	 * @param tankCapacity
	 * @param colors
	 * @param guiRenderScale
	 * @param bogieLocoPositions
	 * @param additionnalTooltip
	 */
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType,int MHP,int maxSpeed, double mass, int fuelConsumption,int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPositions, String[] additionnalTooltip){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.MHP=MHP;
		this.maxSpeed=maxSpeed;
		this.mass=mass;
		this.fuelConsumption=fuelConsumption;
		this.waterConsumption=waterConsumption;
		this.heatingTime=heatingTime;
		this.accelerationRate=accelerationRate;
		this.brakeRate=brakeRate;
		this.tankCapacity=tankCapacity;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.bogieLocoPosition = bogieLocoPositions;
		this.additionnalTooltip=additionnalTooltip;
	}

	private EnumTrains(String internalName,Class entityClass, Item item, EnumTrainType trainType,int MHP,int maxSpeed, double mass, int fuelConsumption,int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPositions, String[] additionnalTooltip)
	{
		this( internalName, entityClass, item, trainType.TrainType, MHP, maxSpeed,  mass,  fuelConsumption, waterConsumption,  heatingTime,  accelerationRate,  brakeRate,  tankCapacity,  colors,  guiRenderScale,  bogieLocoPositions,  additionnalTooltip);
	}


	/**
	 * Constructor for freight carts
	 * @param internalName
	 * @param entityClass
	 * @param item
	 * @param trainType
	 * @param mass
	 * @param colors
	 * @param guiRenderScale
	 * //@param bogieLocoPositions
	 * //@param bogieUtilityPositions
	 * @param cargoCapacity
	 * @param additionnalTooltip
	 */
	private EnumTrains(String internalName,Class entityClass, Item item, String trainType, double mass, int[] colors, int guiRenderScale, int cargoCapacity, String[] additionnalTooltip)
	{
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.mass=mass;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.additionnalTooltip=additionnalTooltip;
		this.cargoCapacity = cargoCapacity;
	}

	private EnumTrains(String internalName,Class entityClass, Item item, EnumTrainType trainType, double mass, int[] colors, int guiRenderScale, int cargoCapacity, String[] additionnalTooltip)
	{
		this(internalName, entityClass, item, trainType.TrainType, mass, colors, guiRenderScale, cargoCapacity, additionnalTooltip);
	}

	public String getInternalName(){
		return this.internalName;
	}

	public Item getItem(){
		return this.item;
	}

	public String getTrainType(){
		return this.trainType;
	}

	public int getMHP(){
		return this.MHP;
	}

	public int getMaxSpeed(){
		return this.maxSpeed;
	}

	public double getMass(){
		return this.mass;
	}

	public int getFuelConsumption(){
		return this.fuelConsumption;
	}

	public int getWaterConsumption(){
		return this.waterConsumption;
	}

	public int getHeatingTime(){
		return this.heatingTime;
	}

	public double getAccelerationRate(){
		return this.accelerationRate;
	}

	public double getBrakeRate(){
		return this.brakeRate;
	}

	public int getTankCapacity(){
		return this.tankCapacity;
	}

	public int[] getColors(){
		return this.colors;
	}

	public double getBogieLocoPosition(){
		return this.bogieLocoPosition;
	}


	public Class getEntityClass() {
		return this.entityClass;
	}

	public int getGuiRenderScale(){
		return this.guiRenderScale;
	}

	public String[] getAdditionnalTooltip(){
		return this.additionnalTooltip;
	}

	public int getCargoCapacity(){
		return cargoCapacity;
	}

	public static EnumTrains getCurrentTrain(Item item){
		if(item==null)return null;
		for (EnumTrains trains : EnumTrains.values()) {
			if(trains!=null && trains.getItem()!=null && trains.getItem() == item){
				return trains;
			}
		}
		return null;
	}

	public static AbstractTrains getEntityWithItem(Item item, World world, double x, double y, double z){
		if(item==null)return null;
		for (EnumTrains trains : EnumTrains.values()) {
			if(trains!=null && trains.getItem()!=null && trains.getItem() == item){
				return trains.getEntity(world, x, y, z);
			}
		}
		return null;
	}

	public AbstractTrains getEntity(World world){
		try {
			return (AbstractTrains) entityClass.getConstructor(World.class).newInstance(world);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	public AbstractTrains getEntity(World world, double x, double y, double z){
		try {
			if(world.isRemote){
				entityClass.getConstructor(World.class).newInstance(world);
			} else {
				return (AbstractTrains) entityClass.getConstructor(World.class, double.class, double.class, double.class).newInstance(world, x, y, z);
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
}
