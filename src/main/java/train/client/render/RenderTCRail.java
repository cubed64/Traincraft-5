package train.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import train.client.render.models.blocks.*;
import train.common.tile.TileTCRail;

public class RenderTCRail extends TileEntitySpecialRenderer {

	public static final ModelSmallStraightTCTrack modelSmallStraight = new ModelSmallStraightTCTrack();
	public static final ModelSmallStraightTCTrack modelRoadCrossing = new ModelSmallStraightTCTrack();
	public static final ModelMediumStraightTCTrack modelMediumStraight = new ModelMediumStraightTCTrack();
	public static final ModelRightTurnTCTrack modelRightTurn = new ModelRightTurnTCTrack();
	public static final ModelLeftTurnTCTrack modelLeftTurn = new ModelLeftTurnTCTrack();
	public static final ModelRightSwitchTCTrack modelRightSwitchTurn = new ModelRightSwitchTCTrack();
	public static final ModelLeftSwitchTCTrack modelLeftSwitchTurn = new ModelLeftSwitchTCTrack();
	public static final ModelTwoWaysCrossingTCTrack modelTwoWaysCrossing = new ModelTwoWaysCrossingTCTrack();
	public static final ModelSlopeTCTrack modelSlope = new ModelSlopeTCTrack();
	public static final ModelLargeSlopeTCTrack modelLargeSlope = new ModelLargeSlopeTCTrack();
	public static final ModelVeryLargeSlopeTCTrack	modelVeryLargeSlope = new ModelVeryLargeSlopeTCTrack();
	public static final ModelRightParallelCurveTCTrack modelRightParallelCurve = new ModelRightParallelCurveTCTrack();
	public static final ModelLeftParallelCurveTCTrack modelLeftParallelCurve = new ModelLeftParallelCurveTCTrack();

	public RenderTCRail() {
		
	}

	@Override
	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float var8) {
		if(var1 instanceof TileTCRail){
			TileTCRail railTile = (TileTCRail) var1;
			
			if (railTile.hasModel && railTile.getTrackType() != null)
			{
				switch (railTile.getTrackType())
				{
					case MEDIUM_TURN:
					case MEDIUM_RIGHT_TURN: {
						modelRightTurn.render("medium", railTile, x, y, z);
						break;
					}
					case MEDIUM_LEFT_TURN: {
						modelLeftTurn.render("medium", railTile, x, y, z);
						break;
					}
					case MEDIUM_SWITCH:
					case MEDIUM_RIGHT_SWITCH: {
						modelRightSwitchTurn.render("medium", railTile, x, y, z);
						break;
					}
					case MEDIUM_LEFT_SWITCH: {
						modelLeftSwitchTurn.render("medium", railTile, x, y, z);
						break;
					}
					case LARGE_SWITCH:
					case LARGE_RIGHT_SWITCH: {
						modelRightSwitchTurn.render("large_90", railTile, x, y, z);
						break;
					}
					case LARGE_LEFT_SWITCH: {
						modelLeftSwitchTurn.render("large_90", railTile, x, y, z);
						break;
					}
					case MEDIUM_PARALLEL_SWITCH:
					case MEDIUM_RIGHT_PARALLEL_SWITCH: {
						modelRightSwitchTurn.render("medium_parallel", railTile, x, y, z);
						break;
					}
					case MEDIUM_LEFT_PARALLEL_SWITCH: {
						modelLeftSwitchTurn.render("medium_parallel", railTile, x, y, z);
						break;
					}
					case LARGE_TURN:
					case LARGE_RIGHT_TURN: {
						modelRightTurn.render("large", railTile, x, y, z);
						break;
					}
					case LARGE_LEFT_TURN: {
						modelLeftTurn.render("large", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_TURN:
					case VERY_LARGE_RIGHT_TURN: {
						modelRightTurn.render("very_large", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_LEFT_TURN: {
						modelLeftTurn.render("very_large", railTile, x, y, z);
						break;
					}
					case SMALL_STRAIGHT:{
						modelSmallStraight.render("straight", railTile, x, y, z);
						break;
					}
					case MEDIUM_STRAIGHT:
					case LONG_STRAIGHT:
					case VERY_LONG_STRAIGHT:
                    case EMBEDDED_MEDIUM_STRAIGHT:
                    case EMBEDDED_LONG_STRAIGHT:
                    case EMBEDDED_VERY_LONG_STRAIGHT:
                    {
						modelMediumStraight.render(railTile, x, y, z);
						break;
					}

					case TWO_WAYS_CROSSING:
					case EMBEDDED_TWO_WAYS_CROSSING:
					{
						modelTwoWaysCrossing.render(railTile.getTrackType().getVariant(), x, y, z);
						break;
					}
					case SMALL_PARALLEL_CURVE:
					case SMALL_RIGHT_PARALLEL_CURVE:
					case EMBEDDED_SMALL_PARALLEL_CURVE:
					case EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE:
					{
						modelRightParallelCurve.render("small", railTile, x, y, z);
						break;
					}
					case SMALL_LEFT_PARALLEL_CURVE:
					case EMBEDDED_SMALL_LEFT_PARALLEL_CURVE:
					{
						modelLeftParallelCurve.render("small", railTile, x, y, z);
						break;
					}

					case MEDIUM_PARALLEL_CURVE:
					case MEDIUM_RIGHT_PARALLEL_CURVE:
					case EMBEDDED_MEDIUM_PARALLEL_CURVE:
					case EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE:
					{
						modelRightParallelCurve.render("medium", railTile, x, y, z);
						break;
					}
					case MEDIUM_LEFT_PARALLEL_CURVE:
					case EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE:
					{
						modelLeftParallelCurve.render("medium", railTile, x, y, z);
						break;
					}
					case LARGE_PARALLEL_CURVE:
					case LARGE_RIGHT_PARALLEL_CURVE:
					case EMBEDDED_LARGE_PARALLEL_CURVE:
					case EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE:
					{
						modelRightParallelCurve.render("large", railTile, x, y, z);
						break;
					}
					case LARGE_LEFT_PARALLEL_CURVE:
					case EMBEDDED_LARGE_LEFT_PARALLEL_CURVE:
					{
						modelLeftParallelCurve.render("large", railTile, x, y, z);
						break;
					}
					case SLOPE_WOOD: {
						modelSlope.render("wood", railTile, x, y, z);
						break;
					}
					case SLOPE_GRAVEL: {
						modelSlope.render("gravel", railTile, x, y, z);
						break;
					}
					case SLOPE_BALLAST: {
						modelSlope.render("ballast", railTile, x, y, z);
						break;
					}
					case SLOPE_SNOW_GRAVEL: {
						modelSlope.render("snow", railTile, x, y, z);
						break;
					}
					case SLOPE_DYNAMIC: {
						modelSlope.render("dynamic", railTile, x, y, z);
						break;
					}
					case EMBEDDED_SLOPE_DYNAMIC: {
						modelSlope.render("embedded_dynamic", railTile, x, y, z);
						break;
					}
					case LARGE_SLOPE_WOOD: {
						modelLargeSlope.render("wood", railTile, x, y, z);
						break;
					}
					case LARGE_SLOPE_GRAVEL: {
						modelLargeSlope.render("gravel", railTile, x, y, z);
						break;
					}
					case LARGE_SLOPE_BALLAST: {
						modelLargeSlope.render("ballast", railTile, x, y, z);
						break;
					}
					case LARGE_SLOPE_SNOW_GRAVEL: {
						modelLargeSlope.render("snow", railTile, x, y, z);
						break;
					}
					case LARGE_SLOPE_DYNAMIC: {
						modelLargeSlope.render("dynamic", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_SLOPE_DYNAMIC: {
						modelLargeSlope.render("embedded_dynamic", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_SLOPE_WOOD: {
						modelVeryLargeSlope.render("wood", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_SLOPE_GRAVEL: {
						modelVeryLargeSlope.render("gravel", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_SLOPE_BALLAST: {
						modelVeryLargeSlope.render("ballast", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_SLOPE_SNOW_GRAVEL: {
						modelVeryLargeSlope.render("snow", railTile, x, y, z);
						break;
					}
					case SUPER_LARGE_RIGHT_TURN: {
						modelRightTurn.render("super_large", railTile, x , y, z);
						break;
					}
					case SUPER_LARGE_LEFT_TURN: {
						modelLeftTurn.render("super_large", railTile, x , y,z);
						break;
					}
					case SLOPE_PEA_GRAVEL: {
						modelSlope.render("peagravel", railTile, x, y, z);
						break;
					}
					case LARGE_SLOPE_PEA_GRAVEL: {
						modelLargeSlope.render("peagravel", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_SLOPE_PEA_GRAVEL: {
						modelVeryLargeSlope.render("peagravel", railTile, x, y, z);
						break;
					}
					case VERY_LARGE_SLOPE_DYNAMIC: {
						modelVeryLargeSlope.render("dynamic", railTile, x, y, z);
						break;
					}
					case EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC: {
						modelVeryLargeSlope.render("embedded_dynamic", railTile, x, y, z);
						break;
					}

					// Embedded Tracks
					case EMBEDDED_SMALL_STRAIGHT: {
						modelSmallStraight.render("embedded", railTile, x, y, z);
						break;
					}
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
					//case SMALL_ROAD_CROSSING_DYNAMIC:{
					//	modelRoadCrossing.render("dynamic", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_SMALL_DIAGONAL_STRAIGHT: {
					//	modelSmallDiagonalStraight.render("embedded_diagonal", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT:
					//case EMBEDDED_LONG_DIAGONAL_STRAIGHT:
					//case EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT: {
					//	modelMediumDiagonalStraight.render("embedded_diagonal", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_TURN_1X1:
					//case EMBEDDED_RIGHT_TURN_1X1: {
					//	modelRightTurn.render("embedded_1x", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_LEFT_TURN_1X1: {
					//	modelLeftTurn.render("embedded_1x", railTile, x, y, z);
					//	break;
					//}

					case EMBEDDED_MEDIUM_TURN:
					case EMBEDDED_MEDIUM_RIGHT_TURN: {
						modelRightTurn.render("embedded_medium", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_LEFT_TURN: {
						modelLeftTurn.render("embedded_medium", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_TURN:
					case EMBEDDED_LARGE_RIGHT_TURN: {
						modelRightTurn.render("embedded_large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_LEFT_TURN: {
						modelLeftTurn.render("embedded_large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_VERY_LARGE_TURN:
					case EMBEDDED_VERY_LARGE_RIGHT_TURN: {
						modelRightTurn.render("embedded_very_large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_VERY_LARGE_LEFT_TURN: {
						modelLeftTurn.render("embedded_very_large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_SUPER_LARGE_TURN:
					case EMBEDDED_SUPER_LARGE_RIGHT_TURN: {
						modelRightTurn.render("embedded_super_large", railTile, x, y, z);
						break;
					}
					case EMBEDDED_SUPER_LARGE_LEFT_TURN: {
						modelLeftTurn.render("embedded_super_large", railTile, x, y, z);
						break;
					}
					//case EMBEDDED_TURN_29X29:
					//case EMBEDDED_RIGHT_TURN_29X29: {
					//	modelRightTurn.render("embedded_29x", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_LEFT_TURN_29X29: {
					//	modelLeftTurn.render("embedded_29x", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_TURN_32X32:
					//case EMBEDDED_RIGHT_TURN_32X32: {
					//	modelRightTurn.render("embedded_32x", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_LEFT_TURN_32X32: {
					//	modelLeftTurn.render("embedded_32x", railTile, x, y, z);
					//	break;
					//}
					/**case EMBEDDED_MEDIUM_45DEGREE_TURN:
					case EMBEDDED_MEDIUM_RIGHT_45DEGREE_TURN: {
						model45DegreeRightTurn.render("medium", "embedded", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_LEFT_45DEGREE_TURN: {
						model45DegreeLeftTurn.render("medium", "embedded", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_45DEGREE_TURN:
					case EMBEDDED_LARGE_RIGHT_45DEGREE_TURN: {
						model45DegreeRightTurn.render("large", "embedded", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_LEFT_45DEGREE_TURN: {
						model45DegreeLeftTurn.render("large", "embedded", railTile, x, y, z);
						break;
					}
					case EMBEDDED_VERY_LARGE_45DEGREE_TURN:
					case EMBEDDED_VERY_LARGE_RIGHT_45DEGREE_TURN: {
						model45DegreeRightTurn.render("verylarge", "embedded", railTile, x, y, z);
						break;
					}
					case EMBEDDED_VERY_LARGE_LEFT_45DEGREE_TURN: {
						model45DegreeLeftTurn.render("verylarge", "embedded", railTile, x, y, z);
						break;
					}
					case EMBEDDED_SUPER_LARGE_45DEGREE_TURN:
					case EMBEDDED_SUPER_LARGE_RIGHT_45DEGREE_TURN: {
						model45DegreeRightTurn.render("superlarge", "embedded", railTile, x, y, z);
						break;
					}*/
					//case EMBEDDED_SUPER_LARGE_LEFT_45DEGREE_TURN: {
					//	model45DegreeLeftTurn.render("superlarge", "embedded", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_DIAGONAL_TURN_9X20:
					//case EMBEDDED_DIAGONAL_RIGHT_TURN_9X20: {
					//	model45DegreeRightTurn.render("9x20","embedded",railTile,x,y,z);
					//	break;
					//}
					//case EMBEDDED_DIAGONAL_LEFT_TURN_9X20: {
					//	model45DegreeLeftTurn.render("9x20","embedded",railTile,x,y,z);
					//	break;
					//}
					//case EMBEDDED_DIAGONAL_TURN_10X22:
					//case EMBEDDED_DIAGONAL_RIGHT_TURN_10X22: {
					//	model45DegreeRightTurn.render("10x22","embedded",railTile,x,y,z);
					//	break;
					//}
					//case EMBEDDED_DIAGONAL_LEFT_TURN_10X22: {
					//	model45DegreeLeftTurn.render("10x22","embedded",railTile,x,y,z);
					//	break;
					//}

					//case EMBEDDED_S_CURVE_20x2:
					//case EMBEDDED_S_CURVE_20x2_RIGHT: {
					//	modelRightParallelCurve.render("20x2", "embedded", railTile, x, y, z);
					//	break;
					//}
//
					//case EMBEDDED_S_CURVE_20x2_LEFT: {
					//	modelLeftParallelCurve.render("20x2", "embedded", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_TWO_WAYS_CROSSING: {
					//	modelTwoWaysCrossing.render("embedded_crossing", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_FOUR_WAYS_CROSSING: {
					//	modelTwoWaysCrossing.render("embedded_universal_crossing", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_DIAGONAL_TWO_WAYS_CROSSING: {
					//	modelTwoWaysCrossing.render("embedded_diagonal_crossing", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_DIAMOND_CROSSING:
					//case EMBEDDED_RIGHT_DIAMOND_CROSSING: {
					//	modelRightDiamondCrossing.render("embedded", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_LEFT_DIAMOND_CROSSING: {
					//	modelLeftDiamondCrossing.render("embedded", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_DOUBLE_DIAMOND_CROSSING: {
					//	modelTwoWaysCrossing.render("embedded_diamond", railTile, x, y, z);
					//	break;
					//}
					/*case EMBEDDED_MEDIUM_SWITCH:
					case EMBEDDED_MEDIUM_RIGHT_SWITCH: {
						modelRightSwitchTurn.render("medium", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_LEFT_SWITCH: {
						modelLeftSwitchTurn.render("medium", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_SWITCH:
					case EMBEDDED_LARGE_RIGHT_SWITCH: {
						modelRightSwitchTurn.render("large_90",railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_LEFT_SWITCH: {
						modelLeftSwitchTurn.render("large_90", railTile, x, y, z);
						break;
					}*/
					/**case EMBEDDED_VERY_LARGE_SWITCH:
					case EMBEDDED_VERY_LARGE_RIGHT_SWITCH: {
						modelRightSwitchTurn.render("very_large_90", "embedded", railTile, x, y, z);
						break;
					}
					case EMBEDDED_VERY_LARGE_LEFT_SWITCH: {
						modelLeftSwitchTurn.render("very_large_90", "embedded", railTile, x, y, z);
						break;
					}*/
					//case EMBEDDED_MEDIUM_PARALLEL_SWITCH:
					//case EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH: {
					//	modelRightSwitchTurn.render("medium_parallel", railTile, x, y, z);
					//	break;
					//}
					//case EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH: {
					//	modelLeftSwitchTurn.render("medium_parallel", railTile, x, y, z);
					//	break;
					//}
					/**case EMBEDDED_LARGE_PARALLEL_SWITCH:
					case EMBEDDED_LARGE_RIGHT_PARALLEL_SWITCH: {
						modelRightSwitchTurn.render("large_parallel", "embedded", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_LEFT_PARALLEL_SWITCH: {
						modelLeftSwitchTurn.render("large_parallel", "embedded", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_45DEGREE_SWITCH:
					case EMBEDDED_MEDIUM_RIGHT_45DEGREE_SWITCH: {
						modelRightSwitchTurn.render("medium_45degree", "embedded", railTile, x, y, z);
						break;
					}
					case EMBEDDED_MEDIUM_LEFT_45DEGREE_SWITCH: {
						modelLeftSwitchTurn.render("medium_45degree", "embedded", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_45DEGREE_SWITCH:
					case EMBEDDED_LARGE_RIGHT_45DEGREE_SWITCH: {
						modelRightSwitchTurn.render("large_45degree", "embedded", railTile, x, y, z);
						break;
					}
					case EMBEDDED_LARGE_LEFT_45DEGREE_SWITCH: {
						modelLeftSwitchTurn.render("large_45degree", "embedded", railTile, x, y, z);
						break;
					}*/

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
