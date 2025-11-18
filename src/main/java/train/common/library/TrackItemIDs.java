package train.common.library;

import net.minecraft.item.Item;

public enum TrackItemIDs
{
    /** Normal Tracks **/
    //straights
    tcRailSmallStraight("ItemTCRail", "track_straight_1", 5),
    tcRailMediumStraight("ItemTCRail", "track_straight_3", 5),
    tcRailLongStraight("ItemTCRail", "track_straight_6", 5),
    tcRailVeryLongStraight("ItemTCRail", "track_straight_12", 5),

    //turns
    tcRail1X1Turn("ItemTCRail", "track_turn_1", 5),
    tcRailMediumTurn("ItemTCRail", "track_turn_3", 5),
    tcRailLargeTurn("ItemTCRail", "track_turn_5", 5),
    tcRailVeryLargeTurn("ItemTCRail", "track_turn_10", 5),
    tcRailSuperLargeTurn("ItemTCRail", "track_turn_16", 5),
    tcRail29X29Turn("ItemTCRail", "track_turn_29", 5),
    tcRail32X32Turn("ItemTCRail", "track_turn_32", 5),

    //45 degree turns
    tcRailMedium45DegreeTurn("ItemTCRail", "track_45degree_turn_3x4", 5),
    tcRailLarge45DegreeTurn("ItemTCRail", "track_45degree_turn_3x6", 5),
    tcRailVeryLarge45DegreeTurn("ItemTCRail", "track_45degree_turn_4x8", 5),
    tcRailSuperLarge45DegreeTurn("ItemTCRail", "track_45degree_turn_5x11", 5),
    tcRail45DegreeTurn9x20("ItemTCRail", "track_45degree_turn_9x20", 5),
    tcRail45DegreeTurn10x22("ItemTCRail", "track_45degree_turn_10x22", 5),

    //parallel curves / s curves
    tcRailSmallParallelCurve("ItemTCRail", "track_s-curve_2x8", 3),
    tcRailMediumParallelCurve("ItemTCRail", "track_s-curve_3x12", 3),
    tcRailLargeParallelCurve("ItemTCRail", "track_s-curve_4x16", 3),
    tcRail20x2SCurve("ItemTCRail", "track_s-curve_2x20", 3),

    //switches
    tcRailMediumSwitch("ItemTCRail", "track_switch_4x4", 5),
    tcRailLargeSwitch("ItemTCRail", "track_switch_6x6", 5),
    tcRailVeryLargeSwitch("ItemTCRail", "track_switch_11x11", 5),

    tcRailMediumParallelSwitch("ItemTCRail", "track_switch_p_4x11", 5),
    tcRailLargeParallelSwitch("ItemTCRail", "track_switch_p_4x17", 5),

    tcRailMedium45DegreeSwitch("ItemTCRail","track_switch_45degree_3x5", 5),
    tcRailLarge45DegreeSwitch("ItemTCRail", "track_switch_45degree_4x8", 5),

    tcRailCrossoverSwitch10x2("ItemTCRail", "track_switch_crossover_10x2", 5),

    //diamonds
    tcRailTwoWaysCrossing("ItemTCRail","track_plus_crossing",5),
    tcRailDiamondCrossing("ItemTCRail", "track_x_crossing", 5),
    tcRailDoubleDiamondCrossing("ItemTCRail", "track_double_x_crossing", 5),
    tcRailFourWaysCrossing("ItemTCRail", "track_xplus_crossing", 5),

    //1x3 slope
    tcRail1X3SlopeDynamic("ItemTCRail", "item_rail_straight_slope_dynamic", 3),

    //1x6 slopes
    tcRailSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 3),
    tcRailSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 3),
    tcRailSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 3),
    tcRailSlopeSnowGravel("ItemTCRail", "item_rail_straight_slope_snow_gravel", 3),
    tcRailSlopePeaGravel("ItemTCRail", "item_rail_straight_slope_pea_gravel", 3),
    tcRailSlopeDynamic("ItemTCRail", "item_rail_straight_slope_dynamic", 3),

    //1x12 slopes
    tcRailLargeSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 3),
    tcRailLargeSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 3),
    tcRailLargeSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 3),
    tcRailLargeSlopeSnowGravel("ItemTCRail", "item_rail_straight_slope_snow_gravel", 3),
    tcRailLargeSlopePeaGravel("ItemTCRail", "item_rail_straight_slope_pea_gravel", 3),
    tcRailLargeSlopeDynamic("ItemTCRail", "item_rail_straight_slope_dynamic", 3),

    //1x18 slopes
    tcRailVeryLargeSlopeWood("ItemTCRail", "item_rail_straight_slope_wood", 3),
    tcRailVeryLargeSlopeGravel("ItemTCRail", "item_rail_straight_slope_gravel", 3),
    tcRailVeryLargeSlopeBallast("ItemTCRail", "item_rail_straight_slope_ballast", 3),
    tcRailVeryLargeSlopeSnowGravel("ItemTCRail", "item_rail_straight_slope_snow_gravel", 3),
    tcRailVeryLargeSlopePeaGravel("ItemTCRail", "item_rail_straight_slope_pea_gravel", 3),
    tcRailVeryLargeSlopeDynamic("ItemTCRail", "item_rail_straight_slope_dynamic", 3),


    /** Sleeperless Tracks **/
    //straights
    tcRailEmbeddedSmallStraight("ItemTCRail", "track_straight_1_e", 5),
    tcRailEmbeddedMediumStraight("ItemTCRail", "track_straight_3_e", 5),
    tcRailEmbeddedLongStraight("ItemTCRail", "track_straight_6_e", 5),
    tcRailEmbeddedVeryLongStraight("ItemTCRail", "track_straight_12_e", 5),

    //turns
    tcRailEmbedded1X1Turn("ItemTCRail", "track_turn_1_e", 5),
    tcRailEmbeddedMediumTurn("ItemTCRail", "track_turn_3_e", 5),
    tcRailEmbeddedLargeTurn("ItemTCRail", "track_turn_5_e", 5),
    tcRailEmbeddedVeryLargeTurn("ItemTCRail", "track_turn_10_e", 5),
    tcRailEmbeddedSuperLargeTurn("ItemTCRail", "track_turn_16_e", 5),
    tcRailEmbedded29X29Turn("ItemTCRail", "track_turn_29_e", 5),
    tcRailEmbedded32X32Turn("ItemTCRail", "track_turn_32_e", 5),

    //45 degree turns
    tcRailEmbeddedMedium45DegreeTurn("ItemTCRail", "track_45degree_turn_3x4_e", 5),
    tcRailEmbeddedLarge45DegreeTurn("ItemTCRail", "track_45degree_turn_3x6_e", 5),
    tcRailEmbeddedVeryLarge45DegreeTurn("ItemTCRail", "track_45degree_turn_4x8_e", 5),
    tcRailEmbeddedSuperLarge45DegreeTurn("ItemTCRail", "track_45degree_turn_5x11_e", 5),
    tcRailEmbedded45DegreeTurn9x20("ItemTCRail", "track_45degree_turn_9x20_e", 5),
    tcRailEmbedded45DegreeTurn10x22("ItemTCRail", "track_45degree_turn_10x22_e", 5),

    //parallel curves / s curves
    tcRailEmbeddedSmallParallelCurve("ItemTCRail", "track_s-curve_2x8_e", 3),
    tcRailEmbeddedMediumParallelCurve("ItemTCRail", "track_s-curve_3x12_e", 3),
    tcRailEmbeddedLargeParallelCurve("ItemTCRail", "track_s-curve_4x16_e", 3),
    tcRailEmbedded20x2SCurve("ItemTCRail", "track_s-curve_2x20_e", 3),

    //switches
    tcRailEmbeddedMediumSwitch("ItemtcRailEmbedded", "track_switch_4x4_e", 5),
    tcRailEmbeddedLargeSwitch("ItemtcRailEmbedded", "track_switch_6x6_e", 5),
    tcRailEmbeddedVeryLargeSwitch("ItemtcRailEmbedded", "track_switch_11x11_e", 5),

    tcRailEmbeddedMediumParallelSwitch("ItemtcRailEmbedded", "track_switch_p_4x11_e", 5),
    tcRailEmbeddedLargeParallelSwitch("ItemtcRailEmbedded", "track_switch_p_4x17_e", 5),

    tcRailEmbeddedMedium45DegreeSwitch("ItemtcRailEmbedded","track_switch_45degree_3x5_e", 5),
    tcRailEmbeddedLarge45DegreeSwitch("ItemtcRailEmbedded", "track_switch_45degree_4x8_e", 5),
    tcRailEmbeddedCrossoverSwitch10x2("ItemTCRail", "track_switch_crossover_10x2_e", 5),

    //diamonds
    tcRailEmbeddedTwoWaysCrossing("ItemtcRailEmbedded","track_plus_crossing_e",5),
    tcRailEmbeddedDiamondCrossing("ItemtcRailEmbedded", "track_x_crossing_e",5),
    tcRailEmbeddedDoubleDiamondCrossing("ItemtcRailEmbedded", "track_double_x_crossing_e",5),
    tcRailEmbeddedFourWaysCrossing("ItemtcRailEmbedded", "track_xplus_crossing_e",5),

    //slopes
    tcRailEmbedded1x3SlopeDynamic("ItemTCRail", "item_rail_embedded_slope_dynamic", 5),
    tcRailEmbeddedSlopeDynamic("ItemTCRail", "item_rail_embedded_slope_dynamic", 5),
    tcRailEmbeddedLargeSlopeDynamic("ItemTCRail", "item_rail_embedded_slope_dynamic", 5),
    tcRailEmbeddedVeryLargeSlopeDynamic("ItemTCRail", "item_rail_embedded_slope_dynamic", 5),

    //road crossings
    tcRailSmallRoadCrossing("ItemTCRail", "item_rail_small_road_crossing", 5),
    tcRailSmallRoadCrossing1("ItemTCRail", "item_rail_small_road_crossing_1", 5),
    tcRailSmallRoadCrossing2("ItemTCRail", "item_rail_small_road_crossing_2", 5),
    tcRailSmallRoadCrossingDynamic("ItemTCRail", "item_rail_small_road_crossing_dynamic", 5);

    public Item item;
    public String className;
    public String iconName;

    /**
     * amount for one emerald. For ItemRollingStock, it is the price for one train
     */
    public int amountForEmerald;

    /**
     * @param classMethodName
     * @param iconName
     * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
     */
    TrackItemIDs(String classMethodName, String iconName, int amountForEmerald) {
        this.className = classMethodName;
        this.iconName = iconName;
        this.amountForEmerald = amountForEmerald;
    }
}
