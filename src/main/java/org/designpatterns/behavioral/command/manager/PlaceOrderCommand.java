package org.designpatterns.behavioral.command.manager;

public class PlaceOrderCommand implements Command {

    private final Jacket jacket;

    public PlaceOrderCommand(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void execute() {
        jacket.placeOrder();
    }
}
