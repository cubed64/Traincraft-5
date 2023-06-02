package com.jcirmodelsquad.tcjcir.features.signal.dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainTalk {
    //A network for trains to talk to each other, for Dynamic signalling.

    static TrainTalk instance;

    public static TrainTalk getInstance() {
        if (instance == null) instance = new TrainTalk();
        return instance;
    }




    List<Channel> ttChannels;

    public void init() {
        ttChannels = new ArrayList<>();
        ttChannels.add(new Channel());
    }


}