package cxfbasic;

import javax.xml.ws.Endpoint;

import cxfbasic.service.HelloImpl;

public class ServiceRunner {
	public static void main(String... args) {
		Endpoint.publish("http://localhost:9000", new HelloImpl());
	}
}
