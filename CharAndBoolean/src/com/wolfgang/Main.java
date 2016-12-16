package com.wolfgang;

public class Main {

    public static void main(String[] args) {

        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output: " + myChar);

        char registeredSymbol = '\u00AE';
        System.out.println("Unicode output for register symbol: "registeredSymbol);

        boolean myBoolean = false;
    }
}
