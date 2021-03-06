package com.infi.recorder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

public class XpathXML {
    public String parseXML(int threadNumber)
        throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        try {
            File inputFile = new File(
                System.getProperty("user.dir") + "/target/parallel.xml");
            if (inputFile.exists()) {
                DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder;

                dBuilder = dbFactory.newDocumentBuilder();

                Document doc = dBuilder.parse(inputFile);
                doc.getDocumentElement().normalize();

                XPath xPath = XPathFactory.newInstance().newXPath();

                String expression = "/suite/test/parameter";
                NodeList nodeList = (NodeList) xPath.compile(expression)
                    .evaluate(doc, XPathConstants.NODESET);
                String value = nodeList.item(threadNumber).getAttributes().getNamedItem("value")
                    .getNodeValue();
                return value;
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return null;
    }
}
