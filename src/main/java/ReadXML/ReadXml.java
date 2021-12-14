package ReadXML;

import EntryData.EntryData;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


public class ReadXml {
    public Document convert() throws JAXBException {
        try {
            File file = new File("src\\main\\resources\\searchData.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(EntryData.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            EntryData entryData = (EntryData) jaxbUnmarshaller.unmarshal(file);
            return (Document) entryData;
        }
        catch (JAXBException e){
            e.printStackTrace();
        }
//        try{
//            File file = new File("src\\main\\resources\\searchData.xml");
//            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//            Document document = documentBuilder.parse(file);
//            return document;
//        }
//         catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (SAXException e) {
//            e.printStackTrace();
//        }
        return null;
    }
}
