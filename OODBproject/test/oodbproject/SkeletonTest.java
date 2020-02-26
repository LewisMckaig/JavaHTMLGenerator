
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
public class SkeletonTest {

    /**
     *Tests that the create page generates the correct html
     */
    @Test
    public void testCreatePage() {
        System.out.println("createPage");
        String title = "Test";
        String expResult = "<!DOCTYPE html>"
                + "\n<html lang = \"en\">"
                + "\n<head>"
                + "\n<meta charset =\"utf-8\">"
                + "\n<link rel=\"stylesheet\" type=\"text/css\" href=\"database.css\" />"
                + "\n<title>Test</title>"
                + "\n</head>";
        Skeleton s = new Skeleton(title);
        String result = s.html;
        assertEquals(expResult, result);
        
                }  
}
