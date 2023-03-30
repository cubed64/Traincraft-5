package train.common.mtc.vbc;

import mods.railcraft.api.signals.SignalAspect;
import net.minecraft.util.Vec3;

public class SignalSection {
    public Vec3 startPos;

    public Vec3 endPos;
    public int speedLimit;
    public String identifier;

    public SignalSection(Vec3 startPos, Vec3 endPos, int speedLimit, String identifier,  String prev, String next) {
        this.startPos = startPos;
        this.endPos = endPos;
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

    public Vec3 getStartPos() {
        return startPos;
    }

    public void setStartPos(Vec3 startPos) {
        this.startPos = startPos;
    }

    public Vec3 getEndPos() {
        return endPos;
    }

    public void setEndPos(Vec3 endPos) {
        this.endPos = endPos;
    }

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

    public SignalAspect aspect;

    public SignalSection() {}


}
