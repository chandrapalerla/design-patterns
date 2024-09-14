package org.designpatterns.structural.flyweight;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();

        System.out.println("additionof a and b::::" + (a + b));

    }
}
