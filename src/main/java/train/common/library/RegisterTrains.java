package train.common.library;

import train.common.Traincraft;
import train.common.entity.rollingStock.passenger.EntityPassenger2;
import train.common.entity.rollingStock.passenger.EntityPassenger5;
import train.common.entity.rollingStock.passenger.EntityPassenger7;
import train.common.entity.rollingStock.passenger.EntityPassengerBlue;
import train.common.library.register.ITrainRecord;
import train.common.library.register.TrainRecord;

public class RegisterTrains
{
    public RegisterTrains()
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
    }
}
