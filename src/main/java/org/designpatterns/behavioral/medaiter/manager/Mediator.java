package org.designpatterns.behavioral.medaiter.manager;

public class Mediator {

    private final Customer customer;
    private final ECommerceSite site;
    private final Driver driver;

    public Mediator() {
        customer = new Customer("123 Sunny Street");
        site = new ECommerceSite();
        driver = new Driver();
    }

    public void buy(String item, int amount) {
        if (site.checkInStock(item, amount)) {
            site.sell(item, amount);
            driver.deliver(item, amount, customer);
        }
    }

}
