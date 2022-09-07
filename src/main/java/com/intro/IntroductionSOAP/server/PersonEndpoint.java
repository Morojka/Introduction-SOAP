package com.intro.IntroductionSOAP.server;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import wsdl.ProcessPersonRequest;
import wsdl.ProcessPersonResponse;


@Endpoint
public class PersonEndpoint {
    private static final String NAMESPACE_URI = "http://localhost:8081/ws/person";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "processPersonRequest")
    @ResponsePayload
    public ProcessPersonResponse processPerson(@RequestPayload ProcessPersonRequest request) {
        ProcessPersonResponse response = new ProcessPersonResponse();
//        response.setPerson(personRepository);
        System.out.println(request);
        return response;
    }
}