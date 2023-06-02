package com.jcirmodelsquad.tcjcir.features.signal.dynamic;

public class Message {
        String header;
        Object data;

        int source;

        int destination; //-1 for all other trains

        public Message() {}

        public Message(int destination, int source, String header, Object data) {
            this.destination = destination;
            this.source = source;
            this.header = header;
            this.data = data;
        }

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Message{" +
                    "header='" + header + '\'' +
                    ", data=" + data +
                    ", source=" + source +
                    ", destination=" + destination +
                    '}';
        }
    }