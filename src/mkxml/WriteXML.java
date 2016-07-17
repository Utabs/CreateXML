package mkxml;

import element.PersonTO;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amrafiee on 7/16/2016.
 */
public class WriteXML {
    private static int counter;

    public WriteXML() throws IOException {
        try {

            List<PersonTO> personTOs = new ArrayList<PersonTO>();
            for (int i = 0; i < 10; i++) {
                PersonTO personTO = new PersonTO();
                personTO.setName("amin" + i);
                personTO.setBirthdate("13950505");
                personTO.setIssue_number("040563233610");
                personTO.setLast_name("rafie" + i);
                personTO.setLevel("2000");
                personTO.setNational_code("46054640215");
                personTOs.add(personTO);
                counter++;
            }

            Element root = new Element("indevidual-activity-level");
            Document document = new Document(root);
            document.setRootElement(root);

            Element header = new Element("header");
            header.addContent(new Element("bic").setText("MELIIRTHXXX"));
            header.addContent(new Element("record-count").setText(String.valueOf(counter)));
            document.getRootElement().addContent(header);
            Element persons = new Element("persons");
            for (PersonTO to : personTOs) {
                Element person = new Element("person");
                person.setAttribute(new Attribute("National-code", to.getNational_code()));
                person.setAttribute(new Attribute("name", to.getName()));
                person.setAttribute(new Attribute("last-name", to.getLast_name()));
                person.setAttribute(new Attribute("level", to.getLevel()));
                person.setAttribute(new Attribute("issue-number", to.getIssue_number()));
                person.setAttribute(new Attribute("birth-date", to.getBirthdate()));
                persons.addContent(person);
                System.out.println(to.getName());
            }
            document.getRootElement().addContent(persons);
            XMLOutputter xmlOutputter = new XMLOutputter();
            xmlOutputter.setFormat(Format.getPrettyFormat());
            xmlOutputter.output(document, new FileWriter("d:\\file.xml"));
            System.out.println("File Saved to XML!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
