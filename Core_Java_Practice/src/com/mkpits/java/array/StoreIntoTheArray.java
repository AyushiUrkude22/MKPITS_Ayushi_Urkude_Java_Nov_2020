package src.com.mkpits.java.array;
// Write a program to create an array of 5 element and accept values from the user to store into the array.

import java.util.*;
class StoreIntoTheArray {
    public static void main(String[] arg)
    {

        Scanner s1=new Scanner(System.in);
        int[] num= new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter numbers");
            num[i]=s1.nextInt();
        }
        for(int i=0; i<5 ; i++)
        {
            System.out.println(num[i]);
        }
    }
}
