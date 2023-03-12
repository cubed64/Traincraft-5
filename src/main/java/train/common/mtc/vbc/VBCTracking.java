package train.common.mtc.vbc;

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
    public static Map<Integer, ArrayList<Track[]>> systems = new HashMap<>();

    public static Map<String, Vec3> registeredReceivers = new HashMap<>();

    public int updateFrequency = 40;

    public int ticks;

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

    public void addSystem(ArrayList<Track[]> system) {
       /* ArrayList<Track[]> input = new ArrayList<>();

        Track track = new Track();
        HashMap<String, SignalSection> sectionsA = new ArrayList<>();
        sectionsA.add(
                new SignalSection(
                        Vec3.createVectorHelper(116, 64, 168),
                        Vec3.createVectorHelper(116, 64, 157),
                        20,
                        "TST-1"
                ));

        sectionsA.add(
                new SignalSection(
                        Vec3.createVectorHelper(116, 64, 157),
                        Vec3.createVectorHelper(116, 64, 146),
                        20,
                        "TST-2"
                ));


        sectionsA.add(
                new SignalSection(
                        Vec3.createVectorHelper(116, 64, 146),
                        Vec3.createVectorHelper(116, 64, 136),
                        20,
                        "TST-1"
                ));

        sectionsA.add(
                new SignalSection(
                        Vec3.createVectorHelper(116, 64, 136),
                        Vec3.createVectorHelper(116, 64, 126),
                        20,
                        "TST-1"
                ));

        track.sideA = sectionsA;
        Track[] tracks = new Track[] {track};
        input.add(tracks);
        systems.put(0, input);*/
    }


    public static void updateFromMessage(int systemId, ArrayList<Vec3> positions) {
        if (systems.get(systemId) == null) return;
        ArrayList<Track[]> system = systems.get(systemId);
        for (Track[] tracks : system) {
            for (Track track : tracks) {
                for (SignalSection section : track.sideA.values()) {
                    boolean signalOccupancy = false;

                    for (Vec3 position : positions) {

                        if (isInside(position, section.startPos, section.endPos)) {
                            //It's in the section!
                            //System.out.println("Train in " + section.identifier);
                            signalOccupancy = true;
                            updateOccupancy(track, section.identifier, true);
                        }
                    }

                    if (!signalOccupancy) updateOccupancy(track, section.identifier, false);
                }
            }
        }
    }


    public static void updateOccupancy(Track track, String sectionId, boolean occupied) {
        //Determine if it's new, or actually we need to update it.

        if (track.sideA.get(sectionId) != null) {
            SignalSection actualSection = track.sideA.get(sectionId);

            if (!(occupied == actualSection.occupied)) {
                //Oh, actually update it!!
                actualSection.occupied = occupied;
                System.out.println(sectionId + "is now" + occupied);
                if (registeredReceivers.containsKey(sectionId)) {
                    World world = FMLCommonHandler.instance().getMinecraftServerInstance().getEntityWorld();
                    Vec3 pos = registeredReceivers.get(sectionId);
                    //Tell it that it updated.
                    TileVBCController controller = (TileVBCController) world.getTileEntity((int) pos.xCoord, (int) pos.yCoord, (int) pos.zCoord);

                    if (controller != null) controller.updateAspect(SignalAspect.RED);
                }
            }
        }

    }

    public static void updateAspects(Track track, String sectionId) {
        if (track.sideA.get(sectionId) != null) {
            SignalSection actualSection = track.sideA.get(sectionId);
            //SignalSection previousSection = track.sideA.values();

           /* List keys = new ArrayList(track.keySet());
            for (int i = 0; i < keys.size(); i++) {
                Object obj = keys.get(i);
                // do stuff here
            }*/

        }
    }

    public static void updateAspect(Track track, String sectionId, SignalAspect aspect) {
        if (registeredReceivers.containsKey(sectionId)) {
            World world = FMLCommonHandler.instance().getMinecraftServerInstance().getEntityWorld();
            Vec3 pos = registeredReceivers.get(sectionId);
            //Tell it that it updated.
            TileVBCController controller = (TileVBCController) world.getTileEntity((int) pos.xCoord, (int) pos.yCoord, (int) pos.zCoord);

            if (controller != null) controller.updateAspect(aspect);
        }
    }


    public static boolean isInside(Vec3 loc, Vec3 l1, Vec3 l2) {

        int x1 = (int) Math.min(l1.xCoord, l2.xCoord);
        int y1 = (int) Math.min(l1.yCoord, l2.yCoord);
        int z1 = (int) Math.min(l1.zCoord, l2.zCoord);
        int x2 = (int) Math.max(l1.xCoord, l2.xCoord);
        int y2 = (int) Math.max(l1.yCoord, l2.yCoord);
        int z2 = (int) Math.max(l1.zCoord, l2.zCoord);

        return loc.xCoord >= x1 && loc.xCoord <= x2 && loc.yCoord >= y1 && loc.yCoord <= y2 && loc.zCoord >= z1 && loc.zCoord <= z2;
    }
}
