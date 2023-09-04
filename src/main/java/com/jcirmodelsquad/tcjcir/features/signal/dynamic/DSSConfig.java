package com.jcirmodelsquad.tcjcir.features.signal.dynamic;

import com.google.gson.*;
import com.jcirmodelsquad.tcjcir.extras.PeachyUtil;
import train.common.Traincraft;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DSSConfig {

    static JsonArray jDssInstances;
    static List<DynamicSignalServer> dssInstances;

    public static void load() {
        dssInstances = new ArrayList<>();

        File configFile = new File(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/railtech/dynamic/dss.json");
        try {
            if (configFile.exists()) {
                FileReader reader = new FileReader(configFile);
                //Oh. Just read it like so.
                jDssInstances = new JsonParser().parse(reader).getAsJsonArray();
                //Okay, now create all the new instances.

                for (JsonElement i : jDssInstances) {
                    JsonObject element = i.getAsJsonObject();
                    DynamicSignalServer instance = new DynamicSignalServer(element.get("id").getAsInt(), element.get("name").getAsString(),
                            element.get("safeDistance").getAsInt(), element.get("ttId").getAsInt());

                    instance.occupants = new HashMap<>();

                    Map<Integer, Map<String, Track>> trackModel = new LinkedHashMap<Integer, Map<String, Track>>();
                    Map<String, Switch> switchMap = new HashMap<String, Switch>();

                    //Have to reverse it, because, hashmap.

                    for (Map.Entry<String, JsonElement> entry : element.getAsJsonObject("trackModel").entrySet()) {
                        Map<String, Track> side = new LinkedHashMap<>();
                        String key = entry.getKey();
                        JsonObject v = entry.getValue().getAsJsonObject();
                        for (Map.Entry<String, JsonElement> s : v.entrySet()) {
                            JsonArray jSection = s.getValue().getAsJsonArray();

                            Track section = new Track();
                            section.setBoundA(PeachyUtil.xyz(jSection.get(0).getAsInt(), jSection.get(1).getAsInt(), jSection.get(2).getAsInt()));
                            section.setBoundB(PeachyUtil.xyz(jSection.get(3).getAsInt(), jSection.get(4).getAsInt(), jSection.get(5).getAsInt()));
                            section.setSpeedLimit(jSection.get(6).getAsInt());
                            side.put(s.getKey(), section);
                        }

                        trackModel.put(Integer.valueOf(key), side);
                        instance.occupants.put(Integer.valueOf(key), new HashMap<Integer, DynamicSignalServer.Train>());
                    }

                    Map<String, Switch> switches = new HashMap<>();
                    for (Map.Entry<String, JsonElement> entry : element.getAsJsonObject("trackSwitches").entrySet()) {

                        String key = entry.getKey();
                        JsonArray v = entry.getValue().getAsJsonArray();
                        Switch tSwitch = new Switch();
                        tSwitch.setLinkedTo(v.get(0).getAsString());
                        tSwitch.setTrackSection(v.get(1).getAsString());
                        tSwitch.setCrossoverTrack(v.get(2).getAsInt() == 1);
                        switches.put(key, tSwitch);


                    }
                    switchMap = switches;

                    instance.trackModel = trackModel;
                    instance.switchMap = switchMap;
                    dssInstances.add(instance);
                    TrainTalk.getInstance().createChannel(instance.systemId);
                    instance.init();

                }
            } else {
                //No? Okay, create it!
                configFile.createNewFile();

            }

            Traincraft.tcLog.info("Successfully loaded " + dssInstances.size() + " Dynamic Signal Server" + (dssInstances.size() == 1 ? "" : "s"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveOccupancy() {

    }


    public static void saveAll() {
        File configFile = new File(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/" + "dss.json");
        try {
            if (configFile.exists()) {
                FileReader reader = new FileReader(configFile);
                //Oh. Just read it like so.
                // dssInstances = new JsonParser().parse(reader).getAsJsonArray();

                //Okay, now create all the new instances.
            } else {
                //No? Okay, create it!
                configFile.createNewFile();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
