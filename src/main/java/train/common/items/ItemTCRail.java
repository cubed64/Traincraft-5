package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockMushroom;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import org.lwjgl.util.vector.Matrix2f;
import org.lwjgl.util.vector.Vector2f;
import train.common.library.BlockIDs;
import train.common.library.EnumTracks;
import train.common.library.ItemIDs;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import javax.annotation.Nullable;
import java.util.List;

public class ItemTCRail extends ItemPart {
	private EnumTracks type;
	EnumTracks tempType;

	private String typeVariantStraightLabel = EnumTracks.SMALL_STRAIGHT.getLabel();

	public static boolean isTCTurnTrack(TileTCRail tile) {
		if(tile==null || tile.getType()==null){return false;}
		return (tile.getType().equals(EnumTracks.MEDIUM_LEFT_SWITCH.getLabel()) && tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_SWITCH.getLabel()) && tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.LARGE_LEFT_SWITCH.getLabel()) && tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.LARGE_RIGHT_SWITCH.getLabel()) && tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) && tile.getSwitchState())

				|| tile.getType().equals(EnumTracks.MEDIUM_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.LARGE_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.LARGE_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.VERY_LARGE_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.VERY_LARGE_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.MEDIUM_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.SUPER_LARGE_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.SUPER_LARGE_RIGHT_TURN.getLabel())

				|| tile.getType().equals(EnumTracks.SMALL_RIGHT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.SMALL_LEFT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.MEDIUM_RIGHT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.MEDIUM_LEFT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.LARGE_RIGHT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.LARGE_LEFT_PARALLEL_CURVE.getLabel())

				|| tile.getType().equals(EnumTracks.EMBEDDED_MEDIUM_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_LARGE_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_LARGE_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_VERY_LARGE_RIGHT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_VERY_LARGE_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_MEDIUM_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_SUPER_LARGE_LEFT_TURN.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_SUPER_LARGE_RIGHT_TURN.getLabel())

				|| tile.getType().equals(EnumTracks.EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_SMALL_LEFT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE.getLabel())
				|| tile.getType().equals(EnumTracks.EMBEDDED_LARGE_LEFT_PARALLEL_CURVE.getLabel());


	}

	public static boolean isTCStraightTrack(TileTCRail tile) {
		if(tile==null || tile.getType()==null){return false;}
		return (tile.getType().equals(EnumTracks.MEDIUM_LEFT_SWITCH.getLabel()) && !tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.LARGE_LEFT_SWITCH.getLabel()) && !tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.LARGE_RIGHT_SWITCH.getLabel()) && !tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) && !tile.getSwitchState())
				|| (tile.getType().equals(EnumTracks.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) && !tile.getSwitchState())
				|| tile.getType().contains("STRAIGHT")
				;
	}

	public static boolean isTCSwitch(TileTCRail tile) {
		if(tile==null || tile.getType()==null){return false;}
		return (tile.getType().equals(EnumTracks.MEDIUM_LEFT_SWITCH.getLabel()))
				|| (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_SWITCH.getLabel()))
				|| (tile.getType().equals(EnumTracks.LARGE_LEFT_SWITCH.getLabel()))
				|| (tile.getType().equals(EnumTracks.LARGE_RIGHT_SWITCH.getLabel()))
				|| (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()))
				|| (tile.getType().equals(EnumTracks.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()));
	}

	public ItemTCRail(EnumTracks t) {
		super(t.getItem().iconName);
		this.overridePath("tracks");
		this.type = t;
	}

	private boolean canPlaceTrack(EntityPlayer player, World world, int x, int y, int z) {
		Block l1 = world.getBlock(x, y - 1, z);

		if(player !=null && (!player.canPlayerEdit(x, y - 1, z, 0, player.getCurrentEquippedItem()) ||
				!player.canPlayerEdit(x, y, z, 0, player.getCurrentEquippedItem()))
		){
			return false;
		}

		return canBeReplaced(world, x, y, z) && (World.doesBlockHaveSolidTopSurface(world ,x, y - 1, z) || l1 == BlockIDs.bridgePillar.block);
	}

	private boolean canBeReplaced(World world, int x, int y, int z){
		Block block = world.getBlock(x, y, z);
		return block == null || block.isReplaceable(world, x, y, z) || block instanceof BlockFlower
				|| block == Blocks.double_plant || block instanceof BlockMushroom;
	}

	/**
	 *
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * //@param posX[] array of gag
	 * //@param posZ[] array of gag
	 * @param l orientation
	 * @param exitFacing
	 * @param posExitX
	 * @param posExitZ
	 * @param r ray
	 * @param cx circle center
	 * @param cy circle center
	 * @param cz circle center
	 * @param type
	 * @return
	 */
	private boolean putDownTurn(@Nullable EntityPlayer player, World world, boolean putDownEnterTrack, int x, int y, int z, int[] posX, int[] posZ,
								int l, boolean putDownExitTrack, int exitFacing, int posExitX, int posExitZ, double r, double cx, double cy,
								double cz, String type, Item idDrop) {
		TileTCRailGag[] tileGag = new TileTCRailGag[posX.length - 1];

		/** check if first straight rail can be placed */
		if (putDownEnterTrack && !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}

		/** check if Gag rails can be placed */
		for (int gag = 0; gag < posX.length; gag++) {
			if (!canPlaceTrack(player, world, posX[gag], y + 1, posZ[gag])) {
				return false;
			}
		}
		/** Check last block */
		if (putDownExitTrack && !canPlaceTrack(player, world, posExitX, y + 1, posExitZ)) {
			return false;
		}
		if (putDownEnterTrack) {
			/** first rail of the turn is a 1 block straight */
			placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
			TileTCRail tcRailStart = (TileTCRail) world.getTileEntity(x, y + 1, z);
			tcRailStart.setType(typeVariantStraightLabel);
			tcRailStart.setFacing(l);
			tcRailStart.isLinkedToRail = true;
			tcRailStart.linkedX = posX[0];
			tcRailStart.linkedY = y + 1;
			tcRailStart.linkedZ = posZ[0];
		}

		/** the turn starts with this rail */
		placeTrack(world,posX[0], y + 1, posZ[0], BlockIDs.tcRail.block, l);
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(posX[0], y + 1, posZ[0]);
		tcRail.setFacing(l);
		tcRail.r = r;
		tcRail.cx = cx;
		tcRail.cy = cy;
		tcRail.cz = cz;
		tcRail.setType(type);
		tcRail.idDrop = idDrop;

		/** Gag rails containing reference to first turn rail */
		for (int gag = 1; gag < posX.length; gag++) {
			placeTrack(world,posX[gag], y + 1, posZ[gag], BlockIDs.tcRailGag.block, 0);
			tileGag[gag - 1] = (TileTCRailGag) world.getTileEntity(posX[gag], y + 1, posZ[gag]);
		}

		if (putDownExitTrack) {
			/** Last rail is a 1 block straight */
			placeTrack(world,posExitX, y + 1, posExitZ, BlockIDs.tcRail.block, exitFacing);
			TileTCRail tcRailEnd = (TileTCRail) world.getTileEntity(posExitX, y + 1, posExitZ);
			tcRailEnd.setFacing(exitFacing);
			tcRailEnd.setType(typeVariantStraightLabel);
			tcRailEnd.isLinkedToRail = true;
			tcRailEnd.linkedX = posX[0];
			tcRailEnd.linkedY = y + 1;
			tcRailEnd.linkedZ = posZ[0];
		}

		for (int i = 0; i < tileGag.length; i++) {
			tileGag[i].originX = posX[0];
			tileGag[i].originY = y + 1;
			tileGag[i].originZ = posZ[0];
			tileGag[i].type = type;
		}
		return true;
	}

	private void putDownSingleRail(World world, int posX, int posY, int posZ, int l, double cx, double cy, double cz, double r, String label, boolean hasModel, int linkedX, int linkedY, int linkedZ, boolean canTypeBeModifiedBySwitch, boolean shouldDrop) {
		/** Switch rail */
		placeTrack(world,posX, posY, posZ, BlockIDs.tcRail.block, l);
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(posX, posY, posZ);
		//world.setBlockMetadataWithNotify(posX, posY, posZ, l, 2);
		tcRail.setFacing(l);
		tcRail.cx = cx;
		tcRail.cy = cy;
		tcRail.cz = cz;
		tcRail.r = r;
		tcRail.setType(label);
		tcRail.hasModel = hasModel;
		tcRail.isLinkedToRail = true;
		tcRail.linkedX = linkedX;
		tcRail.linkedY = linkedY;
		tcRail.linkedZ = linkedZ;
		tcRail.canTypeBeModifiedBySwitch = canTypeBeModifiedBySwitch;
		if(shouldDrop)
		{
			tcRail.idDrop = ItemIDs.tcRailSmallStraight.item;
		}
	}

	public String getTrackOrientation(int l, float yaw) {
		if (l == 2 && yaw >= -180 && yaw <= -135) {
			return "right";
		}
		if (l == 2 && yaw <= 180 && yaw >= 135) {
			return "left";
		}
		if (l == 3 && yaw > -135 && yaw <= -90) {
			return "left";
		}
		if (l == 3 && yaw > -90 && yaw <= -45) {
			return "right";
		}
		if (l == 0 && yaw > -45 && yaw <= 0) {
			return "left";
		}
		if (l == 0 && yaw > 0 && yaw <= 45) {
			return "right";
		}
		if (l == 1 && yaw > 45 && yaw <= 90) {
			return "left";
		}
		if (l == 1 && yaw > 90 && yaw <= 135) {
			return "right";
		}
		return "";
	}

	public static Vector2f getDirectionVector(int facing)
	{
		Matrix2f nrot90 = new Matrix2f();
		nrot90.m00 = +0; nrot90.m01 = +1;
		nrot90.m10 = -1; nrot90.m11 = +0;

		Vector2f vec = new Vector2f();
		vec.x = 0; vec.y = 1;

		for ( int i = 0; i < facing; i++ )
		{
			Vector2f nvec = new Vector2f();
			nvec.x = vec.x * nrot90.m00 + vec.y * nrot90.m10;
			nvec.y = vec.x * nrot90.m01 + vec.y * nrot90.m11;
			vec = nvec;
		}

		return vec;
	}

	private int[][] getUsedSpaceFromType( EnumTracks type )
	{
		switch (type)
		{
			case SMALL_STRAIGHT:
			case SMALL_ROAD_CROSSING:
			case SMALL_ROAD_CROSSING_1:
			case SMALL_ROAD_CROSSING_2:
			case EMBEDDED_SMALL_STRAIGHT:
			return new int[][]{ {0,0} };

			case MEDIUM_STRAIGHT:
			case EMBEDDED_MEDIUM_STRAIGHT:
			return new int[][]{ {0,0}, {1,0}, {2,0} };

			case LONG_STRAIGHT:
			case EMBEDDED_LONG_STRAIGHT:
			return new int[][]{ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0} };

			case VERY_LONG_STRAIGHT:
			case EMBEDDED_VERY_LONG_STRAIGHT:
			return new int[][]{ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6,0}, {7,0}, {8,0}, {9,0}, {10,0}, {11,0}};

			case SLOPE_BALLAST:
			case SLOPE_GRAVEL:
			case SLOPE_WOOD:
			case SLOPE_SNOW_GRAVEL:
			case SLOPE_PEA_GRAVEL:
			case SLOPE_DYNAMIC:
			case EMBEDDED_SLOPE_DYNAMIC:
			return new int[][]{ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0} };

			case LARGE_SLOPE_BALLAST:
			case LARGE_SLOPE_GRAVEL:
			case LARGE_SLOPE_WOOD:
			case LARGE_SLOPE_SNOW_GRAVEL:
			case LARGE_SLOPE_PEA_GRAVEL:
			case LARGE_SLOPE_DYNAMIC:
			case EMBEDDED_LARGE_SLOPE_DYNAMIC:
			return new int[][]{ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6,0}, {7,0}, {8,0}, {9,0}, {10,0}, {11,0} };

			case VERY_LARGE_SLOPE_BALLAST:
			case VERY_LARGE_SLOPE_GRAVEL:
			case VERY_LARGE_SLOPE_WOOD:
			case VERY_LARGE_SLOPE_SNOW_GRAVEL:
			case VERY_LARGE_SLOPE_PEA_GRAVEL:
			case VERY_LARGE_SLOPE_DYNAMIC:
			case EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC:
			return new int[][]{ {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6,0}, {7,0}, {8,0}, {9,0}, {10,0}, {11,0},
					{12,0}, {13,0}, {14,0}, {15,0}, {16,0}, {17,0}};

			case TWO_WAYS_CROSSING:
			case EMBEDDED_TWO_WAYS_CROSSING:
			return new int[][] { {0,0}, {1,0}, {2,0}, {1,1}, {1,-1} };

			case MEDIUM_TURN:
			case EMBEDDED_MEDIUM_TURN:
			return new int[][] { {0,0}, {1,0}, {1,1}, {2,1}, {2,2} };

			case LARGE_TURN:
			case EMBEDDED_LARGE_TURN:
			return new int[][] { {0,0}, {1,0}, {2,0}, {1,1}, {2,1}, {3,1}, {2,2}, {3,2}, {4,2}, {3,3}, {4,3}, {4,4} };

			case VERY_LARGE_TURN:
			case EMBEDDED_VERY_LARGE_TURN:
			return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {2,1}, {3,1}, {4,1}, {5,1}, {4,2}, {5,2}, {6,2},
						{6,3}, {7,3}, {7,4}, {8,4}, {7,5}, {8,5}, {9,5}, {8,6}, {9,6}, {8,7}, {9,7}, {9,8}, {9,9} };

			case MEDIUM_PARALLEL_SWITCH:
			//case EMBEDDED_MEDIUM_PARALLEL_SWITCH:
			return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {6,0}, {7,0}, {8,0}, {9,0}, {10,0},
						{2,1}, {3,1}, {4,1}, {5,1},	{4,2}, {5,2}, {6,2}, {7,2}, {8,2}, {6,3}, {7,3}, {8,3}, {9,3}, {10,3}};

			case MEDIUM_SWITCH:
			//case EMBEDDED_MEDIUM_SWITCH:
			return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {2,1}, {3,1}, {3,2}, {3,3} };

			case LARGE_SWITCH:
			//case EMBEDDED_LARGE_SWITCH:
			return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0},
					{2,1}, {3,1}, {4,1}, {3,2}, {4,2}, {5,2}, {4,3}, {5,3},	{5,4}, {5,5}};
			case SUPER_LARGE_TURN:
			case EMBEDDED_SUPER_LARGE_TURN:
			return new int[][]{ {0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {5, 2}, {6, 2}, {7, 2}, {8, 2},
					{7, 3}, {8, 3}, {9, 3}, {10, 3}, {9, 4}, {10, 4}, {11, 4}, {10, 5}, {11, 5}, {12, 5}, {11, 6}, {12, 6}, {13, 6}, {12, 7}, {13, 7},
					{12, 8}, {13, 8}, {14, 8}, {13, 9}, {14, 9}, {13, 10}, {14, 10}, {15, 10}, {14, 11}, {15, 11}, {14, 12}, {15, 12}, {14, 12,}, {15, 13}, {15, 14}, {15, 15}};

			/** Parallel Curves */
			case SMALL_PARALLEL_CURVE:
			case EMBEDDED_SMALL_PARALLEL_CURVE:
			return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {2,1}, {3,1}, {4,1}, {5,1}, {6,1}, {7,1}};

			case MEDIUM_PARALLEL_CURVE:
			case EMBEDDED_MEDIUM_PARALLEL_CURVE:
			return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {3,1}, {4,1}, {5,1}, {6,1}, {7,1}, {8,1}, {7,2}, {8,2}, {9,2}, {10,2}, {11,2}};

			case LARGE_PARALLEL_CURVE:
			case EMBEDDED_LARGE_PARALLEL_CURVE:
			return new int[][] { {0,0}, {1,0}, {2,0}, {3,0}, {4,0}, {5,0}, {4,1}, {5,1}, {6,1}, {7,1}, {8,1}, {7,2}, {8,2}, {9,2}, {10,2}, {11,2}, {10,3}, {11,3}, {12,3}, {13,3}, {14,3}, {15,3}};

			default:
			return null;
		}
	}

	public boolean tryToPlaceTrack( ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, boolean changeWorld )
	{
		if ( !(itemStack.getItem() instanceof ItemTCRail) )
			return false;

		y = getPlacementHeight(world, x, y, z);

		ItemTCRail item = (ItemTCRail) itemStack.getItem();
		int facing0 = MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
		Vector2f dir0 = ItemTCRail.getDirectionVector(facing0);

		float yaw = MathHelper.wrapAngleTo180_float(player.rotationYaw);
		boolean isLeftTurn = item.getTrackOrientation( facing0, yaw ).equals("left");
		int facing1 = isLeftTurn ? (facing0 + 4 - 1)%4 : (facing0 + 1)%4;
		Vector2f dir1 = getDirectionVector( facing1 );

		int[][] trackPositions = getUsedSpaceFromType( item.getTrackType() );

		if ( trackPositions != null )
		{

			for ( int[] pos : trackPositions )
			{
				int dx = (int) (pos[0] * dir0.getX() + pos[1] * dir1.getX());
				int dz = (int) (pos[0] * dir0.getY() + pos[1] * dir1.getY());

				if( !canPlaceTrack(player, world, x + dx, y+1, z + dz ))
					return false;
			}

			return true;
		}else {
			return false;
		}
	}

	public int getPlacementHeight( World world, int x, int y, int z )
	{
		if(canBeReplaced(world, x, y, z)){
			y--;
		}
		return y;
	}

	private void setSharedStraightTypeVariant()
	{
		switch (type.getVariant())
		{
			case EMBEDDED:
				typeVariantStraightLabel = EnumTracks.EMBEDDED_SMALL_STRAIGHT.getLabel();
				break;
		}
	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
		if (!world.isRemote) {

			y = getPlacementHeight(world, x, y, z);
			int l = MathHelper.floor_double((player!=null?player.rotationYaw:par10) * 4.0F / 360.0F + 0.5D) & 3;

			int[] curveXArray;
			int[] curveZArray;
			int[] curveXArray2;
			int[] curveZArray2;

			tempType = getPlacementDirection(player, world, l, par10);

			/** This code below actually places the stuff
			 * l = direction
			 *  l = 1 = west
			 *  l = 2 = NORTH
			 *  l = 0 = SOUTH
			 *  l = 3 = east
			 **/
			//System.out.println(type +" "+l);
			setSharedStraightTypeVariant();
			switch (tempType)
			{
				case MEDIUM_LEFT_TURN:
				case MEDIUM_RIGHT_TURN:
				case EMBEDDED_MEDIUM_LEFT_TURN:
				case EMBEDDED_MEDIUM_RIGHT_TURN:
					curveXArray = new int[]{0, 0, 1, 1, 2};
					curveZArray = new int[]{0, 1, 1, 2, 2};
					if (!turnTrack(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 2.5f))
					{
						return false;
					}
					else
					{
						if (player == null || !player.capabilities.isCreativeMode)
						{
							--itemstack.stackSize;
						}
						return true;
					}

				case LARGE_LEFT_TURN:
				case LARGE_RIGHT_TURN:
				case EMBEDDED_LARGE_LEFT_TURN:
				case EMBEDDED_LARGE_RIGHT_TURN:
					curveXArray = new int[]{0, 0, 1, 1, 2, 0, 1, 2, 3, 4, 3, 2};
					curveZArray = new int[]{0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};
					if (!turnTrack(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 4.5f))
					{
						return false;
					}
					else
					{
						if (player == null || !player.capabilities.isCreativeMode)
						{
							--itemstack.stackSize;
						}
						return true;
					}

				case VERY_LARGE_LEFT_TURN:
				case VERY_LARGE_RIGHT_TURN:
				case EMBEDDED_VERY_LARGE_LEFT_TURN:
				case EMBEDDED_VERY_LARGE_RIGHT_TURN:
					curveXArray = new int[]{0, 0, 0, 1, 0, 1, 0, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 9};
					curveZArray = new int[]{0, 1, 2, 2, 3, 3, 4, 4, 5, 4, 5, 6, 6, 7, 7, 8, 7, 8, 9, 8, 9, 8, 9, 9, 9};
					if (!turnTrack(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 9.5f))
					{
						return false;
					}
					else
					{
						if (player == null || !player.capabilities.isCreativeMode)
						{
							--itemstack.stackSize;
						}
						return true;
					}


				case SUPER_LARGE_LEFT_TURN:
				case SUPER_LARGE_RIGHT_TURN:
				case EMBEDDED_SUPER_LARGE_LEFT_TURN:
				case EMBEDDED_SUPER_LARGE_RIGHT_TURN:
					curveXArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9, 10, 11, 11, 12, 12, 13, 14, 15};
					curveZArray = new int[]{0, 1, 2, 3, 4, 3, 4, 5, 6, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 14, 14, 15, 14, 15, 15, 15, 15};
					if (!turnTrack(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, 15.5f))
					{
						return false;
					}
					else
					{
						if (player == null || !player.capabilities.isCreativeMode)
						{
							--itemstack.stackSize;
						}
					}
					return true;

				case SMALL_RIGHT_PARALLEL_CURVE:
				case SMALL_LEFT_PARALLEL_CURVE:
				case EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE:
				case EMBEDDED_SMALL_LEFT_PARALLEL_CURVE:

					curveXArray = new int[]{0, 0, 0, 0, 0, 0};
					curveZArray = new int[]{0, 1, 2, 3, 4, 5};
					curveXArray2 = new int[]{1, 1, 1, 1, 1, 1};
					curveZArray2 = new int[]{2, 3, 4, 5, 6, 7};
					if (!SCurve(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, curveXArray2, curveZArray2, 16.25f, 8, 2))
					{
						return false;
					}
					else
					{
						if (player == null || !player.capabilities.isCreativeMode)
						{
							--itemstack.stackSize;
						}
						return true;
					}

				case MEDIUM_RIGHT_PARALLEL_CURVE:
				case MEDIUM_LEFT_PARALLEL_CURVE:
				case EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE:
				case EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE:

					curveXArray = new int[]{0, 0, 0, 0, 0, 1, 1, 1};
					curveZArray = new int[]{0, 1, 2, 3, 4, 3, 4, 5};
					curveXArray2 = new int[]{1, 1, 1, 2, 2, 2, 2, 2};
					curveZArray2 = new int[]{6, 7, 8, 7, 8, 9, 10, 11};
					if (!SCurve(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, curveXArray2, curveZArray2, 18.50f, 12, 3))
					{
						return false;
					}
					else
					{
						if (player == null || !player.capabilities.isCreativeMode)
						{
							--itemstack.stackSize;
						}
						return true;
					}

				case LARGE_RIGHT_PARALLEL_CURVE:
				case LARGE_LEFT_PARALLEL_CURVE:
				case EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE:
				case EMBEDDED_LARGE_LEFT_PARALLEL_CURVE:

					curveXArray = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
					curveZArray = new int[]{0, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8};
					curveXArray2 = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3,3};
					curveZArray2 = new int[]{7, 8, 9, 10, 11, 10, 11, 12, 13, 14,15};
					if (!SCurve(player, world, x, y, z, l, tempType, par10, curveXArray, curveZArray, curveXArray2, curveZArray2, 22f, 16, 4))
					{
						return false;
					}
					else
					{
						if (player == null || !player.capabilities.isCreativeMode)
						{
							--itemstack.stackSize;
						}
						return true;
					}

				case MEDIUM_LEFT_PARALLEL_SWITCH:
				//case EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH:
				{
					if (l == 2) {
						if (!parallelLeftSwitchNorth(player, world, x, y, z, l, tempType))
							return false;
					}
					if (l == 0) {
						if (!parallelLeftSwitchSouth(player, world, x, y, z, l, tempType))
							return false;
					}
					if (l == 1) {
						if (!parallelLeftSwitchWest(player, world, x, y, z, l, tempType))
							return false;
					}
					if (l == 3) {
						if (!parallelLeftSwitchEast(player, world, x, y, z, l, tempType))
							return false;
					}
					if (player ==null || !player.capabilities.isCreativeMode) {
						--itemstack.stackSize;
					}
					return true;
				}

				case MEDIUM_RIGHT_PARALLEL_SWITCH:
				//case EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH:
				{
					if (l == 2) {
						if (!parallelRightSwitchNorth(player, world, x, y, z, l, tempType))
							return false;
					}
					if (l == 0) {
						if (!parallelRightSwitchSouth(player, world, x, y, z, l, tempType))
							return false;
					}
					if (l == 1) {
						if (!parallelRightSwitchWest(player, world, x, y, z, l, tempType))
							return false;
					}
					if (l == 3) {
						if (!parallelRightSwitchEast(player, world, x, y, z, l, tempType))
							return false;
					}
					if (player ==null || !player.capabilities.isCreativeMode) {
						--itemstack.stackSize;
					}
					return true;
				}

				case MEDIUM_RIGHT_SWITCH:
				//case EMBEDDED_MEDIUM_RIGHT_SWITCH:
				{
					if (l == 2) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 2) || !canPlaceTrack(player, world, x, y + 1, z - 1)) {
							return false;
						}

						int[] xArray = { x + 1, x + 1, x + 2 };
						int[] zArray = { z - 2, z - 3, z - 3 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x + 3, z - 3, 2.5, x + 3, y + 1,
								z, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
							return false;
						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
						if (tcRailTurn != null) {
							tcRailTurn.hasModel = false;
						}
						world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
						/** Switch rail 1 */
						putDownSingleRail(world, x, y + 1, z - 1, l, x + 3, y + 1, z, 2.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x, y + 1, z - 2, l, x + 3, y + 1, z, 2.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 2, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 1, y + 1, z - 2, false, false);

					}
					if (l == 0) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 2) || !canPlaceTrack(player, world, x, y + 1, z + 1)) {
							return false;
						}

						int[] xArray = { x - 1, x - 1, x - 2 };
						int[] zArray = { z + 2, z + 3, z + 3 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 3, z + 3, 2.5, x - 2, y + 1,
								z + 1, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
							return false;
						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x, y + 1, z + 1, l, x - 2, y + 1, z + 1, 2.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x, y + 1, z + 2, l, x - 2, y + 1, z + 1, 2.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 2, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 1, y + 1, z + 2, false, false);

					}
					if (l == 1) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z) || !canPlaceTrack(player, world, x - 1, y + 1, z)) {
							return false;
						}

						int[] xArray = { x - 2, x - 3, x - 3 };
						int[] zArray = { z - 1, z - 1, z - 2 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x - 3, z - 3, 2.5, x, y + 1,
								z - 2, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
							return false;
						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z - 2, 2.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, true, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z - 2, 2.5, typeVariantStraightLabel, false, x - 2, y + 1, z - 1, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 2, y + 1, z - 1, false, false);

					}
					if (l == 3) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z) || !canPlaceTrack(player, world, x + 1, y + 1, z)) {
							return false;
						}

						int[] xArray = { x + 2, x + 3, x + 3 };
						int[] zArray = { z + 1, z + 1, z + 2 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x + 3, z + 3, 2.5, x + 1, y + 1,
								z + 3, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
							return false;
						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z + 3, 2.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z + 3, 2.5, typeVariantStraightLabel, false, x + 2, y + 1, z + 1, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x + 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 2, y + 1, z + 1, false, false);

					}

					if (player==null || !player.capabilities.isCreativeMode) {
						--itemstack.stackSize;
					}
					return true;
				}

				case MEDIUM_LEFT_SWITCH:
				//case EMBEDDED_MEDIUM_LEFT_SWITCH:
				{


					if (l == 2) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 2) || !canPlaceTrack(player, world, x, y + 1, z - 1)) {
							return false;
						}

						int[] xArray = { x - 1, x - 1, x - 2 };
						int[] zArray = { z - 2, z - 3, z - 3 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 3, z - 3, 2.5, x - 2, y + 1,
								z, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
							return false;
						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
						if (tcRailTurn != null) {
							tcRailTurn.hasModel = false;
						}
						world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x, y + 1, z - 1, l, x - 2, y + 1, z, 2.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x, y + 1, z - 2, l, x - 2, y + 1, z, 2.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 2, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x, y + 1, z - 3, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 1, y + 1, z - 2, false, false);

					}
					if (l == 0) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 2) || !canPlaceTrack(player, world, x, y + 1, z + 1)) {
							return false;
						}
						int[] xArray = { x + 1, x + 1, x + 2 };
						int[] zArray = { z + 2, z + 3, z + 3 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 3, x + 3, z + 3, 2.5, x + 3, y + 1,
								z + 1, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
							return false;
						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x, y + 1, z + 1, l, x + 3, y + 1, z + 1, 2.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x, y + 1, z + 2, l, x + 3, y + 1, z + 1, 2.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 2, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x, y + 1, z + 3, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 1, y + 1, z + 2, false, false);

					}
					if (l == 1) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z) || !canPlaceTrack(player, world, x - 1, y + 1, z)) {
							return false;
						}
						int[] xArray = { x - 2, x - 3, x - 3 };
						int[] zArray = { z + 1, z + 1, z + 2 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x - 3, z + 3, 2.5, x, y + 1,
								z + 3, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
							return false;

						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z + 3, 2.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z + 3, 2.5, typeVariantStraightLabel, false, x - 2, y + 1, z + 1, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 2, y + 1, z + 1, false, false);

					}
					if (l == 3) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z) || !canPlaceTrack(player, world, x + 1, y + 1, z)) {
							return false;
						}
						int[] xArray = { x + 2, x + 3, x + 3 };
						int[] zArray = { z - 1, z - 1, z - 2 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x + 3, z - 3, 2.5, x + 1, y + 1,
								z - 2, EnumTracks.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumSwitch.item))
							return false;
						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x + 2, y + 1, z - 1, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z - 2, 2.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z - 2, 2.5, typeVariantStraightLabel, false, x + 2, y + 1, z - 1, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x + 3, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 2, y + 1, z - 1, false, false);

					}
					if (player ==null || !player.capabilities.isCreativeMode) {
						--itemstack.stackSize;
					}
					return true;
				}

				case LARGE_RIGHT_SWITCH:
				//case EMBEDDED_LARGE_RIGHT_SWITCH:
				{
					if (l == 2) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x, y + 1, z - 5) || !canPlaceTrack(player, world, x, y + 1, z - 4) || !canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 2) || !canPlaceTrack(player, world, x, y + 1, z - 1)) {
							return false;
						}
						int[] xArray = { x + 1, x + 1, x + 2, x + 1, x + 2, x + 3, x + 4, x + 3, x + 2 };
						int[] zArray = { z - 2, z - 3, z - 3, z - 4, z - 4, z - 4, z - 5, z - 5, z - 5 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x + 5, z - 5, 4.5, x + 5, y + 1,
								z, EnumTracks.LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
							return false;
						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 2);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x + 1, y + 1, z - 2, l, 2);//to force client update
						/** Switch rail 1 */
						putDownSingleRail(world, x, y + 1, z - 1, l, x + 5, y + 1, z, 4.5, tempType.getLabel(), true, x + 1, y + 1, z - 2, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x, y + 1, z - 2, l, x + 5, y + 1, z, 4.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 2, true, false);

						/** Switch rail 3 **/
						putDownSingleRail(world, x, y + 1, z - 3, l, x + 5, y + 1, z, 4.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 2, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 1, y + 1, z - 2, false, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x, y + 1, z - 5, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 1, y + 1, z - 2, false, false);

					}
					if (l == 0) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x, y + 1, z + 5) || !canPlaceTrack(player, world, x, y + 1, z + 4) || !canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 2) || !canPlaceTrack(player, world, x, y + 1, z + 1)) {
							return false;
						}

						int[] xArray = { x - 1, x - 1, x - 2, x - 1, x - 2, x - 3, x - 2, x - 3, x - 4 };
						int[] zArray = { z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 5 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 5, z + 5, 4.5, x - 4, y + 1,
								z + 1, EnumTracks.LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
							return false;
						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 2);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x - 1, y + 1, z + 2, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x, y + 1, z + 1, l, x - 4, y + 1, z + 1, 4.5, tempType.getLabel(), true, x - 1, y + 1, z + 2, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x, y + 1, z + 2, l, x - 4, y + 1, z + 1, 4.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 2, true, false);

						/** Switch rail 3 **/
						putDownSingleRail(world, x, y + 1, z + 3, l, x - 4, y + 1, z + 1, 4.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 2, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 1, y + 1, z + 2, false, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x, y + 1, z + 5, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 1, y + 1, z + 2, false, false);

					}
					if (l == 1) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x - 5, y + 1, z) || !canPlaceTrack(player, world, x - 4, y + 1, z) || !canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z) || !canPlaceTrack(player, world, x - 1, y + 1, z)) {
							return false;
						}
						int[] xArray = { x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 5 };
						int[] zArray = { z - 1, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x - 5, z - 5, 4.5, x, y + 1,
								z - 4, EnumTracks.LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
							return false;
						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 1);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x - 2, y + 1, z - 1, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z - 4, 4.5, tempType.getLabel(), true, x - 2, y + 1, z - 1, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z - 4, 4.5, typeVariantStraightLabel, false, x - 2, y + 1, z - 1, true, false);

						/** Switch rail 3 **/
						putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z - 4, 4.5, typeVariantStraightLabel, false, x - 2, y + 1, z - 1, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 2, y + 1, z - 1, false, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x - 5, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 2, y + 1, z - 1, false, false);

					}
					if (l == 3) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x + 5, y + 1, z) || !canPlaceTrack(player, world, x + 4, y + 1, z) || !canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z) || !canPlaceTrack(player, world, x + 1, y + 1, z)) {
							return false;
						}
						int[] xArray = { x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 5 };
						int[] zArray = { z + 1, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x + 5, z + 5, 4.5, x + 1, y + 1,
								z + 5, EnumTracks.LARGE_RIGHT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
							return false;

						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 1);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x + 2, y + 1, z + 1, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, tempType.getLabel(), true, x + 2, y + 1, z + 1, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, typeVariantStraightLabel, false, x + 2, y + 1, z + 1, true, false);

						/** Switch rail 3 **/
						putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z + 5, 4.5, typeVariantStraightLabel, false, x + 2, y + 1, z + 1, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 2, y + 1, z + 1, false, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x + 5, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 2, y + 1, z + 1, false, false);

					}

					if (player ==null || !player.capabilities.isCreativeMode) {
						--itemstack.stackSize;
					}
					return true;
				}

				case LARGE_LEFT_SWITCH:
				//case EMBEDDED_LARGE_LEFT_SWITCH:
				{
					if (l == 2) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x, y + 1, z - 5) || !canPlaceTrack(player, world, x, y + 1, z - 4) || !canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 2) || !canPlaceTrack(player, world, x, y + 1, z - 1)) {
							return false;
						}
						int[] xArray = { x - 1, x - 1, x - 2, x - 1, x - 2, x - 3, x - 4, x - 3, x - 2 };
						int[] zArray = { z - 2, z - 3, z - 3, z - 4, z - 4, z - 4, z - 5, z - 5, z - 5 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 5, z - 5, 4.5, x - 4, y + 1,
								z, EnumTracks.LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
							return false;
						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 2);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x - 1, y + 1, z - 2, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x, y + 1, z - 1, l, x - 4, y + 1, z, 4.5, tempType.getLabel(), true, x - 1, y + 1, z - 2, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x, y + 1, z - 2, l, x - 4, y + 1, z, 4.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 2, true, false);

						/** Switch rail 3 **/
						putDownSingleRail(world, x, y + 1, z - 3, l, x - 4, y + 1, z, 4.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 2, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 1, y + 1, z - 2, false, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x, y + 1, z - 5, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 1, y + 1, z - 2, false, false);

					}
					else if (l == 0) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x, y + 1, z + 5) || !canPlaceTrack(player, world, x, y + 1, z + 4) || !canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 2) || !canPlaceTrack(player, world, x, y + 1, z + 1)) {
							return false;
						}
						int[] xArray = { x + 1, x + 1, x + 2, x + 1, x + 2, x + 3, x + 2, x + 3, x + 4 };
						int[] zArray = { z + 2, z + 3, z + 3, z + 4, z + 4, z + 4, z + 5, z + 5, z + 5 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x + 5, z + 5, 4.5, x + 5, y + 1,
								z + 1, EnumTracks.LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
							return false;

						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 2);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x + 1, y + 1, z + 2, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x, y + 1, z + 1, l, x + 5, y + 1, z + 1, 4.5, tempType.getLabel(), true, x + 1, y + 1, z + 2, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x, y + 1, z + 2, l, x + 5, y + 1, z + 1, 4.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 2, true, false);

						/** Switch rail 3 **/
						putDownSingleRail(world, x, y + 1, z + 3, l, x + 5, y + 1, z + 1, 4.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 2, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 1, y + 1, z + 2, false, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x, y + 1, z + 5, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 1, y + 1, z + 2, false, false);

					}
					else if (l == 1) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x - 5, y + 1, z) || !canPlaceTrack(player, world, x - 4, y + 1, z) || !canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z) || !canPlaceTrack(player, world, x - 1, y + 1, z)) {
							return false;
						}
						int[] xArray = { x - 2, x - 3, x - 3, x - 4, x - 4, x - 4, x - 5, x - 5, x - 5 };
						int[] zArray = { z + 1, z + 1, z + 2, z + 1, z + 2, z + 3, z + 2, z + 3, z + 4 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x - 5, z + 5, 4.5, x, y + 1,
								z + 5, EnumTracks.LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
							return false;

						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 1);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x - 2, y + 1, z + 1, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x - 1, y + 1, z, l, x, y + 1, z + 5, 4.5, tempType.getLabel(), true, x - 2, y + 1, z + 1, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x - 2, y + 1, z, l, x, y + 1, z + 5, 4.5, typeVariantStraightLabel, false, x - 2, y + 1, z + 1, true, false);

						/** Switch rail 3 **/
						putDownSingleRail(world, x - 3, y + 1, z, l, x, y + 1, z + 5, 4.5, typeVariantStraightLabel, false, x - 2, y + 1, z + 1, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 2, y + 1, z + 1, false, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x - 5, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 2, y + 1, z + 1, false, false);

					}
					else if (l == 3) {
						/** Check if straight exit can be put down */
						if (!canPlaceTrack(player, world, x + 5, y + 1, z) || !canPlaceTrack(player, world, x + 4, y + 1, z) || !canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z) || !canPlaceTrack(player, world, x + 1, y + 1, z)) {
							return false;
						}
						int[] xArray = { x + 2, x + 3, x + 3, x + 4, x + 4, x + 4, x + 5, x + 5, x + 5 };
						int[] zArray = { z - 1, z - 1, z - 2, z - 1, z - 2, z - 3, z - 2, z - 3, z - 4 };
						if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x + 5, z - 5, 4.5, x + 1, y + 1,
								z - 4, EnumTracks.LARGE_LEFT_TURN.getLabel(), ItemIDs.tcRailLargeSwitch.item))
							return false;

						TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 1);
						if (tcRailTurn != null)
							tcRailTurn.hasModel = false;
						world.setBlockMetadataWithNotify(x + 2, y + 1, z - 1, l, 2);//to force client update

						/** Switch rail 1 */
						putDownSingleRail(world, x + 1, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, tempType.getLabel(), true, x + 2, y + 1, z - 1, false, false);

						/** Switch rail 2 **/
						putDownSingleRail(world, x + 2, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, typeVariantStraightLabel, false, x + 2, y + 1, z - 1, true, false);

						/** Switch rail 3 **/
						putDownSingleRail(world, x + 3, y + 1, z, l, x + 1, y + 1, z - 4, 4.5, typeVariantStraightLabel, false, x + 2, y + 1, z - 1, true, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 2, y + 1, z - 1, false, false);

						/** Put down straight exit **/
						putDownSingleRail(world, x + 5, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel,
								true, x + 2, y + 1, z - 1, false, false);

					}
					if (player ==null || !player.capabilities.isCreativeMode) {
						--itemstack.stackSize;
					}
					return true;
				}
				case TWO_WAYS_CROSSING:
				case EMBEDDED_TWO_WAYS_CROSSING:
				{
					if (!canPlaceTrack(player, world, x, y + 1, z))
					{
						return false;
					}

					int zDisplace = 0;
					int xDisplace = 0;
					int xSideDisplace = 0;
					int zSideDisplace = 0;
					int sideFacing = l;

					if (l == 2)
					{
						zDisplace = -1;
						xSideDisplace = 1;
						sideFacing = 1;
					}
					if (l == 3)
					{
						xDisplace = 1;
						zSideDisplace = 1;
						sideFacing = 2;
					}
					if (l == 0)
					{
						zDisplace = 1;
						xSideDisplace = 1;
						sideFacing = 1;
					}
					if (l == 1)
					{
						xDisplace = -1;
						zSideDisplace = 1;
						sideFacing = 2;
					}

					if (!canPlaceTrack(player, world, x + xDisplace, y + 1, z + zDisplace)
							|| !canPlaceTrack(player, world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2)))
					{
						return false;
					}
					if (!canPlaceTrack(player, world, x + (xDisplace * 2) + (xSideDisplace), y + 1,
							z + (zDisplace) + (zSideDisplace)))
					{
						return false;
					}
					if (!canPlaceTrack(player, world, x + (xDisplace * 2) - (xSideDisplace), y + 1,
							z + (zDisplace) - (zSideDisplace)))
					{
						return false;
					}

					switch (type) {
						case TWO_WAYS_CROSSING:
							typeVariantStraightLabel = EnumTracks.SMALL_STRAIGHT.getLabel();
							break;

						case EMBEDDED_TWO_WAYS_CROSSING:
							typeVariantStraightLabel = EnumTracks.EMBEDDED_SMALL_STRAIGHT.getLabel();
							break;

					}

					/*
					 * Bottom
					 */

					putDownSingleRail(world, x + (xDisplace * 2), y + 1, z + (zDisplace * 2), l, x + (xDisplace * 2), y + 1,
							z + (zDisplace * 2), 0, typeVariantStraightLabel, true, x + (xDisplace), y + 1,
							z + (zDisplace), false, false);

					// putDownSingleRail(world, x+(xDisplace*4), y + 1, z+(zDisplace*4), l,
					// x+(xDisplace*4) , y + 1, z+(zDisplace*4), 0,
					// EnumTracks.SMALL_STRAIGHT.getLabel(), true, x+(xDisplace*3), y + 1,
					// z+(zDisplace*3), false, false);


					placeTrack(world, x + (xDisplace), y + 1, z + (zDisplace), BlockIDs.tcRail.block, l);
					TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + (xDisplace), y + 1, z + (zDisplace));
					tcRail2.setFacing(l);
					tcRail2.cx = x + (xDisplace);
					tcRail2.cy = y + 1;
					tcRail2.cz = z + (zDisplace);
					tcRail2.setType(type.getLabel());
					tcRail2.idDrop = this.type.getItem().item;

					/*
					 * Top
					 */

					// putDownSingleRail(world, x + (xDisplace), y + 1, z + (zDisplace), l, x +
					// (xDisplace), y + 1,
					// z + (zDisplace), 0, EnumTracks.SMALL_STRAIGHT.getLabel(), true, x +
					// (xDisplace * 2), y + 1,
					// z + (zDisplace * 2), false, false);

					putDownSingleRail(world, x, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true,
							x + (xDisplace), y + 1, z + (zDisplace), false, false);

					/*
					 * Right
					 */

					putDownSingleRail(world, x + (xDisplace) + (xSideDisplace), y + 1,
							z + (zDisplace) + (zSideDisplace), sideFacing,
							x + (xDisplace) + (xSideDisplace), y + 1, z + (zDisplace) + (zSideDisplace), 0,
							typeVariantStraightLabel, true, x + (xDisplace), y + 1, z + (zDisplace),
							false, false);

					// putDownSingleRail(world, x + (xDisplace * 2) + (xSideDisplace * 2), y + 1,
					// z + (zDisplace * 2) + (zSideDisplace * 2), sideFacing,
					// x + (xDisplace * 2) + (xSideDisplace * 2), y + 1, z + (zDisplace * 2) +
					// (zSideDisplace * 2), 0,
					// EnumTracks.SMALL_STRAIGHT.getLabel(), true, x + (xDisplace * 2) + (xSideDisplace
					//), y + 1,
					// z + (zDisplace * 2) + (zSideDisplace), false, false);

					/*
					 * Left
					 */

					putDownSingleRail(world, x + (xDisplace) - (xSideDisplace), y + 1,
							z + (zDisplace) - (zSideDisplace), sideFacing,
							x + (xDisplace) - (xSideDisplace), y + 1, z + (zDisplace) - (zSideDisplace), 0,
							typeVariantStraightLabel, true, x + (xDisplace), y + 1, z + (zDisplace),
							false, false);

					//				putDownSingleRail(world, x+(xDisplace*2)-(xSideDisplace*2), y + 1, z+(zDisplace*2)-(zSideDisplace*2), sideFacing, x+(xDisplace*2)-(xSideDisplace*2) , y + 1, z+(zDisplace*2)-(zSideDisplace*2), 0, typeVariantStraightLabel, true, x+(xDisplace*2)-(xSideDisplace*1), y + 1, z+(zDisplace*2)-(zSideDisplace*1), false, false);

					if (player == null || !player.capabilities.isCreativeMode)
					{
						--itemstack.stackSize;
					}
					return true;
				}


				default:
				{
					if (TCRailTypes.RailTypes.SLOPE.equals(type.getRailType()))
					{
						if (!canPlaceTrack(player, world, x, y + 1, z)) {
							return false;
						}

						if (type.getLabel().contains("DYNAMIC") && world.getBlock(x, y, z) == BlockIDs.bridgePillar.block)
						{
							return false;
						}

						int gagEnd = 0;
						double slopeAngle = 0;
						/**
						 * Explanation: normally you would devide 100 by (gagEnd+1) but this seems to be
						 * against TCs own brain. you need to devide 100 by (gagEnd+1)
						 **/
						if (type == EnumTracks.SLOPE_WOOD || type == EnumTracks.SLOPE_GRAVEL
								|| type == EnumTracks.SLOPE_BALLAST || type == EnumTracks.SLOPE_SNOW_GRAVEL
								|| type == EnumTracks.SLOPE_PEA_GRAVEL || type == EnumTracks.SLOPE_DYNAMIC
								|| type == EnumTracks.EMBEDDED_SLOPE_DYNAMIC) {
							gagEnd = 5;
							slopeAngle = 0.13;
						}
						else if (type == EnumTracks.LARGE_SLOPE_WOOD || type == EnumTracks.LARGE_SLOPE_GRAVEL
								|| type == EnumTracks.LARGE_SLOPE_BALLAST || type == EnumTracks.LARGE_SLOPE_SNOW_GRAVEL
								|| type == EnumTracks.LARGE_SLOPE_PEA_GRAVEL || type == EnumTracks.LARGE_SLOPE_DYNAMIC
								|| type == EnumTracks.EMBEDDED_LARGE_SLOPE_DYNAMIC) {
							gagEnd = 11;
							slopeAngle = 0.0666;
						}
						else if (type == EnumTracks.VERY_LARGE_SLOPE_WOOD || type == EnumTracks.VERY_LARGE_SLOPE_GRAVEL
								|| type == EnumTracks.VERY_LARGE_SLOPE_BALLAST || type == EnumTracks.VERY_LARGE_SLOPE_SNOW_GRAVEL
								|| type == EnumTracks.VERY_LARGE_SLOPE_PEA_GRAVEL || type == EnumTracks.VERY_LARGE_SLOPE_DYNAMIC
								|| type == EnumTracks.EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC) {
							gagEnd = 17;
							slopeAngle = 0.0444;
						}

						Item idDropped = this.type.getItem().item;
						TileTCRailGag[] tileGag = new TileTCRailGag[gagEnd];

						for (int i = 1; i <= gagEnd; i++) {
							if (l == 2) {
								if (!canPlaceTrack(player, world, x, y + 1, z - i)) {
									return false;
								}
							}
							if (l == 0) {
								if (!canPlaceTrack(player, world, x, y + 1, z + i)) {
									return false;
								}
							}
							if (l == 1) {
								if (!canPlaceTrack(player, world, x - i, y + 1, z)) {
									return false;
								}
							}
							if (l == 3) {
								if (!canPlaceTrack(player, world, x + i, y + 1, z)) {
									return false;
								}
							}
						}
						placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
						tcRail.setFacing(l);
						tcRail.setType(type.getLabel());
						tcRail.idDrop = idDropped;
						tcRail.slopeHeight = 1;
						tcRail.slopeAngle = slopeAngle;
						tcRail.slopeLength = gagEnd + 1;

						Block block = world.getBlock(x, y, z);
						int blockID = Block.getIdFromBlock(block);
						tcRail.setBallastMaterial(blockID);
						tcRail.ballastMetadata = world.getBlockMetadata(x, y, z);

						for (int i2 = 1; i2 <= gagEnd; i2++)
						{
							switch (l)
							{
								case 2:
									placeTrack(world,x, y + 1, z - i2, BlockIDs.tcRailGag.block, l);
									tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - i2);
									tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd ));
								break;
								case 0:
									placeTrack(world,x, y + 1, z + i2, BlockIDs.tcRailGag.block, l);
									tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + i2);
									tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));
								break;
								case 1:
									placeTrack(world,x - i2, y + 1, z, BlockIDs.tcRailGag.block, l);
									tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x - i2, y + 1, z);
									tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));
								break;
								case 3:
									placeTrack(world,x + i2, y + 1, z, BlockIDs.tcRailGag.block, l);
									tileGag[i2 - 1] = (TileTCRailGag) world.getTileEntity(x + i2, y + 1, z);
									tileGag[i2 - 1].bbHeight = Math.max(0.125f, Math.min(1f, i2 / (float) gagEnd));
								break;
							}
						}
						for (int i = 0; i < tileGag.length; i++) {
							if (player != null && tileGag[i] == null) {
								player.addChatMessage(new ChatComponentText(
										"There was a problem when placing the track. Possibly too many tracks around"));
								return false;
							}
							tileGag[i].originX = x;
							tileGag[i].originY = y + 1;
							tileGag[i].originZ = z;
							tileGag[i].type = type.getLabel();
						}
						if (player ==null || !player.capabilities.isCreativeMode) {
							--itemstack.stackSize;
						}
						return true;
					}
				}
			}

			/** Placement of Medium and Long Straight */
			if (type == EnumTracks.MEDIUM_STRAIGHT  || type == EnumTracks.LONG_STRAIGHT || type == EnumTracks.VERY_LONG_STRAIGHT
				|| type == EnumTracks.EMBEDDED_MEDIUM_STRAIGHT  || type == EnumTracks.EMBEDDED_LONG_STRAIGHT || type == EnumTracks.EMBEDDED_VERY_LONG_STRAIGHT) {
				/** check if first rail can be placed */
				if (!canPlaceTrack(player, world, x, y + 1, z)) {
					return false;
				}

				Boolean isAnyTypeOfLongStraight = type == EnumTracks.LONG_STRAIGHT || type == EnumTracks.EMBEDDED_LONG_STRAIGHT;
				Boolean isAnyTypeOfVeryLongStraight = type == EnumTracks.VERY_LONG_STRAIGHT || type == EnumTracks.EMBEDDED_VERY_LONG_STRAIGHT;

				TileTCRailGag[] tileGag = new TileTCRailGag[2]; /** makes it so only 2 gags are placed */
				if (isAnyTypeOfLongStraight) {
					tileGag = new TileTCRailGag[4];
				}

				if (isAnyTypeOfVeryLongStraight){
					tileGag = new TileTCRailGag[8];
				}
				if (l == 2) {
					if (!canPlaceTrack(player, world, x, y + 1, z - 1) || !canPlaceTrack(player, world, x, y + 1, z - 2)) {
						return false;
					}
					if (isAnyTypeOfLongStraight){
						if (!canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 4)
								|| !canPlaceTrack(player, world, x, y + 1, z - 5)) {
							return false;
						}
					}
					if (isAnyTypeOfVeryLongStraight){
						if (!canPlaceTrack(player, world, x, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z - 4)
								|| !canPlaceTrack(player, world, x, y + 1, z - 5) || !canPlaceTrack(player, world, x, y+1, z - 6) || !canPlaceTrack(player, world, x, y+1, z - 7) || !canPlaceTrack(player, world, x, y+1, z - 8)  ||
								!canPlaceTrack(player, world, x, y+1, z - 9) || !canPlaceTrack(player, world,x, y+1, z - 10) || !canPlaceTrack(player, world, x, y+1, z - 11)) {
							return false;
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());

					placeTrack(world,x, y + 1, z - 1, BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 1);

					placeTrack(world,x, y + 1, z - 2, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 2);

					if (isAnyTypeOfLongStraight) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}

					if (isAnyTypeOfLongStraight || isAnyTypeOfVeryLongStraight) {
						placeTrack(world,x, y + 1, z - 3, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z - 3);
						tcRail2.setFacing(l);
						tcRail2.setType(type.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z - 1;

						placeTrack(world,x, y + 1, z - 4, BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 4);

						placeTrack(world,x, y + 1, z - 5, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 5);

						if (isAnyTypeOfVeryLongStraight) {
							tcRail.idDrop = this.type.getItem().item;
						} else {
							tcRail.idDrop = this.type.getItem().item;
						}
					}
					if (isAnyTypeOfVeryLongStraight) {

						placeTrack(world,x, y+1, z - 6, BlockIDs.tcRail.block, l);
						TileTCRail tcRail3 = (TileTCRail) world.getTileEntity(x, y + 1, z - 6);
						tcRail3.setFacing(l);
						tcRail3.setType(type.getLabel());
						tcRail3.isLinkedToRail = true;
						tcRail3.linkedX = x;
						tcRail3.linkedY = y + 1;
						tcRail3.linkedZ = z - 1;

						placeTrack(world,x, y + 1, z - 7, BlockIDs.tcRailGag.block, l);
						tileGag[4] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 7);

						placeTrack(world,x, y + 1, z - 8, BlockIDs.tcRailGag.block, l);
						tileGag[5] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 8);

						placeTrack(world,x, y+1, z - 9, BlockIDs.tcRail.block, l);
						TileTCRail tcRail4 = (TileTCRail) world.getTileEntity(x, y + 1, z - 9);
						tcRail4.setFacing(l);
						tcRail4.setType(type.getLabel());
						tcRail4.isLinkedToRail = true;
						tcRail4.linkedX = x;
						tcRail4.linkedY = y + 1;
						tcRail4.linkedZ = z - 1;

						placeTrack(world,x, y + 1, z - 10, BlockIDs.tcRailGag.block, l);
						tileGag[6] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 10);

						placeTrack(world,x, y + 1, z - 11, BlockIDs.tcRailGag.block, l);
						tileGag[7] = (TileTCRailGag) world.getTileEntity(x, y + 1, z - 11);


					}

				}
				if (l == 0) {
					if (!canPlaceTrack(player, world, x, y + 1, z + 1) || !canPlaceTrack(player, world, x, y + 1, z + 2)) {
						return false;
					}
					if (isAnyTypeOfLongStraight){
						if (!canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 4)
								|| !canPlaceTrack(player, world, x, y + 1, z + 5)) {
							return false;
						}
					}
					if (isAnyTypeOfVeryLongStraight){
						if (!canPlaceTrack(player, world, x, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z + 4)
								|| !canPlaceTrack(player, world, x, y + 1, z + 5) || !canPlaceTrack(player, world, x, y+1, z + 6) || !canPlaceTrack(player, world, x, y+1, z + 7)  ||
								!canPlaceTrack(player, world, x, y+1, z + 8) || !canPlaceTrack(player, world, x, y+1, z + 9) || !canPlaceTrack(player, world, x, y+1, z + 10) || !canPlaceTrack(player, world, x, y+1, z + 11)) {
							return false;
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());

					placeTrack(world,x, y + 1, z + 1, BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 1);

					placeTrack(world,x, y + 1, z + 2, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 2);

					if (isAnyTypeOfLongStraight) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}

					if (isAnyTypeOfLongStraight
							|| isAnyTypeOfVeryLongStraight) {
						placeTrack(world,x, y + 1, z + 3, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x, y + 1, z + 3);
						tcRail2.setFacing(l);
						tcRail2.setType(type.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z + 1;

						placeTrack(world,x, y + 1, z + 4, BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 4);

						placeTrack(world,x, y + 1, z + 5, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 5);

						if (isAnyTypeOfVeryLongStraight) {
							tcRail.idDrop = this.type.getItem().item;
						} else {
							tcRail.idDrop = this.type.getItem().item;
						}
					}
					if (isAnyTypeOfVeryLongStraight) {

						placeTrack(world,x, y+1, z + 6, BlockIDs.tcRail.block, l);
						TileTCRail tcRail3 = (TileTCRail) world.getTileEntity(x, y + 1, z + 6);
						tcRail3.setFacing(l);
						tcRail3.setType(type.getLabel());
						tcRail3.isLinkedToRail = true;
						tcRail3.linkedX = x;
						tcRail3.linkedY = y + 1;
						tcRail3.linkedZ = z + 1;

						placeTrack(world,x, y + 1, z + 7, BlockIDs.tcRailGag.block, l);
						tileGag[4] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 7);

						placeTrack(world,x, y + 1, z + 8, BlockIDs.tcRailGag.block, l);
						tileGag[5] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 8);

						placeTrack(world,x, y+1, z + 9, BlockIDs.tcRail.block, l);
						TileTCRail tcRail4 = (TileTCRail) world.getTileEntity(x, y + 1, z + 9);
						tcRail4.setFacing(l);
						tcRail4.setType(type.getLabel());
						tcRail4.isLinkedToRail = true;
						tcRail4.linkedX = x;
						tcRail4.linkedY = y + 1;
						tcRail4.linkedZ = z + 1;

						placeTrack(world,x, y + 1, z + 10, BlockIDs.tcRailGag.block, l);
						tileGag[6] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 10);

						placeTrack(world,x, y + 1, z + 11, BlockIDs.tcRailGag.block, l);
						tileGag[7] = (TileTCRailGag) world.getTileEntity(x, y + 1, z + 11);


					}

				}
				if (l == 1) {
					if (!canPlaceTrack(player, world, x - 1, y + 1, z) || !canPlaceTrack(player, world, x - 2, y + 1, z)) {
						return false;
					}
					if (isAnyTypeOfLongStraight){
						if (!canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 4, y + 1, z)
								|| !canPlaceTrack(player, world, x - 5, y + 1, z)) {
							return false;
						}
					}
					if (isAnyTypeOfVeryLongStraight){
						if ( !canPlaceTrack(player, world, x - 3, y + 1, z) || !canPlaceTrack(player, world, x - 4, y + 1, z)
								|| !canPlaceTrack(player, world, x - 5, y + 1, z) || !canPlaceTrack(player, world, x - 6, y+1, z ) || !canPlaceTrack(player, world, x - 7, y+1, z )  ||
								!canPlaceTrack(player, world, x - 8, y+1, z) || !canPlaceTrack(player, world, x - 9, y+1, z) || !canPlaceTrack(player, world, x - 10, y+1, z ) || !canPlaceTrack(player, world, x - 11, y+1, z)) {
							return false;
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());

					placeTrack(world,x - 1, y + 1, z , BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x - 1, y + 1, z);

					placeTrack(world,x - 2, y + 1, z, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x - 2, y + 1, z );

					if (isAnyTypeOfLongStraight) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}

					if (isAnyTypeOfLongStraight
							|| isAnyTypeOfVeryLongStraight) {
						placeTrack(world,x - 3, y + 1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x - 3, y + 1, z);
						tcRail2.setFacing(l);
						tcRail2.setType(type.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x - 1;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z ;

						placeTrack(world,x - 4, y + 1, z , BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x - 4, y + 1, z);

						placeTrack(world,x - 5, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x - 5, y + 1, z);

						if (isAnyTypeOfVeryLongStraight) {
							tcRail.idDrop = this.type.getItem().item;
						} else {
							tcRail.idDrop = this.type.getItem().item;
						}
					}
					if (isAnyTypeOfVeryLongStraight) {

						placeTrack(world,x - 6, y+1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail3 = (TileTCRail) world.getTileEntity(x - 6, y + 1, z);
						tcRail3.setType(type.getLabel());
						tcRail3.isLinkedToRail = true;
						tcRail3.linkedX = x - 1;
						tcRail3.linkedY = y + 1;
						tcRail3.linkedZ = z ;

						placeTrack(world,x - 7, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[4] = (TileTCRailGag) world.getTileEntity(x - 7, y + 1, z);

						placeTrack(world,x - 8, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[5] = (TileTCRailGag) world.getTileEntity(x - 8, y + 1, z);

						placeTrack(world,x - 9, y+1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail4 = (TileTCRail) world.getTileEntity(x - 9, y + 1, z);
						tcRail4.setFacing(l);
						tcRail4.setType(type.getLabel());
						tcRail4.isLinkedToRail = true;
						tcRail4.linkedX = x - 1;
						tcRail4.linkedY = y + 1;
						tcRail4.linkedZ = z;

						placeTrack(world,x - 10, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[6] = (TileTCRailGag) world.getTileEntity(x - 10, y + 1, z);

						placeTrack(world,x - 11, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[7] = (TileTCRailGag) world.getTileEntity(x - 11, y + 1, z);


					}

				}
				if (l == 3) {
					if (!canPlaceTrack(player, world, x + 1, y + 1, z) || !canPlaceTrack(player, world, x + 2, y + 1, z)) {
						return false;
					}
					if (isAnyTypeOfLongStraight){
						if (!canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 4, y + 1, z)
								|| !canPlaceTrack(player, world, x + 5, y + 1, z)) {
							return false;
						}
					}
					if (isAnyTypeOfVeryLongStraight){
						if ( !canPlaceTrack(player, world, x + 3, y + 1, z) || !canPlaceTrack(player, world, x + 4, y + 1, z)
								|| !canPlaceTrack(player, world, x + 5, y + 1, z) || !canPlaceTrack(player, world, x + 6, y+1, z ) || !canPlaceTrack(player, world, x + 7, y+1, z )  ||
								!canPlaceTrack(player, world, x + 8, y+1, z) || !canPlaceTrack(player, world, x + 9, y+1, z) || !canPlaceTrack(player, world, x + 10, y+1, z ) || !canPlaceTrack(player, world, x + 11, y+1, z)) {
							return false;
						}
					}
					placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
					TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
					tcRail.setFacing(l);
					tcRail.setType(type.getLabel());

					placeTrack(world,x + 1, y + 1, z , BlockIDs.tcRailGag.block, l);
					tileGag[0] = (TileTCRailGag) world.getTileEntity(x + 1, y + 1, z);

					placeTrack(world,x + 2, y + 1, z, BlockIDs.tcRailGag.block, l);
					tileGag[1] = (TileTCRailGag) world.getTileEntity(x + 2, y + 1, z );

					if (isAnyTypeOfLongStraight) {
						tcRail.idDrop = this.type.getItem().item;
					} else {
						tcRail.idDrop = this.type.getItem().item;
					}

					if (isAnyTypeOfLongStraight
							|| isAnyTypeOfVeryLongStraight) {
						placeTrack(world,x + 3, y + 1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail2 = (TileTCRail) world.getTileEntity(x + 3, y + 1, z);
						tcRail2.setFacing(l);
						tcRail2.setType(type.getLabel());
						tcRail2.isLinkedToRail = true;
						tcRail2.linkedX = x + 1;
						tcRail2.linkedY = y + 1;
						tcRail2.linkedZ = z ;

						placeTrack(world,x + 4, y + 1, z , BlockIDs.tcRailGag.block, l);
						tileGag[2] = (TileTCRailGag) world.getTileEntity(x + 4, y + 1, z);

						placeTrack(world,x + 5, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[3] = (TileTCRailGag) world.getTileEntity(x + 5, y + 1, z);

						if (isAnyTypeOfVeryLongStraight) {
							tcRail.idDrop = this.type.getItem().item;
						} else {
							tcRail.idDrop = this.type.getItem().item;
						}
					}
					if (isAnyTypeOfVeryLongStraight) {

						placeTrack(world,x + 6, y+1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail3 = (TileTCRail) world.getTileEntity(x + 6, y + 1, z);
						tcRail3.setFacing(l);
						tcRail3.setType(type.getLabel());
						tcRail3.isLinkedToRail = true;
						tcRail3.linkedX = x + 1;
						tcRail3.linkedY = y + 1;
						tcRail3.linkedZ = z ;

						placeTrack(world,x + 7, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[4] = (TileTCRailGag) world.getTileEntity(x + 7, y + 1, z);

						placeTrack(world,x + 8, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[5] = (TileTCRailGag) world.getTileEntity(x + 8, y + 1, z);

						placeTrack(world,x + 9, y+1, z, BlockIDs.tcRail.block, l);
						TileTCRail tcRail4 = (TileTCRail) world.getTileEntity(x + 9, y + 1, z);
						tcRail4.setFacing(l);
						tcRail4.setType(type.getLabel());
						tcRail4.isLinkedToRail = true;
						tcRail4.linkedX = x + 1;
						tcRail4.linkedY = y + 1;
						tcRail4.linkedZ = z;

						placeTrack(world,x + 10, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[6] = (TileTCRailGag) world.getTileEntity(x + 10, y + 1, z);

						placeTrack(world,x + 11, y + 1, z, BlockIDs.tcRailGag.block, l);
						tileGag[7] = (TileTCRailGag) world.getTileEntity(x + 11, y + 1, z);


					}

				}


				for (int i = 0; i < tileGag.length; i++) {
					if (player !=null && tileGag[i] == null) {
						player.addChatMessage(new ChatComponentText("There was a problem when placing the track. Possibly too many tracks around"));
						return false;
					}
					tileGag[i].originX = x;
					tileGag[i].originY = y + 1;
					tileGag[i].originZ = z;
					tileGag[i].type = EnumTracks.MEDIUM_STRAIGHT.getLabel();
				}
				if (player ==null || !player.capabilities.isCreativeMode) {
					--itemstack.stackSize;
				}
				return true;
			}

			if (type == EnumTracks.SMALL_STRAIGHT || type == EnumTracks.EMBEDDED_SMALL_STRAIGHT
					|| type == EnumTracks.SMALL_ROAD_CROSSING || type == EnumTracks.SMALL_ROAD_CROSSING_1 || type == EnumTracks.SMALL_ROAD_CROSSING_2)
			{
				if (smallStraight(player,world,x,y,z,l,type) == false)
				{
					return false;
				}

				if (player ==null || !player.capabilities.isCreativeMode)
				{
					--itemstack.stackSize;
				}
				return true;
			}
		}
		return false;
	}

	private EnumTracks getPlacementDirection(EntityPlayer player, World world, int l, float par10)
	{
		if (!world.isRemote)
		{
			/** Determines if track is left or right*/
			float yaw = MathHelper.wrapAngleTo180_float(player!=null?player.rotationYaw:par10);
			tempType = type;

			if (type == EnumTracks.LARGE_TURN) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.LARGE_RIGHT_TURN;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.LARGE_LEFT_TURN;
				}
			}
			if (type == EnumTracks.VERY_LARGE_TURN) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.VERY_LARGE_RIGHT_TURN;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.VERY_LARGE_LEFT_TURN;
				}
			}
			if (type == EnumTracks.MEDIUM_TURN) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.MEDIUM_RIGHT_TURN;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.MEDIUM_LEFT_TURN;
				}
			}
			if (type == EnumTracks.SMALL_PARALLEL_CURVE) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.SMALL_RIGHT_PARALLEL_CURVE;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.SMALL_LEFT_PARALLEL_CURVE;
				}
			}
			if (type == EnumTracks.MEDIUM_PARALLEL_CURVE) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.MEDIUM_RIGHT_PARALLEL_CURVE;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.MEDIUM_LEFT_PARALLEL_CURVE;
				}
			}
			if (type == EnumTracks.LARGE_PARALLEL_CURVE) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.LARGE_RIGHT_PARALLEL_CURVE;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.LARGE_LEFT_PARALLEL_CURVE;
				}
			}
			if (type == EnumTracks.MEDIUM_SWITCH) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.MEDIUM_RIGHT_SWITCH;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.MEDIUM_LEFT_SWITCH;
				}
			}
			if (type == EnumTracks.LARGE_SWITCH) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.LARGE_RIGHT_SWITCH;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.LARGE_LEFT_SWITCH;
				}
			}
			if (type == EnumTracks.MEDIUM_PARALLEL_SWITCH) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.MEDIUM_RIGHT_PARALLEL_SWITCH;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.MEDIUM_LEFT_PARALLEL_SWITCH;
				}
			}
			if (type == EnumTracks.SUPER_LARGE_TURN) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.SUPER_LARGE_RIGHT_TURN;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.SUPER_LARGE_LEFT_TURN;
				}
			}
			if (type == EnumTracks.EMBEDDED_MEDIUM_TURN) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.EMBEDDED_MEDIUM_RIGHT_TURN;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.EMBEDDED_MEDIUM_LEFT_TURN;
				}
			}
			if (type == EnumTracks.EMBEDDED_LARGE_TURN) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.EMBEDDED_LARGE_RIGHT_TURN;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.EMBEDDED_LARGE_LEFT_TURN;
				}
			}
			if (type == EnumTracks.EMBEDDED_VERY_LARGE_TURN) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.EMBEDDED_VERY_LARGE_RIGHT_TURN;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.EMBEDDED_VERY_LARGE_LEFT_TURN;
				}
			}
			if (type == EnumTracks.EMBEDDED_SUPER_LARGE_TURN) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.EMBEDDED_SUPER_LARGE_RIGHT_TURN;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.EMBEDDED_SUPER_LARGE_LEFT_TURN;
				}
			}
            if (type == EnumTracks.EMBEDDED_SMALL_PARALLEL_CURVE) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = EnumTracks.EMBEDDED_SMALL_RIGHT_PARALLEL_CURVE;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = EnumTracks.EMBEDDED_SMALL_LEFT_PARALLEL_CURVE;
                }
            }
            if (type == EnumTracks.EMBEDDED_MEDIUM_PARALLEL_CURVE) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = EnumTracks.EMBEDDED_MEDIUM_RIGHT_PARALLEL_CURVE;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = EnumTracks.EMBEDDED_MEDIUM_LEFT_PARALLEL_CURVE;
                }
            }
            if (type == EnumTracks.EMBEDDED_LARGE_PARALLEL_CURVE) {
                if (getTrackOrientation(l, yaw).equals("right")) {
                    tempType = EnumTracks.EMBEDDED_LARGE_RIGHT_PARALLEL_CURVE;
                }
                if (getTrackOrientation(l, yaw).equals("left")) {
                    tempType = EnumTracks.EMBEDDED_LARGE_LEFT_PARALLEL_CURVE;
                }
            }
			/*if (type == EnumTracks.EMBEDDED_MEDIUM_SWITCH) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.EMBEDDED_MEDIUM_RIGHT_SWITCH;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.EMBEDDED_MEDIUM_LEFT_SWITCH;
				}
			}
			if (type == EnumTracks.EMBEDDED_LARGE_SWITCH) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.EMBEDDED_LARGE_RIGHT_SWITCH;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.EMBEDDED_LARGE_LEFT_SWITCH;
				}
			}
			if (type == EnumTracks.EMBEDDED_MEDIUM_PARALLEL_SWITCH) {
				if (getTrackOrientation(l, yaw).equals("right")) {
					tempType = EnumTracks.EMBEDDED_MEDIUM_RIGHT_PARALLEL_SWITCH;
				}
				if (getTrackOrientation(l, yaw).equals("left")) {
					tempType = EnumTracks.EMBEDDED_MEDIUM_LEFT_PARALLEL_SWITCH;
				}
			}*/
		}

		return tempType;
	}

	private boolean smallStraight(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks type)
	{
		if (!canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		placeTrack(world,x, y + 1, z, BlockIDs.tcRail.block, l);
		TileTCRail tcRail = (TileTCRail) world.getTileEntity(x, y + 1, z);
		tcRail.setFacing(l);
		tcRail.cx = x;
		tcRail.cy = y + 1;
		tcRail.cz = z;
		tcRail.setType(type.getLabel());
		tcRail.idDrop = this.type.getItem().item;

		return true;
	}

	public boolean SCurve(EntityPlayer player, World world, int x, int y, int z, int dir, EnumTracks tempType, float pyaw, int[] xArray, int[]zArray, int[] xArray2, int[] zArray2, float radius, int length, int width){
		float yaw = MathHelper.wrapAngleTo180_float(player != null ? player.rotationYaw : pyaw);
		String ori = getTrackOrientation(dir,yaw);

		if (ori.equals("right")) {
			xArray = flipArraySign(xArray);
			xArray2 = flipArraySign(xArray2);
		}

		int xOffset = 0;
		int zOffset = 0;
		double cx = 0;
		double cz = 0;
		double cx2 = 0;
		double cz2 = 0;
		int[] usedXArray = new int[0];
		int[] usedZArray = new int[0];
		int[] usedXArray2 = new int[0];
		int[] usedZArray2 = new int[0];

		if (dir==2) {
			usedXArray = flipArraySign(xArray,x,true);
			usedZArray = flipArraySign(zArray,z,true);
			usedXArray2 = flipArraySign(xArray2, x, true);
			usedZArray2 = flipArraySign(zArray2, z, true);

			if (ori.equals("right")) {
				xOffset = width;
				cx = -(radius + 0.5f);
				cx2 = -(-radius + (width - 0.5f));
			} else {
				xOffset = -width;
				cx = (radius - 0.5);
				cx2 = -(radius - width + 1.5f);

			}
			zOffset = -length;
			cz = -1f;
			cz2 = -(-length + 1);
		}
		else if (dir == 0) {
			usedXArray = flipArraySign(xArray,x,false);
			usedZArray = flipArraySign(zArray,z,false);
			usedXArray2 = flipArraySign(xArray2, x, false);
			usedZArray2 = flipArraySign(zArray2, z, false);

			if (ori.equals("right")) {
				xOffset = -width;
				cx = radius - 0.5f;
				cx2 = -(radius - (width - 0.5f - 1));

			} else {
				xOffset = width;
				cx = -(radius + 0.5);
				cx2 = -(-radius + width - 0.5f);
			}
			cz2 = -(length);
			zOffset = length;

		}
		else if (dir == 1) {
			usedXArray = flipArraySign(zArray, x, true);
			usedZArray = flipArraySign(xArray, z, false);
			usedXArray2 = flipArraySign(zArray2, x, true);
			usedZArray2 = flipArraySign(xArray2, z, false);

			if (ori.equals("right")) {
				zOffset = -width;
				cz = -(-radius + 0.5f);
				cz2 = -(radius - width + 1.5f);
			} else {
				zOffset = width;
				cz = -(radius + 0.5f);
				cz2 = -(-radius + (width - 0.5f));
			}
			xOffset = -length;
			cx = -1f;
			cx2 = -(-length + 1);
		}
		else if (dir == 3){
			usedXArray = flipArraySign(zArray, x, false);
			usedZArray = flipArraySign(xArray, z, true);
			usedXArray2 = flipArraySign(zArray2, x, false);
			usedZArray2 = flipArraySign(xArray2, z, true);
			if (ori.equals("right")) {
				zOffset = width;
				cz = -(radius + 0.5f);
				cz2 = radius - (width - 0.5f);

			} else {
				zOffset = -width;
				cz = -(-radius + 0.5f);
				cz2 = -(radius - (width - 0.5) + 1);
			}
			cx2 = -length;
			xOffset = length;

		}
		if (usedXArray.length == 0) {
			return false;
		}

		for (int check = 0; check < usedXArray.length; check++){
			if (!canPlaceTrack(player, world, usedXArray[check], y + 1, usedZArray[check])
					|| !canPlaceTrack(player, world, usedXArray2[check], y + 1, usedZArray2[check])){
				return false;
			}
		}


		if (!putDownTurn(player, world, false, x, y, z, usedXArray, usedZArray, dir, false, dir, (x + xOffset), (z + zOffset), radius, x - cx,
				y + 1, z - cz, tempType.getLabel(), tempType.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x, y + 1, z);


		if (tcRailTurn != null) {
			tcRailTurn.hasModel = true;
			if (!putDownTurn(player, world, false, x, y, z, usedXArray2, usedZArray2, dir, false, dir, (x + xOffset), (z + zOffset), radius, x - cx2,
					y + 1, z - cz2, EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), (Item) null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(usedXArray2[0], y + 1, usedZArray2[0]);

			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = usedXArray2[0];
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = usedZArray2[0];
		}
		return true;

	}

	private boolean parallelRightSwitchEast(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x + check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(player, world, x + 3, y + 1, z + 1) || !canPlaceTrack(player, world, x + 4, y + 1, z + 1) || !canPlaceTrack(player, world, x + 5, y + 1, z + 1) || !canPlaceTrack(player, world, x + 4, y + 1, z + 2) || !canPlaceTrack(player, world, x + 5, y + 1, z + 2) || !canPlaceTrack(player, world, x + 6, y + 1, z + 2) || !canPlaceTrack(player, world, x + 7, y + 1, z + 2) || !canPlaceTrack(player, world, x + 8, y + 1, z + 2) || !canPlaceTrack(player, world, x + 6, y + 1, z + 3) || !canPlaceTrack(player, world, x + 7, y + 1, z + 3) || !canPlaceTrack(player, world, x + 8, y + 1, z + 3) || !canPlaceTrack(player, world, x + 9, y + 1, z + 3) || !canPlaceTrack(player, world, x + 10, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 3, x + 2, x + 4, x + 5 };
		int[] zArray = { z + 1, z + 1, z + 1, z + 1 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 3, x + 10, z, 8.5, x + 0.5, y + 1, z + 9,
				EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), tempType.getItem().item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z + 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x + 1, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, tempType.getLabel(), true, x + 3, y + 1, z + 1, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x + 2, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, typeVariantStraightLabel, false, x + 3, y + 1, z + 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x + 3, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, typeVariantStraightLabel, false, x + 3, y + 1, z + 1, true, false);

			int[] xArray2 = {x + 4, x + 5, x + 6, x + 7, x + 8, x + 6, x + 7, x + 8, x + 9};
			int[] zArray2 = {z + 2, z + 2, z + 2, z + 2, z + 2, z + 3, z + 3, z + 3, z + 3};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 0, true, 3, x + 10, z + 3, 8.5, x + 10, y + 1, z - 5,
					EnumTracks.MEDIUM_LEFT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 4, y + 1, z + 2);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x + 3;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z + 1;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x + 4;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z + 2;
		}
		/** Put down straight **/
		putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 3, y + 1, z + 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x + straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 3, y + 1, z + 1, false, false);
		}
		return true;
	}

	private boolean parallelRightSwitchWest(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x - check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(player, world, x - 3, y + 1, z - 1) || !canPlaceTrack(player, world, x - 4, y + 1, z - 1) || !canPlaceTrack(player, world, x - 5, y + 1, z - 1) || !canPlaceTrack(player, world, x - 4, y + 1, z - 2) || !canPlaceTrack(player, world, x - 5, y + 1, z - 2) || !canPlaceTrack(player, world, x - 6, y + 1, z - 2) || !canPlaceTrack(player, world, x - 7, y + 1, z - 2) || !canPlaceTrack(player, world, x - 8, y + 1, z - 2) || !canPlaceTrack(player, world, x - 6, y + 1, z - 3) || !canPlaceTrack(player, world, x - 7, y + 1, z - 3) || !canPlaceTrack(player, world, x - 8, y + 1, z - 3) || !canPlaceTrack(player, world, x - 9, y + 1, z - 3) || !canPlaceTrack(player, world, x - 10, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 3, x - 2, x - 4, x - 5 };
		int[] zArray = { z - 1, z - 1, z - 1, z - 1 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 10, z, 8.5, x + 0.5, y + 1, z - 8,
				EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z - 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x - 1, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, tempType.getLabel(), true, x - 3, y + 1, z - 1, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x - 2, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, typeVariantStraightLabel, false, x - 3, y + 1, z - 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x - 3, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, typeVariantStraightLabel, false, x - 3, y + 1, z - 1, true, false);

			int[] xArray2 = {x - 4, x - 5, x - 6, x - 7, x - 8, x - 6, x - 7, x - 8, x - 9};
			int[] zArray2 = {z - 2, z - 2, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 3};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 2, true, 1, x - 10, z - 3, 8.5, x - 9, y + 1, z + 6,
					EnumTracks.MEDIUM_LEFT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 4, y + 1, z - 2);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x - 3;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z - 1;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x - 4;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z - 2;
		}

		/** Put down straight **/
		putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 3, y + 1, z - 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 3, y + 1, z - 1, false, false);
		}
		return true;
	}

	private boolean parallelRightSwitchSouth(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x, y + 1, z + check))
				return false;
		}
		if (!canPlaceTrack(player, world, x - 1, y + 1, z + 3) || !canPlaceTrack(player, world, x - 1, y + 1, z + 4) || !canPlaceTrack(player, world, x - 1, y + 1, z + 5) || !canPlaceTrack(player, world, x - 2, y + 1, z + 4) || !canPlaceTrack(player, world, x - 2, y + 1, z + 5) || !canPlaceTrack(player, world, x - 2, y + 1, z + 6) || !canPlaceTrack(player, world, x - 2, y + 1, z + 7) || !canPlaceTrack(player, world, x - 2, y + 1, z + 8) || !canPlaceTrack(player, world, x - 3, y + 1, z + 6) || !canPlaceTrack(player, world, x - 3, y + 1, z + 7) || !canPlaceTrack(player, world, x - 3, y + 1, z + 8) || !canPlaceTrack(player, world, x - 3, y + 1, z + 9) || !canPlaceTrack(player, world, x - 3, y + 1, z + 10) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 1, x - 1, x - 1, x - 1 };
		int[] zArray = { z + 3, z + 2, z + 4, z + 5 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x, z + 10, 8.5, x - 8, y + 1, z + 0.5,
				EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z + 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x, y + 1, z + 1, l, x - 8, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x - 1, y + 1, z + 3, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z + 2, l, x - 8, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x, y + 1, z + 3, l, x - 8, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x - 1, y + 1, z + 3, true, false);

			int[] xArray2 = {x - 2, x - 2, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 3};
			int[] zArray2 = {z + 4, z + 5, z + 6, z + 7, z + 8, z + 6, z + 7, z + 8, z + 9};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 1, true, 0, x - 3, z + 10, 8.5, x + 6, y + 1, z + 10,
					EnumTracks.MEDIUM_LEFT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 2, y + 1, z + 4);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x - 1;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z + 3;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x - 2;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z + 4;
		}
		/** Put down straight **/
		putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 1, y + 1, z + 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x, y + 1, z + straight, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 1, y + 1, z + 3, false, false);
		}
		return true;
	}

	private boolean parallelRightSwitchNorth(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType)
	{
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x, y + 1, z - check))
				return false;
		}
		if (!canPlaceTrack(player, world, x + 1, y + 1, z - 3) || !canPlaceTrack(player, world, x + 1, y + 1, z - 4) || !canPlaceTrack(player, world, x + 1, y + 1, z - 5) || !canPlaceTrack(player, world, x + 2, y + 1, z - 4) || !canPlaceTrack(player, world, x + 2, y + 1, z - 5) || !canPlaceTrack(player, world, x + 2, y + 1, z - 6) || !canPlaceTrack(player, world, x + 2, y + 1, z - 7) || !canPlaceTrack(player, world, x + 2, y + 1, z - 8) || !canPlaceTrack(player, world, x + 3, y + 1, z - 6) || !canPlaceTrack(player, world, x + 3, y + 1, z - 7) || !canPlaceTrack(player, world, x + 3, y + 1, z - 8) || !canPlaceTrack(player, world, x + 3, y + 1, z - 9) || !canPlaceTrack(player, world, x + 3, y + 1, z - 10) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 1, x + 1, x + 1, x + 1 };
		int[] zArray = { z - 3, z - 2, z - 4, z - 5 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x, z - 10, 8.5, x + 9, y + 1, z + 0.5,
				EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z - 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x, y + 1, z - 1, l, x + 9, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x + 1, y + 1, z - 3, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z - 2, l, x + 9, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x, y + 1, z - 3, l, x + 9, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x + 1, y + 1, z - 3, true, false);

			int[] xArray2 = {x + 2, x + 2, x + 2, x + 2, x + 2, x + 3, x + 3, x + 3, x + 3};
			int[] zArray2 = {z - 4, z - 5, z - 6, z - 7, z - 8, z - 6, z - 7, z - 8, z - 9};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 3, true, 2, x + 3, z - 10, 8.5, x - 5, y + 1, z - 9,
					EnumTracks.MEDIUM_LEFT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 2, y + 1, z - 4);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x + 1;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z - 3;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x + 2;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z - 4;
		}
		/** Put down straight **/
		putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 1, y + 1, z - 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x, y + 1, z - straight, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 1, y + 1, z - 3, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchNorth(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x, y + 1, z - check))
				return false;
		}
		if (!canPlaceTrack(player, world, x - 1, y + 1, z - 3) || !canPlaceTrack(player, world, x - 1, y + 1, z - 4) || !canPlaceTrack(player, world, x - 1, y + 1, z - 5) || !canPlaceTrack(player, world, x - 2, y + 1, z - 4) || !canPlaceTrack(player, world, x - 2, y + 1, z - 5) || !canPlaceTrack(player, world, x - 2, y + 1, z - 6) || !canPlaceTrack(player, world, x - 2, y + 1, z - 7) || !canPlaceTrack(player, world, x - 2, y + 1, z - 8) || !canPlaceTrack(player, world, x - 3, y + 1, z - 6) || !canPlaceTrack(player, world, x - 3, y + 1, z - 7) || !canPlaceTrack(player, world, x - 3, y + 1, z - 8) || !canPlaceTrack(player, world, x - 3, y + 1, z - 9) || !canPlaceTrack(player, world, x - 3, y + 1, z - 10) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 1, x - 1, x - 1, x - 1 };
		int[] zArray = { z - 3, z - 2, z - 4, z - 5 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 2, x, z - 10, 8.5, x - 8, y + 1, z + 0.5,
				EnumTracks.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 1, y + 1, z - 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x, y + 1, z - 1, l, x - 8, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x - 1, y + 1, z - 3, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z - 2, l, x - 8, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x, y + 1, z - 3, l, x - 8, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x - 1, y + 1, z - 3, true, false);

			int[] xArray2 = {x - 2, x - 2, x - 2, x - 2, x - 2, x - 3, x - 3, x - 3, x - 3};
			int[] zArray2 = {z - 4, z - 5, z - 6, z - 7, z - 8, z - 6, z - 7, z - 8, z - 9};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 1, true, 2, x - 3, z - 10, 8.5, x + 6, y + 1, z - 9,
					EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 2, y + 1, z - 4);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x - 1;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z - 3;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x - 2;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z - 4;
		}
		/** Put down straight **/
		putDownSingleRail(world, x, y + 1, z - 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 1, y + 1, z - 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x, y + 1, z - straight, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 1, y + 1, z - 3, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchSouth(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x, y + 1, z + check))
				return false;
		}
		if (!canPlaceTrack(player, world, x + 1, y + 1, z + 3) || !canPlaceTrack(player, world, x + 1, y + 1, z + 4) || !canPlaceTrack(player, world, x + 1, y + 1, z + 5) || !canPlaceTrack(player, world, x + 2, y + 1, z + 4) || !canPlaceTrack(player, world, x + 2, y + 1, z + 5) || !canPlaceTrack(player, world, x + 2, y + 1, z + 6) || !canPlaceTrack(player, world, x + 2, y + 1, z + 7) || !canPlaceTrack(player, world, x + 2, y + 1, z + 8) || !canPlaceTrack(player, world, x + 3, y + 1, z + 6) || !canPlaceTrack(player, world, x + 3, y + 1, z + 7) || !canPlaceTrack(player, world, x + 3, y + 1, z + 8) || !canPlaceTrack(player, world, x + 3, y + 1, z + 9) || !canPlaceTrack(player, world, x + 3, y + 1, z + 10) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 1, x + 1, x + 1, x + 1 };
		int[] zArray = { z + 3, z + 2, z + 4, z + 5 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 0, x, z + 10, 8.5, x + 9, y + 1, z + 0.5,
				EnumTracks.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 1, y + 1, z + 3);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x, y + 1, z + 1, l, x + 9, y + 1, z + 0.5, 8.5, tempType.getLabel(), true, x + 1, y + 1, z + 3, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x, y + 1, z + 2, l, x + 9, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 3, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x, y + 1, z + 3, l, x + 9, y + 1, z + 0.5, 8.5, typeVariantStraightLabel, false, x + 1, y + 1, z + 3, true, false);

			int[] xArray2 = {x + 2, x + 2, x + 2, x + 2, x + 2, x + 3, x + 3, x + 3, x + 3};
			int[] zArray2 = {z + 4, z + 5, z + 6, z + 7, z + 8, z + 6, z + 7, z + 8, z + 9};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 3, true, 0, x + 3, z + 10, 8.5, x - 5, y + 1, z + 10,
					EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 2, y + 1, z + 4);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x + 1;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z + 3;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x + 2;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z + 4;
		}
		/** Put down straight **/
		putDownSingleRail(world, x, y + 1, z + 4, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 1, y + 1, z + 3, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x, y + 1, z + straight, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 1, y + 1, z + 3, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchEast(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x + check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(player, world, x + 3, y + 1, z - 1) || !canPlaceTrack(player, world, x + 4, y + 1, z - 1) || !canPlaceTrack(player, world, x + 5, y + 1, z - 1) || !canPlaceTrack(player, world, x + 4, y + 1, z - 2) || !canPlaceTrack(player, world, x + 5, y + 1, z - 2) || !canPlaceTrack(player, world, x + 6, y + 1, z - 2) || !canPlaceTrack(player, world, x + 7, y + 1, z - 2) || !canPlaceTrack(player, world, x + 8, y + 1, z - 2) || !canPlaceTrack(player, world, x + 6, y + 1, z - 3) || !canPlaceTrack(player, world, x + 7, y + 1, z - 3) || !canPlaceTrack(player, world, x + 8, y + 1, z - 3) || !canPlaceTrack(player, world, x + 9, y + 1, z - 3) || !canPlaceTrack(player, world, x + 10, y + 1, z - 3) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x + 3, x + 2, x + 4, x + 5 };
		int[] zArray = { z - 1, z - 1, z - 1, z - 1 };
		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 3, x + 10, z, 8.5, x + 0.5, y + 1, z - 8,
				EnumTracks.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x + 3, y + 1, z - 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x + 1, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, tempType.getLabel(), true, x + 3, y + 1, z - 1, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x + 2, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, typeVariantStraightLabel, false, x + 3, y + 1, z - 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x + 3, y + 1, z, l, x + 0.5, y + 1, z - 8, 8.5, typeVariantStraightLabel, false, x + 3, y + 1, z - 1, true, false);

			int[] xArray2 = {x + 4, x + 5, x + 6, x + 7, x + 8, x + 6, x + 7, x + 8, x + 9};
			int[] zArray2 = {z - 2, z - 2, z - 2, z - 2, z - 2, z - 3, z - 3, z - 3, z - 3};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 2, true, 3, x + 10, z - 3, 8.5, x + 10, y + 1, z + 6,
					EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x + 4, y + 1, z - 2);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;

				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x + 3;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z - 1;
			}
				tcRailTurn.isLinkedToRail = true;
				tcRailTurn.linkedX = x + 4;
				tcRailTurn.linkedY = y + 1;
				tcRailTurn.linkedZ = z - 2;
		}
		/** Put down straight **/
		putDownSingleRail(world, x + 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x + 3, y + 1, z - 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x + straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x + 3, y + 1, z - 1, false, false);
		}
		return true;
	}

	private boolean parallelLeftSwitchWest(EntityPlayer player, World world, int x, int y, int z, int l, EnumTracks tempType) {
		for (int check = 1; check < 10; check++) {
			if (!canPlaceTrack(player, world, x - check, y + 1, z))
				return false;
		}
		if (!canPlaceTrack(player, world, x - 3, y + 1, z + 1) || !canPlaceTrack(player, world, x - 4, y + 1, z + 1) || !canPlaceTrack(player, world, x - 5, y + 1, z + 1) || !canPlaceTrack(player, world, x - 4, y + 1, z + 2) || !canPlaceTrack(player, world, x - 5, y + 1, z + 2) || !canPlaceTrack(player, world, x - 6, y + 1, z + 2) || !canPlaceTrack(player, world, x - 7, y + 1, z + 2) || !canPlaceTrack(player, world, x - 8, y + 1, z + 2) || !canPlaceTrack(player, world, x - 6, y + 1, z + 3) || !canPlaceTrack(player, world, x - 7, y + 1, z + 3) || !canPlaceTrack(player, world, x - 8, y + 1, z + 3) || !canPlaceTrack(player, world, x - 9, y + 1, z + 3) || !canPlaceTrack(player, world, x - 10, y + 1, z + 3) || !canPlaceTrack(player, world, x, y + 1, z)) {
			return false;
		}
		int[] xArray = { x - 3, x - 2, x - 4, x - 5 };
		int[] zArray = { z + 1, z + 1, z + 1, z + 1 };

		if (!putDownTurn(player, world, true, x, y, z, xArray, zArray, l, true, 1, x - 10, z, 8.5, x + 0.5, y + 1, z + 9,
				EnumTracks.MEDIUM_LEFT_TURN.getLabel(), ItemIDs.tcRailMediumParallelSwitch.item))
			return false;
		TileTCRail tcRailTurn = (TileTCRail) world.getTileEntity(x - 3, y + 1, z + 1);
		if (tcRailTurn != null) {
			tcRailTurn.hasModel = false;

			/** Switch rail 1 */
			putDownSingleRail(world, x - 1, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, tempType.getLabel(), true, x - 3, y + 1, z + 1, false, false);

			/** Switch rail 2 **/
			putDownSingleRail(world, x - 2, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, typeVariantStraightLabel, false, x - 3, y + 1, z + 1, true, false);
			/** Switch rail 3 **/
			putDownSingleRail(world, x - 3, y + 1, z, l, x + 0.5, y + 1, z + 9, 8.5, typeVariantStraightLabel, false, x - 3, y + 1, z + 1, true, false);

			int[] xArray2 = {x - 4, x - 5, x - 6, x - 7, x - 8, x - 6, x - 7, x - 8, x - 9};
			int[] zArray2 = {z + 2, z + 2, z + 2, z + 2, z + 2, z + 3, z + 3, z + 3, z + 3};
			if (!putDownTurn(player, world, false, x, y, z, xArray2, zArray2, 0, true, 1, x - 10, z + 3, 8.5, x - 9, y + 1, z - 5,
					EnumTracks.MEDIUM_RIGHT_TURN.getLabel(), null))
				return false;
			TileTCRail tcRailTurn2 = (TileTCRail) world.getTileEntity(x - 4, y + 1, z + 2);
			if (tcRailTurn2 != null) {
				tcRailTurn2.hasModel = false;
				tcRailTurn2.isLinkedToRail = true;
				tcRailTurn2.linkedX = x - 3;
				tcRailTurn2.linkedY = y + 1;
				tcRailTurn2.linkedZ = z + 1;
			}
			tcRailTurn.isLinkedToRail = true;
			tcRailTurn.linkedX = x - 4;
			tcRailTurn.linkedY = y + 1;
			tcRailTurn.linkedZ = z + 2;
		}
		/** Put down straight **/
		putDownSingleRail(world, x - 4, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, false, x - 3, y + 1, z + 1, false, false);
		for (int straight = 5; straight < 10; straight++) {
			putDownSingleRail(world, x - straight, y + 1, z, l, x, y + 1, z, 0, typeVariantStraightLabel, true, x - 3, y + 1, z + 1, false, false);
		}
		return true;
	}

	private boolean turnTrack(EntityPlayer player, World world, int x, int y, int z, int dir, EnumTracks tempType, float pyaw, int[] xArray, int[]zArray, float radius){

		float yaw = MathHelper.wrapAngleTo180_float(player != null ? player.rotationYaw : pyaw);
		String orientation = getTrackOrientation(dir,yaw);

		if (orientation.equals("right")) {
			xArray = flipArraySign(xArray);
		}

		double cx = 0;
		double cz = 0;
		int[] usedXArray = new int[0];
		int[] usedZArray = new int[0];

		int xOffset = 0;
		int zOffset = 0;

		if (dir == 2){
			usedXArray = flipArraySign(xArray,x,true);
			usedZArray = flipArraySign(zArray,z,true);
			cx = orientation.equals("right") ? -(radius + 0.5f) : (radius - 0.5);
			cz = -1f;
		}
		else if (dir == 0){
			usedXArray = flipArraySign(xArray,x,false);
			usedZArray = flipArraySign(zArray,z,false);
			cx = orientation.equals("right") ? radius - 0.5f : -(radius + 0.5);
		}
		else if (dir == 1){
			usedXArray = flipArraySign(zArray, x, true);
			usedZArray = flipArraySign(xArray, z, false);
			cz = orientation.equals("right") ? -(-radius + 0.5f) : -(radius + 0.5f);
			cx = -1f;
		}
		else if (dir == 3){
			usedXArray = flipArraySign(zArray, x, false);
			usedZArray = flipArraySign(xArray, z, true);
			cz = orientation.equals("right") ? -(radius + 0.5f) : -(-radius + 0.5f) ;
		}

		if (usedXArray.length == 0) {
			return false;
		}

		for (int check = 0; check < usedXArray.length; check++){
			if (!canPlaceTrack(player, world, usedXArray[check], y + 1, usedZArray[check])){
				return false;
			}
		}

		if (!putDownTurn(player, world, false, x, y, z, usedXArray, usedZArray, dir, false, dir, (x + xOffset), (z + zOffset), radius, x - cx,
				y + 1, z - cz, tempType.getLabel(), tempType.getItem().item))
			return false;

		return true;
	}

	/**
	 * changes the sign of an array and adds the current world pos to it
	 */
	public int[] flipArraySign(int[] array, int pos, boolean needsConverting) {
		if (needsConverting)
			for (int i = 0; i < array.length; i++) {
				array[i] = (array[i] * -1) + pos;
			}
		else {
			for (int i = 0; i < array.length; i++) {
				array[i] = (array[i] + pos);
			}
		}

		return array;
	}

	public int[] flipArraySign(int[] array) {
		for(int i=0;i<array.length;i++) {
			array[i] = (array[i] * -1);
		}
		return array;
	}

	/**
	 * Drop the previous block before placing the track.
	 */
	private void placeTrack(World world, int x, int y, int z, Block block, int metadata){
		Block removed = world.getBlock(x, y, z);
		if(removed != null){
			removed.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
		}
		world.setBlock(x, y, z, block, metadata, 3);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("\u00a77" + type.getTooltip());
	}

	public EnumTracks getTrackType() {
		return this.type;
	}
}
