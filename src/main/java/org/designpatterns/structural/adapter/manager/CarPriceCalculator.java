package org.designpatterns.structural.adapter.manager;

public class CarPriceCalculator implements PriceCalculator {

    public static int averageCarPrice = 6000;
    private final int age;
    private final String model;

    public CarPriceCalculator(String model, int age) {
        this.model = model;
        this.age = age;
    }

    public int getRetailPrice() {
        switch (model) {
            case "Ford":
                return 3000;
            case "Audi":
                return 5000;
            case "BMW":
                return 7000;
            case "Tesla":
                return 10000;
            default:
                return averageCarPrice;
        }
    }

    @Override
    public String calculatePrice() {
        int price = Math.max(getRetailPrice() - (age * 100), 0);
        return price + "USD";
    }
}