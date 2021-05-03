package src.com.mkpits.java.whileloopdowhileloop;
//Write a program to accept a number and print table of that number.

import java.util.*;
class PrintTableOfThatNumber {
    public static void main(String[] arg)

    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter number");
        int num=s1.nextInt();
        int i=1;
        int res;
        while(i <= 10)
        {
            res=num * i;
            System.out.println(num + "*" + i +"=" + res);
            i=i+1;
        }
    }
}