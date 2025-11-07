package train.client.render.register;

import train.client.render.models.*;
import train.common.Traincraft;
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

        }};
    }
}
