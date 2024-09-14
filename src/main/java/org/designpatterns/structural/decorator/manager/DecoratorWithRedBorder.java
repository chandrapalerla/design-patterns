package org.designpatterns.structural.decorator.manager;

import java.awt.*;

public class DecoratorWithRedBorder implements Component {

    private final Component decoratedComponent;

    public DecoratorWithRedBorder(Component component) {
        this.decoratedComponent = component;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        decoratedComponent.draw(graphics);
        graphics.setColor(Color.BLACK);
    }

}
