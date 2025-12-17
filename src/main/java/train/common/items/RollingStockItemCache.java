package train.common.items;

import train.common.api.AbstractTrains;
import train.common.library.register.ITrainRecord;

import java.util.Map;

public class RollingStockItemCache
{
    public RollingStockItemCache(ITrainRecord trainRecord, AbstractTrains train)
    {
        HasPublicSkins = trainRecord.getColors() == null || train.lockoutMap.isEmpty() || train.lockoutMap.size() != trainRecord.getColors().length;
        TransportYear = train.transportYear();
        TransportCountry = train.transportCountry();
        IsFictional = train.isFictional();
        textureDescriptionMap = train.getTextureDescriptionMap();
    }

    public final Map<Integer, String> textureDescriptionMap;

    public final boolean HasPublicSkins;

    public final String TransportYear;
    public final String TransportCountry;
    public final boolean IsFictional;
}
