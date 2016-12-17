package com.wolfgang;

/**
 * Created by johna on 12/16/2016.
 */
public class Table {
    private String shape;
    private String color;
    private int availableSeats;

    public Table(String shape, String color, int availableSeats) {
        this.shape = shape;
        this.color = color;
        this.availableSeats = availableSeats;
    }

    public void clearTheTable() {
        System.out.println("You've cleared the table");
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
