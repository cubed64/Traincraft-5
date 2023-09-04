package com.jcirmodelsquad.tcjcir.features.signal.dynamic;

import net.minecraft.util.Vec3;

import java.util.ArrayList;
import java.util.List;

public class Switch {
    String trackSection;
    String linkedTo;
    boolean isCrossoverTrack;

    boolean isActivated = false;

    public Switch(){}

    public Switch(String trackSection, String linkedTo, boolean isCrossoverTrack) {
        this.trackSection = trackSection;
        this.linkedTo = linkedTo;
        this.isCrossoverTrack = isCrossoverTrack;
    }

    public String getTrackSection() {
        return trackSection;
    }

    public void setTrackSection(String trackSection) {
        this.trackSection = trackSection;
    }

    public String getLinkedTo() {
        return linkedTo;
    }

    public void setLinkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
    }

    public boolean isCrossoverTrack() {
        return isCrossoverTrack;
    }

    public void setCrossoverTrack(boolean crossoverTrack) {
        isCrossoverTrack = crossoverTrack;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

}
