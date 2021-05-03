package src.com.mkpits.java.array;
//Write a program to enhanced for statement or for each loop do the above program using enhanced for loop.

import java.util.*;
class ForLoop {
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
            System.out.println(item);
        }
    }
}
