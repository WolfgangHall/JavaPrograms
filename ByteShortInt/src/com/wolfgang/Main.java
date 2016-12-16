package com.wolfgang;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        byte newByteValue = (byte) (myMinByteValue / 2);

        // short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;

        // long has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;



        byte myByte = 126;

        short myShort = 32_000;

        int myInt = 1_000_000;

        long myLong = 50_000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);
    }
}
