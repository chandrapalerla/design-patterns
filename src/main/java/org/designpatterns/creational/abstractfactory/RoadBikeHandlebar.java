package org.designpatterns.creational.abstractfactory;

public class RoadBikeHandlebar extends Handlebar {

    private static final String type = "DROP";
    @Override
    public void getDescription() {
        System.out.println("Road bike handlebar. Type: " + type);
    }

}
