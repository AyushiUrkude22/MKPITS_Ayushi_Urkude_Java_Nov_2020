package org.mkpits.java.controlflowstatement;
//Write a program to accept 2 no. and oprator like +,-,*and then display result using switch statement.

import java.util.*;
class TwoNumberAndOpreatorDisplay {
    public static void main(String[] arg)
    {
        Scanner s1=new Scanner(System.in);
        int n1,n2,res=0;
        char op;
        System.out.println("enter 2 no.");
        n1=s1.nextInt();
        n2=s1.nextInt();
        System.out.println("enter operator +,-,*");
        op=s1.next().charAt(0);

        switch (op)
        {
            case'+':
                res=n1+n2;
                break;
            case '-':
                res=n1-n2;
                break;
            case '*':
                res=n1*n2;
                break;
            case '/':
                res=n1/n2;
                break;
        }
            System.out.println("res="+res);
    }
}
