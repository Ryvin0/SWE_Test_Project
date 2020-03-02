import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.*;
import java.util.List;

/*  This test class will test out the Functionality test suites included in our Word Document 
 * 
 */

public class TestTrafficClass
{
    //Global variables
    public List<Traffic> loc;
    
    //Test the connect() method of Traffic class
    @Test
    public void testConnect()
    {
        Traffic t = new Traffic();
        boolean actual = t.connect();
        assertEquals(true, actual);
    }

    //Test the fileExists method with a file that is known to be in database
    @Test
    public void testFileExist()
    {
        Traffic t = new Traffic();
        t.connect();
        boolean actual = t.fileExists("Atlanta");
        assertEquals(true, actual);
    }

    //Test the fileExists method with a file that is not in database
    @Test
    public void testFileExist_notDB()
    {
        Traffic t = new Traffic();
        t.setLocation("Atlanta");
        t.connect();
        boolean actual = t.fileExists();
        assertEquals(false, actual);
    }
    
    //Test to see if File object is not Null
    @Test
    public void testFileIsNotNull()
    {
        Traffic t = new Traffic();
        t.setLocation("Atlanta");
        t.connect();
        boolean actual = t.isFileNull();
        assertEquals(true, actual);
    }

    //Test retrieveTrafficInfo method
    @Test
    public void testRetrieveTrafficInfo()
    {
        List<Traffic> test;
        Traffic t = new Traffic();
        t.setLocation("Atlanta");
        t.connect();
        loc = t.retrieveTrafficInfo();
        test = t.retrieveTrafficInfo();
        assertTrue(test.equals(loc));
    }
    
    
    //Test to make sure trafficLocations contains searched location 
    @Test
    public void checkLocations() 
    { 
    	
    	
    }
    
    //Test to make validate size of incidents 
    @Test 
    public void checkIncidents() 
    { 
    	
    }
    
    
    
    
}
