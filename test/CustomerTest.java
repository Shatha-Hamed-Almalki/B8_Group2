/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class CustomerTest {
       Customer Instance = new Customer(1, "Raghad hezam", "Ab12345", "raghadh@hotmail.com", "0534672588", "jeddah,alajwad");
    
    public CustomerTest() {
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
     * Test of setCustomerName method, of class Customer.
     */
    
    @Test
    public void testSetCustomerName() {
        System.out.println("setCustomerName");
        String CustomerName = "";
        Customer instance = new Customer();
        instance.setCustomerName(CustomerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerPassword method, of class Customer.
     */
    @Test
    public void testSetCustomerPassword() {
        System.out.println("setCustomerPassword");
        String CustomerPassword = "";
        Customer instance = new Customer();
        instance.setCustomerPassword(CustomerPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerEmail method, of class Customer.
     */
    @Test
    public void testSetCustomerEmail() {
        System.out.println("setCustomerEmail");
        String CustomerEmail = "raghadh@hotmail.com";
        //Customer instance = new Customer();
        Instance.setCustomerEmail(CustomerEmail);
      
    }

    /**
     * Test of setCustomerPhone method, of class Customer.
     */
    @Test
    public void testSetCustomerPhone() {
        System.out.println("setCustomerPhone");
        String CustomerPhone = "0534672588";
        //Customer instance = new Customer();
        Instance.setCustomerPhone(CustomerPhone);
       
    }

    /**
     * Test of setCustomerAddress method, of class Customer.
     */
    @Test
    public void testSetCustomerAddress() {
        System.out.println("setCustomerAddress");
        String CustomerAddress = "jeddah,alajwad";
        //Customer instance = new Customer();
        Instance.setCustomerAddress(CustomerAddress);
       
    }

    /**
     * Test of setCustomerID method, of class Customer.
     */
    @Test
    public void testSetCustomerID() {
        System.out.println("setCustomerID");
        int CustomerID = 0;
        Customer instance = new Customer();
        instance.setCustomerID(CustomerID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerName method, of class Customer.
     */
   
    
    @Test
    public void testGetCustomerName() {
        System.out.println("getCustomerName");
       // Customer instance = new Customer();
        String expResult = "Raghad hezam";
        String result = Instance.getCustomerName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCustomerPassword method, of class Customer.
     */
    @Test
    public void testGetCustomerPassword() {
        System.out.println("getCustomerPassword");
       // Customer instance = new Customer();
        String expResult = "Ab12345";
        String result = Instance.getCustomerPassword();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCustomerEmail method, of class Customer.
     */
    @Test
    public void testGetCustomerEmail() {
        System.out.println("getCustomerEmail");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getCustomerEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerPhone method, of class Customer.
     */
    @Test
    public void testGetCustomerPhone() {
        System.out.println("getCustomerPhone");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getCustomerPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerAddress method, of class Customer.
     */
    @Test
    public void testGetCustomerAddress() {
        System.out.println("getCustomerAddress");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getCustomerAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    

   /**
     * Test of searchForBook method, of class Customer.
     */
    @Test(timeout=90)
    public void testSearchForBook() {
        System.out.println("searchForBook");
        String name = "Believe and Achieve";
        ArrayList<Book> bookList = new ArrayList<>();
        Book instance = new Book("Believe and Achieve","Chris Naylor","Self development",45.0,1,"Available");
        bookList.add(instance);
        Book expResult = instance;
        Customer object =new Customer();
        Book result = object.searchForBook(bookList,name);
        assertEquals(expResult, result);
       
      
    }
      //Use NullObject method to testing
     @Test
    public void testNullObject() {
        System.out.println("searchForLawyer");
        String name = "Believe and Achiev";
        ArrayList<Book> bookList = new ArrayList<>();
        Book instance = new Book("Believe and Achieve","Chris Naylor","Self development",45.0,1,"Available");
        bookList.add(instance);
        Customer object =new Customer();
        Book result = object.searchForBook(bookList, name);
        assertNull(result);
      
    }
    
}
     
    
    
    