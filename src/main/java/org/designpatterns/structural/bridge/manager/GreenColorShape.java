package org.designpatterns.structural.bridge.manager;

import java.awt.*;

public class GreenColorShape implements ColorShape {

    public void setColor(Graphics graphics) {
        graphics.setColor(Color.GREEN);
    }

}
