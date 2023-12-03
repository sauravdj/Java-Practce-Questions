import javafx.scene.effect.Light.Spot;

class WeatherData {
    // CREATE PRIVATE MEMBER VARIABLES HERE
    //windSpeed variable
    private int windSpeed;
    private double dailyTemp ;
    //Default Constructor
    WeatherData()
    {
        // Initialize private member variables to none or zero
        windSpeed = 0;
        dailyTemp = 0;
               
    }
    
// Overload Constructor
    WeatherData(double newDailyTemp, int newWindSpeed)
    {
        // Initialize private member variables to values passed in a variable to values passed in an parameters
        windSpeed = newWindSpeed;
        dailyTemp = newDailyTemp;
    }        

    // Accessors
    public void setDailyTemp(double currentTemp)
    {
        // set the currentTemp to the value passed in a parameter
        dailyTemp = currentTemp;
    }
    
    public void setWindSpeed(int currentWindSpeed)
    {
        // set the WindSpeed to the value passed in the parameter
        windSpeed = currentWindSpeed;
    }        

    // Mutators
    public double getDailyTemp()
    {
        // return the dailyTemp here
        return this.dailyTemp;
    }
    
    public int getWindSpeed()
    {
        // return the windSpeed here

        return this.windSpeed;
    }
    
    public boolean equals(WeatherData o)
    {
        // Check to see if the windSpeed and dailyTemp in Object o is the same
        // as the "this" or current objects windSpeed and dailyTemp.
        // If they are equal, then return true
        if(this.windSpeed == o.windSpeed && this.dailyTemp == o.dailyTemp)
            return true;
        else
            return false;
    }
    
}
public class WeatherDataDriver{
    public static void main(String[] args) {
        WeatherData wd1 = new WeatherData(40, 100);
        WeatherData wd2 = new WeatherData(30, 100);
        System.out.println(wd1.equals(wd2));
        System.out.println(wd2.equals(wd1));
    }
}
