package cxfbasic.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@SOAPBinding(use = SOAPBinding.Use.LITERAL)
@WebService(name = "Hello", targetNamespace = "http://cxfbasic")
public interface Hello {
    @SOAPBinding(style = SOAPBinding.Style.RPC)
    @WebMethod(operationName = "sayHi", exclude = false)
    String sayHi(String value);
}