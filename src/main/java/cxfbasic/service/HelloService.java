package cxfbasic.service;


import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 *
 */

@WebServiceClient(name = "HelloService",
targetNamespace = "http://cxfbasic",
                  wsdlLocation = "http://localhost:9000/Hello?hello.wsdl")
public class HelloService extends Service {
    static final QName SERVICE = new QName("http://cxfbasic", "HelloService");
    static final QName HELLO_PORT =
        new QName("http://cxfbasic", "HelloPort");
    public HelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @WebEndpoint(name = "HelloPort")
    public Hello getHelloPort() {
        return super.getPort(HELLO_PORT, Hello.class);
    }

}