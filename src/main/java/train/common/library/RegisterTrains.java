package train.common.library;

import train.common.Traincraft;
import train.common.entity.rollingStock.electric.*;
import train.common.entity.rollingStock.passenger.*;
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
