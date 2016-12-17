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

    // instead of using getters and setters, we can access our components directly
    // allows us to abstract away code from the main class

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

}
