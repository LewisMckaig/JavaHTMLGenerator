
package oodbproject;

/**
 * Holds all Data in a row, passes the data to other classes where needed.
 * @author 1634854
 */
public class Row {

    final private String id; 
    final private String fname; 
    final private String lname; 
    final private String email; 
    final private String countrycode; 
    final private String category;
    
    /**
     * Constructor sets the passed values from connect() to its own variables.
     * @param id
     * @param fname
     * @param lname
     * @param email
     * @param countrycode
     * @param category 
     */
    public Row(String id, String fname, String lname, String email, String countrycode, String category){
        this.id = id;
        this.fname = fname;
        this.lname = lname; 
        this.email = email; 
        this.countrycode = countrycode; 
        this.category = category;
    }
    
    /**
     * returns a string that is in html format to be added to the linked pages.
     * @return 
     */
    @Override
    public String toString(){
        String text = "id: " + id + "<br> First Name: " + fname + "<br> Last Name: " + lname
                + "<br> Email: " + email + "<br> Country Code: " + countrycode + "<br> Category: " 
                + category;
        return text;
    }
    
    /**
     * returns a String of all the fields in the row.
     * @return 
     */
    public String toText(){
        String text = "id: " + id + " First Name: " + fname + " Last Name: " + lname
                + " Email: " + email + " Country Code: " + countrycode + " Category: " 
                + category;
        return text;
    }
    
    /**
     * Concatenates two strings, used for creating the links to the user pages on the index page
     * @return 
     */
    public String indexString(){
        String text = "Name :" + fname + " " +lname;
        return text;
    }
    
    /**
     *
     * @return
     */
    public String getID(){
        return id;
    }
    
    /**
     *
     * @return
     */
    public String getFname(){
        return fname;
    }
    
    /**
     *
     * @return
     */
    public String getLname(){
        return lname;
    }
    
    /**
     *
     * @return
     */
    public String getEmail(){
        return email;
    }
    
    /**
     *
     * @return
     */
    public String getCountryCode(){
        return countrycode;
    }
    
    /**
     *
     * @return
     */
    public String getCategory(){
        return category;
    }
}
