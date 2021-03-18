package org.mkpits.java.array2;
//Write a program to sum the elements of an array.

import java.util.*;
class SumTheElements{
    public static void main(String[] arg)
    {
        Scanner s1=new Scanner(System.in);
        int[] num= new int[5];
        int sum=0;
        for(int i=0;i<5;i++)
        {
            System.out.println("enter numbers");
            num[i]=s1.nextInt();
        }
        for(int item : num)
        {
            sum = sum + item;
        }
        System.out.println("sum of elements of an array " + sum);
    }
}
