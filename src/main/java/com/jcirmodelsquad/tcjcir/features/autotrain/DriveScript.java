package com.jcirmodelsquad.tcjcir.features.autotrain;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.LinkedList;
import java.util.List;

public class DriveScript {
    String name;
    String version;
    boolean pdmMode;
    AutoTrain2.Action doneAction;

    List<AutoTrain2.Action> actionList;

    public DriveScript() {}

    public DriveScript(String name, String version, boolean pdmMode, AutoTrain2.Action doneAction, List<AutoTrain2.Action> actionList) {
        this.name = name;
        this.version = version;
        this.pdmMode = pdmMode;
        this.doneAction = doneAction;
        this.actionList = actionList;
    }


    public static DriveScript fromJson(String json) {
        JsonObject jDriveScript = new JsonParser().parse(json).getAsJsonObject();
        DriveScript build = new DriveScript();

        build.setName(jDriveScript.get("name").getAsString());
        build.setVersion(jDriveScript.get("version").getAsString());
        build.setPdmMode(jDriveScript.get("pdmMode").getAsBoolean());

        JsonArray script  = jDriveScript.getAsJsonArray("drivescript");
        for (JsonElement element: script) {
            JsonObject jAction = element.getAsJsonObject();
            /*AutoTrain2.Action, action = new AutoTrain2.Action(
                    jAction.get("action").getAsJsonObject(),

            );*/

        }

        return new DriveScript();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isPdmMode() {
        return pdmMode;
    }

    public void setPdmMode(boolean pdmMode) {
        this.pdmMode = pdmMode;
    }

    public AutoTrain2.Action getDoneAction() {
        return doneAction;
    }

    public void setDoneAction(AutoTrain2.Action doneAction) {
        this.doneAction = doneAction;
    }

    public List<AutoTrain2.Action> getActionList() {
        return actionList;
    }

    public void setActionList(List<AutoTrain2.Action> actionList) {
        this.actionList = actionList;
    }
}
