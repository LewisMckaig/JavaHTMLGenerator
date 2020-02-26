
package oodbproject;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

    /**
    * Saves text into HTML files.
    */
public class SaveHTML {
    
    /**
     * Receives two Strings and uses them to generate an html file. One String is needed for the title of the document.
     * @param title
     * @param html 
     */
    static void save(String title, String html){
    try{
    File file = new File("H:\\contacts\\"+title+".html");
	FileWriter fileWriter = new FileWriter(file);
	PrintWriter printWriter = new PrintWriter(fileWriter);       
        printWriter.print(html);
        fileWriter.flush();
        fileWriter.close();
        }
    catch(IOException e){
      e.printStackTrace();  
    }
    }
}

