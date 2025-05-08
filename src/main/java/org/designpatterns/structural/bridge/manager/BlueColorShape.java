package org.designpatterns.structural.bridge.manager;

import java.awt.*;

public class BlueColorShape implements ColorShape {

    public void setColor(Graphics graphics) {
        graphics.setColor(Color.BLUE);
    }

}
