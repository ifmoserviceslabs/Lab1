package com.ifmo.serviceslab1maven;
import javax.xml.ws.Endpoint;

public class MainApplication {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8080/EmployeeService";
        Endpoint.publish(url, new EmployeeWebService());
    }
}