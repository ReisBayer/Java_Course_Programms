package Wetter.API;

public class WeatherInfo {

    private String timestamp;
    private String temperature;

    private String unit;

    /*
    private String feeling;
    private String weather;
     */

    WeatherInfo(String timestamp, String temperature, String unit){

        this.timestamp = timestamp;
        this.temperature = temperature;

        this.unit = unit;

        /*
        this.feeling = feeling;
        this.weather = weather;

         */

    }

    public String getTimestamp(){
        return timestamp;
    }

    public String getTemperature(){
        return temperature;
    }

    public String getUnit(){
        return unit;
    }

}
