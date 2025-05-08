package org.designpatterns.structural.adapter;

import org.designpatterns.structural.adapter.manager.AsianCity;
import org.designpatterns.structural.adapter.manager.NorthAmericanCity;
import org.designpatterns.structural.adapter.manager.WeatherAdapter;
import org.designpatterns.structural.adapter.manager.WeatherWarnings;

public class WeatherMain {

    public static void main(String[] args) {
        WeatherWarnings weatherWarnings = new WeatherWarnings();

        NorthAmericanCity chicago = new NorthAmericanCity("Chicago", 16);
        weatherWarnings.postWarning(chicago);

        NorthAmericanCity phoenix = new NorthAmericanCity("Phoenix", 104);
        weatherWarnings.postWarning(phoenix);

        NorthAmericanCity portland = new NorthAmericanCity("Portland", 70);
        weatherWarnings.postWarning(portland);

        AsianCity bangkok = new AsianCity("Bangkok", 50);
        WeatherAdapter adapter = new WeatherAdapter(bangkok);
        weatherWarnings.postWarning(adapter);

    }

}
