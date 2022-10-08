package train.common.mtc.vbc;

import net.minecraft.util.Vec3;

public class SignalSection {
    public Vec3 startPos;

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

    public Vec3 endPos;
    public int speedLimit;
    public String identifier;

    public int getOccupiedBy() {
        return occupiedBy;
    }

    public void setOccupiedBy(int occupiedBy) {
        this.occupiedBy = occupiedBy;
    }

    public int occupiedBy;

    public SignalSection() {}

    public SignalSection(Vec3 startPos, Vec3 endPos, int speedLimit, String identifier) {
        this.startPos = startPos;
        this.endPos = endPos;
        this.speedLimit = speedLimit;
        this.identifier = identifier;
    }
}
