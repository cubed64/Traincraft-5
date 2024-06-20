package train.common.library;

public enum TypeOfRollingStock
{
    HERITAGE("HERITAGE"),
    STEAM("STEAM"),
    DIESEL("DIESEL"),
    ELECTRIC("ELETRIC"),
    PASSENGER("PASSENGER"),
    FREIGHT("FREIGHT"),
    BOOSE("BOOSE"),
    EMPTY("");

    public final String TypeOfRollingStock;

    TypeOfRollingStock(String typeOfRollingStock)
    {
        TypeOfRollingStock = typeOfRollingStock;
    }
};


