package mkxml;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import java.io.File;
import java.util.List;

/**
 * Created by amrafiee on 7/16/2016.
 */
public class ReadXML {
    public ReadXML() {
        try {
            SAXBuilder builder = new SAXBuilder();
            File xmlFile = new File("d:\\file.xml");
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();

            List list = rootNode.getChildren("header");

            for (int i = 0; i < list.size(); i++) {
                System.out.println( i);
                Element node = (Element) list.get(i);

                System.out.println("persons is : " + node.getChildText("person"));


            }
        } catch (Exception e) {

        }


    }

}
