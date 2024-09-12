/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.designpatterns.creational.builder.before;

import java.awt.*;

public class Kitchen {

    private final Dimension dimensions;
    private final int ceilingHeight;
    private final int floorNumber;
    private final Color wallColor;
    private final int numberOfWindows;
    private final int numberOfDoors;
    private final boolean hasDishwasher;
    private final boolean hasMicrowave;

    public Kitchen(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean hasDishwasher, boolean hasMicrowave) {
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.hasDishwasher = hasDishwasher;
        this.hasMicrowave = hasMicrowave;
    }
}
