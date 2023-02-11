
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 * @author wafaa
 */
public class PaymentTest {
    
    public PaymentTest() {
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
     * Test of setCardNum method, of class Payment.
     */
    @Test
    public void testSetCardNum() {
        System.out.println("setCardNum");
        String CardNum = "1234567891234567";
        Payment instance = new Payment("1234567891234567", "wafaa", "23", 827);
        assertEquals(CardNum, instance.getCardNum());
        assertEquals(instance.getCardNum().length(), 16);
        
    }
    /**
     * Test of setNameOnCard method, of class Payment.
     */
    @Test
    public void testSetNameOnCard() {
        System.out.println("setNameOnCard");
        String NameOnCard = "wafaa";
        Payment instance = new Payment("", "wafaa", "23", 827);
        assertEquals(NameOnCard, instance.getNameOnCard());
    }
    /**
     * Test of setExpiryDate method, of class Payment.
     */
    @Test
    public void testSetExpiryDate() {
        System.out.println("setExpiryDate");
        String ExpiryDate = "23";
        Payment instance = new Payment("", "wafaa", "23", 827);
        assertEquals(ExpiryDate, instance.getExpiryDate());
    }
    /**
     * Test of setCVV method, of class Payment.
     */
    @Test
    public void testSetCVV() {
        System.out.println("setCVV");
        int CVV = 827;
        Payment instance = new Payment("", "jehan", "23", 827);
        assertEquals(CVV, instance.getCVV());
    }
    
}


