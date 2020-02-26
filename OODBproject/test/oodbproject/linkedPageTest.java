/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodbproject;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1634854
 */
public class linkedPageTest {

    /**
     *
     */
    public linkedPageTest() {
    }
    /**
     * This test tests the linked page class to ensure it is creating acceptable html code. 
     * A row is created and passed to the linked page which will generate html.
     * The result is compared with the result that is desired.
     */
    @Test
    public void displaypage() {
        Row r = new Row("1A", "lewis", "mckaig", "l@l.com", "uk", "business");
        DataBase.contact.add(r);
        String html = "";
        String expected = "<!DOCTYPE html>"
                + "\n<html lang = \"en\">"
                + "\n<head>"
                + "\n<meta charset =\"utf-8\">"
                + "\n<link rel=\"stylesheet\" type=\"text/css\" href=\"database.css\" />"
                + "\n<title>Lewis Mckaig</title>"
                + "\n</head>"
                + "\n<body><P>id: 1A<br> First Name: lewis<br> Last Name: mckaig<br> Email: l@l.com<br> Country Code: uk<br> Category: business </p>"
                + "\n<P>example </p>"
                + "\n <button onclick=\"window.location.href='index.html'\">back to home</button></body></html>";
        
        UserPage LP = new UserPage("1A", "Lewis", "Mckaig", 0,"example");
        assertEquals(LP.html, expected);

    }

}
