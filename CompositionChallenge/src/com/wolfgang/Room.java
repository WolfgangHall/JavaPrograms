package com.wolfgang;

/**
 * Created by johna on 12/16/2016.
 */
public class Room {
    private Lights lights;
    private Table table;
    private Windows windows;

    public Room (Lights lights, Table table, Windows windows) {
        this.lights = lights;
        this.table = table;
        this.windows = windows;
    }

    public void illuminate() {
        lights.turnOn();
    }

    public Lights getLights() {
        return lights;
    }

    public Table getTable() {
        return table;
    }

    public Windows getWindows() {
        return windows;
    }
}
