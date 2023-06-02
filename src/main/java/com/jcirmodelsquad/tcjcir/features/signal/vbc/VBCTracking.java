package com.jcirmodelsquad.tcjcir.features.signal.vbc;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.railcraft.api.signals.SignalAspect;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.*;

public class VBCTracking {

    //The all network for Virtual Block Signalling.
    public Map<Integer, ArrayList<Track[]>> systems = new HashMap<>();

    public Map<String, Vec3> registeredReceivers = new HashMap<>();

    public int updateFrequency = 40;

    public int ticks;

    private static VBCTracking instance;

    public static VBCTracking getInstance() {
        if (instance == null) {
            instance = new VBCTracking();
        }
        return instance;
    }

    private VBCTracking() {}

    @SubscribeEvent
    @SideOnly(Side.SERVER)
    public void onWorldTick(TickEvent.WorldTickEvent event) {
        ticks++;

        if (event != null) {
            World world = FMLCommonHandler.instance().getMinecraftServerInstance().getEntityWorld();
            if (ticks % updateFrequency == 0) {
                //Start VBC tracking.

            }
        }
    }

    public void debugSetup() {
        ArrayList<Track[]> input = new ArrayList<>();

        Track track = new Track();
        LinkedHashMap<String, SignalSection> sectionsA = new LinkedHashMap<>();
        sectionsA.put("TST-1",
                new SignalSection(
                        new Vec3[] { Vec3.createVectorHelper(116, 64, 168),  Vec3.createVectorHelper(116, 64, 157)},
                        20,
                        "TST-1",
                        "none",
                        "TST-2"
                ));

        sectionsA.put("TST-2",
                new SignalSection(
                        new Vec3[] {Vec3.createVectorHelper(116, 64, 157), Vec3.createVectorHelper(116, 64, 146)},
                        20,
                        "TST-2",
                        "TST-1",
                        "TST-3"
                ));


        sectionsA.put("TST-3",
                new SignalSection(
                        new Vec3[] {Vec3.createVectorHelper(116, 64, 146), Vec3.createVectorHelper(116, 64, 136)},
                        20,
                        "TST-3",
                        "TST-2",
                        "TST-4"
                ));

        sectionsA.put("TST-4",
                new SignalSection(
                        new Vec3[] {Vec3.createVectorHelper(116, 64, 136), Vec3.createVectorHelper(116, 64, 126)},
                        20,
                        "TST-4",
                        "TST-3",
                        "none"
                ));
        LinkedHashMap<String, SignalSection> sectionsB = new LinkedHashMap<>();
        sectionsB.put("TST-4D",
                new SignalSection(
                        new Vec3[] {Vec3.createVectorHelper(116, 64, 136), Vec3.createVectorHelper(116, 64, 126)},
                        20,
                        "TST-4D",
                        "none",
                        "TST-3D"
                ));


        sectionsB.put("TST-3D",
                new SignalSection(
                        new Vec3[] {Vec3.createVectorHelper(116, 64, 146), Vec3.createVectorHelper(116, 64, 136)},
                        20,
                        "TST-3D",
                        "TST-4D",
                        "TST-2D"
                ));
        sectionsB.put("TST-2D",
                new SignalSection(
                        new Vec3[] {Vec3.createVectorHelper(116, 64, 157), Vec3.createVectorHelper(116, 64, 146)},
                        20,
                        "TST-2D",
                        "TST-3D",
                        "TST-1D"
                ));


        sectionsB.put("TST-1D",
                new SignalSection(
                        new Vec3[] {Vec3.createVectorHelper(116, 64, 168), Vec3.createVectorHelper(116, 64, 157)},
                        20,
                        "TST-1D",
                        "TST-2D",
                        "none"
                ));






        track.sideA = sectionsA;
        track.sideB = sectionsB;
        Track[] tracks = new Track[] {track};
        input.add(tracks);
        systems.put(0, input);

    }


    public void updateFromRS(Vec3 position) {
        for (ArrayList<Track[]> system : systems.values()) {

            for (Track[] tracks : system) {
                for (Track track : tracks) {
                    for (SignalSection section : track.sideA.values()) {
                        boolean signalOccupancy = false;

                       /* for (Vec3 position : positions) {*/

                            for(int i = 0; i + 1 < section.positions.length; i += 2) {

                                if (isInside(position, section.positions[i], section.positions[i + 1])) {
                                    //It's in the section!
                                    //System.out.println("Train in " + section.identifier);
                                    signalOccupancy = true;
                                    updateOccupancy(system, track, section.identifier, true);

                                }
                            }


                        //}

                        if (!signalOccupancy) updateOccupancy(system, track, section.identifier, false);
                    }

                    for (SignalSection section : track.sideB.values()) {
                        boolean signalOccupancy = false;

                       // for (Vec3 position : positions) {

                            for(int i = 0; i + 1 < section.positions.length; i += 2) {

                                if (isInside(position, section.positions[i], section.positions[i + 1])) {
                                    //It's in the section!
                                    //System.out.println("Train in " + section.identifier);
                                    signalOccupancy = true;
                                    updateOccupancy(system, track, section.identifier, true);

                                }
                            }
                        //}

                        if (!signalOccupancy) updateOccupancy(system, track, section.identifier, false);
                    }
                }
            }
        }
    }

    public void updateOccupancy(ArrayList<Track[]> system, Track track, String sectionId, boolean occupied) {
        //Determine if it's new, or actually we need to update it.

        if (track.sideA.get(sectionId) != null) {
            SignalSection actualSection = track.sideA.get(sectionId);

            if (!(occupied == actualSection.occupied)) {
                //Oh, actually update it!!
                actualSection.occupied = occupied;
                System.out.println(sectionId + " is now " + occupied);
                updateAspects(track);
            }
        } else if (track.sideB.get(sectionId) != null) {
            SignalSection actualSection = track.sideB.get(sectionId);

            if (!(occupied == actualSection.occupied)) {
                //Oh, actually update it!!
                actualSection.occupied = occupied;
                System.out.println(sectionId + " is now " + occupied);
                updateAspects(track);
            }
        }

    }

    public void updateAspects(Track track) {
        for (SignalSection section : track.sideA.values()) {
            if (section.occupied) {
                updateAspect(section, SignalAspect.RED);
                SignalSection prevSection = track.sideA.get(section.getPrev());

                if (prevSection != null && !prevSection.occupied) {
                    updateAspect(track.sideA.get(section.getPrev()), SignalAspect.YELLOW);
                }

                if (prevSection != null && track.sideA.get(prevSection.getPrev()) != null && !track.sideA.get(prevSection.getPrev()).occupied) {
                    updateAspect(track.sideA.get(prevSection.getPrev()), SignalAspect.BLINK_YELLOW);
                }

               /* if (prevSection != null && track.sideA.get(prevSection.getPrev()) != null &&
                        track.sideA.get(track.sideA.get(prevSection.getPrev()).getPrev()) != null && !track.sideA.get(track.sideA.get(prevSection.getPrev()).getPrev()).occupied){
                    updateAspect(track.sideA.get(prevSection.getPrev()), SignalAspect.GREEN);
                }*/
            } else {
                SignalSection prevSection = track.sideA.get(section.getPrev());
                if (prevSection != null && !prevSection.occupied) {
                    continue;
                }

                if (prevSection != null && track.sideA.get(prevSection.getPrev()) != null && !track.sideA.get(prevSection.getPrev()).occupied) {
                    continue;
                }

                updateAspect(section, SignalAspect.GREEN);
            }


        }

        for (SignalSection section : track.sideB.values()) {
            if (section.occupied) {
                updateAspect(section, SignalAspect.RED);
                SignalSection prevSection = track.sideB.get(section.getPrev());

                if (prevSection != null && !prevSection.occupied) {
                    updateAspect(track.sideB.get(section.getPrev()), SignalAspect.YELLOW);
                }

                if (prevSection != null && track.sideB.get(prevSection.getPrev()) != null && !track.sideB.get(prevSection.getPrev()).occupied) {
                    updateAspect(track.sideB.get(prevSection.getPrev()), SignalAspect.BLINK_YELLOW);
                }

               /* if (prevSection != null && track.sideA.get(prevSection.getPrev()) != null &&
                        track.sideA.get(track.sideA.get(prevSection.getPrev()).getPrev()) != null && !track.sideA.get(track.sideA.get(prevSection.getPrev()).getPrev()).occupied){
                    updateAspect(track.sideA.get(prevSection.getPrev()), SignalAspect.GREEN);
                }*/
            }


        }
    }

    public void updateAspect(SignalSection section, SignalAspect aspect) {
        if (registeredReceivers.containsKey(section.identifier)) {
            World world = FMLCommonHandler.instance().getMinecraftServerInstance().getEntityWorld();
            Vec3 pos = registeredReceivers.get(section.identifier);
            //Tell it that it updated.
            TileVBCController controller = (TileVBCController) world.getTileEntity((int) pos.xCoord, (int) pos.yCoord, (int) pos.zCoord);
            section.setAspect(aspect);
            if (controller != null) controller.updateAspect(aspect);
        }
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
}
