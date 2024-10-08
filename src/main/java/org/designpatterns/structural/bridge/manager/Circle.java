package org.designpatterns.structural.bridge.manager;

import java.awt.*;

public class Circle extends Shape {
    ColorShape colorShape;

    public Circle(ColorShape colorShape) {
        this.colorShape = colorShape;
    }

    public void draw(Graphics graphics) {
        colorShape.setColor(graphics);
        graphics.fillOval(75, 15, 50, 50);
    }
}
