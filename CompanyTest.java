

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    private Company company;
    private  User client1;
    private  User client2;
    private  User seller1;
    private  User seller2;
    private  Property property1;
    
    /**
     * Default constructor for test class CompanyTest
     */
    public CompanyTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp(){
        User client1 = new User("José Manuel","911111111", "zemanel@yahoo.com");
        User client2 = new User("António Francisco","922222222", "tochico@hotmail.com");
        User seller1 = new User("Fernando Fernandes","966777101", "fefe@remax.pt");
        User seller2 = new User("Rodrigo Rodrigues","966777152", "roro@remax.pt");
        Property property1 = new Property("T3 Monte Belo",150000.0);  
        company = new Company();
    }
    

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
   
    @Test
    public void testConstructor(){
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
    }
    
    
    //nivel 4
    @Test
    public void testRegisterClient(){
        assertEquals(true,company.registerClient(client1));
    }
     
    @Test
    public void testRegisterClients(){
        assertEquals(true,company.registerClient(client1));
        assertEquals(true,company.registerClient(client2));
    }
    
    @Test
    public void testRegisterClientDuplicate(){
        assertEquals(true, company.registerClient(client1));
        assertEquals(false, company.registerClient(client1));
    }
    
    @Test
    public void testRegisterClientNull(){
        assertEquals(true, company.registerClient(null));
    }
    
    //test SELLER
    @Test
    public void testRegisterSeller(){
        assertEquals(true,company.registerSeller(seller1));
    }
    
     @Test
    public void testRegisterSellers(){
        assertEquals(true,company.registerSeller(seller1));
        assertEquals(true,company.registerSeller(seller2));
    }
    
    @Test
    public void testRegisterSellerDuplicate(){
        assertEquals(true,company.registerSeller(seller1));
        assertEquals(false,company.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellerNull(){
        assertEquals(true,company.registerSeller(null));
    }
    
  @Test
    public void testRegisterProperty(){
        assertEquals(true,company.registerProperty(property1));
    }
}
