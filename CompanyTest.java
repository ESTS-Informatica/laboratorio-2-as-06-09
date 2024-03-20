

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
}
