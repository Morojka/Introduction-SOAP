package com.intro.IntroductionSOAP.server;

import com.intro.IntroductionSOAP.controller.PersonController;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import javax.xml.transform.TransformerException;

import localhost._8081.ws.person.ProcessPersonRequest;
import localhost._8081.ws.person.ProcessPersonResponse;

@Endpoint
public class PersonEndpoint {
    private static final String NAMESPACE_URI = "http://localhost:8081/ws/person";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "processPersonRequest")
    @ResponsePayload
    public ProcessPersonResponse processPerson(@RequestPayload ProcessPersonRequest request) throws TransformerException {
        ProcessPersonResponse response = new ProcessPersonResponse();
        response.setPerson(PersonController.processXML(request.getPerson()));
        return response;
    }
}