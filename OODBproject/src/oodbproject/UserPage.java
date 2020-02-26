
package oodbproject;

import java.util.Scanner;

/**
 *Generates the Individual User Page.
 */
public class UserPage extends Skeleton{
 
    /**
     * Creates the page from the data passed into the method.
     * @param id
     * @param fname
     * @param lname
     * @param i
     * @param txt 
     */
    public UserPage(String id, String fname, String lname, int i, String txt){
        super(fname + " " + lname);
        html = html + Tag.openBody();
        String text = DataBase.contact.get(i).toString();
        html = html + Tag.para(text);
        html = html + Tag.para(txt);
        html = html + Tag.backBtn();
        html = html + Tag.closeBody();
        html = html + Tag.closePage();
        
    }    
}
