package com.jcirmodelsquad.tcjcir.features;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import train.common.api.EntityRollingStock;

public class WigglyWobblyHandler {
    private int lastTimeCheck;
    public float tiltingProgress = 0;

    @SubscribeEvent
    public void tickUwU(TickEvent.PlayerTickEvent event) {
        if (lastTimeCheck == 20) {
            lastTimeCheck = 0;
        } else {
            lastTimeCheck = lastTimeCheck + 1;
        }
    }

    public void handleTilting(EntityRollingStock rollingStock) {

    }
}
