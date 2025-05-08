package org.designpatterns.structural.adapter.manager;

public interface City {

    String getName();

    double getTemperature();

    String getTemperatureScale();

    boolean getHasWeatherWarning();

    void setHasWeatherWarning(boolean hasWeatherWarning);

}



