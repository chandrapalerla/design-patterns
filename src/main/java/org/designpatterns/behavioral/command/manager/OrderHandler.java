package org.designpatterns.behavioral.command.manager;

public class OrderHandler {

  public void invoke(Command command) {
    command.execute();
  }

}
