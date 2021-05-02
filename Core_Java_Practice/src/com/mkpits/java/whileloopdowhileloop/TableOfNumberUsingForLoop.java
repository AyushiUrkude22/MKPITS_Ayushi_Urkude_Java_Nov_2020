package org.mkpits.java.whileloopdowhileloop;
//wWrite a program to accept a number and print table of that number using for loop.

import java.util.*;
class TableOfNumberUsingForLoop {
    public static void main(String[] arg)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter number");
        int num=s1.nextInt();
        int i;
        int res;
        for(i=1;i<=10;i++)

        {
            res=num * i;
            System.out.println(num + "*" + i +"=" + res);

        }
    }
}
