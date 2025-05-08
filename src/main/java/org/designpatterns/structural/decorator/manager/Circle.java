package org.designpatterns.structural.decorator.manager;

import java.awt.*;

public class Circle implements Component {

    private final int x;
    private final int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics graphics) {
        graphics.drawOval(x, y, 50, 50);
    }
}
