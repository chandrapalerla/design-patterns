package org.designpatterns.behavioral.command.manager;

public class SaveCommand implements Command {

  private Document document;

  public SaveCommand(Document document) {
    this.document = document;
  }

  @Override
  public void execute() {
    document.save();
  }

}
