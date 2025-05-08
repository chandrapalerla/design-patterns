package org.designpatterns.behavioral.interpreter;

import org.designpatterns.behavioral.interpreter.manager.FirstLetterIsUpperCase;
import org.designpatterns.behavioral.interpreter.manager.FirstLetterNotUnderscore;

public class Main {

    public static void main(String[] args) {

        String context = "this is a a sentence sentence";
        FirstLetterIsUpperCase firstLetterIsUpperCase = new FirstLetterIsUpperCase();
        context = firstLetterIsUpperCase.interpret(context);
        System.out.println(context);

        String context1 = "_Int";
        FirstLetterNotUnderscore firstLetterNotUnderscore = new FirstLetterNotUnderscore();
        context1 = firstLetterNotUnderscore.interpret(context1);
        System.out.println(context1);

    }
}
