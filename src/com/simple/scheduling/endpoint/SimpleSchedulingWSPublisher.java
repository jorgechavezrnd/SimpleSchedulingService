/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.scheduling.endpoint;

import com.simple.scheduling.ws.SimpleSchedulingWS;
import javax.xml.ws.Endpoint;

public class SimpleSchedulingWSPublisher {
    
    public static void main(String[] args) {
        
        Endpoint.publish("http://localhost:9999/simplescheduling", new SimpleSchedulingWS());
        System.out.println("Service listening at: http://localhost:9999/simplescheduling?wsdl");
        
    }
    
}
