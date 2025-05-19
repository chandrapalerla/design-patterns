package org.designpatterns.structural.adapter;

import org.designpatterns.structural.adapter.manager.AsianCity;
import org.designpatterns.structural.adapter.manager.NorthAmericanCity;
import org.designpatterns.structural.adapter.manager.WeatherAdapter;
import org.designpatterns.structural.adapter.manager.WeatherWarnings;

//What: Converts the interface of one class to another that clients expect.
//Why: Enables incompatible interfaces to work together, promotes reusability, and separates interfaces from implementations.
// When: You need to use an existing class with an incompatible interface, or you want to create a reusable component
//       that can work with different interfaces.
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
