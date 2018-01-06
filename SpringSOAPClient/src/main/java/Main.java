import server.stuff.HelloWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class Main {

    /**
     * Make sure to run SpringSoapServer on Tomcat LocalServer
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
