package org.designpatterns.structural.bridge.manager;

public class SmallButtonSize implements ButtonSize {
    public void getSize() {
        System.out.println("Setting size to small...");
    }
}
