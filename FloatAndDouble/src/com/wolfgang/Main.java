package com.wolfgang;

public class Main {

    public static void main(String[] args) {
	    int myValue = 5 / 2;
	    float myFloatValue = 5f / 2f;
	    double myDoubleValue = 5d / 2d;

        System.out.println(myValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double numPounds = 3d;
        double kgConverter = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + kgConverter);
    }
}
