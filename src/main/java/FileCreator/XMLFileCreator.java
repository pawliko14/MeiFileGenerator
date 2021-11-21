package FileCreator;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class XMLFileCreator {

    private final String xmlSource;
    private  final String xmlFileName;

    public XMLFileCreator(String xmlSource, String xmlFileName) {
        this.xmlSource = xmlSource;
        this.xmlFileName = xmlFileName;
    }

    public void stringToDom() throws SAXException, ParserConfigurationException, IOException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new InputSource(new StringReader(this.xmlSource)));
        // Use a Transformer for output
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer();

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(this.createResourceSubFolder() + "/" + this.xmlFileName));
        transformer.transform(source, result);
    }

    private Path createResourceSubFolder() throws IOException {
        Path source = Paths.get(this.getClass().getResource("/").getPath());
        Path newFolder = Paths.get(source.toAbsolutePath() + "/newFolder/");

        return newFolder;
    }

}
