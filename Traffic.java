import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Traffic
{
    public String location;
    public List<Traffic> trafficLocations;
    public File file;

    //constructors
    public Traffic(String location, List<Traffic> tlocations)
    {
        this.location = location;
        trafficLocations = tlocations;
    }

    public Traffic()
    {
        location = " ";
    }


    /*
        Getter and setter methods for location variable
     */
    public void setLocation(String loc)
    {
        location = loc;
    }

    public String getLocation()
    {
        return location;
    }


    /*
           Establishes a connection to the database containing CSV files with traffic conformation
           Precondition: database is live and functioning
           Postcondition: return true if connection is successful, false otherwise
        */
    public boolean connect()
    {
        return false;
    }

    /*
        Uses location variable to obtain the CSV file of the desired location from the database
        Precondition: Database is live and the file is in the database
        Postcondition: The file is retrieved from the database and added into a list and returns the list
     */
    public List retrieveTrafficInfo()
    {
        return trafficLocations;
    }


    /*
        Checks to see if the CSV file of a location is in the database
        Precondition: Database is live and a connection has been established
        Postcondition: Returns true if the file is in the database, false otherwise
     */
    public boolean fileExists()
    {
        return false;
    }


    /*
        Retrieves file from database and checks to see if it is Null
        precondition: connection to database has been established
        postcondition: true if file is NOT null, false otherwise
     */

    public boolean isFileNull()
    {
        return false;
    }

    /*
        retrieves file from database and checks to see if it is empty
        preconditions: connection to database has been established
        postcondition: true if file is empty, false otherwise
     */
    public boolean isFileEmpty()
    {
        return true;
    }




}
