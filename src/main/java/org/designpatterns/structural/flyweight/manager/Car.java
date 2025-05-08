package org.designpatterns.structural.flyweight.manager;

public class Car implements Vehicle {
    private final int[] location = new int[2];

    @Override
    public String getModel() {
        return "Car";
    }

    @Override
    public void setLocation(int latitude, int longitude) {
        location[0] = latitude;
        location[1] = longitude;
    }

    @Override
    public int[] getLocation() {
        return location;
    }
}