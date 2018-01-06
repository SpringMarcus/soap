package com.marcus.chiu.client;

import com.marcus.chiu.server.HelloWebService;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client{

    /**
     * Copy this to to a new project and run it
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:8080/hello?wsdl");
        QName qname = new QName("http://server.chiu.marcus.com/", "HelloWebServiceImplService");

        Service service = Service.create(url, qname);

        HelloWebService helloWebService = service.getPort(HelloWebService.class);

        System.out.println(helloWebService.printMessage());

    }

}

