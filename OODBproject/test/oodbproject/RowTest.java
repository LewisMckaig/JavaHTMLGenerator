/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodbproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1634854
 */
public class RowTest {

    /**
     * Tests that the ToString() method generates the correct HTML.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Row r = new Row("1A","lewis","mckaig", "l@l.com","uk","business");
        String expResult = "id: 1A<br> First Name: lewis<br> Last Name: mckaig<br> Email: l@l.com<br> Country Code: uk<br> Category: business";
        String result = r.toString();
        assertEquals(expResult, result);
    }
    
}
