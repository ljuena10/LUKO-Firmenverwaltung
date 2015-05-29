/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pdf;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author David
 */
public class PDFConverter {
    
    public static void createPDF(String filename, String existingFile)
    {
        File fExist = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "files" + File.separator + existingFile);
        File f = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "files" + File.separator + filename+".pdf");
        try {
            f.createNewFile();
            f=fExist;
        } catch (IOException ex) {
            Logger.getLogger(PDFConverter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        PDFConverter.createPDF("test01", "test.xml");
    }
    
}
