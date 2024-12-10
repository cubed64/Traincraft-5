package train.common.api.pathfinding;

import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.tileentity.TileEntity;
import train.common.blocks.BlockTCRail;
import train.common.blocks.BlockTCRailGag;
import train.common.library.EnumTracks;
import train.common.tile.TileTCRail;

import java.util.List;

/**Meant to simplifying updates for path finding by having a single dedicated location for shared path finding calculations
 *
 */
public class PathFindingHelper
{
    /**
     *
     * @param entityMinecart
     * @param i posX
     * @param j posY
     * @param k posZ
     * @param cx
     * @param cz
     * @param meta
     */
    public void moveOnTCStraight(EntityMinecart entityMinecart, int i, int j, int k, double cx, double cz, int meta) {
        entityMinecart.posY = j + 0.2;
        if (meta == 2 || meta == 0) {
            double norm = Math.sqrt(entityMinecart.motionX * entityMinecart.motionX + entityMinecart.motionZ * entityMinecart.motionZ);

            entityMinecart.setPosition(cx + 0.5, entityMinecart.posY + entityMinecart.yOffset, entityMinecart.posZ);
            //setPosition(posX, posY + yOffset, posZ);

            entityMinecart.motionX = 0;
            entityMinecart.motionZ = Math.copySign(norm, entityMinecart.motionZ);
            entityMinecart.boundingBox.offset(0, 0 , Math.copySign(norm, entityMinecart.motionZ));

            List boxes = entityMinecart.worldObj.getCollidingBoundingBoxes(entityMinecart, entityMinecart.boundingBox);
            for(Object b : boxes){
                if(!(b instanceof BlockRailBase) && !(b instanceof BlockTCRail) && !(b instanceof BlockTCRailGag) && !(b instanceof BlockAir)){
                    return;
                }
            }
            entityMinecart.posX = (entityMinecart.boundingBox.minX + entityMinecart.boundingBox.maxX) / 2.0D;
            entityMinecart.posY = entityMinecart.boundingBox.minY + (double)entityMinecart.yOffset - (double)entityMinecart.ySize;
            entityMinecart.posZ = (entityMinecart.boundingBox.minZ + entityMinecart.boundingBox.maxZ) / 2.0D;

            //System.out.println("straight z "+Math.copySign(norm, motionZ));
        }
        if (meta == 1 || meta == 3) {

            entityMinecart.setPosition(entityMinecart.posX, entityMinecart.posY + entityMinecart.yOffset, cz + 0.5);
            //setPosition(posX, posY + yOffset, posZ);

            entityMinecart.motionX = Math.copySign(Math.sqrt(entityMinecart.motionX * entityMinecart.motionX + entityMinecart.motionZ * entityMinecart.motionZ), entityMinecart.motionX);
            entityMinecart.motionZ = 0;
            entityMinecart.boundingBox.offset(entityMinecart.motionX, 0 , 0);

            List boxes = entityMinecart.worldObj.getCollidingBoundingBoxes(entityMinecart, entityMinecart.boundingBox);
            for(Object b : boxes){
                if(!(b instanceof BlockRailBase) && !(b instanceof BlockTCRail) && !(b instanceof BlockTCRailGag) && !(b instanceof BlockAir)){
                    return;
                }
            }
            entityMinecart.posX = (entityMinecart.boundingBox.minX + entityMinecart.boundingBox.maxX) / 2.0D;
            entityMinecart.posY = entityMinecart.boundingBox.minY + (double)entityMinecart.yOffset - (double)entityMinecart.ySize;
            entityMinecart.posZ = (entityMinecart.boundingBox.minZ + entityMinecart.boundingBox.maxZ) / 2.0D;

            //System.out.println("straight x "+Math.copySign(norm, motionX));
        }
    }

    public void moveOnTCDiagonal(EntityMinecart entityMinecart, int i, int j, int k, double cx, double cz, int meta, double length)
    {
        double Y_OFFSET = 0.2;
        double X_OFFSET = 0.5;
        double Z_OFFSET = 1.5;
        entityMinecart.posY = j + Y_OFFSET;

        double exitX = 0;
        double exitZ = 0;
        double directionX;
        double directionZ;
        double norm = Math.sqrt(entityMinecart.motionX * entityMinecart.motionX + entityMinecart.motionZ * entityMinecart.motionZ);
        double distanceNorm;

        if (meta == 6) {
            exitX = (entityMinecart.motionX > 0) ? cx + length + X_OFFSET : cx - X_OFFSET;
            exitZ = (entityMinecart.motionX > 0) ? cz - length + X_OFFSET : cz + Z_OFFSET;
        } else if (meta == 4) {
            exitX = (entityMinecart.motionX > 0) ? cx + Z_OFFSET : cx - (length - X_OFFSET);
            exitZ = (entityMinecart.motionX > 0) ? cz - X_OFFSET : cz + (length + X_OFFSET);
        } else if (meta == 5) {
            exitX = (entityMinecart.motionX > 0) ? cx + Z_OFFSET : cx - (length + X_OFFSET);
            exitZ = (entityMinecart.motionX > 0) ? cz + Z_OFFSET : cz - (length + X_OFFSET);
        } else if (meta == 7) {
            exitX = (entityMinecart.motionX > 0) ? cx + (length + X_OFFSET) : cx - X_OFFSET;
            exitZ = (entityMinecart.motionX > 0) ? cz + (length + X_OFFSET) : cz - X_OFFSET;
        }

        directionX = exitX - entityMinecart.posX;
        directionZ = exitZ - entityMinecart.posZ;
        distanceNorm = Math.sqrt(directionX * directionX + directionZ * directionZ);
        entityMinecart.motionX = (directionX / distanceNorm) * norm;
        entityMinecart.motionZ = (directionZ / distanceNorm) * norm;
        entityMinecart.boundingBox.offset(Math.copySign(entityMinecart.motionX, entityMinecart.motionX), 0 , Math.copySign(entityMinecart.motionZ, entityMinecart.motionZ));

        List boxes = entityMinecart.worldObj.getCollidingBoundingBoxes(entityMinecart, entityMinecart.boundingBox);
        for(Object b : boxes){
            if(!(b instanceof BlockRailBase) && !(b instanceof BlockTCRail) && !(b instanceof BlockTCRailGag) && !(b instanceof BlockAir)){
                return;
            }
        }
        entityMinecart.posX = (entityMinecart.boundingBox.minX + entityMinecart.boundingBox.maxX) / 2.0D;
        entityMinecart.posY = entityMinecart.boundingBox.minY + (double)entityMinecart.yOffset - (double)entityMinecart.ySize;
        entityMinecart.posZ = (entityMinecart.boundingBox.minZ + entityMinecart.boundingBox.maxZ) / 2.0D;
    }

    public boolean shouldIgnoreSwitch(EntityMinecart entityMinecart, TileTCRail tile, int i, int j, int k, int meta) {
        if (tile != null
                && (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_TURN.getLabel())
                || tile.getType().equals(EnumTracks.MEDIUM_LEFT_TURN.getLabel())
                || tile.getType().equals(EnumTracks.LARGE_LEFT_TURN.getLabel())
                || tile.getType().equals(EnumTracks.LARGE_RIGHT_TURN.getLabel()))
                && tile.canTypeBeModifiedBySwitch) {
            if (meta == 2) {
                if (entityMinecart.motionZ > 0 && Math.abs(entityMinecart.motionX) < 0.01) {
                    TileEntity tile2 = entityMinecart.worldObj.getTileEntity(i, j, k + 1);
                    if (tile2 != null && tile2 instanceof TileTCRail) {
                        ((TileTCRail) tile2).setSwitchState(false, true);
                    }
                    return true;
                }
            }
            if (meta == 0) {
                if (entityMinecart.motionZ < 0 && Math.abs(entityMinecart.motionX) < 0.01) {
                    TileEntity tile2 = entityMinecart.worldObj.getTileEntity(i, j, k - 1);
                    if (tile2 != null && tile2 instanceof TileTCRail) {
                        ((TileTCRail) tile2).setSwitchState(false, true);
                    }
                    return true;
                }
            }
            if (meta == 1) {
                if (Math.abs(entityMinecart.motionZ) < 0.01 && entityMinecart.motionX > 0) {
                    TileEntity tile2 = entityMinecart.worldObj.getTileEntity(i + 1, j, k);
                    if (tile2 != null && tile2 instanceof TileTCRail) {
                        ((TileTCRail) tile2).setSwitchState(false, true);
                    }
                    return true;
                }
            }
            if (meta == 3) {
                if (Math.abs(entityMinecart.motionZ) < 0.01 && entityMinecart.motionX < 0) {
                    TileEntity tile2 = entityMinecart.worldObj.getTileEntity(i - 1, j, k);
                    if (tile2 != null && tile2 instanceof TileTCRail) {
                        ((TileTCRail) tile2).setSwitchState(false, true);
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
