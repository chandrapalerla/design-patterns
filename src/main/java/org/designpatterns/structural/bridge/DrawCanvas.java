package org.designpatterns.structural.bridge;

import org.designpatterns.structural.bridge.manager.*;

import javax.swing.*;
import java.awt.*;

public class DrawCanvas extends JPanel {

    public static void main(String[] a) {
        // Creates a canvas to draw on
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.add(new DrawCanvas());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics graphics) {
        Square square = new Square(new BlueColorShape());
        square.draw(graphics);
        Circle circle = new Circle(new RedColorShape());
        circle.draw(graphics);
        Triangle triangle = new Triangle(new GreenColorShape());
        triangle.draw(graphics);
    }

}
