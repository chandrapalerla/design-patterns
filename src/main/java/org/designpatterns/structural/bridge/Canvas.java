package org.designpatterns.structural.bridge;

import org.designpatterns.structural.bridge.manager.*;

public class Canvas {

    public static void main(String[] args) {

        CheckboxButton checkboxButton = new CheckboxButton(new SmallButtonSize());
        checkboxButton.draw();

        RadioButton radioButton = new RadioButton(new MediumButtonSize());
        radioButton.draw();

        DropdownButton dropdownButton = new DropdownButton(new LargeButtonSize());
        dropdownButton.draw();
    }
}
