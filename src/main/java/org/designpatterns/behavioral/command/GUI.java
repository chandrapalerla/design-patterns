package org.designpatterns.behavioral.command;

import org.designpatterns.behavioral.command.manager.Button;
import org.designpatterns.behavioral.command.manager.Document;
import org.designpatterns.behavioral.command.manager.PrintCommand;
import org.designpatterns.behavioral.command.manager.SaveCommand;

public class GUI {

    private static final Document document = new Document();

    public static void main(String[] args) {

        Button saveButton = new Button("Save");
        Button printButton = new Button("Print");

        saveButton.click(new SaveCommand(document));
        printButton.click(new PrintCommand(document));

    }

}
