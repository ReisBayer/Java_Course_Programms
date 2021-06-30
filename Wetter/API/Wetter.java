package Wetter.API;

import java.util.Scanner;

public class Wetter {

    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        WeatherFetcher wa = WeatherFetcher.getInstance();
        String city = input.next();

        WeatherInfo[] weatherInfos = wa.getWeather(city);

        for(int x = 0; x < weatherInfos.length; x++){
            WeatherInfo weatherInfo = weatherInfos[x];
            System.out.println(weatherInfo.getTimestamp() + ": " + weatherInfo.getTemperature() + weatherInfo.getUnit());
        }

    }

}
