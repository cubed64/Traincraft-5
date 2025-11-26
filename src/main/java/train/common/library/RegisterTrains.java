package train.common.library;

import train.common.Traincraft;
import train.common.core.util.TraincraftUtil;
import train.common.entity.rollingStock.*;
import train.common.entity.rollingStock.electric.*;
import train.common.entity.rollingStock.freight.*;
import train.common.entity.rollingStock.passenger.*;
import train.common.entity.rollingStock.workcart.*;
import train.common.library.register.TrainRecord;

public class RegisterTrains
{
    public RegisterTrains()
    {
        RegisterRollingHeritage();
        RegisterBAPSteam();
        RegisterBAPDiesel();
        RegisterBAPElectric();
        RegisterBAPPassenger();
        RegisterBAPFreight();
    }

    private void RegisterRollingHeritage()
    {
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerBlue.item,
                                new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassenger2.item,
                                new TrainRecord("Passenger Small Black", EntityPassenger2.class, ItemIDs.minecartPassenger2.item, EnumTrainType.Passenger, 0.5,
                                        new String[]{"Black"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassenger5.item,
                                new TrainRecord("Passenger Green Long", EntityPassenger5.class, ItemIDs.minecartPassenger5.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Green", "Yellow"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassenger7.item,
                                new TrainRecord("Passenger Short Green", EntityPassenger7.class, ItemIDs.minecartPassenger7.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Black"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassenger8_1class_DB.item,
                                new TrainRecord("Passenger 1Class DB", EntityPassenger_1class_DB.class, ItemIDs.minecartPassenger8_1class_DB.item, EnumTrainType.Passenger, 1.5,
                                        new String[]{"Black"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        //passenger_1class_DB("Passenger 1Class DB", EntityPassenger_1class_DB.class, ItemIDs.minecartPassenger8_1class_DB.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassenger9_2class_DB.item,
                                new TrainRecord("Passenger 2Class DB", EntityPassenger_2class_DB.class, ItemIDs.minecartPassenger9_2class_DB.item, EnumTrainType.Passenger, 1.5,
                                        new String[]{"Green", "Cyan"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );

        //passenger_2class_DB("Passenger 2Class DB", EntityPassenger_2class_DB.class, ItemIDs.minecartPassenger9_2class_DB.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Green", "Cyan"}), 18, 0),
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerHighSpeedCarZeroED.item,
                                new TrainRecord("Passenger High Speed Zero ED", EntityPassengerHighSpeedCarZeroED.class, ItemIDs.minecartPassengerHighSpeedCarZeroED.item, EnumTrainType.Passenger, 2,
                                        new String[]{"White", "LightGrey", "Grey"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        //passengerHighSpeedZeroED("Passenger High Speed Zero ED", EntityPassengerHighSpeedCarZeroED.class, ItemIDs.minecartPassengerHighSpeedCarZeroED.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "LightGrey", "Grey"}), 18, 0),

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartNYTram.item,
                                new TrainRecord("Loco Electric Tram NY", EntityLocoElectricTramNY.class, ItemIDs.minecartNYTram.item, EnumTrainType.Passenger, 1,
                                        new String[] {"Grey", "White"},
                                        18).setMHP(2428).setMaxSpeed(160).setFuelConsumption(6).setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.965).setBogieLocoPosition(-3),
                                Traincraft.instance // don't touch this line
                        );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerTramNY.item,
                                new TrainRecord("Passenger Tram NY", EntityPassengerTramNY.class, ItemIDs.minecartPassengerTramNY.item, EnumTrainType.Passenger, 1,
                                        new String[] {"Grey", "White"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        //passengerTramNY("Passenger Tram NY", EntityPassengerTramNY.class, ItemIDs.minecartPassengerTramNY.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[] {"Grey", "White"}), 18, 0),
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerAdler.item,
                                new TrainRecord("Passenger Adler", EntityPassengerAdler.class, ItemIDs.minecartPassengerAdler.item, EnumTrainType.Passenger, 0.5,
                                        new String[] {"Black"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        //passengerAdler("Passenger Adler", EntityPassengerAdler.class, ItemIDs.minecartPassengerAdler.item, "passenger", 0, 0, 0.5, 0, 0, 0, 0, 0, 0, null, 18, 0),
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerDBOriental.item,
                                new TrainRecord("Passenger DB oriental", EntityPassengerDBOriental.class, ItemIDs.minecartPassengerDBOriental.item, EnumTrainType.Passenger, 1,
                                        new String[] {"Yellow", "Blue", "White"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        //passengerDBOriental("Passenger DB oriental", EntityPassengerDBOriental.class, ItemIDs.minecartPassengerDBOriental.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow", "Blue", "White"}), 18, 0),
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartICE1_1stClass.item,
                                new TrainRecord("Passenger ICE 1st Class", EntityPassengerICE_1class.class, ItemIDs.minecartICE1_1stClass.item, EnumTrainType.Passenger, 1.5,
                                        new String[]{"White", "Red"},
                                        10),
                                Traincraft.instance // don't touch this line
                        );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartICE1_2ndClass.item,
                                new TrainRecord("Passenger ICE 2nd Class", EntityPassengerICE_2class.class, ItemIDs.minecartICE1_2ndClass.item, EnumTrainType.Passenger, 1.5,
                                        new String[]{"White", "Red"},
                                        10),
                                Traincraft.instance // don't touch this line
                        );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartICE1_Restaurant.item,
                                new TrainRecord("ICE Restaurant", EntityPassengerICE_Restaurant.class, ItemIDs.minecartICE1_Restaurant.item, EnumTrainType.Passenger, 1.5,
                                        new String[]{"White", "Red"},
                                        10),
                                Traincraft.instance // don't touch this line
                        );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartGS4_Passenger.item,
                                new TrainRecord("Passenger GS4", EntityPassengerGS4.class, ItemIDs.minecartGS4_Passenger.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Orange", "White", "Yellow", "Brown", "Green", "Lime", "Red", "Grey", "Green", "LightGrey", "Blue", "Black", "LightBlue"},
                                        11),
                                Traincraft.instance // don't touch this line
                        );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartGS4_Observatory.item,
                                new TrainRecord("Passenger GS4 Observatory", EntityPassengerGS4_Observatory.class, ItemIDs.minecartGS4_Observatory.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"},
                                        11),
                                Traincraft.instance // don't touch this line
                        );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartGS4_Tail.item,
                                new TrainRecord("Passenger GS4 Tail", EntityPassengerGS4_Tail.class, ItemIDs.minecartGS4_Tail.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Orange", "White", "Yellow", "Brown", "Lime", "Red", "Grey", "Green", "LightGrey", "Black", "LightBlue"},
                                        11),
                                Traincraft.instance // don't touch this line
                        );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartDenverRioGrandePassenger.item,
                                new TrainRecord("Passenger Denver Rio Grande", EntityPassengerDenverRioGrande.class, ItemIDs.minecartDenverRioGrandePassenger.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Yellow", "Red", "Green"},
                                        10),
                                Traincraft.instance // don't touch this line
                        );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartDenverRioGrandeCombo.item,
                                new TrainRecord("Passenger Denver Rio Grande Combo", EntityPassengerDenverRioGrandeCombo.class, ItemIDs.minecartDenverRioGrandeCombo.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Yellow", "Red", "Green"},
                                        10),
                                Traincraft.instance // don't touch this line
                        );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerRheingold.item,
                                new TrainRecord("Passenger Rheingold", EntityPassengerRheingold.class, ItemIDs.minecartPassengerRheingold.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime", "Cyan"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerRheingoldDining1.item,
                                new TrainRecord("Rheingold Dining", EntityPassengerRheingoldDining1.class, ItemIDs.minecartPassengerRheingoldDining1.item, EnumTrainType.Passenger_Combine, 1.5,
                                        new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerRheingoldDining2.item,
                                new TrainRecord("Rheingold Dining Alternate", EntityPassengerRheingoldDining2.class, ItemIDs.minecartPassengerRheingoldDining2.item, EnumTrainType.Passenger_Combine, 1.5,
                                        new String[]{"Blue", "Red", "Green", "LightBlue", "Magenta", "Lime"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerRheingoldPanorama.item,
                                new TrainRecord("Rheingold Panorama", EntityPassengerRheingoldPanorama.class, ItemIDs.minecartPassengerRheingoldPanorama.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerMILW.item,
                                new TrainRecord("Passenger MILW", EntityPassengerMILW.class, ItemIDs.minecartPassengerMILW.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Black"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerMILWTail.item,
                                new TrainRecord("Passenger MILW Tail", EntityPassengerMILWTail.class, ItemIDs.minecartPassengerMILWTail.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Black"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerBamboo.item,
                                new TrainRecord("Bamboo Flatcar Passenger", EntityPassengerBamboo.class, ItemIDs.minecartPassengerBamboo.item, EnumTrainType.Passenger, 0.1,
                                        new String[] {"Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Brown", "Purple", "Orange", "Grey"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        /**
         * Caboose
         */
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartCaboose.item,
                                new TrainRecord("Caboose Red", EntityCaboose.class, ItemIDs.minecartCaboose.item, EnumTrainType.Caboose, 0.5,
                                        new String[] {"Red"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartCaboose3.item,
                                new TrainRecord("Caboose Black", EntityCaboose3.class, ItemIDs.minecartCaboose3.item, EnumTrainType.Caboose, 0.5,
                                        new String[] {"Black"},
                                        18),
                                Traincraft.instance // don't touch this line
                        );

        /**
         * Specials
         **/
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartGWRBrakeVan.item,
                                new TrainRecord("GWR Toad Brake Van", EntityGWRBrakeVan.class, ItemIDs.minecartGWRBrakeVan.item, "work", 0.7,
                                        new String[]{"Black"},
                                        18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartStockCar.item,
                                        new TrainRecord("Stock Cart", EntityStockCar.class, ItemIDs.minecartStockCar.item, "stock car", 2,
                                                new String[]{"Blue", "Red", "Yellow", "White"},
                                                18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartDRWGStockCar.item,
                                        new TrainRecord("DRWG Stock Cart", EntityStockCarDRWG.class, ItemIDs.minecartDRWGStockCar.item, "stock car", 2,
                                                new String[]{"Black"},
                                                18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartWork.item,
                                        new TrainRecord("Work Cart Yellow", EntityWorkCart.class, ItemIDs.minecartWork.item, "work", 0.7,
                                                new String[]{"Black"},
                                                18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFlatCart.item,
                                        new TrainRecord("Flat Cart", EntityFlatCart.class, ItemIDs.minecartFlatCart.item, EnumTrainType.Flatcars, 0.2,
                                                new String[]{"Black"},
                                                18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartCabooseWork.item,
                                        new TrainRecord("Work Caboose", EntityCabooseWorkCart.class, ItemIDs.minecartCabooseWork.item, "work", 0.6,
                                                new String[]{"Black"},
                                                18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartCabooseLogging.item,
                                        new TrainRecord("Caboose Logging", EntityCabooseLogging.class, ItemIDs.minecartCabooseLogging.item, "work", 0.2,
                                                new String[]{"Red", "Cyan", "Grey"},
                                                18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartCabooseLoggingPRR.item,
                                        new TrainRecord("PRR Caboose Logging", EntityCabooseLoggingPRR.class, ItemIDs.minecartCabooseLoggingPRR.item, "work", 0.2,
                                                new String[]{"Red", "Blue", "Green", "Orange"},
                                                18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartMailWagon_DB.item,
                                        new TrainRecord("Mail Wagon DB", EntityMailWagen_DB.class, ItemIDs.minecartMailWagon_DB.item, "work", 1,
                                                new String[]{"Black"},
                                                18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartJukeBoxCart.item,
                                        new TrainRecord("JukeBox Cart", EntityJukeBoxCart.class, ItemIDs.minecartJukeBoxCart.item, "special", 0.2,
                                                new String[]{"Black"},
                                                18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFlatCartSU.item,
                                        new TrainRecord("Flat Cart SU", EntityFlatCartSU.class, ItemIDs.minecartFlatCartSU.item, EnumTrainType.Flatcars, 0.2,
                                                new String[]{"Black"},
                                                18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFlatCartUS.item,
                                        new TrainRecord("Flat Cart US", EntityFlatCartUS.class, ItemIDs.minecartFlatCartUS.item, EnumTrainType.Flatcars, 0.4,
                                                new String[]{"Black"},
                                                18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartBuilder.item,
                                        new TrainRecord("Tracks Builder", EntityTracksBuilder.class, ItemIDs.minecartBuilder.item, "special", 0,
                                                new String[]{"Black"},
                                                14),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFlatCart_DB.item,
                                        new TrainRecord("Flat Cart DB", EntityFlatCar_DB.class, ItemIDs.minecartFlatCart_DB.item, "flat", 0.2,
                                                new String[]{"Red", "Green"},
                                                18),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartLocoDD35B.item,
                                        new TrainRecord("DD35 B Unit", EntityBUnitDD35.class, ItemIDs.minecartLocoDD35B.item, "b-unit", 8,
                                                new String[]{"Orange", "Black"},
                                                18).setTankCapacity(12000),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartPropagandaUs.item,
                                        new TrainRecord("Propaganda USA", EntityPropagandaUS.class, ItemIDs.minecartPropagandaUs.item, "decorative", 0.1,
                                                new String[]{"Blue", "White", "Red", "Green", "Orange", "Lime"},
                                                14),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartPropagandaUSSR.item,
                                        new TrainRecord("Propaganda USSR", EntityPropagandaUSSR.class, ItemIDs.minecartPropagandaUSSR.item, "decorative", 0.1,
                                                new String[]{"Blue", "White", "Red"},
                                                14),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartPropagandaJapan.item,
                                        new TrainRecord("Propaganda Japan", EntityPropagandaJapan.class, ItemIDs.minecartPropagandaJapan.item, "decorative", 0.1,
                                                new String[]{"Red", "White", "Yellow"},
                                                14),
                                        Traincraft.instance);
                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartPropagandaBritish.item,
                                        new TrainRecord("Propaganda Britain", EntityPropagandaBritain.class, ItemIDs.minecartPropagandaBritish.item, "decorative", 0.1,
                                                new String[]{"Blue", "White", "Yellow"},
                                                14),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFreightCart2.item,
                                        new TrainRecord("Freight Cart Red", EntityFreightCart2.class, ItemIDs.minecartFreightCart2.item, EnumTrainType.Boxcar, 3,
                                                new String[]{"Red", "White", "Orange"},
                                                18).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartChest.item,
                                        new TrainRecord("Freight Cart Yellow", EntityFreightCart.class, ItemIDs.minecartChest.item, EnumTrainType.Boxcar, 3,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(36),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartWood.item,
                                        new TrainRecord("Freight Flat Cart Log", EntityFreightWood.class, ItemIDs.minecartWood.item, "freight", 3,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(27).setAdditionalTooltip(new String[]{"Cargo: only Logs"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartGrain.item,
                                        new TrainRecord("Freight Hopper Green", EntityFreightGrain.class, ItemIDs.minecartGrain.item, "freight", 4,
                                                new String[]{"Green", "White"},
                                                18).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: wheat, seeds"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartKClassRailBox.item,
                                        new TrainRecord("Freight K Class Rail Box", EntityFreightKClassRailBox.class, ItemIDs.minecartKClassRailBox.item, "freight", 4,
                                                new String[]{"Yellow", "Orange"},
                                                18).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartShortCoveredHopper.item,
                                        new TrainRecord("Freight Short Covered Hopper", EntityFreightShortCoveredHopper.class, ItemIDs.minecartShortCoveredHopper.item, EnumTrainType.CoveredHopper, 4,
                                                new String[]{"Grey", "Orange", "LightBlue", "Lime", "Yellow", "Blue", "Cyan", "Skin16"},
                                                18).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartLongCoveredHopper.item,
                                        new TrainRecord("Freight Long Covered Hopper", EntityFreightLongCoveredHopper.class, ItemIDs.minecartLongCoveredHopper.item, "freight", 6,
                                                new String[]{"LightGrey", "Grey","Pink", "White", "Green", "Orange", "Lime", "Cyan"},
                                                18).setCargoCapacity(54).setAdditionalTooltip(new String[]{"Cargo: any"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartOpenWagon.item,
                                        new TrainRecord("Freight Open Wagon", EntityFreightOpenWagon.class, ItemIDs.minecartOpenWagon.item, "freight", 2,
                                                new String[]{"Red", "Brown", "Pink"},
                                                18).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: blocks, vanilla items"}),
                                        Traincraft.instance);//"train_hopper" for open wagon => weird

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFreightHopperUS.item,
                                        new TrainRecord("Freight Hopper US", EntityFreightHopperUS.class, ItemIDs.minecartFreightHopperUS.item, "freight", 4,
                                                new String[]{"Brown", "Grey", "LightGrey", "Blue", "Red", "Yellow", "Black", "LightBlue", "Purple", "Green", "Magenta", "Orange","Skin17"},
                                                18).setCargoCapacity(27).setAdditionalTooltip(new String[]{"Cargo: blocks"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFreight100TonHopper.item,
                                        new TrainRecord("Freight 100 Ton Hopper", EntityFreight100TonHopper.class, ItemIDs.minecartFreight100TonHopper.item, "freight", 4,
                                                new String[]{"Red", "Black", "Blue", "Grey", "LightGrey", "Brown"},
                                                18).setCargoCapacity(54).setAdditionalTooltip(new String[]{"Cargo: blocks"}),
                                        Traincraft.instance);


                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFlatCartWoodUS.item,
                                        new TrainRecord("Freight Flat Cart Wood US", EntityFlatCartWoodUS.class, ItemIDs.minecartFlatCartWoodUS.item, "freight", 3,
                                                new String[]{"Red", "White"},
                                                18).setCargoCapacity(27).setAdditionalTooltip(new String[]{"Cargo: wood stuff"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartBulkheadFlatCart.item,
                                        new TrainRecord("Freight Bulkhead Flat Cart", EntityBulkheadFlatCart.class, ItemIDs.minecartBulkheadFlatCart.item, "freight", 3,
                                                new String[]{"Brown", "Yellow", "Green"},
                                                18).setCargoCapacity(27).setAdditionalTooltip(new String[]{"Cargo: only planks"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFreightCartUS.item,
                                        new TrainRecord("Freight Cart US", EntityFreightCartUS.class, ItemIDs.minecartFreightCartUS.item, "freight", 3.5,
                                                new String[]{"Brown", "Yellow", "Black", "Blue", "Cyan", "Green", "Grey", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "White"},
                                        18).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: blocks, vanilla items"}),
                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartBoxCartUS.item,
                                        new TrainRecord("Freight Box Cart US", EntityBoxCartUS.class, ItemIDs.minecartBoxCartUS.item, "freight", 2,
                                                new String[]{"Brown", "Red", "Blue", "Black", "Yellow", "Magenta", "Cyan", "Pink", "LightGrey", "Green", "White", "LightBlue", "Lime", "Purple", "Orange", "Grey", "Skin16", "Skin17", "Skin18"},
                                        18).setCargoCapacity(45).setAdditionalTooltip(new String[]{"Cargo: any"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartBoxCartPRR.item,
                                        new TrainRecord("Freight Box Cart PRR", EntityBoxCartPRR.class, ItemIDs.minecartBoxCartPRR.item, "freight", 2,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(45).setAdditionalTooltip(new String[]{"Cargo: any"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFreightCartSmall.item,
                                        new TrainRecord("Freight Cart Small", EntityFreightCartSmall.class, ItemIDs.minecartFreightCartSmall.item, "freight", 1,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartMineTrain.item,
                                        new TrainRecord("Freight Minecart Yellow", EntityFreightMinetrain.class, ItemIDs.minecartMineTrain.item, "freight", 0.5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(18).setAdditionalTooltip(new String[]{"Cargo: opaque blocks"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFreightGTNG.item,
                                        new TrainRecord("Freight GTNG Ore Wagon", EntityFreightGTNG.class, ItemIDs.minecartFreightGTNG.item, "freight", 0.5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(18).setAdditionalTooltip(new String[]{"Cargo: opaque blocks"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFreightWood2.item,
                                        new TrainRecord("Freight Flat Logs", EntityFreightWood2.class, ItemIDs.minecartFreightWood2.item, "freight", 3,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(18).setAdditionalTooltip(new String[]{"Cargo: only logs"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFreightClosed.item,
                                        new TrainRecord("Freight Cart Closed RedBrown", EntityFreightClosed.class, ItemIDs.minecartFreightClosed.item, "freight", 2.5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFreightOpen2.item,
                                        new TrainRecord("Freight Open RedBrown", EntityFreightOpen2.class, ItemIDs.minecartFreightOpen2.item, "freight", 5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(21).setAdditionalTooltip(new String[]{"Cargo: any"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFreightWagon_DB.item,
                                        new TrainRecord("Freight Wagon DB", EntityFreightWagenDB.class, ItemIDs.minecartFreightWagon_DB.item, "freight", 4,
                                                new String[] {"Red", "Green", "Yellow", "Orange", "Pink"},
                                        18).setCargoCapacity(54).setAdditionalTooltip(new String[]{"Cargo: any"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFlatCartRail_DB.item,
                                        new TrainRecord("Freight Flat Cart Rails DB", EntityFlatCarRails_DB.class, ItemIDs.minecartFlatCartRail_DB.item, "freight", 5,
                                                new String[] {"Red", "Green", "Cyan", "Yellow"},
                                        18).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: only rails"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartASTFAutorack.item,
                                        new TrainRecord("Freight ASTF Autorack", EntityFreightASTFAutorack.class, ItemIDs.minecartASTFAutorack.item, "freight", 5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any | Stack limit 1"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartFlatCartLogs_DB.item,
                                        new TrainRecord("Freight Flat Cart Logs DB", EntityFlatCarLogs_DB.class, ItemIDs.minecartFlatCartLogs_DB.item, "freight", 4,
                                                new String[]{"Red", "Green", "Black", "Blue", "Brown", "Cyan", "LightBlue", "LightGrey", "Lime", "Magenta", "Orange", "Pink", "Purple", "White", "Yellow"},
                                                18).setCargoCapacity(45).setAdditionalTooltip(new String[]{"Cargo: only logs"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartSlateWagon.item,
                                        new TrainRecord("Freight Slate Wagon", EntityFreightSlateWagon.class, ItemIDs.minecartSlateWagon.item, "freight", 0.5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(38).setAdditionalTooltip(new String[]{"Cargo: only stone and ores"}),
                                        Traincraft.instance);

                Traincraft.traincraftRegistry
                        .RegisterRollingStockEntity
                                (ItemIDs.minecartIceWagon.item,
                                        new TrainRecord("Freight Ice Wagon", EntityFreightIceWagon.class, ItemIDs.minecartIceWagon.item, "freight", 0.5,
                                                new String[]{ "Black" },
                                                18).setCargoCapacity(38).setAdditionalTooltip(new String[]{"Cargo: only ice"}),
                                        Traincraft.instance);
    }

    private void RegisterBAPSteam()
    {
        
    }

    private void RegisterBAPDiesel()
    {

    }

    private void RegisterBAPElectric()
    {

    }

    private void RegisterBAPPassenger()
    {

    }

    private void RegisterBAPFreight()
    {

    }
}
