package cxfbasic;

import javax.xml.ws.Endpoint;

import cxfbasic.server.HelloWorldImpl;

public class Server {
    public static void main(String args[]) throws Exception {
    	Server server = new Server();
    	Endpoint endpoint = server.createAndPublish();
    	System.out.println("Server ready...");
    }
    
    private Endpoint createAndPublish() {
        System.out.println("Starting Server");
        HelloWorldImpl implementor = new HelloWorldImpl();
        String container = System.getenv().get("CONTAINER");
        String address = "http://0.0.0.0:9000/helloWorld";
        if ( container != null ) {
            address = "http://0.0.0.0:9000/helloWorld";
        } else {
            address = "http://localhost:9000/helloWorld";
        }
        System.out.println("Address: " + address);
        return Endpoint.publish(address, implementor);
    }
}
