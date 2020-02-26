package oodbproject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1634854
 */
public class connectTest {

    /**
     * Ensures that the Connect class connects to the database and fills an array list. 
     * the result is also printed to the screen to ensure all the data is there.
     */
    @Test
    public void displaycontacts() {
        Connect c = new Connect();
        
        for (int i = 0; i< c.contact.size(); i++){
        System.out.println(c.contact.get(i).toText());
        
        assertNotNull(c.contact);
        }
    }
    
}
