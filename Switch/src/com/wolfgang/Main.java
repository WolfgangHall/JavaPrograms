package com.wolfgang;

public class Main {

    public static void main(String[] args) {


        // switch works for byte, char, int, enums, and Strings

	    int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("Was a 3 or a 4 or a 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                System.out.println("Actually it was a " + switchValue);
                break;
        }

        char  myChar = 'A';
        switch (myChar) {
            case 'A':
                System.out.println("The character is A");
                break;

            case 'B':
                System.out.println("The character is B");
                break;

            case 'C':
                System.out.println("The character is C");
                break;

            case 'D':
                System.out.println("The character is D");
                break;

            case 'E':
                System.out.println("The character is E");
                break;

            default:
                System.out.println("The character is A, B, C, D, or E but " + myChar);
                break;
        }

        String switchMonth = "January";

        switch (switchMonth.toLowerCase()) {
            case "january":case "february":case "december":
                System.out.println("Man it is cold");
                break;

            case "may":case "june":case "july":
                System.out.println("Man it is warm");
                break;

             default:
                 System.out.println("it's probably cool out");
                 break;
        }

    }

}
