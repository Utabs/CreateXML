package mkxml;

/**
 * Created by amrafiee on 7/17/2016.
 */

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler extends DefaultHandler {

    boolean bMarks = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

        if (qName.equalsIgnoreCase("person")) {
            bMarks = true;
        }

        if (qName.equalsIgnoreCase("person")) {
            String id = attributes.getValue("level");
            String name = attributes.getValue("name");
            System.out.println("Level is : " + id);
            System.out.println("name is : " + name);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("person")) {
            System.out.println("End Element :" + qName);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (bMarks) {
            System.out.println("Marks: "
                    + new String(ch, start, length));
            bMarks = false;
        }
    }
}