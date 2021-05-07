package src.com.mkpits.java.controlflowstatement;
//Java Program to example of Sum of Positive Numbers Only.

import java.util.Scanner;
class SumOf55PositiveNumbersOnly {
    public static void main(String[] args) {

        int sum = 0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // take integer input from the user
        System.out.println("Enter a number");
        int number = input.nextInt();

        // while loop continues
        // until entered number is positive
        while (number >= 0) {
            // add only positive numbers
            sum += number;

            System.out.println("Enter a number");
            number = input.nextInt();
        }

        System.out.println("Sum = " + sum);
        input.close();
    }
}
