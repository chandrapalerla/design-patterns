package org.designpatterns.behavioral.iterator;

import org.designpatterns.behavioral.iterator.manager.*;

public class Main {

    public static void main(String[] args) {

        Item pens = new Item("pens", 175);
        Item pencils = new Item("pencils", 0);
        Item paper = new Item("paper", 500);

        Inventory inventory = new Inventory(pens, pencils, paper);
        StockIterator iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item.getName());
        }

        Employee zak = new Employee("Zak");
        Employee sarah = new Employee("Sarah");
        Employee anna = new Employee("Anna");

        StaffList staffList = new StaffList(zak, sarah, anna);
        StaffListIterator iterator1 = new StaffListIterator(staffList);

        while (iterator1.hasNext()) {
            Employee employee = iterator1.next();
            System.out.println(employee.getName());
        }

    }

}
