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

    ArrayList<Traffic> trafficLocations;


    //Constructors
    public TrafficData(String location, List trafficLocations)
    {
        super(location, trafficLocations);
        time = LocalTime.now();
        date = LocalDate.now();
        incidents = new ArrayList();
        weather = " ";


    }

    /*
        Getters and setters
     */
    public int getIncidents(){return incidents.size();}

    public LocalTime getTime()
    {
        return time;
    }

    public void setTime()
    {
        LocalTime.now();
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate()
    {
        LocalDate.now();
    }

    //use this method to test setWeather
    public String getWeather()
    {
        return weather;
    }


    /*
        This method will retrieve incidents from the locations csv file, add them to the incidents ArrayList
        and return the ArrayList
        precondition: file exists and is in the trafficLocations List
        postcondition: incidents have been added to the ArrayList and the ArrayList is returned

     */
    public ArrayList setObstructions(ArrayList<Traffic> trafficLocations)
    {
        return incidents;
    }

    /*
        Retrieves weather from location and sets it equal to the weather
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
