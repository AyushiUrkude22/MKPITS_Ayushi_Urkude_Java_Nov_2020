package org.mkpits.java.whileloopdowhileloop;
//Write a program to print no. from 1 to 10 using while loop.

import java.util.*;
class PrintNumberFrom1To10WhileLoop {
    public static void main(String[] arg)
    {
        int i=1;
        while( i <= 10 )
        {
            System.out.println("i = " + i); //1 2 3 ....
            i=i+1; //3
        }
        System.out.println("bye");
    }
}
