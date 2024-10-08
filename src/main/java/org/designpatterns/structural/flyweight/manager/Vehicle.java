package org.designpatterns.structural.flyweight.manager;

public interface Vehicle {
    String getModel();
    void setLocation(int latitude, int longitude);
    int[] getLocation();
}
