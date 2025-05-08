package org.designpatterns.structural.adapter.manager;

public class WeatherAdapter implements City {

    City city;

    public WeatherAdapter(AsianCity city) {
        this.city = city;
    }

    public String getName() {
        return city.getName();
    }

    public double getTemperature() {
        double temperature = city.getTemperature();
        return temperature * 1.8 + 32;
    }

    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    public boolean getHasWeatherWarning() {
        return city.getHasWeatherWarning();
    }

    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        city.setHasWeatherWarning(hasWeatherWarning);
    }

}







