package org.example.homework_23;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import static org.example.homework_23.Constants.*;

public class SAXHandler extends DefaultHandler {

    private final StringBuilder stringBuilder = new StringBuilder();
    private final StringBuilder lines = new StringBuilder();

    private String firstName;
    private String lastName;
    private String title;

    private boolean inFirsName = false;
    private boolean inLastName = false;
    private boolean inTitle = false;
    private boolean inLine = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        stringBuilder.setLength(0);
        switch (qName) {
            case FIELD_FIRST_NAME -> inFirsName = true;
            case FIELD_LAST_NAME -> inLastName = true;
            case FIELD_TITLE -> inTitle = true;
            case FIELD_LINE -> inLine = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        stringBuilder.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String value = stringBuilder.toString().trim();
        switch (qName) {
            case FIELD_FIRST_NAME:
                if (inFirsName && !value.isEmpty()) {
                    firstName = value;
                }
                inFirsName = false;
                break;
            case FIELD_LAST_NAME:
                if (inLastName && !value.isEmpty()) {
                    lastName = value;
                }
                inLastName = false;
                break;
            case FIELD_TITLE:
                if (inTitle && !value.isEmpty()) {
                    title = value;
                }
                inTitle = false;
                break;
            case FIELD_LINE:
                if (inLine && !value.isEmpty()) {
                    lines.append(value).append("\n");
                }
                inLine = false;
                break;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public StringBuilder getLines() {
        return lines;
    }
}
