
import java.util.ArrayList;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author wafaa
 */
public class OrderTest {
    
    public OrderTest() {
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
     * Test of setOrderID method, of class Order.
     */
    @Test
    public void testSetOrderID() {
        System.out.println("setOrderID");
        String OrderID = ""+    new Random().nextInt(10000);
        
        Order instance = new Order();
        instance.setOrderID(OrderID);
        assertEquals(OrderID, instance.getOrderID());
    }
    /**
     * Test of testGetPriceSum method, of class Order.
    */
    @Test
    public void testGetPriceSum() {
        System.out.println("getPriceSum");
           ArrayList<Book> expResult = new ArrayList<>();
        expResult.add(new Book ("test book 1","wafaa","test book type",50.0,50,"Available"));
        expResult.add(new Book ("test book 2","wafaa","test book type",50.0,50,"Available"));
        expResult.add(new Book ("test book 3","wafaa","test book type",50.0,50,"Available"));
        expResult.add(new Book ("test book 4","wafaa","test book type",50.0,50,"Available"));
        
        double PriceSum = 200;
        Order instance = new Order();
        instance.setBooks(expResult);
        assertEquals(PriceSum, instance.getPriceSum(),0);
    }
    /**
     * Test of getBooks method, of class Order.
     */
    @Test
    public void testGetBooks() {
        System.out.println("getBooks");
        Order instance = new Order();
        ArrayList<Book> expResult = new ArrayList<>();
        expResult.add(new Book ("test book 1","wafaa","test book type",50.0,50,"Available"));
        expResult.add(new Book ("test book 2","wafaa","test book type",50.0,50,"Available"));
        expResult.add(new Book ("test book 3","wafaa","test book type",50.0,50,"Available"));
        expResult.add(new Book ("test book 4","wafaa","test book type",50.0,50,"Available"));
        
        instance.setBooks(expResult);
        
        ArrayList<Book> result = instance.getBooks();
        assertEquals(expResult, result);
   
    }
    /**
     * Test of addBook method, of class Order.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        Book b = new Book ("test book","wafaa","test book type",50.0,50,"Available");
        Order instance = new Order();
        instance.addBook(b);
        assertEquals(1, instance.getBooks().size());
        assertEquals(b, instance.getBooks().get(0));
        
    }
    
}
