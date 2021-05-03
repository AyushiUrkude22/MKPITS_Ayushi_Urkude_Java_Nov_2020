package src.com.mkpits.java.controlflowstatement;
//Write a program to accept day no and print the related day name using switch statement.

import java.util.*;

class DayNoAndPrintRelatedDayName {
    public static void main(String[] arg)
    {
        Scanner s1=new Scanner(System.in);
        int dayno;
        System.out.println("enter dayno between 1 and 7");
        dayno=s1.nextInt();
        switch (dayno)
        {
            case 1:
                  System.out.println("monday");
            break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("some other day");
                break;
        }
    }
}
