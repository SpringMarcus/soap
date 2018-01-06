package com.marcus.chiu.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@javax.jws.WebService
public interface HelloWebService {
    @WebMethod
    String printMessage();
}
