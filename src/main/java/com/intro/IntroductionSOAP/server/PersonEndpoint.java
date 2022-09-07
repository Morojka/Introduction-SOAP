package com.intro.IntroductionSOAP.server;

import localhost._8081.ws.person.ProcessPersonRequest;
import localhost._8081.ws.person.ProcessPersonResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class PersonEndpoint {
    private static final String NAMESPACE_URI = "http://localhost:8081/ws/person";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "processPersonRequest")
    @ResponsePayload
    public ProcessPersonResponse processPerson(@RequestPayload ProcessPersonRequest request) {
        ProcessPersonResponse response = new ProcessPersonResponse();
        response.setPerson(request.getPerson());
        System.out.println(request.getPerson());
        return response;
    }
}