package com.jcirmodelsquad.tcjcir.features.signal.dynamic;

import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import scala.Int;
import train.common.api.Locomotive;

import java.util.*;

import static com.jcirmodelsquad.tcjcir.features.autotrain.DriveScript2.xyz;

public class DynamicSignalServer extends TTTransceiver {

    int systemId;
    String name;

    int minimumTrainDistance = 30;
    static Map<Integer, List<TrackSection>> trackModel;

    static Map<Integer, Map<Integer, Train>> occupants;
    static
    class TrackSection {
        Vec3 boundA;
        Vec3 boundB;
        int speedLimit;


        public TrackSection(Vec3 boundA, Vec3 boundB, int speedLimit) {
            this.boundA = boundA;
            this.boundB = boundB;
            this.speedLimit = speedLimit;
        }
    }


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
    public DynamicSignalServer(int id, String name) {
        this(id);
        this.id = id;
        this.name = name;

    }

    public void init() {
        trackModel = new HashMap<>();
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
        occupants.put(1, new HashMap<Integer, Train>());
        connect(0);


    }
    public DynamicSignalServer(int id) {
        super(id);
    }


    public boolean isInside(Vec3 loc, Vec3 l1, Vec3 l2) {

        int x1 = (int) Math.min(l1.xCoord, l2.xCoord);
        int y1 = (int) Math.min(l1.yCoord, l2.yCoord);
        int z1 = (int) Math.min(l1.zCoord, l2.zCoord);
        int x2 = (int) Math.max(l1.xCoord, l2.xCoord);
        int y2 = (int) Math.max(l1.yCoord, l2.yCoord);
        int z2 = (int) Math.max(l1.zCoord, l2.zCoord);

        return loc.xCoord >= x1 && loc.xCoord <= x2 && loc.yCoord >= y1 && loc.yCoord <= y2 && loc.zCoord >= z1 && loc.zCoord <= z2;
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
                        System.out.println("Removing!!");
                        iter.remove();
                    }
                  System.out.println(entry);
                }
            }

        }

        if (msg.getHeader().equals("pos")) {
            Map<String, Object> response = new HashMap<>();

            int side = -1;
            TrackSection boundASection = null;
            TrackSection boundBSection = null;
            Map<String, Object> data = (Map<String, Object>) msg.data;
            Vec3 trainPos = xyz((Integer) data.get("x1"), (Integer) data.get("y1"), (Integer) data.get("z1"));
            Vec3 trainPos2 = xyz((Integer) data.get("x2"), (Integer) data.get("y2"), (Integer) data.get("z2"));

            for (Map.Entry<Integer, List<TrackSection>> entry : trackModel.entrySet()) {
                Integer key = entry.getKey();
                List<TrackSection> value = entry.getValue();
                //Determine where the train is.
                for (TrackSection section: value) {
                    if (isInside(trainPos, section.boundA, section.boundB) || isInside(trainPos2, section.boundA, section.boundB)) {
                        System.out.println("Train is on side " + key);
                        occupants.get(key).put(msg.source, new Train(trainPos, trainPos2, (Float) data.get("ry"), (Float) data.get("rp")));
                        side = key;
                        if (isInside(trainPos, section.boundA, section.boundB)) boundASection = section;
                        if (isInside(trainPos2, section.boundA, section.boundB))  boundBSection = section;
                        break;
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

                System.out.println("distances.." + distances);

                List sortedKeys = new ArrayList(distances.keySet());
                Collections.sort(sortedKeys);
                int sendLimit =  25;
                if (boundASection == null) {
                    if (boundBSection != null) sendLimit = boundBSection.speedLimit;
                } else {
                    sendLimit = boundASection.speedLimit;
                }

                if (!sortedKeys.isEmpty()) {
                    System.out.println("closest one: " + sortedKeys.get(0));
                    Integer closestDistance = distances.get(sortedKeys.get(0));

                    //Default train distance level is 50. If a train is too close to another, stop it.

                    response.put("speedLimit", sendLimit);
                    response.put("safeDistance", closestDistance - minimumTrainDistance);
                } else {
                    response.put("speedLimit", sendLimit);
                    response.put("safeDistance", sendLimit);
                }

            } else {
                response.put("speedLimit", 15);
                response.put("safeDistance", 15);
            }
            response.put("minimumTrainDistance", minimumTrainDistance);
            sendMessage(new Message(msg.source, id, "resp", response));






        }

    }
    public double getDistanceWithDirection(Locomotive loco1, Locomotive loco2) {

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

    public double getDistanceWithDirection(Vec3 train1Pos, float rotationYaw, float rotationPitch, Vec3 train2Pos) {


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
}
