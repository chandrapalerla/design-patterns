package org.designpatterns.structural.bridge.manager;

public class MediumButtonSize implements ButtonSize {
    public void getSize() {
        System.out.println("Setting size to medium...");
    }
}
