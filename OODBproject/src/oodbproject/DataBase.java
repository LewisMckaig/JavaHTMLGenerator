
package oodbproject;

import java.util.ArrayList;

/**
 *This class populates the Database Arraylist from the connect class.
 */
public class DataBase {
    static ArrayList<Row> contact = new ArrayList<>();
    boolean connect = false;
    
    /**
     * Runs the database connection and populates the ArrayList with all the rows.
     */
    public DataBase(){
        if(connect == false){
        Connect connection = new Connect();        
        contact = connection.getDataBase();
        connect = true;
        }
        else{
            System.out.println("Already connected");
        }}
    
    
}
