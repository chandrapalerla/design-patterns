package org.designpatterns.creational.factory;

import java.util.ArrayList;

public abstract class Candy {

    abstract ArrayList<Candy> makeCandyPackage(int quantity);

}
