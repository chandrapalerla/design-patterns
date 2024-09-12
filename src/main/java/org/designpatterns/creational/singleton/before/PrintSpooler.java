package org.designpatterns.creational.singleton.before;

public class PrintSpooler {

    private static PrintSpooler spooler;

    private static boolean initialized = false;

    private PrintSpooler() {
    }

    public static synchronized PrintSpooler getInstance() {

        if (initialized) return spooler;
        spooler = new PrintSpooler();
        spooler.init();
        initialized = true;
        return spooler;

    }

    private void init() {
        // Code to initialize our printer spooler goes here
    }

}
