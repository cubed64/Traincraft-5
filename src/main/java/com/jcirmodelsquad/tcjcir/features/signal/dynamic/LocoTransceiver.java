package com.jcirmodelsquad.tcjcir.features.signal.dynamic;

import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.util.Vec3;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.mtc.network.PacketSpeedLimit;

import java.util.HashMap;
import java.util.Map;

public class LocoTransceiver extends TTTransceiver {

    Locomotive loco;

    public LocoTransceiver(int id, Locomotive loco) {
        super(id);
        this.loco = loco;
    }

    @Override
    public void receiveMessage(Message msg) {
        super.receiveMessage(msg);
        if (msg.getHeader().equals("resp")) {
            loco.isConnected = true;
            Map<String, Object> data = (Map<String, Object>) msg.getData();
            int speedLimit = (int) data.get("speedLimit");
            int nextSpeedLimit = (int) data.get("nextSpeedLimit");
            int safeDistance = (int) data.get("safeDistance");

            Vec3 nextSpeedPos = (Vec3)data.get("nextSpeedPos");

            if (safeDistance < 0) {
                speedLimit = 0;
            } else if (safeDistance < speedLimit) {
                speedLimit = safeDistance;
            }

            loco.setSpeedLimit(speedLimit, nextSpeedLimit, nextSpeedPos);
        }
    }


}
