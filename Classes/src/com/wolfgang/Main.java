package com.wolfgang;

public class Main {

    public static void main(String[] args) {
	// state (awake or asleep) and behavior (wake up or go to sleep)
    // a class is a template for creating objects
    // a user-defined data-type

        // Whenever you make a new object, you need to initialize it with the new keyword
        // if you don't initialize the object, you can't change it's state or behavior
        // don't set an object to null after initializing
        Car audi = new Car();
        Car ford = new Car();

        audi.setModel("A4");
        System.out.println("Model is " + audi.getModel());
    }
}
