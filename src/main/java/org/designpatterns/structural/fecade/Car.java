package org.designpatterns.structural.fecade;

import org.designpatterns.structural.fecade.manager.CarFacade;

public class Car {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.drive();
    }
}
