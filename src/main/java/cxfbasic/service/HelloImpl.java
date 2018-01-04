package cxfbasic.service;

import javax.jws.WebService;


@WebService(name = "Hello", serviceName = "HelloService", portName = "HelloPort",
            targetNamespace = "http://cxfbasic",
            endpointInterface = "cxfbasic.service.Hello")
public class HelloImpl implements Hello {
    public String sayHi(String arg0) {
        return "get" + arg0;
    }

}