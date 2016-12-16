package com.wolfgang;

/**
 * Created by johna on 12/15/2016.
 */
public class Car {
    // public access modifier gives unrestricted access to class

    // known as class or member variables or fields
    // you must define access modifiers --> often will be private
    // Encapsulation is used to hide fields from public access

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    // use this keyword to assign variables in an object
    // info on right is assigned to variable on the left

    // we use getters and setters because we can implement validation tests
    public void setModel(String model)
    {
        String validModel = model.toLowerCase();

        // only allows audi and ford to be set as model name
        // equals checks for equality amongst objects
        if (validModel.equals("a4") || validModel.equals("mustang")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // if no model is set, getModel will return null

    public String getModel()
    {
        return this.model;
    }
}
