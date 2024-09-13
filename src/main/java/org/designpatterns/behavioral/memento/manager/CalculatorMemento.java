package org.designpatterns.behavioral.memento.manager;

public class CalculatorMemento {
    private int state;

    public CalculatorMemento(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}