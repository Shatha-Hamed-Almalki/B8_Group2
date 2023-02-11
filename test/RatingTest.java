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
     * Test of setStars method, of class Rating.
     */
    @Test
    public void testSetStars() {
        System.out.println("setStars");
        int stars = 5;
        Rating instance = new Rating(5, "Thanks");
        instance.setStars(stars);
        int expResult = 5;
        int result = instance.getStars();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStars method, of class Rating.
     */
    @Test
    public void testGetStars() {
        System.out.println("getStars");
        Rating instance = new Rating(4, "Everythin was good");
        int expResult = 4;
        int result = instance.getStars();
        assertEquals(expResult, result);
    }
    /**
     * Test of setRate method, of class Rating.
     */
    @Test
    public void testSetRate() {
        System.out.println("setRate");
        String rate = "No comments, Thanks";
        Rating instance = new Rating(3,"No comments, Thanks");
        instance.setRate(rate);
        String expResult = "No comments, Thanks";
        String result = instance.getRate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRate method, of class Rating.
     */
    @Test
    public void testGetRate() {
        System.out.println("getRate");
        Rating instance = new Rating(5, "Pdrfect application!");
        String expResult = "Pdrfect application!";
        String result = instance.getRate();
        assertEquals(expResult, result);
    }

    
    
}
