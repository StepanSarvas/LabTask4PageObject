package parsers.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class XMLParser {
    public static DataModel unmarshall() {
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(DataModel.class);
            return (DataModel) context.createUnmarshaller()
                    .unmarshal(new FileReader("src/main/resources/forparsing/data.xml"));
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}