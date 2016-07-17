package mkxml;
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;



/**
 * Created by amrafiee on 7/16/2016.
 */
public class ReadXML {
    public ReadXML() {
        try {
            try {
                File inputFile = new File("D:\\file.xml");
                SAXParserFactory factory = SAXParserFactory.newInstance();
                SAXParser saxParser = factory.newSAXParser();
                UserHandler userhandler = new UserHandler();
                saxParser.parse(inputFile, userhandler);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
