package train.common.enums;

public enum TCTrackDirection
{
    SOUTH(0),
    WEST(1),
    NORTH(2),
    EAST(3),


    NORTHEAST(3),
    SouthEast(1),
    NORTHWEST(5),

    SOUTHWEST(7);

    public final byte Direction;

    /**Constructor for BoxName
     *
     * @param direction
     */
    TCTrackDirection(int direction)
    {
        Direction = ((byte)direction);
    }

    public static byte ConvertDiagonalDirectionInput(int direction)
    {
        switch (direction)
        {
            case 0:
                return 0;
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
                return 5;
            case 4:
                return 2;
            case 5:
                return 6;
            case 6:
                return 3;
            case 7:
                return 7;
        }
        return 0;
    }
}
