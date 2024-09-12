package org.designpatterns.creational.builder.before;

import java.awt.*;

public class Bedroom {

    private final Dimension dimensions;
    private final int ceilingHeight;
    private final int floorNumber;
    private final Color wallColor;
    private final int numberOfWindows;
    private final int numberOfDoors;
    private final boolean isDouble;
    private final boolean hasEnsuite;

    public Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean isDouble, boolean hasEnsuite) {
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;
    }

}
