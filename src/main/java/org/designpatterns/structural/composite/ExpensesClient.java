package org.designpatterns.structural.composite;

import org.designpatterns.structural.composite.manager.Manager;
import org.designpatterns.structural.composite.manager.SalesComposite;
import org.designpatterns.structural.composite.manager.SalesTeam;
import org.designpatterns.structural.composite.manager.Salesperson;

public class ExpensesClient {

    public static void main(String[] args) {
        Manager jane = new Manager("Jane");
        Salesperson bob = new Salesperson("Bob", jane);
        Salesperson sue = new Salesperson("Sue", jane);

        SalesTeam team = new SalesTeam();
        team.addTeamMember(jane);
        team.addTeamMember(bob);
        team.addTeamMember(sue);

        payExpense(jane, 100);
        payExpense(bob, 300);
        payExpense(team, 200);

    }

    private static void payExpense(SalesComposite manager, int amount) {
        System.out.println("Expenses have been requested");
        manager.payExpenses(amount);
        System.out.println("Expenses have been paid\n");
    }
}
