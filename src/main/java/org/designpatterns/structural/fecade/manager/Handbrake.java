package org.designpatterns.structural.fecade.manager;

public class Handbrake {

    private boolean isUp = true;

    public void pushDown() {
        System.out.println("Pushing down handbrake");
        isUp = false;
    }

    public void liftUp() {
        System.out.println("Lifting up handbrake");
        isUp = true;
    }

}
