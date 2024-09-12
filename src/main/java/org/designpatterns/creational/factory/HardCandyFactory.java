package org.designpatterns.creational.factory;

import java.util.ArrayList;

public class HardCandyFactory extends CandyFactory {

    @Override
    public Candy getCandy(String type) {
        return switch (type) {
            case "candycane" -> new HardCandy_CandyCane();
            case "lollipop" -> new HardCandy_Lollipop();
            case "peppermint" -> new HardCandy_Peppermint();
            default -> new HardCandy_CandyCane();
        };

    }

    @Override
    public ArrayList getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        if (quantity % 10 != 0) {
            System.out.println("Hard candy must be packaged in multiples of 10.");
            return null;
        }
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

}
