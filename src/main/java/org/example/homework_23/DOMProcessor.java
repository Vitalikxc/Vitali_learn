package org.example.homework_23;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;

import static org.example.homework_23.Constants.*;

public class DOMProcessor {
    public void process() throws ParserConfigurationException, IOException, SAXException {
        StringBuilder stringBuilder = new StringBuilder();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(XML_RESOURCE_PATH));

        BookTitle bookTitle = new BookTitle(document.getElementsByTagName(FIELD_FIRST_NAME).item(0).getTextContent(),
                document.getElementsByTagName(FIELD_LAST_NAME).item(0).getTextContent(),
                document.getElementsByTagName(FIELD_TITLE).item(0).getTextContent());

        Element element = document.getDocumentElement();
        NodeList nodeList = element.getElementsByTagName(FIELD_LINE);

        IntStream.range(0, nodeList.getLength())
                .forEach(i -> stringBuilder.append(nodeList.item(i).getTextContent()).append("\n"));

        Files.writeString(Paths.get(SAVE_DIRECTORY + bookTitle), stringBuilder);
    }
}
