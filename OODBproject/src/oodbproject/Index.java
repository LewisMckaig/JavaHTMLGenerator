
package oodbproject;

import java.util.Scanner;

    /**
     *Generates the html for the index page.
     */
public class Index extends Skeleton{
    
    /**
     * generates skeleton HTML then generates links to all pages that are created from data taken from the database.
     * After generating the html it is then saved as a html file
     */
    public Index(){     
        super("Index");
        html = html + Tag.openBody();
        
        for (int i = 0; i < DataBase.contact.size(); i++){
            String text = DataBase.contact.get(i).indexString();
            html = html + "\n" + Tag.pageLink(text, DataBase.contact.get(i).getID());
        }
        
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter text to add to Index page.");
        String txt = Scan.nextLine();
        html = html + Tag.para(txt);
        
        html = html + Tag.closeBody();
        html = html + "\n" + Tag.closePage();       
        }
    }

