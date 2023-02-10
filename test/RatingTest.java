/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RatingTest {
    
    public RatingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStars method, of class Rating.
     */
    @Test
    public void testGetStars() {
        System.out.println("getStars");
        Rating instance = new Rating();
        int expResult = 0;
        int result = instance.getStars();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStars method, of class Rating.
     */
    @Test
    public void testSetStars() {
        System.out.println("setStars");
        int stars = 0;
        Rating instance = new Rating();
        instance.setStars(stars);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRate method, of class Rating.
     */
    @Test
    public void testGetRate() {
        System.out.println("getRate");
        Rating instance = new Rating();
        String expResult = "";
        String result = instance.getRate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRate method, of class Rating.
     */
    @Test
    public void testSetRate() {
        System.out.println("setRate");
        String rate = "";
        Rating instance = new Rating();
        instance.setRate(rate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
