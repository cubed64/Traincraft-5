package com.jcirmodelsquad.tcjcir.features.autotrain.modules;

import com.jcirmodelsquad.tcjcir.features.autotrain.AutoTrain2Handler;
import com.jcirmodelsquad.tcjcir.features.autotrain.AutoTrain2Module;
import net.minecraft.util.Vec3;
import train.common.api.Locomotive;

public class PassengerTrainModule extends AutoTrain2Module {

    @Override
    public void doThings(AutoTrain2Handler handler, Locomotive locomotive) {

        if (handler.currentTrackSection != null && handler.currentTrackSection.getSectionType().equals("station") || handler.nextTrackSection != null && handler.nextTrackSection.getSectionType().equals("station")) {
            if (handler.currentTrackSection != null) {
                locomotive.stationStop3 = Vec3.createVectorHelper(handler.currentTrackSection.getEndPosition().getX(), handler.currentTrackSection.getEndPosition().getY(), handler.currentTrackSection.getEndPosition().getZ());
            } else {
                locomotive.stationStop3 = Vec3.createVectorHelper(handler.nextTrackSection.getEndPosition().getX(), handler.nextTrackSection.getEndPosition().getY(), handler.nextTrackSection.getEndPosition().getZ());
            }
        }
        if (!locomotive.stationStop) {
            locomotive.atoStatus = 1;
        } else {
            locomotive.atoStatus = 0;
        }
    }


    @Override
    public String getModuleName() {
        return "Passenger Train Module";
    }
}
