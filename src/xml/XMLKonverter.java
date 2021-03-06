/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import beans.Adresse;
import beans.Person;
import java.io.File;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Enis Lushtaku
 */
public class XMLKonverter
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Person p = new Person("Enis", "Lushtaku", new Date(), new Adresse(), 1514684684);

        try
        {
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Marshaller marsh = context.createMarshaller();
            marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marsh.marshal(p, System.out);
            String xmlPath = System.getProperty("user.dir")
                    +File.separator+"src"
                    +File.separator+"xml"
                    +File.separator+"Student.xml";
            Unmarshaller unmarsh = JAXBContext.newInstance(xmlPath).createUnmarshaller();
            Object o = unmarsh.unmarshal(null)
        } catch (JAXBException ex)
        {
            System.out.println(ex.toString());
        }
    }

}
