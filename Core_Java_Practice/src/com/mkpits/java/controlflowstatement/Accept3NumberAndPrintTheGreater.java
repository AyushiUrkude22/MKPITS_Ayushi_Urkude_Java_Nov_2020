package org.mkpits.java.controlflowstatement;
//Write a program to accept 3 no. and print the greater no. using if else if.

import java.util.*;

class Accept3NumberAndPrintTheGreater {
    public static void main(String[] arg)
    {
        Scanner s1=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("enter number1 and number2 and number3");
        n1=s1.nextInt();
        n2=s1.nextInt();
        n3=s1.nextInt();
        if(n1>n2 && n1>n3)
        {
            System.out.println("n1 is greater");
        }
        else if (n2>n3)
        {
            System.out.println("n3 is greater");
        }
    }
}
