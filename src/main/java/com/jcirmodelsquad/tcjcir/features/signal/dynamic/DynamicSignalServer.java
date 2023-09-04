package com.jcirmodelsquad.tcjcir.features.signal.dynamic;

import net.minecraft.util.Vec3;

import java.util.*;

import static com.jcirmodelsquad.tcjcir.extras.PeachyUtil.*;


public class DynamicSignalServer extends TTTransceiver {

    int systemId;
    String name;

    int minimumTrainDistance = 30;
    Map<Integer, Map<String, Track>> trackModel;
    Map<String, Switch> switchMap;

    Map<Integer, Map<Integer, Train>> occupants;


    class Train {
        Vec3 boundA;
        Vec3 boundB;

        float rotationYaw, rotationPitch;


        public Train(Vec3 boundA, Vec3 boundB, float rotationYaw, float rotationPitch) {
            this.boundA = boundA;
            this.boundB = boundB;
            this.rotationPitch = rotationPitch;
            this.rotationYaw = rotationYaw;
        }
    }
    public DynamicSignalServer(int id, String name, int minimumTrainDistance, int systemId) {
        this(id);
        this.id = id;
        this.name = name;
        this.minimumTrainDistance = minimumTrainDistance;
        this.systemId = systemId;
    }

    public void init() {
        /*trackModel = new HashMap<>();
        occupants = new HashMap<>();
        List<TrackSection> side0 = new ArrayList<>();
        side0.add(new TrackSection(xyz(119, 64, 18), xyz(119, 64, 58), 60));
        side0.add(new TrackSection(xyz(119, 64, 59), xyz(119, 64, 136), 60));
        side0.add(new TrackSection(xyz(120, 64, 136), xyz(120, 64, 210), 60));
        side0.add(new TrackSection(xyz(120, 64, 217), xyz(62, 64, 217), 60));
        side0.add(new TrackSection(xyz(54, 64, 216), xyz(0, 64, 216), 60));
        side0.add(new TrackSection(xyz(-10, 64, 226), xyz(-10, 64, 263), 60));
        side0.add(new TrackSection(xyz(-10, 64, 227), xyz(-10, 64, 707), 130));
        side0.add(new TrackSection(xyz(-10, 64, 780), xyz(-10, 64, 730), 60));
        side0.add(new TrackSection(xyz(-0, 64, 740), xyz(-72, 64, 740), 60));
        trackModel.put(0, side0);

        List<TrackSection> side1 = new ArrayList<>();
        side1.add(new TrackSection(xyz(125, 64, 18), xyz(125, 64, 138), 60));
        side1.add(new TrackSection(xyz(124, 64, 139), xyz(124, 64, 216), 60));
        side1.add(new TrackSection(xyz(117, 64, 221), xyz(58, 64, 221), 60));
        side1.add(new TrackSection(xyz(57, 64, 222), xyz(2, 64, 222), 60));
        side1.add(new TrackSection(xyz(-4, 64, 229), xyz(-4, 64, 281), 60));
        side1.add(new TrackSection(xyz(-4, 64, 282), xyz(-4, 64, 704), 130));
        side1.add(new TrackSection(xyz(-4, 64, 705), xyz(-4, 64, 728), 60));
        side1.add(new TrackSection(xyz(5, 64, 734), xyz(77, 64, 734), 60));
        trackModel.put(1, side1);
        occupants.put(0, new HashMap<Integer, Train>());
        occupants.put(1, new HashMap<Integer, Train>());*/
        connect(systemId);


    }
    public DynamicSignalServer(int id) {
        super(id);
    }

    @Override
    public void receiveMessage(Message msg) {

        super.receiveMessage(msg);

        if (msg.getHeader().equals("disc")) {
            for (Map<Integer, Train> value : occupants.values()) {

                Iterator<Map.Entry<Integer,Train>> iter = value.entrySet().iterator();
                while (iter.hasNext()) {
                    Map.Entry<Integer,Train> entry = iter.next();
                    if (entry.getKey() == msg.source) {
                        iter.remove();
                    }
                }
            }

        }

        if (msg.getHeader().equals("pos")) {

            Map<String, Object> response = new HashMap<>();

            int side = -1;
            int position = -1;

            Track boundASection = null;
            Track boundBSection = null;
            Map<String, Object> data = (Map<String, Object>) msg.data;
            Vec3 trainPos = xyz((Integer) data.get("x1"), (Integer) data.get("y1"), (Integer) data.get("z1"));
            Vec3 trainPos2 = xyz((Integer) data.get("x2"), (Integer) data.get("y2"), (Integer) data.get("z2"));


            for (Map.Entry<Integer, Map<String, Track>> entry : trackModel.entrySet()) {
                Integer key = entry.getKey();
                Map<String, Track> value = entry.getValue();
                //Determine where the train is.
                for (int i = 0; i < value.size(); i++) {
                    Track section = (Track) value.values().toArray()[i];
                    Train train = new Train(trainPos, trainPos2, (Float) data.get("ry"), (Float) data.get("rp"));
                    if (isInside(trainPos, section.boundA, section.boundB) || isInside(trainPos2, section.boundA, section.boundB)) {
                        occupants.get(key).put(msg.source, train);
                        side = key;
                        if (isInside(trainPos, section.boundA, section.boundB)) {
                            boundASection = section;
                            position = i;
                        }
                        if (isInside(trainPos2, section.boundA, section.boundB))  boundBSection = section;
                        break;
                    } else {
                        occupants.get(key).remove(msg.source);
                    }
                }


            }



            if (side != -1) {
                //Calculate the distances between all the trains on the specific track
                Map<Integer, Train> trains = occupants.get(side);
                Map<Integer, Integer> distances = new HashMap<>();

                for (Map.Entry<Integer, Train> entry : trains.entrySet()) {
                    Integer key = entry.getKey();
                    Train train = entry.getValue();
                    if (key == msg.source) continue;
                    int distance = (int) getDistanceWithDirection(trainPos2, (Float) data.get("ry"), (Float) data.get("rp"), train.boundB);
                    if (distance > 0) distances.put(key, distance);
                }


                List<Integer> sortedKeys = new ArrayList<>(distances.keySet());
                Collections.sort(sortedKeys);



                int speedLimit =  25;
                int nextSpeedLimit = 0;
                Vec3 nextSpeedPos = xyz(0,0,0);

                if (boundASection == null) {
                    if (boundBSection != null) speedLimit = boundBSection.speedLimit;
                } else {
                    speedLimit = boundASection.speedLimit;
                }
                //Determine the next speed limit by checking the position, and if it is going towards the direction you want.
                if ((position + 1) < trackModel.get(side).size()) {
                    Track nextSection = (Track) trackModel.get(side).values().toArray()[position + 1];
                    if (nextSection.speedLimit != speedLimit) {
                        nextSpeedLimit = nextSection.speedLimit;
                        nextSpeedPos = nextSection.boundA;
                    }
                } else {
                    //End of the track..
                    nextSpeedLimit = 1;
                    if (boundASection != null) {
                        nextSpeedPos = boundASection.boundB;
                    }


                }



                if (!sortedKeys.isEmpty()) {
                    Integer closestDistance = distances.get(sortedKeys.get(0));

                    //Default train distance level is 50. If a train is too close to another, stop it.

                    response.put("speedLimit", speedLimit);
                    response.put("nextSpeedLimit", nextSpeedLimit);
                    response.put("nextSpeedPos", nextSpeedPos);
                    response.put("safeDistance", closestDistance - minimumTrainDistance);
                } else {
                    response.put("speedLimit", speedLimit);
                    response.put("nextSpeedLimit", nextSpeedLimit);
                    response.put("nextSpeedPos", nextSpeedPos);
                    response.put("safeDistance", speedLimit);
                }

            } else {
                response.put("speedLimit", 15);
                response.put("nextSpeedLimit", 0);
                response.put("nextSpeedPos", xyz(0,0,0));
                response.put("safeDistance", 15);
            }
            response.put("minimumTrainDistance", minimumTrainDistance);
            sendMessage(new Message(msg.source, id, "resp", response));

        }

    }


}
