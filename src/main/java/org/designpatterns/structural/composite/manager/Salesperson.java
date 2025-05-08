package org.designpatterns.structural.composite.manager;

public class Salesperson implements SalesComposite {

    private final String name;

    private final Manager manager;

    public Salesperson(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println(name + " has been paid $" + amount);
    }

}
