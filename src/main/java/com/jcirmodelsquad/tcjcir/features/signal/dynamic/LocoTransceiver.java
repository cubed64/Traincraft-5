package com.jcirmodelsquad.tcjcir.features.signal.dynamic;

import cpw.mods.fml.common.network.NetworkRegistry;
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
            Map<String, Object> data = (Map<String, Object>) msg.getData();
            int speedLimit = (int) data.get("speedLimit");
            int safeDistance = (int) data.get("safeDistance");

            if (safeDistance < 0) {
                speedLimit = 0;
            } else if (safeDistance < speedLimit) {
                speedLimit = safeDistance;
            }

            loco.speedLimit = speedLimit;
            Traincraft.mtcChannel.sendToAllAround(new PacketSpeedLimit(loco.getEntityId(), speedLimit, 0, 0, 0, 0),
                    new NetworkRegistry.TargetPoint(loco.worldObj.provider.dimensionId, loco.posX, loco.posY, loco.posZ, 150.0D));
        }
    }


}
