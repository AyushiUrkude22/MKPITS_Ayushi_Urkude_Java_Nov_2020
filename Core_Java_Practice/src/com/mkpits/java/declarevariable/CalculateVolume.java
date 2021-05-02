package org.mkpits.java.declarevariable;
//Write a program to accept len,bre,height and calculate volume.

import java.util.*;
class CalculateVolume {
    public static void main(String[] arg)
    {
        Scanner s1=new Scanner(System.in);
        int length,breadth,height,vol;
            System.out.println("enter length");
            length= s1.nextInt();
            System.out.println("enter breadth");
            breadth= s1.nextInt();
            System.out.println("enter height");
            height= s1.nextInt();
            vol=length*breadth*height;
            System.out.println("volume of a rectangle ="+vol);
    }
}
