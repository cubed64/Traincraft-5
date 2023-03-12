package train.common.mtc.vbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Track {
    public String trackId;

    public LinkedHashMap<String, SignalSection> sideA;
    public ArrayList<SignalSection> sideB;


    public Track() {}

    public Track(String trackId, LinkedHashMap<String, SignalSection> sideA, ArrayList<SignalSection> sideB) {
        this.trackId = trackId;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public HashMap<String, SignalSection> getSideA() {
        return sideA;
    }

    public void setSideA(LinkedHashMap<String, SignalSection> sideA) {
        this.sideA = sideA;
    }

    public ArrayList<SignalSection> getSideB() {
        return sideB;
    }

    public void setSideB(ArrayList<SignalSection> sideB) {
        this.sideB = sideB;
    }
}
