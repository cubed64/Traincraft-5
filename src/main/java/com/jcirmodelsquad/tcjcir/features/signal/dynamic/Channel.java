package com.jcirmodelsquad.tcjcir.features.signal.dynamic;

import java.util.HashMap;
import java.util.Map;

class Channel {
        Map<Integer, TTTransceiver> listeners = new HashMap<>();


        public Channel connect(TTTransceiver client) {
            listeners.put(client.id, client);
            return this;
        }

        public void disconnect(TTTransceiver client) {
            listeners.remove(client.id);
        }

        public void sendMessage(Message msg) {

        }

        public void receiveMessage(Message msg) {

            for (Map.Entry<Integer, TTTransceiver> entry : listeners.entrySet()) {
                Integer key = entry.getKey();
                TTTransceiver value = entry.getValue();
               if (msg.destination == -1) {
                   //Okay, go to all of them.
                   value.receiveMessage(msg);
               } else if (msg.destination == key) {
                   value.receiveMessage(msg);
                   break;
               }

            }

        }


    }
