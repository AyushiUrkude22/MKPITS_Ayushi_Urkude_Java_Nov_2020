package org.mkpits.java.whileloopdowhileloop;
//Write a program to ask the user whether to continue or not.

import java.util.*;
class UserWhetherToContinueOrNot {
    public static void main(String[] arg)
    {
        Scanner s1=new Scanner(System.in);
        int num,fact=1;
        char ans='y';
        do
        {
            System.out.println("enter number");
            num = s1.nextInt(); //5
            fact=1;
            do
            {
                fact = fact * num; // fact = 120 *1 120
                num--; // 0
            }
            while( num > 0 );
            System.out.println("fact = " + fact);
            System.out.println("do you want to continue ,if yes press y");
            ans=s1.next().charAt(0);
        }
        while(ans=='y');
        System.out.println("bye");
    }
}
