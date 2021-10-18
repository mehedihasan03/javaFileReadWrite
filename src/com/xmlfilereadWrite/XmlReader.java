/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xmlfilereadWrite;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;







/**
 *
 * @author Adon
 */
public class XmlReader {
    public static void main(String[] args) {
        
          File xmlfile = new File("G:\\J2EE\\Advance_JAVA\\FileReadWrite\\newXMLDocument.xml");
           SAXParserFactory spf = SAXParserFactory.newInstance();
           spf.setNamespaceAware(true);
           spf.setValidating(true);
           SAXParser parser = null;
        try {

            parser = spf.newSAXParser();
            Xmlhandler handler = new Xmlhandler();
            parser.parse(xmlfile, handler);
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XmlReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(XmlReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XmlReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
          
       
        
    }
    
    
}
