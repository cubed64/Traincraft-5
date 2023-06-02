package com.jcirmodelsquad.tcjcir.features.signal.vbc;

import mods.railcraft.api.signals.SignalAspect;
import net.minecraft.util.Vec3;

public class SignalSection {


    public Vec3[] positions;
    public int speedLimit;
    public String identifier;

    public SignalSection(Vec3[] positions, int speedLimit, String identifier, String prev, String next) {
        this.positions = positions;
        this.speedLimit = speedLimit;
        this.identifier = identifier;
        this.next = next;
        this.prev = prev;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public String next;
    public String prev;



    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public boolean getOccupiedBy() {
        return occupied;
    }

    public void setOccupiedBy(boolean occupiedBy) {
        this.occupied = occupiedBy;
    }

    public boolean occupied;

    public SignalAspect getAspect() {
        return aspect;
    }

    public void setAspect(SignalAspect aspect) {
        this.aspect = aspect;
    }

    public SignalAspect aspect = SignalAspect.BLINK_YELLOW;
    public Vec3[] getPositions() {
        return positions;
    }

    public void setPositions(Vec3[] positions) {
        this.positions = positions;
    }

    public SignalSection() {}


}
