package com.wolfgang;

/**
 * Created by johna on 12/16/2016.
 */
public class PC {
    // you can inherit/extend from one class
    // using this method we can grab information from many different classes

    private Case theCase; // case is a restricted keyword -> switch statement
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

}
