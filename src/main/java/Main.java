import Beams.BeamsRandomizer;
import FileCreator.XMLFileCreator;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, TransformerException, SAXException {

        for (int i = 0; i < 10; i++) {
            saveToFile(String.valueOf(i));
        }

    }

    private static void saveToFile(String fileName) throws ParserConfigurationException, IOException, TransformerException, SAXException {

        XMLFileCreator xmlFileCreator = new XMLFileCreator(packageGeneratorTest(), fileName + ".xml");
        xmlFileCreator.stringToDom();

    }


    private static String packageGeneratorTest() {

        BeamsRandomizer beamsRandomizer = new BeamsRandomizer();

        StringBuilder randomizedString = beamsRandomizer.getRandomizedString();


        StringBuilder sb2 = new StringBuilder();

        sb2.append(BaseXML.baseXMLFirstPart);
        sb2.append(randomizedString);
        sb2.append(BaseXML.BaseXMlSecondPart);

        return sb2.toString();
    }


}
