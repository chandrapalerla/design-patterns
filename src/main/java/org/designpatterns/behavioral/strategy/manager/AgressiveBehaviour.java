package org.designpatterns.behavioral.strategy.manager;

public class AgressiveBehaviour implements IBehaviour{

    @Override
    public int moveCommand() {
        System.out.println("\tAgressive Behaviour: if find another robot attack it");
        return 1;
    }
}
