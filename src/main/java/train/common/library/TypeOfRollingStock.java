package train.common.library;

public enum TypeOfRollingStock
{
    STEAM("STEAM"),
    DIESEL("DIESEL"),
    ELECTRIC("ELETRIC"),
    PASSENGER("PASSENGER"),
    FREIGHT("FREIGHT"),
    EMPTY("");

    public final String TypeOfRollingStock;

    TypeOfRollingStock(String typeOfRollingStock)
    {
        TypeOfRollingStock = typeOfRollingStock;
    }
};


