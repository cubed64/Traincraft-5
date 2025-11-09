package train.client.render.register;

import train.client.render.models.*;
import train.common.Traincraft;
import train.common.entity.rollingStock.electric.EntityLocoElectricTramNY;
import train.common.entity.rollingStock.passenger.*;
import train.common.library.EnumTrainType;
import train.common.library.Info;

import java.util.ArrayList;
import java.util.List;

public final class RenderRegisterList
{
    public RenderRegisterList()
    {

    }

    public final List<ITrainRenderRecord> SetupRollingStockModels()
    {
        final String modID = Info.modID;
        return new ArrayList<ITrainRenderRecord>()
        {{
            add(new TrainRenderRecord(modID,
                    EntityPassengerBlue.class, new ModelPassenger6(),
                    "passenger",
                    new float[] { 0.0F, -0.47F, 0.0F },
                    null,
                    null));
            add(new TrainRenderRecord(modID,
                    EntityPassenger2.class, new ModelPassenger2(),
                    "passenger3_",
                    new float[] { 0.0F, -0.32F, -0.1F },
                    null,
                    null));
            add(new TrainRenderRecord(modID,
                    EntityPassenger5.class, new ModelPassenger5(),
                    "passenger5_",
                    new float[] { 0.0F, -0.40F, 0.0F },
                    null,
                    null));
            add(new TrainRenderRecord(modID,
                    EntityPassenger7.class, new ModelPassenger7(),
                    "passenger7_",
                    new float[] { 0.0F, -0.44F, 0.0F },
                    new float[] { 0F, 90F, 0F },
                    null));

            add(new TrainRenderRecord(modID,
                    EntityPassenger_1class_DB.class, new ModelPassenger_1class_DB(),
                    "passenger_1class_DB_",
                    new float[] { 0.0F, -0.44F, 0.0F },
                    null,
                    null));
            add(new TrainRenderRecord(modID,
                    EntityPassenger_2class_DB.class, new ModelPassenger_2class_DB(),
                    "passenger_2class_DB_",
                    new float[] { 0.0F, -0.44F, 0.0F },
                    null,
                    null));
            add(new TrainRenderRecord(modID,
                    EntityPassengerHighSpeedCarZeroED.class, new ModelPassengerHighSpeedCarZeroED(),
                    "passengerHighSpeedCarZeroED_",
                    new float[] { 0.0F, -0.47F, 0.0F },
                    null,
                    null));
            add(new TrainRenderRecord(modID,
                    EntityLocoElectricTramNY.class, new ModelTramNY(),
                    "locoTramNY_",
                    new float[] { -1.5F, -0.44F, 0.0F },
                    null,
                    null));
            add(new TrainRenderRecord(modID,
                    EntityPassengerTramNY.class, new ModelTramNY(),
                    "locoTramNY_",
                    new float[] { 0F, -0.44F, 0.0F },
                    null,
                    null));
            add(new TrainRenderRecord(modID,
                    EntityPassengerAdler.class, new ModelPassengerAdler(),
                    "passengerAdler_",
                    new float[] { 0F, 1.04F, 0.0F },
                    new float[] { 180F, -90F, 0F },
                    null));


        }};
    }
}
