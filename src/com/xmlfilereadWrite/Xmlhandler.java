/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xmlfilereadWrite;



import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class Xmlhandler extends DefaultHandler{

    @Override
    public void startElement(String string, String string1, String string2, org.xml.sax.Attributes atrbts) throws SAXException {
        int count =  atrbts.getLength();
       
       for(int i=0; i<count;i++){
           System.out.println(atrbts.getQName(i));
           System.out.println(atrbts.getValue(i));
    }

    
    } 
    
    
}
