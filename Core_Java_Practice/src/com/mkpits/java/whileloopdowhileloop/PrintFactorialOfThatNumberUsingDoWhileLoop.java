package src.com.mkpits.java.whileloopdowhileloop;
//Write a program to accept a no and print factorial of that no. using do while loop.

import java.util.*;
public class PrintFactorialOfThatNumberUsingDoWhileLoop {
    public static void main(String[] arg)
    {
        Scanner s1=new Scanner(System.in);
        int num,fact=1;
        System.out.println("enter number");
        num = s1.nextInt(); //5
        do
        {
            fact = fact * num; // fact = 120 *1 120
            num--; // 0
        }
        while( num > 0 );
        System.out.println("fact = " + fact);

    }
}
