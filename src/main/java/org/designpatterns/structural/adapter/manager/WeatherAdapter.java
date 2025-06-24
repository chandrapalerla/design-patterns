package org.designpatterns.structural.adapter.manager;

public class WeatherAdapter implements City {

    City city;

    public WeatherAdapter(AsianCity city) {
        this.city = city;
    }

    @Override
    public String getName() {
        return city.getName();
    }

    @Override
    public double getTemperature() {
        double temperature = city.getTemperature();
        return temperature * 1.8 + 32;
    }

    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return city.getHasWeatherWarning();
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        city.setHasWeatherWarning(hasWeatherWarning);
    }
}







