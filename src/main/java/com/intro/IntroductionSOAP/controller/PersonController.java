package com.intro.IntroductionSOAP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

@Controller
public class PersonController {

    public static String processXML(String person) throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        Source xslt = new StreamSource(new File("src/main/resources/xslt/transform.xslt"));
        Transformer transformer = factory.newTransformer(xslt);

        Source text = new StringSource(person);
        StreamResult stringResult = new StringResult();
        transformer.transform(text, stringResult);
        return stringResult.toString();
    }
}