package com.jcirmodelsquad.tcjcir.features.signal.dynamic;

import net.minecraft.util.Vec3;

public class Track {
        Vec3 boundA;
        Vec3 boundB;
        int speedLimit;

        public Track() {

        }

        public Track(Vec3 boundA, Vec3 boundB, int speedLimit) {
            this.boundA = boundA;
            this.boundB = boundB;
            this.speedLimit = speedLimit;
        }

    public Vec3 getBoundA() {
        return boundA;
    }

    public void setBoundA(Vec3 boundA) {
        this.boundA = boundA;
    }

    public Vec3 getBoundB() {
        return boundB;
    }

    public void setBoundB(Vec3 boundB) {
        this.boundB = boundB;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
