package org.designpatterns.structural.composite.manager;

public class Manager implements SalesComposite{

    private final String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println(name + " has been paid $" + amount);
    }

}
