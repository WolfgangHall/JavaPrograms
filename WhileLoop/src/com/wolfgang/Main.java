package com.wolfgang;

public class Main {

    public static void main(String[] args) {
	// use a while loop when you don't know how many loops you'll need
        // need to increment your variable manually
        int count = 1;
        while ( count != 4 ) {
            System.out.println("Count value is " + count);
            count++;
        }

        // needs this second assignment of the count variable to avoid an infinite loop
        // using an if statement in a while loop to break out
        count = 1;
        while (true) {
            if ( count == 4 ){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // do-while will always execute once
        // if count = 6, you'll get an infinite loop because count will increment to 7 and
        // satisfy the while condition
        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 10) {
                break;
            }
        } while(count != 6);


        // print out all of the even numbers between 5 and 20
        int number = 5;
        int finishNumber = 20;
        int evenNumbers = 0;
        while (number <= finishNumber)
        {

            if (!isEvenNumber(number)) {
                number++;
                // continue allows you to skip and start over in the loop
                // skips all the odd numbers
                continue;
            }

            System.out.println("Even number " + number);

            evenNumbers++;

            if (evenNumbers >= 5) {
                System.out.println("number of evens: " + evenNumbers);
                break;
            }
            number++;

        }

    }

    public static boolean isEvenNumber(int number)
    {
        if (number % 2 == 0)
        {
            return true;
        } else {
            return false;
        }
    }
}
