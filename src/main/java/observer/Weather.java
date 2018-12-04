package observer;

/**
 * @author guangda 
 */
public class Weather extends Observable<Weather, City, WeatherType> {

    private WeatherType currentWeatherType;

    public Weather() {
        super();
        this.currentWeatherType = WeatherType.SUNNY;
    }

    public void timePasses() {
        notifyObservers(currentWeatherType);
    }

}
