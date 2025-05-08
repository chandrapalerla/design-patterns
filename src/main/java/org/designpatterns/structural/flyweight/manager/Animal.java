package org.designpatterns.structural.flyweight.manager;

public interface Animal {

    String getAnimalType();

    int[] getLocation();

    void setLocation(int latitude, int longitude);

}
