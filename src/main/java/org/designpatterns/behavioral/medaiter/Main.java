package org.designpatterns.behavioral.medaiter;

import org.designpatterns.behavioral.medaiter.manager.Mediator;
import org.designpatterns.behavioral.medaiter.manager.PlayMediator;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();
        mediator.buy("pens", 3);

        PlayMediator playMediator = new PlayMediator();
        playMediator.takeOff();
    }
}
