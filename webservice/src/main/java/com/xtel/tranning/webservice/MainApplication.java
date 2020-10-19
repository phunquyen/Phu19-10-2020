package com.xtel.tranning.webservice;

import com.xtel.tranning.webservice.config.ServerEmbedded;

public class MainApplication {
    public static void main(String[] args) throws Exception{
        ServerEmbedded serverEmbedded = new ServerEmbedded(8080, "/api", "com.xtel.tranning.webservice");
        serverEmbedded.start();
    }
}
