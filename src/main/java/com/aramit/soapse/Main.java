package com.aramit.soapse;


import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/service/LocalWS",new LocalWS());
    }
}
