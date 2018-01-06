package com.marcus.chiu.server;


@javax.jws.WebService(endpointInterface = "com.marcus.chiu.server.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService {

    @Override
    public String printMessage() {
        return "message";
    }
}
