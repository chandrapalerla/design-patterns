package org.designpatterns.structural.flyweight.manager;

public class Tiger implements Animal {

    private final int[] location = new int[2];

    @Override
    public String getAnimalType() {
        return "Tiger";
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
