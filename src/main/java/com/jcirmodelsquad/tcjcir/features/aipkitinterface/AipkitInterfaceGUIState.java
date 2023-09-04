package com.jcirmodelsquad.tcjcir.features.aipkitinterface;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.FileUtils;
import train.common.Traincraft;
import train.common.api.Locomotive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AipkitInterfaceGUIState {
    public static boolean isInit;

    public static String[] options;
    public static int position = 0;
    public static String category = "PCH Interface";
    public static boolean isInfoScreen = false;
    public static String infoString = "";

    public static Locomotive loco;

    public static Map<String, String[]> defaultOptions = new HashMap<>();

    public static void init(Locomotive locomotive) {
        defaultOptions.put("PCH Interface", new String[] {"AutoTrain-2", "DriveScript", "Train"});

        loco = locomotive;
        options = new String[] {"AutoTrain-2", "DriveScript", "Train"};
        infoString = "";
        category = "PCH Interface";
        isInit = true;

    }

    public static void menuSelection() {
        String selection = options[position];
        String newCategory = selection;
        switch (category) {
            case "PCH Interface":
                if (selection.equals("AutoTrain-2")) {
                    options = new String[]{"Back"};
                    isInfoScreen = true;
                    if (loco.getDataWatcher().getWatchableObjectString(29).equals("")) {
                        infoString = "AutoTrain-2 inactive.";
                    } else {
                        JsonObject status = new JsonParser().parse(loco.getDataWatcher().getWatchableObjectString(29)).getAsJsonObject();
                        StringBuilder output = new StringBuilder();
                        output.append("AutoTrain Status: ").append(status.get("status").getAsString()).append("\n");
                        if (status.get("status").getAsString().equals("ready")) {
                            output.append("Verify the train is OK, then press [O] to run the train\n");
                        }
                        output.append("Position: ").append(status.get("progress").getAsString()).append("\n");
                        output.append("TrainTalk: ").append(loco.isConnected ? "Connected" : "Unavailable");
                        infoString = output.toString();
                    }
                } else if (selection.equals("DriveScript")) {
                    options = new String[]{"Load DriveScript A", "Load DriveScript B", "Back"};
                    if (!loco.getDataWatcher().getWatchableObjectString(29).equals("")) {
                        JsonObject status = new JsonParser().parse(loco.getDataWatcher().getWatchableObjectString(29)).getAsJsonObject();
                        JsonArray script = status.getAsJsonArray("driveScript");
                        JsonObject active = script.get(status.get("progress").getAsInt()).getAsJsonObject();
                        infoString = "--> " + active.get("action").getAsString() + ": " + active.get("param1");
                    }

                }
                break;
            case "AutoTrain-2":
                if (selection.equals("Back")) {
                    options = defaultOptions.get("PCH Interface");
                    newCategory = "PCH Interface";
                    infoString = "";
                }
                break;
            case "DriveScript":
                if (selection.equals("Load DriveScript A")) {
                    File[] files = new File(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/railtech/drivescripts/").listFiles();

                    ArrayList<String> fileList = new ArrayList<>();

                    assert files != null;
                    for (File file : files) {
                        if (file.isFile()) {
                            fileList.add(file.getName());
                        }
                    }

                    options = fileList.toArray(new String[0]);
                    newCategory = "Load DriveScript A";
                } else if (selection.equals("Load DriveScript B")) {
                    File[] files = new File(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/railtech/drivescripts/").listFiles();

                    ArrayList<String> fileList = new ArrayList<>();

                    assert files != null;
                    for (File file : files) {
                        if (file.isFile()) {
                            fileList.add(file.getName());
                        }
                    }

                    options = fileList.toArray(new String[0]);
                    newCategory = "Load DriveScript B";
                }


                if (selection.equals("Back")) {
                    options = defaultOptions.get("PCH Interface");
                    newCategory = "PCH Interface";
                    infoString = "";
                }
                break;
            case "Load DriveScript A":
                //Okay, read the file.
                if (selection.startsWith("Yeah, load")) {

                    try {
                        String json = FileUtils.readFileToString(new File(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/railtech/drivescripts/" + selection.substring(11)));
                        Traincraft.mtcChannel.sendToServer(new PacketInterfaceAction(loco.getEntityId(), "setdrivescripta" + json));
                        infoString = "DriveScript loaded!\n Load any additional DriveScripts,\n then Start Engine to initialize AutoTrain-2.";
                        options = new String[]{"Cool"};
                    } catch (Exception e) {
                        infoString = "Error reading. Try again.";
                        options = new String[]{"Back"};
                    }


                } else if (selection.equals("Nah")) {
                    options = new String[]{"Load DriveScript A"};
                } else {
                    FileReader reader = null;
                    try {
                        StringBuilder output = new StringBuilder();

                        reader = new FileReader(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/railtech/drivescripts/" + selection);
                        JsonObject driveScript = new JsonParser().parse(reader).getAsJsonObject();
                        output.append("Name: ").append(driveScript.get("name")).append("\n");
                        output.append(driveScript.get("actions").getAsJsonArray().get(0).getAsJsonObject().get("param1")).append(" -> ").append(driveScript.get("actions").getAsJsonArray().get(1).getAsJsonObject().get("param1")).append("\n");
                        output.append("Confirm load?");
                        options = new String[]{"Yeah, load " + selection, "Nah"};
                        infoString = output.toString();
                        newCategory = "Load DriveScript A";
                    } catch (Exception e) {
                        infoString = "Error reading. Try again.";
                        options = defaultOptions.get("PCH Interface");
                        newCategory = "PCH Interface";
                        infoString = "";
                    }
                }

                //Oh. Just read it like so.


                break;
            case "Load DriveScript B":
            //Okay, read the file.
            if (selection.startsWith("Yeah, load")) {

                try {
                    String json = FileUtils.readFileToString(new File(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/railtech/drivescripts/" + selection.substring(11)));
                    Traincraft.mtcChannel.sendToServer(new PacketInterfaceAction(loco.getEntityId(), "setdrivescriptb" + json));
                    infoString = "DriveScript loaded!\n Load any additional DriveScripts,\n then Start Engine to initialize AutoTrain-2.";
                    options = new String[]{"Cool"};
                } catch (Exception e) {
                    infoString = "Error reading. Try again.";
                    options = new String[]{"Back"};
                }


            } else if (selection.equals("Nah")) {
                options = new String[]{"Load DriveScript B"};
            } else {
                FileReader reader = null;
                try {
                    StringBuilder output = new StringBuilder();

                    reader = new FileReader(Traincraft.configDirectory.getAbsolutePath() + "/traincraft/railtech/drivescripts/" + selection);
                    JsonObject driveScript = new JsonParser().parse(reader).getAsJsonObject();
                    output.append("Name: ").append(driveScript.get("name")).append("\n");
                    output.append(driveScript.get("actions").getAsJsonArray().get(0).getAsJsonObject().get("param1")).append("\n");
                    output.append("Confirm load?");
                    options = new String[]{"Yeah, load " + selection, "Nah"};
                    newCategory = "Load DriveScript B";
                    infoString = output.toString();
                } catch (Exception e) {
                    infoString = "Error reading. Try again.";
                    options = defaultOptions.get("PCH Interface");
                    newCategory = "PCH Interface";
                    infoString = "";
                }
            }
            break;
            case "Re-Init":
                init(loco);
                newCategory = "AutoTrain-2 Computer";
        }
        category = newCategory;
        position = 0;
    }
}
