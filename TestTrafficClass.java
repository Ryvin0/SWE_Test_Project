import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.*;

/*  This test class will test out the Functionality test suites included in our Word Document 
 * 
 */

public class TestTrafficClass
{
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
        t.connect();
        boolean actual = t.fileExists("Cary"); //Cary is a low profile city in North Carolina that may not be in a traffic database
        assertEquals(false, actual);
    }

    //Test retrieveTrafficInfo method
    @Test
    public void testRetrieveTrafficInfo()
    {
        Traffic t = new Traffic();
        t.connect();
        //Having trouble figuring out how to test to see if this method worked
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
