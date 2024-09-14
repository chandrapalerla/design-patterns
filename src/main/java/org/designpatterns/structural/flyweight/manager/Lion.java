package org.designpatterns.structural.flyweight.manager;

public class Lion implements Animal {
    private final int[] location = new int[2];

    public String getAnimalType() {
        return "Lion";
    }

    public void setLocation(int latitude, int longitude) {
        location[0] = latitude;
        location[1] = longitude;
    }

    public int[] getLocation() {
        return location;
    }

}
