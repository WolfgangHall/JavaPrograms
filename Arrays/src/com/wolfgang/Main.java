package com.wolfgang;

public class Main {

    public static void main(String[] args) {
        // need new keyword to declare an array
	    int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 476;
	    // sets the 6th element to 50 -> zero indexed
        myIntArray[5] = 50;

        // alternative way of creating an array
        // sets the number elements in the array and populates them with the input values
        int[] myNewIntArray = {1, 2, 3, 4, 5};
        System.out.println(myNewIntArray[3]);

        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);

        int[] myForArray = new int[15];

        // can use array.length to avoid out of bounds exceptions
        // out of bounds exceptions result when trying to access array elements that go beyond
        //    the scope of an array
        for (int i = 0; i < myForArray.length; i++) {
            myForArray[i] = i * 10;
        }
        printArray(myForArray);
    }

    // we can use arrays as parameters, very much like our main method
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

}
