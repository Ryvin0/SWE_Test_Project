import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

public class TrafficData extends Traffic
{
    String location;
    LocalTime time;
    LocalDate date;
    ArrayList incidents;
    String weather;

    ArrayList locationTraffic;


    //Constructors
    public TrafficData(String location, List lTraffic)
    {
        super(location, lTraffic);
        time = LocalTime.now();
        date = LocalDate.now();
        incidents = new ArrayList();
        weather = " ";


    }

    public TrafficData()
    {
        location = "";
    }

    /*
        Getters and setters
     */

    public LocalTime getTime()
    {
        return time;
    }

    //adds the time to the appropriate place in locationTraffic List
    public void setTime()
    {
        time = LocalTime.now();
    }

    public LocalDate getDate()
    {
        return date;
    }

    //also adds date to appropriate place in locationTraffic list
    public void setDate()
    {
        date = LocalDate.now();
    }


    public String getWeather()
    {
        return weather;
    }


    /*
        This method will retrieve incidents from the locations csv file, add them to the incidents ArrayList and to the
        trafficLocations List and return the ArrayList incidents
        precondition: file exists and is in the trafficLocations List
        postcondition: incidents have been added to the ArrayList and the ArrayList is returned

     */
    public ArrayList setObstructions(ArrayList<Traffic> trafficLocations)
    {
        return incidents;
    }

    /*
        Retrieves weather from location and sets it equal to the weather and adds it to locationTraffic list
        precondition: file exists and is in the trafficLocations List
        postconditions: weather has been retrieved from file and set equal to weather variable
     */
    public void setWeather()
    {

    }

    /*
        This method will display location, date, time, number of incidents, the incidents themselves, and the weather
        preconditions: all variables are not null or empty
        postconditions: All information regarding traffic is diaplayed to the user.
     */
    public void display()
    {

    }

}
