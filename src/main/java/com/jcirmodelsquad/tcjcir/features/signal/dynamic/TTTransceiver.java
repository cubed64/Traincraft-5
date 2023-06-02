package com.jcirmodelsquad.tcjcir.features.signal.dynamic;

public class TTTransceiver {
        int id; //Usually the entityid.
        Channel linkedChannel = null;
        int linkedId = 0;
        boolean connected;

        public TTTransceiver(int id) {
            this.id = id;
        }


        public boolean connect(int id) {

            try {
                linkedChannel = TrainTalk.getInstance().ttChannels.get(id).connect(this);
                sendMessage(new Message(-1, id, "conn", "hi"));
                System.out.println("Connection successful!");
                connected = true;
                linkedId = id;
            } catch (Exception e) {
                System.out.println("Channel not found..");
            }

            return connected;
        }


        public void disconnect() {

            try {
                sendMessage(new Message(-1, id, "disc", "bye"));
                TrainTalk.getInstance().ttChannels.get(linkedId).disconnect(this);
                System.out.println("Disconnection successful!");
                connected = false;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Channel not found..");
            }

        }


        public void sendMessage(Message msg) {

             if (linkedChannel != null) {
                 linkedChannel.receiveMessage(msg);
             } else {
                 System.out.println("Cannot send message, as there is no linked channel.");
             }
        }

        public void receiveMessage(Message msg) {
            //System.out.println("New message:" + msg.toString());
        }
    }