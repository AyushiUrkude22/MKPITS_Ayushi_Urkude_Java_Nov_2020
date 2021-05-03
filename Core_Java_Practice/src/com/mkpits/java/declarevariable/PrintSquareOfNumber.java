package src.com.mkpits.java.declarevariable;
//Write a program to accept a number from the user and print square of the number.

import java.util.Scanner;

class PrintSquareOfNumber {
    public static void main(String[] arg)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter number");
        int num,square;
        num=s1.nextInt();
        square=num*num;
        System.out.println("square of number ="+square);
    }
}
