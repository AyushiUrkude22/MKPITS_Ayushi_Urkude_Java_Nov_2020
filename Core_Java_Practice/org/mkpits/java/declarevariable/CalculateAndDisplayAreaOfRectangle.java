package org.mkpits.java.declarevariable;
//Write a program accept length and breadth of a rectangle and calculate and display area of a rectangle.

import java.util.*;

class CalculateAndDisplayAreaOfRectangle {
    public static void main(String[] arg)
    {
        Scanner s1=new Scanner(System.in);
        int length,breadth,area;
        System.out.println("enter length");
        length=s1.nextInt();
        System.out.println("entre breadth");
        breadth=s1.nextInt();
        area=length*breadth;
        System.out.println("ares of a rectangle ="+area);
    }
}
