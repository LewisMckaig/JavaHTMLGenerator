
package oodbproject;

/**
     * This method creates a "skeleton" for the html documents that needs to be 
     * generated for each page. 
     */
public class Skeleton {
    
    /**
     * String that is used to create the HTML files.
     */
    protected String html;
    
    /**
     * constructor generates the start of the html, all pages will contain the same
     * html before the body. Only the title changes.
     * @param title 
     */
    protected Skeleton(String title){
        Tag t = new Tag();
        html = "<!DOCTYPE html>"
                + "\n<html lang = \"en\">"
                + "\n<head>"
                + "\n<meta charset =\"utf-8\">"
                + "\n<link rel=\"stylesheet\" type=\"text/css\" href=\"database.css\" />"
                + "\n<title>" + title + "</title>"
                + "\n</head>";
    }
}
