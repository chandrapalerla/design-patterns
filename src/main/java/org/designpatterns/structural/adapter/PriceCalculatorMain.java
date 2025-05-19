package org.designpatterns.structural.adapter;

import org.designpatterns.structural.adapter.manager.Adapter;
import org.designpatterns.structural.adapter.manager.CarPriceCalculator;
import org.designpatterns.structural.adapter.manager.PriceCalculator;
import org.designpatterns.structural.adapter.manager.TruckPriceCalculator;
import org.example.UKCarPriceCalculator;

public class PriceCalculatorMain {

    public static void main(String[] args) {
        CarPriceCalculator carPriceCalculator = new CarPriceCalculator("Ford", 3);
        printVehiclePrice(carPriceCalculator);

        TruckPriceCalculator truckPriceCalculator = new TruckPriceCalculator(10, 0);
        printVehiclePrice(truckPriceCalculator);

        UKCarPriceCalculator ukCarPriceCalculator = new UKCarPriceCalculator("BMW", 7);
        Adapter adapter = new Adapter(ukCarPriceCalculator);
        printVehiclePrice(adapter);
    }

    public static void printVehiclePrice(PriceCalculator calculator) {
        String price = calculator.calculatePrice();
        System.out.println("The price of vehicle is: " + price);
    }

}
