package com.wolfgang;

public class Main {

    public static void main(String[] args) {
        Lights theLights = new Lights(0, "florescent", false);
        Table theTable = new Table("circular", "brown", 6);
        Windows theWindows = new Windows("stainglass", new Dimensions(8, 4));

        // access via abstracted class method
        Room room = new Room(theLights, theTable, theWindows);
        room.illuminate();

        // access using getter
        room.getTable().clearTheTable();

        System.out.println("The windows are " + room.getWindows().getType());
    }
}
