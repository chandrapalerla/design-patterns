package org.designpatterns.structural.decorator;

import org.designpatterns.structural.decorator.manager.*;

public class PizaMain {

    public static void main(String[] args) {
        order(new PizzaMargherita());
        order(new PizzaHawaiian());
        order(new PizzaWithExtraCheese(new PizzaPepperoni()));
    }

    public static void order(Pizza pizza) {
        System.out.println("You have ordered a " + pizza.getName() +
                " pizza. The toppings are " + pizza.getToppings() + ".");
    }

}
