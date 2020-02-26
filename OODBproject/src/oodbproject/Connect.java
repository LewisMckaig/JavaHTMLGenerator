
package oodbproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

    /**
    *Connects To the DataBase;
    * @author 1634854
    */
public class Connect {
     
    /**
     * Used to store all of the Rows from the database.
     */
    protected ArrayList<Row> contact = new ArrayList<>();
    
    Connection connection = null;        
    
    /**
     * sets up database connection and stores it is an arraylist of rows.
     */
    public Connect(){
        try
        {
          // create a database connection
          connection = DriverManager.getConnection("jdbc:sqlite:H:\\stefan\\OODBproject\\src\\contacts2.db");
          Statement statement = connection.createStatement();
          statement.setQueryTimeout(30);  // set timeout to 30 sec.
          ResultSet rs = statement.executeQuery("select * from contacts");
        
        while(rs.next())
          {
            String id ,fname, lname, email, countrycode, category;
            id = rs.getString("id");
            fname = rs.getString("first_name");
            lname = rs.getString("last_name");
            email = rs.getString("email");
            countrycode = rs.getString("countrycode");
            category = rs.getString("category");
            contact.add(new Row(id, fname, lname, email,countrycode,category));
            
          }
        
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          System.err.println(e.getMessage());
        }
        finally
        {
          try
          {
            if(connection != null)
              connection.close();
          }
          catch(SQLException e)
          {
            // connection close failed.
            System.err.println(e.getMessage());
          }
    }
    }
    
    /**
     * Returns the contact ArrayList.
     * @return 
     */
    public ArrayList getDataBase(){
            return contact;
        }
}

