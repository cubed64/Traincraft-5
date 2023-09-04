package com.jcirmodelsquad.tcjcir.extras;

import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import train.common.api.Locomotive;

import java.util.List;



public class PeachyUtil {
    public static boolean isIndexOutOfBounds(final List list, int index) {
        return index < 0 || index >= list.size();
    }


    static public Vec3 xyz(int x, int y, int z) {
        return Vec3.createVectorHelper(x, y, z);
    }

    static public Vec3 xyz(double x, double y, double z) {
        return Vec3.createVectorHelper(x, y, z);
    }

    public static double getDistanceWithDirection(Locomotive loco1, Locomotive loco2) {

        Vec3 player1Pos = xyz((int) loco1.posX, (int) loco1.posY, (int) loco1.posZ);
        Vec3 player2Pos = xyz((int) loco2.posX, (int) loco2.posY, (int) loco2.posZ);

        float rotationYaw = loco1.rotationYaw;
        float rotationPitch = loco1.rotationPitch;

        double lookX = MathHelper.cos(-rotationYaw * 0.017453292F - (float) Math.PI);
        double lookY = -MathHelper.sin(-rotationPitch * 0.017453292F);
        double lookZ = -MathHelper.sin(-rotationYaw * 0.017453292F - (float) Math.PI);

        Vec3 player1LookVec = Vec3.createVectorHelper(lookX, lookY, lookZ);



        Vec3 player2ToPlayer1 = player1Pos.subtract(player2Pos);

        double dotProduct = player2ToPlayer1.dotProduct(player1LookVec);
        double distance = player1Pos.distanceTo(player2Pos);

        if (dotProduct < 0) {
            // Player 2 is behind Player 1
            distance = -distance;
        }

        return distance;
    }

    public static double getDistanceWithDirection(Vec3 train1Pos, float rotationYaw, float rotationPitch, Vec3 train2Pos) {


        double lookX = MathHelper.cos(-rotationYaw * 0.017453292F - (float) Math.PI);
        double lookY = -MathHelper.sin(-rotationPitch * 0.017453292F);
        double lookZ = -MathHelper.sin(-rotationYaw * 0.017453292F - (float) Math.PI);

        Vec3 train1LookVec = Vec3.createVectorHelper(lookX, lookY, lookZ);
        Vec3 train2ToTrain1 = train1Pos.subtract(train2Pos);

        double dotProduct = train2ToTrain1.dotProduct(train1LookVec);
        double distance = train1Pos.distanceTo(train2Pos);

        if (dotProduct < 0) {
            // Player 2 is behind Player 1
            distance = -distance;
        }

        return distance;
    }

    public static boolean isInside(Vec3 loc, Vec3 l1, Vec3 l2) {

        int x1 = (int) Math.min(l1.xCoord, l2.xCoord);
        int y1 = (int) Math.min(l1.yCoord, l2.yCoord);
        int z1 = (int) Math.min(l1.zCoord, l2.zCoord);
        int x2 = (int) Math.max(l1.xCoord, l2.xCoord);
        int y2 = (int) Math.max(l1.yCoord, l2.yCoord);
        int z2 = (int) Math.max(l1.zCoord, l2.zCoord);

        return loc.xCoord >= x1 && loc.xCoord <= x2 && loc.yCoord >= y1 && loc.yCoord <= y2 && loc.zCoord >= z1 && loc.zCoord <= z2;
    }
}
