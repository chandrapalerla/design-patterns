package org.designpatterns.behavioral.command.manager;

public class Button {

  String text;

  public Button(String text) {
    this.text = text;
  }

  public void click(Command command) {
    command.execute();
  }


}
