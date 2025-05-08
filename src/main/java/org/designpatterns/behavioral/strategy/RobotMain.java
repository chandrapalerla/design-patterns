package org.designpatterns.behavioral.strategy;

import org.designpatterns.behavioral.strategy.manager.AgressiveBehaviour;
import org.designpatterns.behavioral.strategy.manager.DefensiveBehaviour;
import org.designpatterns.behavioral.strategy.manager.NormalBehaviour;
import org.designpatterns.behavioral.strategy.manager.Robot;

public class RobotMain {
    public static void main(String[] args) {

        Robot r1 = new Robot("Big Robot");
        Robot r2 = new Robot("George v.2.1");
        Robot r3 = new Robot("R2");

        r1.setBehaviour(new AgressiveBehaviour());
        r2.setBehaviour(new DefensiveBehaviour());
        r3.setBehaviour(new NormalBehaviour());

        r1.move();
        r2.move();
        r3.move();

        System.out.println("\r\nNew behaviours: " +
                "\r\n\t'Big Robot' gets really scared" +
                "\r\n\t, 'George v.2.1' becomes really mad because" +
                "it's always attacked by other robots" +
                "\r\n\t and R2 keeps its calm\r\n");

        r1.setBehaviour(new DefensiveBehaviour());
        r2.setBehaviour(new AgressiveBehaviour());

        r1.move();
        r2.move();
        r3.move();
    }
}
