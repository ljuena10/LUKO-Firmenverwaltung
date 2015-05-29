/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xml;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author David
 */
public class xmlCreator
{
    
    public static void createXMLFile(String filename) throws ParserConfigurationException
    {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            File xmlFile = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "files" + File.separator + filename);
            xmlFile.createNewFile();
            
            
        } catch (IOException ex) {
            System.out.println("Fehler bei IOException: "+ex.toString());
        }        
    }
    
    public static void main(String[] args) {
        try {
            xmlCreator.createXMLFile("test.xml");
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(xmlCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
