package org.designpatterns.behavioral.observer.main;

import org.designpatterns.behavioral.observer.CurrentConditionsDisplay;
import org.designpatterns.behavioral.observer.StatisticsDisplay;
import org.designpatterns.behavioral.observer.WeatherData;

public class Application {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(25, 60, 1013.2f);
        weatherData.setMeasurements(26, 65, 1011.5f);
    }
}