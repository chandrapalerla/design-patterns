package org.designpatterns.structural.composite.manager;

public class NonfictionBook implements Book {

    String name;
    boolean checkedOut;

    public NonfictionBook(String name) {
        this.name = name;
        checkedOut = false;
    }

    public void checkout() {
        if (!checkedOut) {
            System.out.println("Checking out " + name + "\n");
            checkedOut = true;
        } else {
            System.out.println(name + " is already checked out\n");
        }
    }

    public void returnBook() {
        if (checkedOut) {
            System.out.println("Returning " + name + "\n");
            checkedOut = false;
        } else {
            System.out.println(name + " is not checked out\n");
        }
    }

}
