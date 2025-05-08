package org.designpatterns.behavioral.memento.manager;

public class Adder {
    private int result;
    private final CalculatorMemento memento = new CalculatorMemento(result);

    public void add(int newNumber) {
        result += newNumber;
    }

    public int getResult() {
        return result;
    }

    public void save() {
        memento.setState(result);
    }

    public void undo() {
        result = memento.getState();
    }

}
