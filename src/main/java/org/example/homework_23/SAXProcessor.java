package org.example.homework_23;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.example.homework_23.Constants.SAVE_DIRECTORY;
import static org.example.homework_23.Constants.XML_RESOURCE_PATH;

public class SAXProcessor {
    public void process() throws ParserConfigurationException, SAXException, IOException {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        SAXHandler handler = new SAXHandler();
        parser.parse(XML_RESOURCE_PATH, handler);

        BookTitle bookTitle = new BookTitle(handler.getFirstName(), handler.getLastName(), handler.getTitle());
        StringBuilder stringBuilder = handler.getLines();

        Files.writeString(Paths.get(SAVE_DIRECTORY + bookTitle), stringBuilder);
    }
}
