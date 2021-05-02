package org.mkpits.java.controlflowstatement;
//Write a program to accept 2 no. and print greate no.

import java.util.*;
class PrintGreaterNumber {
    public static void main(String[] arg)
    {
        Scanner s1=new Scanner(System.in);
        int n1,n2;
        System.out.println("enter number1 and number2");
        n1=s1.nextInt();
        n2=s1.nextInt();
        if(n1>n2)
        {
            System.out.println("n1 is greater then n2");

        }
        else
        {
            System.out.println("n2 is greater than n1");
        }
    }
}
