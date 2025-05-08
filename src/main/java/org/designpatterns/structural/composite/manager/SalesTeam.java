package org.designpatterns.structural.composite.manager;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements SalesComposite {

    private final List<SalesComposite> payees = new ArrayList<>();

    public void payExpenses(int amount) {
        payees.forEach(payee -> payee.payExpenses(amount));
    }

    public void addTeamMember(SalesComposite payee) {
        payees.add(payee);
    }
}
