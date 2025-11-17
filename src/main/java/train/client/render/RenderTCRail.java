package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import train.client.render.models.blocks.*;
import train.client.render.models.blocks.BaseClass.ModelSlopeTCTrack;
import train.client.render.models.blocks.turn.degree45.ModelLeft45DegreeTurnTCTrack;
import train.client.render.models.blocks.turn.degree45.ModelRight45DegreeTurnTCTrack;
import train.client.render.models.blocks.turn.degree90.ModelLeftTurnTCTrack;
import train.client.render.models.blocks.turn.degree90.ModelRightTurnTCTrack;
import train.common.items.BallastTypes;
import train.common.library.EnumTracks;
import train.common.tile.TileTCRail;

public class RenderTCRail extends TileEntitySpecialRenderer {

	public static final ModelSmallStraightTCTrack modelSmallStraight = new ModelSmallStraightTCTrack();
	public static final ModelSmallStraightTCTrack modelRoadCrossing = new ModelSmallStraightTCTrack();
	public static final ModelMediumStraightTCTrack modelMediumStraight = new ModelMediumStraightTCTrack();

	public static final ModelSmallDiagonalStraightTCTrack modelSmallDiagonalStraight = new ModelSmallDiagonalStraightTCTrack();
	public static final ModelMediumDiagonalStraightTCTrack modelMediumDiagonalStraight = new ModelMediumDiagonalStraightTCTrack();

	public static final ModelRightTurnTCTrack modelRightTurn = new ModelRightTurnTCTrack();
	public static final ModelLeftTurnTCTrack modelLeftTurn = new ModelLeftTurnTCTrack();

	public static final ModelRight45DegreeTurnTCTrack model45DegreeRightTurn = new ModelRight45DegreeTurnTCTrack();
	public static final ModelLeft45DegreeTurnTCTrack model45DegreeLeftTurn = new ModelLeft45DegreeTurnTCTrack();

	public static final ModelRightSwitchTCTrack modelRightSwitchTurn = new ModelRightSwitchTCTrack();
	public static final ModelLeftSwitchTCTrack modelLeftSwitchTurn = new ModelLeftSwitchTCTrack();
	public static final ModelTwoWaysCrossingTCTrack modelTwoWaysCrossing = new ModelTwoWaysCrossingTCTrack();

	public static final ModelSlopeTCTrack model1X3Slope = new ModelSlopeTCTrack("track/slope/straight/1x3_rails.obj", "track/slope/straight/1x3_ballast.obj");
	public static final ModelSlopeTCTrack modelSlope = new ModelSlopeTCTrack("track/slope/straight/1x6_rails.obj", "track/slope/straight/1x6_supports.obj", "track/slope/straight/1x6_ballast.obj");
	public static final ModelSlopeTCTrack modelLargeSlope = new ModelSlopeTCTrack("track/slope/straight/1x12_rails.obj", "track/slope/straight/1x12_supports.obj", "track/slope/straight/1x12_ballast.obj");
	public static final ModelSlopeTCTrack modelVeryLargeSlope = new ModelSlopeTCTrack("track/slope/straight/1x18_rails.obj", "track/slope/straight/1x18_supports.obj", "track/slope/straight/1x18_ballast.obj");
	public static final ModelSlopeTCTrack model1x3DiagonalSlope = new ModelSlopeTCTrack("track/slope/45-deg/1x3_rails.obj","track/slope/45-deg/1x3_ballast.obj");
	public static final ModelSlopeTCTrack model1x6DiagonalSlope = new ModelSlopeTCTrack("track/slope/45-deg/1x6_rails.obj","track/slope/45-deg/1x6_ballast.obj");
	public static final ModelSlopeTCTrack model1x12DiagonalSlope = new ModelSlopeTCTrack("track/slope/45-deg/1x12_rails.obj","track/slope/45-deg/1x12_ballast.obj");
	public static final ModelSlopeTCTrack model1x18DiagonalSlope = new ModelSlopeTCTrack("track/slope/45-deg/1x18_rails.obj","track/slope/45-deg/1x18_ballast.obj");

	public static final ModelRightParallelCurveTCTrack modelRightParallelCurve = new ModelRightParallelCurveTCTrack();
	public static final ModelLeftParallelCurveTCTrack modelLeftParallelCurve = new ModelLeftParallelCurveTCTrack();

	public static final ModelRightDiamondCrossing modelRightDiamondCrossing = new ModelRightDiamondCrossing();
	public static final ModelLeftDiamondCrossing modelLeftDiamondCrossing = new ModelLeftDiamondCrossing();

	public RenderTCRail() {
		
	}

	@Override
	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float var8) {
		if(var1 instanceof TileTCRail){
			TileTCRail railTile = (TileTCRail) var1;
			
			if (railTile.hasModel && railTile.getTrackType() != null)
			{
				EnumTracks track = railTile.getTrackType();
				switch (track.getCoreTrack())
				{
					case CORE_SMALL_STRAIGHT:
						switch (track)
						{
							case SMALL_ROAD_CROSSING:{
								modelRoadCrossing.render("crossing", railTile, x, y, z);
								break;
							}
							case SMALL_ROAD_CROSSING_1:{
								modelRoadCrossing.render("crossing1", railTile, x, y, z);
								break;
							}
							case SMALL_ROAD_CROSSING_2:{
								modelRoadCrossing.render("crossing2", railTile, x, y, z);
								break;
							}
							case SMALL_ROAD_CROSSING_DYNAMIC:{
								modelRoadCrossing.render("dynamic", railTile, x, y, z);
								break;
							}
							default:
								modelSmallStraight.render("straight", railTile, x, y, z);
							break;
						}
					break;

					case CORE_MEDIUM_STRAIGHT:
					case CORE_LONG_STRAIGHT:
					case CORE_VERY_LONG_STRAIGHT:
						modelMediumStraight.render(railTile, x, y, z);
					break;

					case CORE_SMALL_DIAGONAL_STRAIGHT: {
						modelSmallDiagonalStraight.render("diagonal", railTile, x, y, z);
						break;
					}

					case CORE_MEDIUM_DIAGONAL_STRAIGHT:
					case CORE_LONG_DIAGONAL_STRAIGHT:
					case CORE_VERY_LONG_DIAGONAL_STRAIGHT:
						modelMediumDiagonalStraight.render(railTile, x, y, z);
					break;

					case CORE_1X_TURN_R:
					case CORE_3X_TURN_R:
					case CORE_5X_TURN_R:
					case CORE_10X_TURN_R:
					case CORE_16X_TURN_R:
					case CORE_29X_TURN_R:
					case CORE_32X_TURN_R:
						modelRightTurn.render("1x", railTile, x, y, z);
					break;

					case CORE_1X_TURN_L:
					case CORE_3X_TURN_L:
					case CORE_5X_TURN_L:
					case CORE_10X_TURN_L:
					case CORE_16X_TURN_L:
					case CORE_29X_TURN_L:
					case CORE_32X_TURN_L:
						modelLeftTurn.render("1x", railTile, x, y, z);
					break;

					case CORE_3_SLOPE:
                        if (BallastTypes.DYNAMIC.equals(track.getBallastType())) {
                            model1X3Slope.renderDynamic(railTile, x, y, z);
                        }
                        else
						{
                            model1X3Slope.render(railTile, x, y, z);
                        }
					break;
					case CORE_3_DIAGONAL_SLOPE:
						if (BallastTypes.DYNAMIC.equals(track.getBallastType())) {
							model1x3DiagonalSlope.renderDynamic(railTile, x, y, z);
						}
						else
						{
							model1x3DiagonalSlope.render(railTile, x, y, z);
						}
					break;
					case CORE_6_SLOPE:
						if (BallastTypes.DYNAMIC.equals(track.getBallastType())) {
							modelSlope.renderDynamic(railTile, x, y, z);
						}
						else
						{
							modelSlope.render(railTile, x, y, z);
						}
					break;
					case CORE_6_DIAGONAL_SLOPE:
						if (BallastTypes.DYNAMIC.equals(track.getBallastType())) {
							model1x6DiagonalSlope.renderDynamic(railTile, x, y, z);
						}
						else
						{
							model1x6DiagonalSlope.render(railTile, x, y, z);
						}
					break;
					case CORE_12_SLOPE:
						if (BallastTypes.DYNAMIC.equals(track.getBallastType())) {
							modelLargeSlope.renderDynamic(railTile, x, y, z);
						}
						else
						{
							modelLargeSlope.render(railTile, x, y, z);
						}
					break;
					case CORE_12_DIAGONAL_SLOPE:
						if (BallastTypes.DYNAMIC.equals(track.getBallastType())) {
							model1x12DiagonalSlope.renderDynamic(railTile, x, y, z);
						}
						else
						{
							model1x12DiagonalSlope.render(railTile, x, y, z);
						}
					break;
					case CORE_18_SLOPE:
						if (BallastTypes.DYNAMIC.equals(track.getBallastType())) {
							modelVeryLargeSlope.renderDynamic(railTile, x, y, z);
						}
						else
						{
							modelVeryLargeSlope.render(railTile, x, y, z);
						}
					break;
					case CORE_18_DIAGONAL_SLOPE:
						if (BallastTypes.DYNAMIC.equals(track.getBallastType())) {
							model1x18DiagonalSlope.renderDynamic(railTile, x, y, z);
						}
						else
						{
							model1x18DiagonalSlope.render(railTile, x, y, z);
						}
					break;
					case CORE_4x11_PARALLEL_SWITCH_R:
						modelRightSwitchTurn.render("medium_parallel", railTile, x, y, z);
					break;
					case CORE_4x11_PARALLEL_SWITCH_L:
						modelLeftSwitchTurn.render("medium_parallel", railTile, x, y, z);
					break;
					case CORE_4x17_PARALLEL_SWITCH_R:
						modelRightSwitchTurn.render("large_parallel", railTile, x, y, z);
					break;
					case CORE_4x17_PARALLEL_SWITCH_L:
						modelLeftSwitchTurn.render("large_parallel", railTile, x, y, z);
					break;

					case CORE_4x4_SWITCH_R:
						modelRightSwitchTurn.render("medium", railTile, x, y, z);
						break;
					case CORE_4x4_SWITCH_L:
						modelLeftSwitchTurn.render("medium", railTile, x, y, z);
						break;
					case CORE_6x6_SWITCH_R:
						modelRightSwitchTurn.render("large_90", railTile, x, y, z);
						break;
					case CORE_6x6_SWITCH_L:
						modelLeftSwitchTurn.render("large_90", railTile, x, y, z);
						break;

					case CORE_11x11_SWITCH_R:
					{
						modelRightSwitchTurn.render("very_large_90", railTile, x, y, z);
						break;
					}
					case CORE_11x11_SWITCH_L:
					{
						modelLeftSwitchTurn.render("very_large_90", railTile, x, y, z);
						break;
					}

					case CORE_S_CURVE_2x8_R:
						modelRightParallelCurve.render("small", railTile, x, y, z);
					break;
					case CORE_S_CURVE_2x8_L:
						modelLeftParallelCurve.render("small", railTile, x, y, z);
					break;
					case CORE_S_CURVE_3x12_R:
						modelRightParallelCurve.render("medium", railTile, x, y, z);
					break;
					case CORE_S_CURVE_3x12_L:
						modelLeftParallelCurve.render("medium", railTile, x, y, z);
					break;
					case CORE_S_CURVE_4x16_R:
						modelRightParallelCurve.render("large", railTile, x, y, z);
					break;
					case CORE_S_CURVE_4x16_L:
						modelLeftParallelCurve.render("large", railTile, x, y, z);
					break;
					case CORE_S_CURVE_20x2_R:
						modelRightParallelCurve.render("20x2", railTile, x, y, z);
					break;
					case CORE_S_CURVE_20x2_L:
						modelLeftParallelCurve.render("20x2", railTile, x, y, z);
					break;

					case CORE_3X4_45DEGREE_TURN_R:
					{
						model45DegreeRightTurn.render("medium",  railTile, x, y, z);
						break;
					}
					case CORE_3X4_45DEGREE_TURN_L: {
						model45DegreeLeftTurn.render("medium", railTile, x, y, z);
						break;
					}
					case CORE_3X6_45DEGREE_TURN_R: {
						model45DegreeRightTurn.render("large",  railTile, x, y, z);
						break;
					}
					case CORE_3X6_45DEGREE_TURN_L: {
						model45DegreeLeftTurn.render("large", railTile, x, y, z);
						break;
					}
					case CORE_4X8_45DEGREE_TURN_R:
					{
						model45DegreeRightTurn.render("verylarge",  railTile, x, y, z);
						break;
					}
					case CORE_4X8_45DEGREE_TURN_L: {
						model45DegreeLeftTurn.render("verylarge", railTile, x, y, z);
						break;
					}
					case CORE_5X11_45DEGREE_TURN_R: {
						model45DegreeRightTurn.render("superlarge",  railTile, x, y, z);
						break;
					}
					case CORE_5X11_45DEGREE_TURN_L: {
						model45DegreeLeftTurn.render("superlarge", railTile, x, y, z);
						break;
					}

					default:
					{
						switch (track)
						{
							case TWO_WAYS_CROSSING:
							case EMBEDDED_TWO_WAYS_CROSSING:
							{
								modelTwoWaysCrossing.render("twoways_crossing", railTile, x, y, z);
								break;
							}
							case FOUR_WAYS_CROSSING:
							case EMBEDDED_FOUR_WAYS_CROSSING:
							{
								modelTwoWaysCrossing.render("universal_crossing", railTile, x, y, z);
								break;
							}
							case DIAMOND_CROSSING:
							case RIGHT_DIAMOND_CROSSING:
							case EMBEDDED_DIAMOND_CROSSING:
							case EMBEDDED_RIGHT_DIAMOND_CROSSING:
							{
								modelRightDiamondCrossing.render(railTile, x, y, z);
								break;
							}
							case LEFT_DIAMOND_CROSSING:
							case EMBEDDED_LEFT_DIAMOND_CROSSING:
							{
								modelLeftDiamondCrossing.render(railTile, x, y, z);
								break;
							}
							case DOUBLE_DIAMOND_CROSSING:
							case EMBEDDED_DOUBLE_DIAMOND_CROSSING:
							{
								modelTwoWaysCrossing.render("diamond", railTile, x, y, z);
								break;
							}
							case DIAGONAL_TWO_WAYS_CROSSING:
							case EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING:
							{
								modelTwoWaysCrossing.render("diagonal_crossing", railTile, x, y, z);
								break;
							}

							case EMBEDDED_CROSSOVER_SWITCH_10X2_LEFT:
							case CROSSOVER_SWITCH_10X2_LEFT: {
								modelLeftSwitchTurn.render("crossover_10x2", railTile, x, y, z);
								break;
							}
							case EMBEDDED_CROSSOVER_SWITCH_10X2:
							case EMBEDDED_CROSSOVER_SWITCH_10X2_RIGHT:
							case CROSSOVER_SWITCH_10X2:
							case CROSSOVER_SWITCH_10X2_RIGHT: {
								modelRightSwitchTurn.render("crossover_10x2", railTile, x, y, z);
								break;
							}

							// Embedded Tracks

							case DIAGONAL_TURN_9X20:
							case DIAGONAL_RIGHT_TURN_9X20:
							case EMBEDDED_DIAGONAL_TURN_9X20:
							case EMBEDDED_DIAGONAL_RIGHT_TURN_9X20: {
								model45DegreeRightTurn.render("9x20",railTile,x,y,z);
								break;
							}
							case DIAGONAL_LEFT_TURN_9X20:
							case EMBEDDED_DIAGONAL_LEFT_TURN_9X20: {
								model45DegreeLeftTurn.render("9x20",railTile,x,y,z);
								break;
							}
							case DIAGONAL_TURN_10X22:
							case DIAGONAL_RIGHT_TURN_10X22:
							case EMBEDDED_DIAGONAL_TURN_10X22:
							case EMBEDDED_DIAGONAL_RIGHT_TURN_10X22:
							{
								model45DegreeRightTurn.render("10x22",railTile,x,y,z);
								break;
							}
							case DIAGONAL_LEFT_TURN_10X22:
							case EMBEDDED_DIAGONAL_LEFT_TURN_10X22: {
								model45DegreeLeftTurn.render("10x22",railTile,x,y,z);
								break;
							}
							case MEDIUM_RIGHT_45DEGREE_SWITCH:
							case EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH: {
								modelRightSwitchTurn.render("medium_45degree",  railTile, x, y, z);
								break;
							}
							case MEDIUM_LEFT_45DEGREE_SWITCH:
							case EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH: {
								modelLeftSwitchTurn.render("medium_45degree",  railTile, x, y, z);
								break;
							}
							case LARGE_RIGHT_45DEGREE_SWITCH:
							case EMBEDDED_LARGE_RIGHT_45DEGREE_SWITCH: {
								modelRightSwitchTurn.render("large_45degree",  railTile, x, y, z);
								break;
							}
							case LARGE_LEFT_45DEGREE_SWITCH:
							case EMBEDDED_LARGE_LEFT_45DEGREE_SWITCH: {
								modelLeftSwitchTurn.render("large_45degree",  railTile, x, y, z);
								break;
							}

							//case EMBEDDED_LARGE_CURVED_SLOPE_DYNAMIC:
							//case EMBEDDED_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC: {
							//	modelRightCurvedSlope.render("embedded_large", railTile, x, y, z);
							//	break;
							//}
							//case EMBEDDED_LARGE_LEFT_CURVED_SLOPE_DYNAMIC: {
							//	modelLeftCurvedSlope.render("embedded_large", railTile, x, y, z);
							//	break;
							//}
							//case EMBEDDED_VERY_LARGE_CURVED_SLOPE_DYNAMIC:
							//case EMBEDDED_VERY_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC: {
							//	modelRightCurvedSlope.render("embedded_verylarge", railTile, x, y, z);
							//	break;
							//}
							//case EMBEDDED_VERY_LARGE_LEFT_CURVED_SLOPE_DYNAMIC: {
							//	modelLeftCurvedSlope.render("embedded_verylarge", railTile, x, y, z);
							//	break;
							//}
							//case EMBEDDED_SUPER_LARGE_CURVED_SLOPE_DYNAMIC:
							//case EMBEDDED_SUPER_LARGE_RIGHT_CURVED_SLOPE_DYNAMIC: {
							//	modelRightCurvedSlope.render("embedded_superlarge", railTile, x, y, z);
							//	break;
							//}
							//case EMBEDDED_SUPER_LARGE_LEFT_CURVED_SLOPE_DYNAMIC: {
							//	modelLeftCurvedSlope.render("embedded_superlarge", railTile, x, y, z);
							//	break;
							//}
						}
					}
				}


			}
		}
	}
}
