package org.designpatterns.behavioral.command;

import org.designpatterns.behavioral.command.manager.Jacket;
import org.designpatterns.behavioral.command.manager.OrderHandler;
import org.designpatterns.behavioral.command.manager.PlaceOrderCommand;
import org.designpatterns.behavioral.command.manager.ReturnOrderCommand;

public class SalesOrderClient {

  private static Jacket jacket = new Jacket();

  public static void main(String[] args) {

    OrderHandler placeOrderHandler = new OrderHandler();
    OrderHandler returnOrderHandler = new OrderHandler();

    placeOrderHandler.invoke(new PlaceOrderCommand(jacket));
    returnOrderHandler.invoke(new ReturnOrderCommand(jacket));


  }


}
