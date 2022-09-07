package com.intro.IntroductionSOAP.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.xml.transform.*;

@RestController
@ResponseBody
@RequestMapping("/response")
public class RequestController {

    @PostMapping(
            value = "/new-request",
            consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_XML_VALUE)
    public String processXML(@RequestBody String request) throws TransformerException {
//        String xml = request;

//        TransformerFactory factory = TransformerFactory.newInstance();
//        Source xslt = new StreamSource(new File("src/main/resources/xslt/transform.xslt"));
//        Transformer transformer = factory.newTransformer(xslt);
//
//        Source text = new StringSource(request);
//        StreamResult consoleResult = new StreamResult(System.out);
//        StreamResult stringResult = new StringResult();
//        transformer.transform(text, consoleResult);
//        transformer.transform(text, stringResult);

        return request;
    }
}